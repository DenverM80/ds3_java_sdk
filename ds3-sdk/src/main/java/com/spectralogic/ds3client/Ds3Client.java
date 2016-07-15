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
package com.spectralogic.ds3client;

import com.spectralogic.ds3client.annotations.Action;
import com.spectralogic.ds3client.annotations.Resource;
import com.spectralogic.ds3client.annotations.ResponsePayloadModel;
import com.spectralogic.ds3client.commands.*;
import com.spectralogic.ds3client.commands.spectrads3.*;
import com.spectralogic.ds3client.commands.spectrads3.notifications.*;
import com.spectralogic.ds3client.models.JobNode;
import com.spectralogic.ds3client.networking.ConnectionDetails;

import java.io.Closeable;
import java.io.IOException;

public interface Ds3Client extends Closeable {

    ConnectionDetails getConnectionDetails();

    
    AbortMultiPartUploadResponse abortMultiPartUpload(AbortMultiPartUploadRequest request)
            throws IOException;
    
    CompleteMultiPartUploadResponse completeMultiPartUpload(CompleteMultiPartUploadRequest request)
            throws IOException;
    
    PutBucketResponse putBucket(PutBucketRequest request)
            throws IOException;
    
    PutMultiPartUploadPartResponse putMultiPartUploadPart(PutMultiPartUploadPartRequest request)
            throws IOException;
    
    PutObjectResponse putObject(PutObjectRequest request)
            throws IOException;
    
    DeleteBucketResponse deleteBucket(DeleteBucketRequest request)
            throws IOException;
    
    DeleteObjectResponse deleteObject(DeleteObjectRequest request)
            throws IOException;
    
    DeleteObjectsResponse deleteObjects(DeleteObjectsRequest request)
            throws IOException;
    
    GetBucketResponse getBucket(GetBucketRequest request)
            throws IOException;
    
    GetServiceResponse getService(GetServiceRequest request)
            throws IOException;
    
    HeadBucketResponse headBucket(HeadBucketRequest request)
            throws IOException;
    
    HeadObjectResponse headObject(HeadObjectRequest request)
            throws IOException;
    
    InitiateMultiPartUploadResponse initiateMultiPartUpload(InitiateMultiPartUploadRequest request)
            throws IOException;
    
    ListMultiPartUploadPartsResponse listMultiPartUploadParts(ListMultiPartUploadPartsRequest request)
            throws IOException;
    
    ListMultiPartUploadsResponse listMultiPartUploads(ListMultiPartUploadsRequest request)
            throws IOException;
    @ResponsePayloadModel("BucketAcl")
    @Action("CREATE")
    @Resource("BUCKET_ACL")
    PutBucketAclForGroupSpectraS3Response putBucketAclForGroupSpectraS3(PutBucketAclForGroupSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("BucketAcl")
    @Action("CREATE")
    @Resource("BUCKET_ACL")
    PutBucketAclForUserSpectraS3Response putBucketAclForUserSpectraS3(PutBucketAclForUserSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPolicyAcl")
    @Action("CREATE")
    @Resource("DATA_POLICY_ACL")
    PutDataPolicyAclForGroupSpectraS3Response putDataPolicyAclForGroupSpectraS3(PutDataPolicyAclForGroupSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPolicyAcl")
    @Action("CREATE")
    @Resource("DATA_POLICY_ACL")
    PutDataPolicyAclForUserSpectraS3Response putDataPolicyAclForUserSpectraS3(PutDataPolicyAclForUserSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("BucketAcl")
    @Action("CREATE")
    @Resource("BUCKET_ACL")
    PutGlobalBucketAclForGroupSpectraS3Response putGlobalBucketAclForGroupSpectraS3(PutGlobalBucketAclForGroupSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("BucketAcl")
    @Action("CREATE")
    @Resource("BUCKET_ACL")
    PutGlobalBucketAclForUserSpectraS3Response putGlobalBucketAclForUserSpectraS3(PutGlobalBucketAclForUserSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPolicyAcl")
    @Action("CREATE")
    @Resource("DATA_POLICY_ACL")
    PutGlobalDataPolicyAclForGroupSpectraS3Response putGlobalDataPolicyAclForGroupSpectraS3(PutGlobalDataPolicyAclForGroupSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPolicyAcl")
    @Action("CREATE")
    @Resource("DATA_POLICY_ACL")
    PutGlobalDataPolicyAclForUserSpectraS3Response putGlobalDataPolicyAclForUserSpectraS3(PutGlobalDataPolicyAclForUserSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("BUCKET_ACL")
    DeleteBucketAclSpectraS3Response deleteBucketAclSpectraS3(DeleteBucketAclSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("DATA_POLICY_ACL")
    DeleteDataPolicyAclSpectraS3Response deleteDataPolicyAclSpectraS3(DeleteDataPolicyAclSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("BucketAcl")
    @Action("SHOW")
    @Resource("BUCKET_ACL")
    GetBucketAclSpectraS3Response getBucketAclSpectraS3(GetBucketAclSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("BucketAclList")
    @Action("LIST")
    @Resource("BUCKET_ACL")
    GetBucketAclsSpectraS3Response getBucketAclsSpectraS3(GetBucketAclsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPolicyAcl")
    @Action("SHOW")
    @Resource("DATA_POLICY_ACL")
    GetDataPolicyAclSpectraS3Response getDataPolicyAclSpectraS3(GetDataPolicyAclSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPolicyAclList")
    @Action("LIST")
    @Resource("DATA_POLICY_ACL")
    GetDataPolicyAclsSpectraS3Response getDataPolicyAclsSpectraS3(GetDataPolicyAclsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Bucket")
    @Action("CREATE")
    @Resource("BUCKET")
    PutBucketSpectraS3Response putBucketSpectraS3(PutBucketSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("BUCKET")
    DeleteBucketSpectraS3Response deleteBucketSpectraS3(DeleteBucketSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Bucket")
    @Action("SHOW")
    @Resource("BUCKET")
    GetBucketSpectraS3Response getBucketSpectraS3(GetBucketSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("BucketList")
    @Action("LIST")
    @Resource("BUCKET")
    GetBucketsSpectraS3Response getBucketsSpectraS3(GetBucketsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Bucket")
    @Action("MODIFY")
    @Resource("BUCKET")
    ModifyBucketSpectraS3Response modifyBucketSpectraS3(ModifyBucketSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("CACHE_FILESYSTEM")
    ForceFullCacheReclaimSpectraS3Response forceFullCacheReclaimSpectraS3(ForceFullCacheReclaimSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("CacheFilesystem")
    @Action("SHOW")
    @Resource("CACHE_FILESYSTEM")
    GetCacheFilesystemSpectraS3Response getCacheFilesystemSpectraS3(GetCacheFilesystemSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("CacheFilesystemList")
    @Action("LIST")
    @Resource("CACHE_FILESYSTEM")
    GetCacheFilesystemsSpectraS3Response getCacheFilesystemsSpectraS3(GetCacheFilesystemsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("CacheInformation")
    @Action("LIST")
    @Resource("CACHE_STATE")
    GetCacheStateSpectraS3Response getCacheStateSpectraS3(GetCacheStateSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("CacheFilesystem")
    @Action("MODIFY")
    @Resource("CACHE_FILESYSTEM")
    ModifyCacheFilesystemSpectraS3Response modifyCacheFilesystemSpectraS3(ModifyCacheFilesystemSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("CapacitySummaryContainer")
    @Action("LIST")
    @Resource("CAPACITY_SUMMARY")
    GetBucketCapacitySummarySpectraS3Response getBucketCapacitySummarySpectraS3(GetBucketCapacitySummarySpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("CapacitySummaryContainer")
    @Action("LIST")
    @Resource("CAPACITY_SUMMARY")
    GetStorageDomainCapacitySummarySpectraS3Response getStorageDomainCapacitySummarySpectraS3(GetStorageDomainCapacitySummarySpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("CapacitySummaryContainer")
    @Action("LIST")
    @Resource("CAPACITY_SUMMARY")
    GetSystemCapacitySummarySpectraS3Response getSystemCapacitySummarySpectraS3(GetSystemCapacitySummarySpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPathBackend")
    @Action("LIST")
    @Resource("DATA_PATH_BACKEND")
    GetDataPathBackendSpectraS3Response getDataPathBackendSpectraS3(GetDataPathBackendSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("BlobStoreTasksInformation")
    @Action("LIST")
    @Resource("BLOB_STORE_TASK")
    GetDataPlannerBlobStoreTasksSpectraS3Response getDataPlannerBlobStoreTasksSpectraS3(GetDataPlannerBlobStoreTasksSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPathBackend")
    @Action("BULK_MODIFY")
    @Resource("DATA_PATH_BACKEND")
    ModifyDataPathBackendSpectraS3Response modifyDataPathBackendSpectraS3(ModifyDataPathBackendSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPersistenceRule")
    @Action("CREATE")
    @Resource("DATA_PERSISTENCE_RULE")
    PutDataPersistenceRuleSpectraS3Response putDataPersistenceRuleSpectraS3(PutDataPersistenceRuleSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPolicy")
    @Action("CREATE")
    @Resource("DATA_POLICY")
    PutDataPolicySpectraS3Response putDataPolicySpectraS3(PutDataPolicySpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataReplicationRule")
    @Action("CREATE")
    @Resource("DATA_REPLICATION_RULE")
    PutDataReplicationRuleSpectraS3Response putDataReplicationRuleSpectraS3(PutDataReplicationRuleSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("DATA_PERSISTENCE_RULE")
    DeleteDataPersistenceRuleSpectraS3Response deleteDataPersistenceRuleSpectraS3(DeleteDataPersistenceRuleSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("DATA_POLICY")
    DeleteDataPolicySpectraS3Response deleteDataPolicySpectraS3(DeleteDataPolicySpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("DATA_REPLICATION_RULE")
    DeleteDataReplicationRuleSpectraS3Response deleteDataReplicationRuleSpectraS3(DeleteDataReplicationRuleSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPersistenceRule")
    @Action("SHOW")
    @Resource("DATA_PERSISTENCE_RULE")
    GetDataPersistenceRuleSpectraS3Response getDataPersistenceRuleSpectraS3(GetDataPersistenceRuleSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPersistenceRuleList")
    @Action("LIST")
    @Resource("DATA_PERSISTENCE_RULE")
    GetDataPersistenceRulesSpectraS3Response getDataPersistenceRulesSpectraS3(GetDataPersistenceRulesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPolicyList")
    @Action("LIST")
    @Resource("DATA_POLICY")
    GetDataPoliciesSpectraS3Response getDataPoliciesSpectraS3(GetDataPoliciesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPolicy")
    @Action("SHOW")
    @Resource("DATA_POLICY")
    GetDataPolicySpectraS3Response getDataPolicySpectraS3(GetDataPolicySpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataReplicationRule")
    @Action("SHOW")
    @Resource("DATA_REPLICATION_RULE")
    GetDataReplicationRuleSpectraS3Response getDataReplicationRuleSpectraS3(GetDataReplicationRuleSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataReplicationRuleList")
    @Action("LIST")
    @Resource("DATA_REPLICATION_RULE")
    GetDataReplicationRulesSpectraS3Response getDataReplicationRulesSpectraS3(GetDataReplicationRulesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPersistenceRule")
    @Action("MODIFY")
    @Resource("DATA_PERSISTENCE_RULE")
    ModifyDataPersistenceRuleSpectraS3Response modifyDataPersistenceRuleSpectraS3(ModifyDataPersistenceRuleSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPolicy")
    @Action("MODIFY")
    @Resource("DATA_POLICY")
    ModifyDataPolicySpectraS3Response modifyDataPolicySpectraS3(ModifyDataPolicySpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataReplicationRule")
    @Action("MODIFY")
    @Resource("DATA_REPLICATION_RULE")
    ModifyDataReplicationRuleSpectraS3Response modifyDataReplicationRuleSpectraS3(ModifyDataReplicationRuleSpectraS3Request request)
            throws IOException;
    @Action("BULK_DELETE")
    @Resource("SUSPECT_BLOB_POOL")
    ClearSuspectBlobPoolsSpectraS3Response clearSuspectBlobPoolsSpectraS3(ClearSuspectBlobPoolsSpectraS3Request request)
            throws IOException;
    @Action("BULK_DELETE")
    @Resource("SUSPECT_BLOB_TAPE")
    ClearSuspectBlobTapesSpectraS3Response clearSuspectBlobTapesSpectraS3(ClearSuspectBlobTapesSpectraS3Request request)
            throws IOException;
    @Action("BULK_DELETE")
    @Resource("SUSPECT_BLOB_TARGET")
    ClearSuspectBlobTargetsSpectraS3Response clearSuspectBlobTargetsSpectraS3(ClearSuspectBlobTargetsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DegradedBlobList")
    @Action("LIST")
    @Resource("DEGRADED_BLOB")
    GetDegradedBlobsSpectraS3Response getDegradedBlobsSpectraS3(GetDegradedBlobsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("BucketList")
    @Action("LIST")
    @Resource("DEGRADED_BUCKET")
    GetDegradedBucketsSpectraS3Response getDegradedBucketsSpectraS3(GetDegradedBucketsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPersistenceRuleList")
    @Action("LIST")
    @Resource("DEGRADED_DATA_PERSISTENCE_RULE")
    GetDegradedDataPersistenceRulesSpectraS3Response getDegradedDataPersistenceRulesSpectraS3(GetDegradedDataPersistenceRulesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataReplicationRuleList")
    @Action("LIST")
    @Resource("DEGRADED_DATA_REPLICATION_RULE")
    GetDegradedDataReplicationRulesSpectraS3Response getDegradedDataReplicationRulesSpectraS3(GetDegradedDataReplicationRulesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("SuspectBlobPoolList")
    @Action("LIST")
    @Resource("SUSPECT_BLOB_POOL")
    GetSuspectBlobPoolsSpectraS3Response getSuspectBlobPoolsSpectraS3(GetSuspectBlobPoolsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("SuspectBlobTapeList")
    @Action("LIST")
    @Resource("SUSPECT_BLOB_TAPE")
    GetSuspectBlobTapesSpectraS3Response getSuspectBlobTapesSpectraS3(GetSuspectBlobTapesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("SuspectBlobTargetList")
    @Action("LIST")
    @Resource("SUSPECT_BLOB_TARGET")
    GetSuspectBlobTargetsSpectraS3Response getSuspectBlobTargetsSpectraS3(GetSuspectBlobTargetsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("BucketList")
    @Action("LIST")
    @Resource("SUSPECT_BUCKET")
    GetSuspectBucketsSpectraS3Response getSuspectBucketsSpectraS3(GetSuspectBucketsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("PhysicalPlacement")
    @Action("LIST")
    @Resource("SUSPECT_OBJECT")
    GetSuspectObjectsSpectraS3Response getSuspectObjectsSpectraS3(GetSuspectObjectsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("BulkObjectList")
    @Action("LIST")
    @Resource("SUSPECT_OBJECT")
    GetSuspectObjectsWithFullDetailsSpectraS3Response getSuspectObjectsWithFullDetailsSpectraS3(GetSuspectObjectsWithFullDetailsSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("SUSPECT_BLOB_POOL")
    MarkSuspectBlobPoolsAsDegradedSpectraS3Response markSuspectBlobPoolsAsDegradedSpectraS3(MarkSuspectBlobPoolsAsDegradedSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("SUSPECT_BLOB_TAPE")
    MarkSuspectBlobTapesAsDegradedSpectraS3Response markSuspectBlobTapesAsDegradedSpectraS3(MarkSuspectBlobTapesAsDegradedSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("SUSPECT_BLOB_TARGET")
    MarkSuspectBlobTargetsAsDegradedSpectraS3Response markSuspectBlobTargetsAsDegradedSpectraS3(MarkSuspectBlobTargetsAsDegradedSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("GroupMember")
    @Action("CREATE")
    @Resource("GROUP_MEMBER")
    PutGroupGroupMemberSpectraS3Response putGroupGroupMemberSpectraS3(PutGroupGroupMemberSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Group")
    @Action("CREATE")
    @Resource("GROUP")
    PutGroupSpectraS3Response putGroupSpectraS3(PutGroupSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("GroupMember")
    @Action("CREATE")
    @Resource("GROUP_MEMBER")
    PutUserGroupMemberSpectraS3Response putUserGroupMemberSpectraS3(PutUserGroupMemberSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("GROUP_MEMBER")
    DeleteGroupMemberSpectraS3Response deleteGroupMemberSpectraS3(DeleteGroupMemberSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("GROUP")
    DeleteGroupSpectraS3Response deleteGroupSpectraS3(DeleteGroupSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("GroupMember")
    @Action("SHOW")
    @Resource("GROUP_MEMBER")
    GetGroupMemberSpectraS3Response getGroupMemberSpectraS3(GetGroupMemberSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("GroupMemberList")
    @Action("LIST")
    @Resource("GROUP_MEMBER")
    GetGroupMembersSpectraS3Response getGroupMembersSpectraS3(GetGroupMembersSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Group")
    @Action("SHOW")
    @Resource("GROUP")
    GetGroupSpectraS3Response getGroupSpectraS3(GetGroupSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("GroupList")
    @Action("LIST")
    @Resource("GROUP")
    GetGroupsSpectraS3Response getGroupsSpectraS3(GetGroupsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Group")
    @Action("MODIFY")
    @Resource("GROUP")
    ModifyGroupSpectraS3Response modifyGroupSpectraS3(ModifyGroupSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Group")
    @Action("MODIFY")
    @Resource("GROUP")
    VerifyUserIsMemberOfGroupSpectraS3Response verifyUserIsMemberOfGroupSpectraS3(VerifyUserIsMemberOfGroupSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Objects")
    @Action("MODIFY")
    @Resource("JOB_CHUNK")
    AllocateJobChunkSpectraS3Response allocateJobChunkSpectraS3(AllocateJobChunkSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("ACTIVE_JOB")
    CancelActiveJobSpectraS3Response cancelActiveJobSpectraS3(CancelActiveJobSpectraS3Request request)
            throws IOException;
    @Action("BULK_DELETE")
    @Resource("ACTIVE_JOB")
    CancelAllActiveJobsSpectraS3Response cancelAllActiveJobsSpectraS3(CancelAllActiveJobsSpectraS3Request request)
            throws IOException;
    @Action("BULK_DELETE")
    @Resource("JOB")
    CancelAllJobsSpectraS3Response cancelAllJobsSpectraS3(CancelAllJobsSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("JOB")
    CancelJobSpectraS3Response cancelJobSpectraS3(CancelJobSpectraS3Request request)
            throws IOException;
    @Action("BULK_DELETE")
    @Resource("CANCELED_JOB")
    ClearAllCanceledJobsSpectraS3Response clearAllCanceledJobsSpectraS3(ClearAllCanceledJobsSpectraS3Request request)
            throws IOException;
    @Action("BULK_DELETE")
    @Resource("COMPLETED_JOB")
    ClearAllCompletedJobsSpectraS3Response clearAllCompletedJobsSpectraS3(ClearAllCompletedJobsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("MasterObjectList")
    @Action("MODIFY")
    @Resource("BUCKET")
    GetBulkJobSpectraS3Response getBulkJobSpectraS3(GetBulkJobSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("MasterObjectList")
    @Action("MODIFY")
    @Resource("BUCKET")
    PutBulkJobSpectraS3Response putBulkJobSpectraS3(PutBulkJobSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("MasterObjectList")
    @Action("MODIFY")
    @Resource("BUCKET")
    VerifyBulkJobSpectraS3Response verifyBulkJobSpectraS3(VerifyBulkJobSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("ActiveJob")
    @Action("SHOW")
    @Resource("ACTIVE_JOB")
    GetActiveJobSpectraS3Response getActiveJobSpectraS3(GetActiveJobSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("ActiveJobList")
    @Action("LIST")
    @Resource("ACTIVE_JOB")
    GetActiveJobsSpectraS3Response getActiveJobsSpectraS3(GetActiveJobsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("CanceledJob")
    @Action("SHOW")
    @Resource("CANCELED_JOB")
    GetCanceledJobSpectraS3Response getCanceledJobSpectraS3(GetCanceledJobSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("CanceledJobList")
    @Action("LIST")
    @Resource("CANCELED_JOB")
    GetCanceledJobsSpectraS3Response getCanceledJobsSpectraS3(GetCanceledJobsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("CompletedJob")
    @Action("SHOW")
    @Resource("COMPLETED_JOB")
    GetCompletedJobSpectraS3Response getCompletedJobSpectraS3(GetCompletedJobSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("CompletedJobList")
    @Action("LIST")
    @Resource("COMPLETED_JOB")
    GetCompletedJobsSpectraS3Response getCompletedJobsSpectraS3(GetCompletedJobsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("JobChunk")
    @Action("SHOW")
    @Resource("JOB_CHUNK_DAO")
    GetJobChunkDaoSpectraS3Response getJobChunkDaoSpectraS3(GetJobChunkDaoSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Objects")
    @Action("SHOW")
    @Resource("JOB_CHUNK")
    GetJobChunkSpectraS3Response getJobChunkSpectraS3(GetJobChunkSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("MasterObjectList")
    @Action("LIST")
    @Resource("JOB_CHUNK")
    GetJobChunksReadyForClientProcessingSpectraS3Response getJobChunksReadyForClientProcessingSpectraS3(GetJobChunksReadyForClientProcessingSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("MasterObjectList")
    @Action("SHOW")
    @Resource("JOB")
    GetJobSpectraS3Response getJobSpectraS3(GetJobSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("String")
    @Action("SHOW")
    @Resource("JOB")
    GetJobToReplicateSpectraS3Response getJobToReplicateSpectraS3(GetJobToReplicateSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("JobList")
    @Action("LIST")
    @Resource("JOB")
    GetJobsSpectraS3Response getJobsSpectraS3(GetJobsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("MasterObjectList")
    @Action("MODIFY")
    @Resource("ACTIVE_JOB")
    ModifyActiveJobSpectraS3Response modifyActiveJobSpectraS3(ModifyActiveJobSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("MasterObjectList")
    @Action("MODIFY")
    @Resource("JOB")
    ModifyJobSpectraS3Response modifyJobSpectraS3(ModifyJobSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("MasterObjectList")
    @Action("MODIFY")
    @Resource("BUCKET")
    ReplicatePutJobSpectraS3Response replicatePutJobSpectraS3(ReplicatePutJobSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("ACTIVE_JOB")
    TruncateActiveJobSpectraS3Response truncateActiveJobSpectraS3(TruncateActiveJobSpectraS3Request request)
            throws IOException;
    @Action("BULK_DELETE")
    @Resource("ACTIVE_JOB")
    TruncateAllActiveJobsSpectraS3Response truncateAllActiveJobsSpectraS3(TruncateAllActiveJobsSpectraS3Request request)
            throws IOException;
    @Action("BULK_DELETE")
    @Resource("JOB")
    TruncateAllJobsSpectraS3Response truncateAllJobsSpectraS3(TruncateAllJobsSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("JOB")
    TruncateJobSpectraS3Response truncateJobSpectraS3(TruncateJobSpectraS3Request request)
            throws IOException;
    @Action("MODIFY")
    @Resource("BUCKET")
    VerifySafeToCreatePutJobSpectraS3Response verifySafeToCreatePutJobSpectraS3(VerifySafeToCreatePutJobSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Node")
    @Action("SHOW")
    @Resource("NODE")
    GetNodeSpectraS3Response getNodeSpectraS3(GetNodeSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("NodeList")
    @Action("LIST")
    @Resource("NODE")
    GetNodesSpectraS3Response getNodesSpectraS3(GetNodesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Node")
    @Action("MODIFY")
    @Resource("NODE")
    ModifyNodeSpectraS3Response modifyNodeSpectraS3(ModifyNodeSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Ds3TargetFailureNotificationRegistration")
    @Action("CREATE")
    @Resource("DS3_TARGET_FAILURE_NOTIFICATION_REGISTRATION")
    PutDs3TargetFailureNotificationRegistrationSpectraS3Response putDs3TargetFailureNotificationRegistrationSpectraS3(PutDs3TargetFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("JobCompletedNotificationRegistration")
    @Action("CREATE")
    @Resource("JOB_COMPLETED_NOTIFICATION_REGISTRATION")
    PutJobCompletedNotificationRegistrationSpectraS3Response putJobCompletedNotificationRegistrationSpectraS3(PutJobCompletedNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("JobCreatedNotificationRegistration")
    @Action("CREATE")
    @Resource("JOB_CREATED_NOTIFICATION_REGISTRATION")
    PutJobCreatedNotificationRegistrationSpectraS3Response putJobCreatedNotificationRegistrationSpectraS3(PutJobCreatedNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("JobCreationFailedNotificationRegistration")
    @Action("CREATE")
    @Resource("JOB_CREATION_FAILED_NOTIFICATION_REGISTRATION")
    PutJobCreationFailedNotificationRegistrationSpectraS3Response putJobCreationFailedNotificationRegistrationSpectraS3(PutJobCreationFailedNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("S3ObjectCachedNotificationRegistration")
    @Action("CREATE")
    @Resource("OBJECT_CACHED_NOTIFICATION_REGISTRATION")
    PutObjectCachedNotificationRegistrationSpectraS3Response putObjectCachedNotificationRegistrationSpectraS3(PutObjectCachedNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("S3ObjectLostNotificationRegistration")
    @Action("CREATE")
    @Resource("OBJECT_LOST_NOTIFICATION_REGISTRATION")
    PutObjectLostNotificationRegistrationSpectraS3Response putObjectLostNotificationRegistrationSpectraS3(PutObjectLostNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("S3ObjectPersistedNotificationRegistration")
    @Action("CREATE")
    @Resource("OBJECT_PERSISTED_NOTIFICATION_REGISTRATION")
    PutObjectPersistedNotificationRegistrationSpectraS3Response putObjectPersistedNotificationRegistrationSpectraS3(PutObjectPersistedNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("PoolFailureNotificationRegistration")
    @Action("CREATE")
    @Resource("POOL_FAILURE_NOTIFICATION_REGISTRATION")
    PutPoolFailureNotificationRegistrationSpectraS3Response putPoolFailureNotificationRegistrationSpectraS3(PutPoolFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("StorageDomainFailureNotificationRegistration")
    @Action("CREATE")
    @Resource("STORAGE_DOMAIN_FAILURE_NOTIFICATION_REGISTRATION")
    PutStorageDomainFailureNotificationRegistrationSpectraS3Response putStorageDomainFailureNotificationRegistrationSpectraS3(PutStorageDomainFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("SystemFailureNotificationRegistration")
    @Action("CREATE")
    @Resource("SYSTEM_FAILURE_NOTIFICATION_REGISTRATION")
    PutSystemFailureNotificationRegistrationSpectraS3Response putSystemFailureNotificationRegistrationSpectraS3(PutSystemFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeFailureNotificationRegistration")
    @Action("CREATE")
    @Resource("TAPE_FAILURE_NOTIFICATION_REGISTRATION")
    PutTapeFailureNotificationRegistrationSpectraS3Response putTapeFailureNotificationRegistrationSpectraS3(PutTapeFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapePartitionFailureNotificationRegistration")
    @Action("CREATE")
    @Resource("TAPE_PARTITION_FAILURE_NOTIFICATION_REGISTRATION")
    PutTapePartitionFailureNotificationRegistrationSpectraS3Response putTapePartitionFailureNotificationRegistrationSpectraS3(PutTapePartitionFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("DS3_TARGET_FAILURE_NOTIFICATION_REGISTRATION")
    DeleteDs3TargetFailureNotificationRegistrationSpectraS3Response deleteDs3TargetFailureNotificationRegistrationSpectraS3(DeleteDs3TargetFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("JOB_COMPLETED_NOTIFICATION_REGISTRATION")
    DeleteJobCompletedNotificationRegistrationSpectraS3Response deleteJobCompletedNotificationRegistrationSpectraS3(DeleteJobCompletedNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("JOB_CREATED_NOTIFICATION_REGISTRATION")
    DeleteJobCreatedNotificationRegistrationSpectraS3Response deleteJobCreatedNotificationRegistrationSpectraS3(DeleteJobCreatedNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("JOB_CREATION_FAILED_NOTIFICATION_REGISTRATION")
    DeleteJobCreationFailedNotificationRegistrationSpectraS3Response deleteJobCreationFailedNotificationRegistrationSpectraS3(DeleteJobCreationFailedNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("OBJECT_CACHED_NOTIFICATION_REGISTRATION")
    DeleteObjectCachedNotificationRegistrationSpectraS3Response deleteObjectCachedNotificationRegistrationSpectraS3(DeleteObjectCachedNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("OBJECT_LOST_NOTIFICATION_REGISTRATION")
    DeleteObjectLostNotificationRegistrationSpectraS3Response deleteObjectLostNotificationRegistrationSpectraS3(DeleteObjectLostNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("OBJECT_PERSISTED_NOTIFICATION_REGISTRATION")
    DeleteObjectPersistedNotificationRegistrationSpectraS3Response deleteObjectPersistedNotificationRegistrationSpectraS3(DeleteObjectPersistedNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("POOL_FAILURE_NOTIFICATION_REGISTRATION")
    DeletePoolFailureNotificationRegistrationSpectraS3Response deletePoolFailureNotificationRegistrationSpectraS3(DeletePoolFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("STORAGE_DOMAIN_FAILURE_NOTIFICATION_REGISTRATION")
    DeleteStorageDomainFailureNotificationRegistrationSpectraS3Response deleteStorageDomainFailureNotificationRegistrationSpectraS3(DeleteStorageDomainFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("SYSTEM_FAILURE_NOTIFICATION_REGISTRATION")
    DeleteSystemFailureNotificationRegistrationSpectraS3Response deleteSystemFailureNotificationRegistrationSpectraS3(DeleteSystemFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("TAPE_FAILURE_NOTIFICATION_REGISTRATION")
    DeleteTapeFailureNotificationRegistrationSpectraS3Response deleteTapeFailureNotificationRegistrationSpectraS3(DeleteTapeFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("TAPE_PARTITION_FAILURE_NOTIFICATION_REGISTRATION")
    DeleteTapePartitionFailureNotificationRegistrationSpectraS3Response deleteTapePartitionFailureNotificationRegistrationSpectraS3(DeleteTapePartitionFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Ds3TargetFailureNotificationRegistration")
    @Action("SHOW")
    @Resource("DS3_TARGET_FAILURE_NOTIFICATION_REGISTRATION")
    GetDs3TargetFailureNotificationRegistrationSpectraS3Response getDs3TargetFailureNotificationRegistrationSpectraS3(GetDs3TargetFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Ds3TargetFailureNotificationRegistrationList")
    @Action("LIST")
    @Resource("DS3_TARGET_FAILURE_NOTIFICATION_REGISTRATION")
    GetDs3TargetFailureNotificationRegistrationsSpectraS3Response getDs3TargetFailureNotificationRegistrationsSpectraS3(GetDs3TargetFailureNotificationRegistrationsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("JobCompletedNotificationRegistration")
    @Action("SHOW")
    @Resource("JOB_COMPLETED_NOTIFICATION_REGISTRATION")
    GetJobCompletedNotificationRegistrationSpectraS3Response getJobCompletedNotificationRegistrationSpectraS3(GetJobCompletedNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("JobCompletedNotificationRegistrationList")
    @Action("LIST")
    @Resource("JOB_COMPLETED_NOTIFICATION_REGISTRATION")
    GetJobCompletedNotificationRegistrationsSpectraS3Response getJobCompletedNotificationRegistrationsSpectraS3(GetJobCompletedNotificationRegistrationsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("JobCreatedNotificationRegistration")
    @Action("SHOW")
    @Resource("JOB_CREATED_NOTIFICATION_REGISTRATION")
    GetJobCreatedNotificationRegistrationSpectraS3Response getJobCreatedNotificationRegistrationSpectraS3(GetJobCreatedNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("JobCreatedNotificationRegistrationList")
    @Action("LIST")
    @Resource("JOB_CREATED_NOTIFICATION_REGISTRATION")
    GetJobCreatedNotificationRegistrationsSpectraS3Response getJobCreatedNotificationRegistrationsSpectraS3(GetJobCreatedNotificationRegistrationsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("JobCreationFailedNotificationRegistration")
    @Action("SHOW")
    @Resource("JOB_CREATION_FAILED_NOTIFICATION_REGISTRATION")
    GetJobCreationFailedNotificationRegistrationSpectraS3Response getJobCreationFailedNotificationRegistrationSpectraS3(GetJobCreationFailedNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("JobCreationFailedNotificationRegistrationList")
    @Action("LIST")
    @Resource("JOB_CREATION_FAILED_NOTIFICATION_REGISTRATION")
    GetJobCreationFailedNotificationRegistrationsSpectraS3Response getJobCreationFailedNotificationRegistrationsSpectraS3(GetJobCreationFailedNotificationRegistrationsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("S3ObjectCachedNotificationRegistration")
    @Action("SHOW")
    @Resource("OBJECT_CACHED_NOTIFICATION_REGISTRATION")
    GetObjectCachedNotificationRegistrationSpectraS3Response getObjectCachedNotificationRegistrationSpectraS3(GetObjectCachedNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("S3ObjectCachedNotificationRegistrationList")
    @Action("LIST")
    @Resource("OBJECT_CACHED_NOTIFICATION_REGISTRATION")
    GetObjectCachedNotificationRegistrationsSpectraS3Response getObjectCachedNotificationRegistrationsSpectraS3(GetObjectCachedNotificationRegistrationsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("S3ObjectLostNotificationRegistration")
    @Action("SHOW")
    @Resource("OBJECT_LOST_NOTIFICATION_REGISTRATION")
    GetObjectLostNotificationRegistrationSpectraS3Response getObjectLostNotificationRegistrationSpectraS3(GetObjectLostNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("S3ObjectLostNotificationRegistrationList")
    @Action("LIST")
    @Resource("OBJECT_LOST_NOTIFICATION_REGISTRATION")
    GetObjectLostNotificationRegistrationsSpectraS3Response getObjectLostNotificationRegistrationsSpectraS3(GetObjectLostNotificationRegistrationsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("S3ObjectPersistedNotificationRegistration")
    @Action("SHOW")
    @Resource("OBJECT_PERSISTED_NOTIFICATION_REGISTRATION")
    GetObjectPersistedNotificationRegistrationSpectraS3Response getObjectPersistedNotificationRegistrationSpectraS3(GetObjectPersistedNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("S3ObjectPersistedNotificationRegistrationList")
    @Action("LIST")
    @Resource("OBJECT_PERSISTED_NOTIFICATION_REGISTRATION")
    GetObjectPersistedNotificationRegistrationsSpectraS3Response getObjectPersistedNotificationRegistrationsSpectraS3(GetObjectPersistedNotificationRegistrationsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("PoolFailureNotificationRegistration")
    @Action("SHOW")
    @Resource("POOL_FAILURE_NOTIFICATION_REGISTRATION")
    GetPoolFailureNotificationRegistrationSpectraS3Response getPoolFailureNotificationRegistrationSpectraS3(GetPoolFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("PoolFailureNotificationRegistrationList")
    @Action("LIST")
    @Resource("POOL_FAILURE_NOTIFICATION_REGISTRATION")
    GetPoolFailureNotificationRegistrationsSpectraS3Response getPoolFailureNotificationRegistrationsSpectraS3(GetPoolFailureNotificationRegistrationsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("StorageDomainFailureNotificationRegistration")
    @Action("SHOW")
    @Resource("STORAGE_DOMAIN_FAILURE_NOTIFICATION_REGISTRATION")
    GetStorageDomainFailureNotificationRegistrationSpectraS3Response getStorageDomainFailureNotificationRegistrationSpectraS3(GetStorageDomainFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("StorageDomainFailureNotificationRegistrationList")
    @Action("LIST")
    @Resource("STORAGE_DOMAIN_FAILURE_NOTIFICATION_REGISTRATION")
    GetStorageDomainFailureNotificationRegistrationsSpectraS3Response getStorageDomainFailureNotificationRegistrationsSpectraS3(GetStorageDomainFailureNotificationRegistrationsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("SystemFailureNotificationRegistration")
    @Action("SHOW")
    @Resource("SYSTEM_FAILURE_NOTIFICATION_REGISTRATION")
    GetSystemFailureNotificationRegistrationSpectraS3Response getSystemFailureNotificationRegistrationSpectraS3(GetSystemFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("SystemFailureNotificationRegistrationList")
    @Action("LIST")
    @Resource("SYSTEM_FAILURE_NOTIFICATION_REGISTRATION")
    GetSystemFailureNotificationRegistrationsSpectraS3Response getSystemFailureNotificationRegistrationsSpectraS3(GetSystemFailureNotificationRegistrationsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeFailureNotificationRegistration")
    @Action("SHOW")
    @Resource("TAPE_FAILURE_NOTIFICATION_REGISTRATION")
    GetTapeFailureNotificationRegistrationSpectraS3Response getTapeFailureNotificationRegistrationSpectraS3(GetTapeFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeFailureNotificationRegistrationList")
    @Action("LIST")
    @Resource("TAPE_FAILURE_NOTIFICATION_REGISTRATION")
    GetTapeFailureNotificationRegistrationsSpectraS3Response getTapeFailureNotificationRegistrationsSpectraS3(GetTapeFailureNotificationRegistrationsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapePartitionFailureNotificationRegistration")
    @Action("SHOW")
    @Resource("TAPE_PARTITION_FAILURE_NOTIFICATION_REGISTRATION")
    GetTapePartitionFailureNotificationRegistrationSpectraS3Response getTapePartitionFailureNotificationRegistrationSpectraS3(GetTapePartitionFailureNotificationRegistrationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapePartitionFailureNotificationRegistrationList")
    @Action("LIST")
    @Resource("TAPE_PARTITION_FAILURE_NOTIFICATION_REGISTRATION")
    GetTapePartitionFailureNotificationRegistrationsSpectraS3Response getTapePartitionFailureNotificationRegistrationsSpectraS3(GetTapePartitionFailureNotificationRegistrationsSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("FOLDER")
    DeleteFolderRecursivelySpectraS3Response deleteFolderRecursivelySpectraS3(DeleteFolderRecursivelySpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("String")
    @Action("LIST")
    @Resource("BLOB_PERSISTENCE")
    GetBlobPersistenceSpectraS3Response getBlobPersistenceSpectraS3(GetBlobPersistenceSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("S3Object")
    @Action("SHOW")
    @Resource("OBJECT")
    GetObjectDetailsSpectraS3Response getObjectDetailsSpectraS3(GetObjectDetailsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("S3ObjectList")
    @Action("LIST")
    @Resource("OBJECT")
    GetObjectsDetailsSpectraS3Response getObjectsDetailsSpectraS3(GetObjectsDetailsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DetailedS3ObjectList")
    @Action("LIST")
    @Resource("OBJECT")
    GetObjectsWithFullDetailsSpectraS3Response getObjectsWithFullDetailsSpectraS3(GetObjectsWithFullDetailsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("PhysicalPlacement")
    @Action("MODIFY")
    @Resource("BUCKET")
    GetPhysicalPlacementForObjectsSpectraS3Response getPhysicalPlacementForObjectsSpectraS3(GetPhysicalPlacementForObjectsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("BulkObjectList")
    @Action("MODIFY")
    @Resource("BUCKET")
    GetPhysicalPlacementForObjectsWithFullDetailsSpectraS3Response getPhysicalPlacementForObjectsWithFullDetailsSpectraS3(GetPhysicalPlacementForObjectsWithFullDetailsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("PhysicalPlacement")
    @Action("SHOW")
    @Resource("BUCKET")
    VerifyPhysicalPlacementForObjectsSpectraS3Response verifyPhysicalPlacementForObjectsSpectraS3(VerifyPhysicalPlacementForObjectsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("BulkObjectList")
    @Action("SHOW")
    @Resource("BUCKET")
    VerifyPhysicalPlacementForObjectsWithFullDetailsSpectraS3Response verifyPhysicalPlacementForObjectsWithFullDetailsSpectraS3(VerifyPhysicalPlacementForObjectsWithFullDetailsSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("POOL")
    CancelImportOnAllPoolsSpectraS3Response cancelImportOnAllPoolsSpectraS3(CancelImportOnAllPoolsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Pool")
    @Action("MODIFY")
    @Resource("POOL")
    CancelImportPoolSpectraS3Response cancelImportPoolSpectraS3(CancelImportPoolSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("POOL")
    CompactAllPoolsSpectraS3Response compactAllPoolsSpectraS3(CompactAllPoolsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Pool")
    @Action("MODIFY")
    @Resource("POOL")
    CompactPoolSpectraS3Response compactPoolSpectraS3(CompactPoolSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("PoolPartition")
    @Action("CREATE")
    @Resource("POOL_PARTITION")
    PutPoolPartitionSpectraS3Response putPoolPartitionSpectraS3(PutPoolPartitionSpectraS3Request request)
            throws IOException;
    @Action("MODIFY")
    @Resource("POOL")
    DeallocatePoolSpectraS3Response deallocatePoolSpectraS3(DeallocatePoolSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("POOL")
    DeletePermanentlyLostPoolSpectraS3Response deletePermanentlyLostPoolSpectraS3(DeletePermanentlyLostPoolSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("POOL_FAILURE")
    DeletePoolFailureSpectraS3Response deletePoolFailureSpectraS3(DeletePoolFailureSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("POOL_PARTITION")
    DeletePoolPartitionSpectraS3Response deletePoolPartitionSpectraS3(DeletePoolPartitionSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("POOL_ENVIRONMENT")
    ForcePoolEnvironmentRefreshSpectraS3Response forcePoolEnvironmentRefreshSpectraS3(ForcePoolEnvironmentRefreshSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("POOL")
    FormatAllForeignPoolsSpectraS3Response formatAllForeignPoolsSpectraS3(FormatAllForeignPoolsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Pool")
    @Action("MODIFY")
    @Resource("POOL")
    FormatForeignPoolSpectraS3Response formatForeignPoolSpectraS3(FormatForeignPoolSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("BulkObjectList")
    @Action("SHOW")
    @Resource("POOL")
    GetBlobsOnPoolSpectraS3Response getBlobsOnPoolSpectraS3(GetBlobsOnPoolSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("PoolFailureList")
    @Action("LIST")
    @Resource("POOL_FAILURE")
    GetPoolFailuresSpectraS3Response getPoolFailuresSpectraS3(GetPoolFailuresSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("PoolPartition")
    @Action("SHOW")
    @Resource("POOL_PARTITION")
    GetPoolPartitionSpectraS3Response getPoolPartitionSpectraS3(GetPoolPartitionSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("PoolPartitionList")
    @Action("LIST")
    @Resource("POOL_PARTITION")
    GetPoolPartitionsSpectraS3Response getPoolPartitionsSpectraS3(GetPoolPartitionsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Pool")
    @Action("SHOW")
    @Resource("POOL")
    GetPoolSpectraS3Response getPoolSpectraS3(GetPoolSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("PoolList")
    @Action("LIST")
    @Resource("POOL")
    GetPoolsSpectraS3Response getPoolsSpectraS3(GetPoolsSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("POOL")
    ImportAllPoolsSpectraS3Response importAllPoolsSpectraS3(ImportAllPoolsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Pool")
    @Action("MODIFY")
    @Resource("POOL")
    ImportPoolSpectraS3Response importPoolSpectraS3(ImportPoolSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("POOL")
    ModifyAllPoolsSpectraS3Response modifyAllPoolsSpectraS3(ModifyAllPoolsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("PoolPartition")
    @Action("MODIFY")
    @Resource("POOL_PARTITION")
    ModifyPoolPartitionSpectraS3Response modifyPoolPartitionSpectraS3(ModifyPoolPartitionSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Pool")
    @Action("MODIFY")
    @Resource("POOL")
    ModifyPoolSpectraS3Response modifyPoolSpectraS3(ModifyPoolSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("POOL")
    VerifyAllPoolsSpectraS3Response verifyAllPoolsSpectraS3(VerifyAllPoolsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Pool")
    @Action("MODIFY")
    @Resource("POOL")
    VerifyPoolSpectraS3Response verifyPoolSpectraS3(VerifyPoolSpectraS3Request request)
            throws IOException;
    @Action("MODIFY")
    @Resource("STORAGE_DOMAIN")
    ConvertStorageDomainToDs3TargetSpectraS3Response convertStorageDomainToDs3TargetSpectraS3(ConvertStorageDomainToDs3TargetSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("StorageDomainMember")
    @Action("CREATE")
    @Resource("STORAGE_DOMAIN_MEMBER")
    PutPoolStorageDomainMemberSpectraS3Response putPoolStorageDomainMemberSpectraS3(PutPoolStorageDomainMemberSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("StorageDomain")
    @Action("CREATE")
    @Resource("STORAGE_DOMAIN")
    PutStorageDomainSpectraS3Response putStorageDomainSpectraS3(PutStorageDomainSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("StorageDomainMember")
    @Action("CREATE")
    @Resource("STORAGE_DOMAIN_MEMBER")
    PutTapeStorageDomainMemberSpectraS3Response putTapeStorageDomainMemberSpectraS3(PutTapeStorageDomainMemberSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("STORAGE_DOMAIN_FAILURE")
    DeleteStorageDomainFailureSpectraS3Response deleteStorageDomainFailureSpectraS3(DeleteStorageDomainFailureSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("STORAGE_DOMAIN_MEMBER")
    DeleteStorageDomainMemberSpectraS3Response deleteStorageDomainMemberSpectraS3(DeleteStorageDomainMemberSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("STORAGE_DOMAIN")
    DeleteStorageDomainSpectraS3Response deleteStorageDomainSpectraS3(DeleteStorageDomainSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("StorageDomainFailureList")
    @Action("LIST")
    @Resource("STORAGE_DOMAIN_FAILURE")
    GetStorageDomainFailuresSpectraS3Response getStorageDomainFailuresSpectraS3(GetStorageDomainFailuresSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("StorageDomainMember")
    @Action("SHOW")
    @Resource("STORAGE_DOMAIN_MEMBER")
    GetStorageDomainMemberSpectraS3Response getStorageDomainMemberSpectraS3(GetStorageDomainMemberSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("StorageDomainMemberList")
    @Action("LIST")
    @Resource("STORAGE_DOMAIN_MEMBER")
    GetStorageDomainMembersSpectraS3Response getStorageDomainMembersSpectraS3(GetStorageDomainMembersSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("StorageDomain")
    @Action("SHOW")
    @Resource("STORAGE_DOMAIN")
    GetStorageDomainSpectraS3Response getStorageDomainSpectraS3(GetStorageDomainSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("StorageDomainList")
    @Action("LIST")
    @Resource("STORAGE_DOMAIN")
    GetStorageDomainsSpectraS3Response getStorageDomainsSpectraS3(GetStorageDomainsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("StorageDomainMember")
    @Action("MODIFY")
    @Resource("STORAGE_DOMAIN_MEMBER")
    ModifyStorageDomainMemberSpectraS3Response modifyStorageDomainMemberSpectraS3(ModifyStorageDomainMemberSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("StorageDomain")
    @Action("MODIFY")
    @Resource("STORAGE_DOMAIN")
    ModifyStorageDomainSpectraS3Response modifyStorageDomainSpectraS3(ModifyStorageDomainSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("SystemFailureList")
    @Action("LIST")
    @Resource("SYSTEM_FAILURE")
    GetSystemFailuresSpectraS3Response getSystemFailuresSpectraS3(GetSystemFailuresSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("SystemInformation")
    @Action("LIST")
    @Resource("SYSTEM_INFORMATION")
    GetSystemInformationSpectraS3Response getSystemInformationSpectraS3(GetSystemInformationSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPathBackend")
    @Action("BULK_MODIFY")
    @Resource("INSTANCE_IDENTIFIER")
    ResetInstanceIdentifierSpectraS3Response resetInstanceIdentifierSpectraS3(ResetInstanceIdentifierSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("HealthVerificationResult")
    @Action("LIST")
    @Resource("SYSTEM_HEALTH")
    VerifySystemHealthSpectraS3Response verifySystemHealthSpectraS3(VerifySystemHealthSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeFailureList")
    @Action("BULK_MODIFY")
    @Resource("TAPE")
    CancelEjectOnAllTapesSpectraS3Response cancelEjectOnAllTapesSpectraS3(CancelEjectOnAllTapesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Tape")
    @Action("MODIFY")
    @Resource("TAPE")
    CancelEjectTapeSpectraS3Response cancelEjectTapeSpectraS3(CancelEjectTapeSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeFailureList")
    @Action("BULK_MODIFY")
    @Resource("TAPE")
    CancelFormatOnAllTapesSpectraS3Response cancelFormatOnAllTapesSpectraS3(CancelFormatOnAllTapesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Tape")
    @Action("MODIFY")
    @Resource("TAPE")
    CancelFormatTapeSpectraS3Response cancelFormatTapeSpectraS3(CancelFormatTapeSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeFailureList")
    @Action("BULK_MODIFY")
    @Resource("TAPE")
    CancelImportOnAllTapesSpectraS3Response cancelImportOnAllTapesSpectraS3(CancelImportOnAllTapesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Tape")
    @Action("MODIFY")
    @Resource("TAPE")
    CancelImportTapeSpectraS3Response cancelImportTapeSpectraS3(CancelImportTapeSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeFailureList")
    @Action("BULK_MODIFY")
    @Resource("TAPE")
    CancelOnlineOnAllTapesSpectraS3Response cancelOnlineOnAllTapesSpectraS3(CancelOnlineOnAllTapesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Tape")
    @Action("MODIFY")
    @Resource("TAPE")
    CancelOnlineTapeSpectraS3Response cancelOnlineTapeSpectraS3(CancelOnlineTapeSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeFailureList")
    @Action("BULK_MODIFY")
    @Resource("TAPE")
    CancelVerifyOnAllTapesSpectraS3Response cancelVerifyOnAllTapesSpectraS3(CancelVerifyOnAllTapesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Tape")
    @Action("MODIFY")
    @Resource("TAPE")
    CancelVerifyTapeSpectraS3Response cancelVerifyTapeSpectraS3(CancelVerifyTapeSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeDrive")
    @Action("MODIFY")
    @Resource("TAPE_DRIVE")
    CleanTapeDriveSpectraS3Response cleanTapeDriveSpectraS3(CleanTapeDriveSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeDensityDirective")
    @Action("CREATE")
    @Resource("TAPE_DENSITY_DIRECTIVE")
    PutTapeDensityDirectiveSpectraS3Response putTapeDensityDirectiveSpectraS3(PutTapeDensityDirectiveSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("TAPE")
    DeletePermanentlyLostTapeSpectraS3Response deletePermanentlyLostTapeSpectraS3(DeletePermanentlyLostTapeSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("TAPE_DENSITY_DIRECTIVE")
    DeleteTapeDensityDirectiveSpectraS3Response deleteTapeDensityDirectiveSpectraS3(DeleteTapeDensityDirectiveSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("TAPE_DRIVE")
    DeleteTapeDriveSpectraS3Response deleteTapeDriveSpectraS3(DeleteTapeDriveSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("TAPE_FAILURE")
    DeleteTapeFailureSpectraS3Response deleteTapeFailureSpectraS3(DeleteTapeFailureSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("TAPE_PARTITION_FAILURE")
    DeleteTapePartitionFailureSpectraS3Response deleteTapePartitionFailureSpectraS3(DeleteTapePartitionFailureSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("TAPE_PARTITION")
    DeleteTapePartitionSpectraS3Response deleteTapePartitionSpectraS3(DeleteTapePartitionSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeFailureList")
    @Action("BULK_MODIFY")
    @Resource("TAPE")
    EjectAllTapesSpectraS3Response ejectAllTapesSpectraS3(EjectAllTapesSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("TAPE")
    EjectStorageDomainBlobsSpectraS3Response ejectStorageDomainBlobsSpectraS3(EjectStorageDomainBlobsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeFailureList")
    @Action("BULK_MODIFY")
    @Resource("TAPE")
    EjectStorageDomainSpectraS3Response ejectStorageDomainSpectraS3(EjectStorageDomainSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Tape")
    @Action("MODIFY")
    @Resource("TAPE")
    EjectTapeSpectraS3Response ejectTapeSpectraS3(EjectTapeSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("TAPE_ENVIRONMENT")
    ForceTapeEnvironmentRefreshSpectraS3Response forceTapeEnvironmentRefreshSpectraS3(ForceTapeEnvironmentRefreshSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeFailureList")
    @Action("BULK_MODIFY")
    @Resource("TAPE")
    FormatAllTapesSpectraS3Response formatAllTapesSpectraS3(FormatAllTapesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Tape")
    @Action("MODIFY")
    @Resource("TAPE")
    FormatTapeSpectraS3Response formatTapeSpectraS3(FormatTapeSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("BulkObjectList")
    @Action("SHOW")
    @Resource("TAPE")
    GetBlobsOnTapeSpectraS3Response getBlobsOnTapeSpectraS3(GetBlobsOnTapeSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeDensityDirective")
    @Action("SHOW")
    @Resource("TAPE_DENSITY_DIRECTIVE")
    GetTapeDensityDirectiveSpectraS3Response getTapeDensityDirectiveSpectraS3(GetTapeDensityDirectiveSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeDensityDirectiveList")
    @Action("LIST")
    @Resource("TAPE_DENSITY_DIRECTIVE")
    GetTapeDensityDirectivesSpectraS3Response getTapeDensityDirectivesSpectraS3(GetTapeDensityDirectivesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeDrive")
    @Action("SHOW")
    @Resource("TAPE_DRIVE")
    GetTapeDriveSpectraS3Response getTapeDriveSpectraS3(GetTapeDriveSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeDriveList")
    @Action("LIST")
    @Resource("TAPE_DRIVE")
    GetTapeDrivesSpectraS3Response getTapeDrivesSpectraS3(GetTapeDrivesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DetailedTapeFailureList")
    @Action("LIST")
    @Resource("TAPE_FAILURE")
    GetTapeFailuresSpectraS3Response getTapeFailuresSpectraS3(GetTapeFailuresSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeLibraryList")
    @Action("LIST")
    @Resource("TAPE_LIBRARY")
    GetTapeLibrariesSpectraS3Response getTapeLibrariesSpectraS3(GetTapeLibrariesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeLibrary")
    @Action("SHOW")
    @Resource("TAPE_LIBRARY")
    GetTapeLibrarySpectraS3Response getTapeLibrarySpectraS3(GetTapeLibrarySpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapePartitionFailureList")
    @Action("LIST")
    @Resource("TAPE_PARTITION_FAILURE")
    GetTapePartitionFailuresSpectraS3Response getTapePartitionFailuresSpectraS3(GetTapePartitionFailuresSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapePartition")
    @Action("SHOW")
    @Resource("TAPE_PARTITION")
    GetTapePartitionSpectraS3Response getTapePartitionSpectraS3(GetTapePartitionSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DetailedTapePartition")
    @Action("SHOW")
    @Resource("TAPE_PARTITION")
    GetTapePartitionWithFullDetailsSpectraS3Response getTapePartitionWithFullDetailsSpectraS3(GetTapePartitionWithFullDetailsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapePartitionList")
    @Action("LIST")
    @Resource("TAPE_PARTITION")
    GetTapePartitionsSpectraS3Response getTapePartitionsSpectraS3(GetTapePartitionsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("NamedDetailedTapePartitionList")
    @Action("LIST")
    @Resource("TAPE_PARTITION")
    GetTapePartitionsWithFullDetailsSpectraS3Response getTapePartitionsWithFullDetailsSpectraS3(GetTapePartitionsWithFullDetailsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Tape")
    @Action("SHOW")
    @Resource("TAPE")
    GetTapeSpectraS3Response getTapeSpectraS3(GetTapeSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeList")
    @Action("LIST")
    @Resource("TAPE")
    GetTapesSpectraS3Response getTapesSpectraS3(GetTapesSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("TAPE")
    ImportAllTapesSpectraS3Response importAllTapesSpectraS3(ImportAllTapesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Tape")
    @Action("MODIFY")
    @Resource("TAPE")
    ImportTapeSpectraS3Response importTapeSpectraS3(ImportTapeSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeFailureList")
    @Action("BULK_MODIFY")
    @Resource("TAPE")
    InspectAllTapesSpectraS3Response inspectAllTapesSpectraS3(InspectAllTapesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Tape")
    @Action("MODIFY")
    @Resource("TAPE")
    InspectTapeSpectraS3Response inspectTapeSpectraS3(InspectTapeSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("TAPE_PARTITION")
    ModifyAllTapePartitionsSpectraS3Response modifyAllTapePartitionsSpectraS3(ModifyAllTapePartitionsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapePartition")
    @Action("MODIFY")
    @Resource("TAPE_PARTITION")
    ModifyTapePartitionSpectraS3Response modifyTapePartitionSpectraS3(ModifyTapePartitionSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Tape")
    @Action("MODIFY")
    @Resource("TAPE")
    ModifyTapeSpectraS3Response modifyTapeSpectraS3(ModifyTapeSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeFailureList")
    @Action("BULK_MODIFY")
    @Resource("TAPE")
    OnlineAllTapesSpectraS3Response onlineAllTapesSpectraS3(OnlineAllTapesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Tape")
    @Action("MODIFY")
    @Resource("TAPE")
    OnlineTapeSpectraS3Response onlineTapeSpectraS3(OnlineTapeSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("TapeFailureList")
    @Action("BULK_MODIFY")
    @Resource("TAPE")
    VerifyAllTapesSpectraS3Response verifyAllTapesSpectraS3(VerifyAllTapesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Tape")
    @Action("MODIFY")
    @Resource("TAPE")
    VerifyTapeSpectraS3Response verifyTapeSpectraS3(VerifyTapeSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Ds3TargetReadPreference")
    @Action("CREATE")
    @Resource("DS3_TARGET_READ_PREFERENCE")
    PutDs3TargetReadPreferenceSpectraS3Response putDs3TargetReadPreferenceSpectraS3(PutDs3TargetReadPreferenceSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("DS3_TARGET_FAILURE")
    DeleteDs3TargetFailureSpectraS3Response deleteDs3TargetFailureSpectraS3(DeleteDs3TargetFailureSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("DS3_TARGET_READ_PREFERENCE")
    DeleteDs3TargetReadPreferenceSpectraS3Response deleteDs3TargetReadPreferenceSpectraS3(DeleteDs3TargetReadPreferenceSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("DS3_TARGET")
    DeleteDs3TargetSpectraS3Response deleteDs3TargetSpectraS3(DeleteDs3TargetSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("TARGET_ENVIRONMENT")
    ForceTargetEnvironmentRefreshSpectraS3Response forceTargetEnvironmentRefreshSpectraS3(ForceTargetEnvironmentRefreshSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("DataPolicyList")
    @Action("SHOW")
    @Resource("DS3_TARGET_DATA_POLICIES")
    GetDs3TargetDataPoliciesSpectraS3Response getDs3TargetDataPoliciesSpectraS3(GetDs3TargetDataPoliciesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Ds3TargetFailureList")
    @Action("LIST")
    @Resource("DS3_TARGET_FAILURE")
    GetDs3TargetFailuresSpectraS3Response getDs3TargetFailuresSpectraS3(GetDs3TargetFailuresSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Ds3TargetReadPreference")
    @Action("SHOW")
    @Resource("DS3_TARGET_READ_PREFERENCE")
    GetDs3TargetReadPreferenceSpectraS3Response getDs3TargetReadPreferenceSpectraS3(GetDs3TargetReadPreferenceSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Ds3TargetReadPreferenceList")
    @Action("LIST")
    @Resource("DS3_TARGET_READ_PREFERENCE")
    GetDs3TargetReadPreferencesSpectraS3Response getDs3TargetReadPreferencesSpectraS3(GetDs3TargetReadPreferencesSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Ds3Target")
    @Action("SHOW")
    @Resource("DS3_TARGET")
    GetDs3TargetSpectraS3Response getDs3TargetSpectraS3(GetDs3TargetSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Ds3TargetList")
    @Action("LIST")
    @Resource("DS3_TARGET")
    GetDs3TargetsSpectraS3Response getDs3TargetsSpectraS3(GetDs3TargetsSpectraS3Request request)
            throws IOException;
    @Action("BULK_MODIFY")
    @Resource("DS3_TARGET")
    ModifyAllDs3TargetsSpectraS3Response modifyAllDs3TargetsSpectraS3(ModifyAllDs3TargetsSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Ds3Target")
    @Action("MODIFY")
    @Resource("DS3_TARGET")
    ModifyDs3TargetSpectraS3Response modifyDs3TargetSpectraS3(ModifyDs3TargetSpectraS3Request request)
            throws IOException;
    @Action("MODIFY")
    @Resource("DS3_TARGET")
    PairBackRegisteredDs3TargetSpectraS3Response pairBackRegisteredDs3TargetSpectraS3(PairBackRegisteredDs3TargetSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Ds3Target")
    @Action("CREATE")
    @Resource("DS3_TARGET")
    RegisterDs3TargetSpectraS3Response registerDs3TargetSpectraS3(RegisterDs3TargetSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("Ds3Target")
    @Action("MODIFY")
    @Resource("DS3_TARGET")
    VerifyDs3TargetSpectraS3Response verifyDs3TargetSpectraS3(VerifyDs3TargetSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("SpectraUser")
    @Action("CREATE")
    @Resource("USER")
    DelegateCreateUserSpectraS3Response delegateCreateUserSpectraS3(DelegateCreateUserSpectraS3Request request)
            throws IOException;
    @Action("DELETE")
    @Resource("USER")
    DelegateDeleteUserSpectraS3Response delegateDeleteUserSpectraS3(DelegateDeleteUserSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("SpectraUser")
    @Action("SHOW")
    @Resource("USER")
    GetUserSpectraS3Response getUserSpectraS3(GetUserSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("SpectraUserList")
    @Action("LIST")
    @Resource("USER")
    GetUsersSpectraS3Response getUsersSpectraS3(GetUsersSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("SpectraUser")
    @Action("MODIFY")
    @Resource("USER")
    ModifyUserSpectraS3Response modifyUserSpectraS3(ModifyUserSpectraS3Request request)
            throws IOException;
    @ResponsePayloadModel("SpectraUser")
    @Action("MODIFY")
    @Resource("USER")
    RegenerateUserSecretKeySpectraS3Response regenerateUserSecretKeySpectraS3(RegenerateUserSecretKeySpectraS3Request request)
            throws IOException;
    
    GetObjectResponse getObject(GetObjectRequest request)
            throws IOException;

    Ds3Client newForNode(final JobNode node);
}