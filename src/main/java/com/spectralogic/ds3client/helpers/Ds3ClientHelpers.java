/*
 * ******************************************************************************
 *   Copyright 2014 Spectra Logic Corporation. All Rights Reserved.
 *   Licensed under the Apache License, Version 2.0 (the "License"). You may not use
 *   this file except in compliance with the License. A copy of the License is located at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   or in the "license" file accompanying this file.
 *   This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *   CONDITIONS OF ANY KIND, either express or implied. See the License for the
 *   specific language governing permissions and limitations under the License.
 * ****************************************************************************
 */

package com.spectralogic.ds3client.helpers;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.google.common.collect.Lists;
import com.spectralogic.ds3client.Ds3Client;
import com.spectralogic.ds3client.commands.BulkGetRequest;
import com.spectralogic.ds3client.commands.BulkGetResponse;
import com.spectralogic.ds3client.commands.BulkPutRequest;
import com.spectralogic.ds3client.commands.BulkPutResponse;
import com.spectralogic.ds3client.commands.GetBucketRequest;
import com.spectralogic.ds3client.commands.GetBucketResponse;
import com.spectralogic.ds3client.models.Contents;
import com.spectralogic.ds3client.models.Ds3Object;
import com.spectralogic.ds3client.models.ListBucketResult;
import com.spectralogic.ds3client.models.MasterObjectList;
import com.spectralogic.ds3client.serializer.XmlProcessingException;

public class Ds3ClientHelpers {
    private static final int DEFAULT_MAX_KEYS = 1000;
    
    private final Ds3Client client;
    
    public interface ObjectGetter {
        /**
         * Must save the {@code contents} for the given {@code key}.
         * 
         * @param key
         * @param contents
         * @throws IOException
         */
        public void writeContents(String key, InputStream contents) throws IOException;
    }
    
    public interface ObjectPutter {
        /**
         * Must return the contents to send over DS3 for the given {@code key}.
         * 
         * @param key
         * @return
         * @throws IOException
         */
        public InputStream getContent(String key) throws IOException;
    }
    
    /**
     * Represents a bulk job operation.
     * When you call one of the start* methods it's recommended that you save the
     * JobId so the job can be recovered in the event of a failure.
     */
    public interface Job {
        public UUID getJobId();
        public String getBucketName();
    }
    
    public interface WriteJob extends Job {
        /**
         * Calls the given @{code putter} for each object in the job remaining to be written.
         * Note that it's possible for the {@code putter} to be called simultaneously from multiple threads.
         * 
         * @param putter
         * @throws SignatureException
         * @throws IOException
         * @throws XmlProcessingException
         */
        public void write(ObjectPutter putter) throws SignatureException, IOException, XmlProcessingException;
    }
    
    public interface ReadJob extends Job {
        /**
         * Calls the given @{code getter} for each object in the job remaining to be read.
         * Note that it's possible for the {@code getter} to be called simultaneously from multiple threads.
         * 
         * @param putter
         * @throws SignatureException
         * @throws IOException
         * @throws XmlProcessingException
         */
        public void read(ObjectGetter getter) throws SignatureException, IOException, XmlProcessingException;
    }

    public Ds3ClientHelpers(final Ds3Client client) {
        this.client = client;
    }
    
    /**
     * Performs a bulk put job creation request and returns an @{code IWriteJob}.
     * See {@code IWriteJob} for information on how to write the objects for the job.
     * 
     * @param bucket
     * @param objectsToWrite
     * @return
     * @throws SignatureException
     * @throws IOException
     * @throws XmlProcessingException
     */
    public WriteJob startWriteJob(final String bucket, final Iterable<Ds3Object> objectsToWrite)
            throws SignatureException, IOException, XmlProcessingException {
        try(final BulkPutResponse prime = this.client.bulkPut(new BulkPutRequest(bucket, Lists.newArrayList(objectsToWrite)))) {
            final MasterObjectList result = prime.getResult();
            return new WriteJobImpl(this.client, result.getJobid(), bucket, result.getObjects());
        }
    }
    
    /**
     * Performs a bulk get job creation request and returns an @{code IReadJob}.
     * See {@code IReadJob} for information on how to read the objects for the job.
     * 
     * @param bucket
     * @param objectsToRead
     * @return
     * @throws SignatureException
     * @throws IOException
     * @throws XmlProcessingException
     */
    public ReadJob startReadJob(final String bucket, final Iterable<Ds3Object> objectsToRead)
            throws SignatureException, IOException, XmlProcessingException {
        try(final BulkGetResponse prime = this.client.bulkGet(new BulkGetRequest(bucket, Lists.newArrayList(objectsToRead)))) {
            final MasterObjectList result = prime.getResult();
            return new ReadJobImpl(this.client, result.getJobid(), bucket, result.getObjects());
        }
    }
    
    /**
     * Performs a bulk get job creation request for all of the objects in the given bucket and returns an @{code IReadJob}.
     * 
     * @param bucket
     * @return
     * @throws SignatureException
     * @throws IOException
     * @throws XmlProcessingException
     */
    public ReadJob startReadAllJob(final String bucket)
            throws SignatureException, IOException, XmlProcessingException {
        final Iterable<Contents> contentsList = this.listObjects(bucket);
        
        final List<Ds3Object> ds3Objects = new ArrayList<>();
        for (final Contents contents : contentsList) {
            ds3Objects.add(new Ds3Object(contents.getKey()));
        }
        
        return this.startReadJob(bucket, ds3Objects);
    }

    /**
     * Returns information about all of the objects in the bucket, regardless of how many objects the bucket contains.
     * 
     * @param bucket
     * @return
     * @throws SignatureException
     * @throws IOException
     */
    public Iterable<Contents> listObjects(final String bucket) throws SignatureException, IOException {
        return this.listObjects(bucket, null);
    }

    /**
     * Returns information about all of the objects in the bucket, regardless of how many objects the bucket contains.
     * 
     * @param bucket
     * @param keyPrefix
     * @return
     * @throws SignatureException
     * @throws IOException
     */
    public Iterable<Contents> listObjects(final String bucket, final String keyPrefix) throws SignatureException, IOException {
        return this.listObjects(bucket, keyPrefix, Integer.MAX_VALUE);
    }

    /**
     * Returns information about all of the objects in the bucket, regardless of how many objects the bucket contains.
     * 
     * @param bucket
     * @param keyPrefix
     * @param maxKeys
     * @return
     * @throws SignatureException
     * @throws IOException
     */
    public Iterable<Contents> listObjects(final String bucket, final String keyPrefix, final int maxKeys) throws SignatureException, IOException {
        final List<Contents> contentList = new ArrayList<>();
        
        int remainingKeys = maxKeys;
        boolean isTruncated = false;
        String marker = null;
        
        do {
            final GetBucketRequest request = new GetBucketRequest(bucket);
            request.withMaxKeys(Math.min(remainingKeys, DEFAULT_MAX_KEYS));
            if (keyPrefix != null) {
                request.withPrefix(keyPrefix);
            }
            if (isTruncated) {
                request.withNextMarker(marker);
            }
            
            try (final GetBucketResponse response = this.client.getBucket(request)) {
                final ListBucketResult result = response.getResult();
                
                isTruncated = result.isTruncated();
                marker = result.getNextMarker();
                remainingKeys -= result.getContentsList().size();
                
                for (final Contents contents : result.getContentsList()) {
                    contentList.add(contents);
                }
            }
        } while (isTruncated && remainingKeys > 0);
        
        return contentList;
    }

    /**
     * Returns an object list with which you can call {@code startWriteJob} based on the files in a {@code directory}.
     * This method traverses the {@code directory} recursively.
     * 
     * @param directory
     * @return
     * @throws IOException
     */
    public Iterable<Ds3Object> listObjectsForDirectory(final Path directory) throws IOException {
        final List<Ds3Object> objects = new ArrayList<>();
        Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(final Path file, final BasicFileAttributes attrs) throws IOException {
                objects.add(new Ds3Object(directory.relativize(file).toString(), Files.size(file)));
                return FileVisitResult.CONTINUE;
            }
        });
        return objects;
    }
}