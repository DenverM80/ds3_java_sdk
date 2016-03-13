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
package com.spectralogic.ds3client.commands;

import com.spectralogic.ds3client.networking.HttpVerb;
import java.util.UUID;

public class PutMultiPartUploadPartRequest extends AbstractRequest {

    // Variables
    
    private final String bucketName;

    private final String objectName;

    private final int partNumber;

    private final String uploadId;

    // Constructor
    
    public PutMultiPartUploadPartRequest(final String bucketName, final String objectName, final int partNumber, final String uploadId) {
        this.bucketName = bucketName;
        this.objectName = objectName;
        this.partNumber = partNumber;
        this.uploadId = uploadId;
                this.getQueryParams().put("part_number", Integer.toString(partNumber));
        this.getQueryParams().put("upload_id", uploadId);
    }


    @Override
    public HttpVerb getVerb() {
        return HttpVerb.PUT;
    }

    @Override
    public String getPath() {
        return "/" + this.bucketName + "/" + this.objectName;
    }
    
    public String getBucketName() {
        return this.bucketName;
    }


    public String getObjectName() {
        return this.objectName;
    }


    public int getPartNumber() {
        return this.partNumber;
    }


    public String getUploadId() {
        return this.uploadId;
    }

}