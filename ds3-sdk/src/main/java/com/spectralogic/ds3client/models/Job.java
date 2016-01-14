/*
 * ******************************************************************************
 *   Copyright 2014-2015 Spectra Logic Corporation. All Rights Reserved.
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

// This code is auto-generated, do not modify
package com.spectralogic.ds3client.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import com.spectralogic.ds3client.models.JobChunkClientProcessingOrderGuarantee;
import java.util.Date;
import java.lang.String;
import com.spectralogic.ds3client.models.BlobStoreTaskPriority;
import com.spectralogic.ds3client.models.JobRequestType;

public class Job {

    // Variables
    @JsonProperty("BucketId")
    private UUID bucketId;

    @JsonProperty("CachedSizeInBytes")
    private long cachedSizeInBytes;

    @JsonProperty("ChunkClientProcessingOrderGuarantee")
    private JobChunkClientProcessingOrderGuarantee chunkClientProcessingOrderGuarantee;

    @JsonProperty("CompletedSizeInBytes")
    private long completedSizeInBytes;

    @JsonProperty("CreatedAt")
    private Date createdAt;

    @JsonProperty("ErrorMessage")
    private String errorMessage;

    @JsonProperty("Id")
    private UUID id;

    @JsonProperty("Naked")
    private boolean naked;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("OriginalSizeInBytes")
    private long originalSizeInBytes;

    @JsonProperty("Priority")
    private BlobStoreTaskPriority priority;

    @JsonProperty("Rechunked")
    private Date rechunked;

    @JsonProperty("RequestType")
    private JobRequestType requestType;

    @JsonProperty("Reshapable")
    private boolean reshapable;

    @JsonProperty("Truncated")
    private boolean truncated;

    @JsonProperty("UserId")
    private UUID userId;

    // Constructor
    public Job(final UUID bucketId, final long cachedSizeInBytes, final JobChunkClientProcessingOrderGuarantee chunkClientProcessingOrderGuarantee, final long completedSizeInBytes, final Date createdAt, final String errorMessage, final UUID id, final boolean naked, final String name, final long originalSizeInBytes, final BlobStoreTaskPriority priority, final Date rechunked, final JobRequestType requestType, final boolean reshapable, final boolean truncated, final UUID userId) {
        this.bucketId = bucketId;
        this.cachedSizeInBytes = cachedSizeInBytes;
        this.chunkClientProcessingOrderGuarantee = chunkClientProcessingOrderGuarantee;
        this.completedSizeInBytes = completedSizeInBytes;
        this.createdAt = createdAt;
        this.errorMessage = errorMessage;
        this.id = id;
        this.naked = naked;
        this.name = name;
        this.originalSizeInBytes = originalSizeInBytes;
        this.priority = priority;
        this.rechunked = rechunked;
        this.requestType = requestType;
        this.reshapable = reshapable;
        this.truncated = truncated;
        this.userId = userId;
    }

    // Getters and Setters
    
    public UUID getBucketId() {
        return this.bucketId;
    }

    public void setBucketId(final UUID bucketId) {
        this.bucketId = bucketId;
    }


    public long getCachedSizeInBytes() {
        return this.cachedSizeInBytes;
    }

    public void setCachedSizeInBytes(final long cachedSizeInBytes) {
        this.cachedSizeInBytes = cachedSizeInBytes;
    }


    public JobChunkClientProcessingOrderGuarantee getChunkClientProcessingOrderGuarantee() {
        return this.chunkClientProcessingOrderGuarantee;
    }

    public void setChunkClientProcessingOrderGuarantee(final JobChunkClientProcessingOrderGuarantee chunkClientProcessingOrderGuarantee) {
        this.chunkClientProcessingOrderGuarantee = chunkClientProcessingOrderGuarantee;
    }


    public long getCompletedSizeInBytes() {
        return this.completedSizeInBytes;
    }

    public void setCompletedSizeInBytes(final long completedSizeInBytes) {
        this.completedSizeInBytes = completedSizeInBytes;
    }


    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(final Date createdAt) {
        this.createdAt = createdAt;
    }


    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }


    public UUID getId() {
        return this.id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }


    public boolean getNaked() {
        return this.naked;
    }

    public void setNaked(final boolean naked) {
        this.naked = naked;
    }


    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }


    public long getOriginalSizeInBytes() {
        return this.originalSizeInBytes;
    }

    public void setOriginalSizeInBytes(final long originalSizeInBytes) {
        this.originalSizeInBytes = originalSizeInBytes;
    }


    public BlobStoreTaskPriority getPriority() {
        return this.priority;
    }

    public void setPriority(final BlobStoreTaskPriority priority) {
        this.priority = priority;
    }


    public Date getRechunked() {
        return this.rechunked;
    }

    public void setRechunked(final Date rechunked) {
        this.rechunked = rechunked;
    }


    public JobRequestType getRequestType() {
        return this.requestType;
    }

    public void setRequestType(final JobRequestType requestType) {
        this.requestType = requestType;
    }


    public boolean getReshapable() {
        return this.reshapable;
    }

    public void setReshapable(final boolean reshapable) {
        this.reshapable = reshapable;
    }


    public boolean getTruncated() {
        return this.truncated;
    }

    public void setTruncated(final boolean truncated) {
        this.truncated = truncated;
    }


    public UUID getUserId() {
        return this.userId;
    }

    public void setUserId(final UUID userId) {
        this.userId = userId;
    }

}