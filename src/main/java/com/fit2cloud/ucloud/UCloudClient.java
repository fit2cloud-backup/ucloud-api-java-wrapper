package com.fit2cloud.ucloud;

import com.fit2cloud.ucloud.exception.UCloudClientException;
import com.fit2cloud.ucloud.exception.UCloudServiceException;
import com.fit2cloud.ucloud.udb.requests.*;
import com.fit2cloud.ucloud.udb.responses.*;
import com.fit2cloud.ucloud.udisk.requests.DescribeUDiskRequest;
import com.fit2cloud.ucloud.udisk.responses.CreateUDiskResponse;
import com.fit2cloud.ucloud.udisk.responses.DescribeUDiskResponse;
import com.fit2cloud.ucloud.uhost.requests.*;
import com.fit2cloud.ucloud.uhost.responses.*;
import com.fit2cloud.ucloud.ulb.requests.*;
import com.fit2cloud.ucloud.ulb.responses.*;
import com.fit2cloud.ucloud.unet.requests.*;
import com.fit2cloud.ucloud.unet.responses.*;
import com.fit2cloud.ucloud.utils.GlobalConst;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Map;

/**
 * Created by chixq on 7/22/15.
 */
public class UCloudClient {
    private BaseModuleRequest request;
    private Gson gson = new GsonBuilder().create();

    public UCloudClient(UCloudCredentials credentials) {
        this.request = new BaseModuleRequest(credentials, GlobalConst.DEFAULT_BASE_URL);
    }

    public UCloudClient(UCloudCredentials credentials, String apiEndpoint) {
        this.request = new BaseModuleRequest(credentials, apiEndpoint);
    }

    public UCloudClient(String publicKey, String privateKey) throws UCloudClientException {
        UCloudCredentials uCloudCredentials = new UCloudCredentials(publicKey, privateKey);
        this.request = new BaseModuleRequest(uCloudCredentials, GlobalConst.DEFAULT_BASE_URL);
    }


    /* UHost API */
    public CreateUHostInstanceResponse CreateUHostInstance(CreateUHostInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("CreateUHostInstance", request.toMap()), CreateUHostInstanceResponse.class);
    }

    public DescribeImageResponse DescribeImage(DescribeImageRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeImage", request.toMap()), DescribeImageResponse.class);
    }

    public TerminateUHostInstanceResponse TerminateUHostInstance(TerminateUHostInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("TerminateUHostInstance", request.toMap()), TerminateUHostInstanceResponse.class);
    }

    public DescribeUHostInstanceResponse DescribeUHostInstance(DescribeUHostInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeUHostInstance", request.toMap()), DescribeUHostInstanceResponse.class);
    }

    public ResizeUHostInstanceResponse ResizeUHostInstance(ResizeUHostInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("ResizeUHostInstance", request.toMap()), ResizeUHostInstanceResponse.class);
    }

    public ReinstallUHostInstanceResponse ReinstallUHostInstance(ReinstallUHostInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("ReinstallUHostInstance", request.toMap()), ReinstallUHostInstanceResponse.class);
    }

    public StartUHostInstanceResponse StartUHostInstance(StartUHostInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("StartUHostInstance", request.toMap()), StartUHostInstanceResponse.class);
    }

    public StopUHostInstanceResponse StopUHostInstance(StopUHostInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("StopUHostInstance", request.toMap()), StopUHostInstanceResponse.class);
    }

    public RebootUHostInstanceResponse RebootUHostInstance(RebootUHostInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("RebootUHostInstance", request.toMap()), RebootUHostInstanceResponse.class);
    }

    public ResetUHostInstancePasswordResponse ResetUHostInstancePassword(ResetUHostInstancePasswordRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("ResetUHostInstancePassword", request.toMap()), ResetUHostInstancePasswordResponse.class);
    }

    public ModifyUHostInstanceNameResponse ModifyUHostInstanceName(ModifyUHostInstanceNameRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("ModifyUHostInstanceName", request.toMap()), ModifyUHostInstanceNameResponse.class);
    }

    public ModifyUHostInstanceTagResponse ModifyUHostInstanceTag(ModifyUHostInstanceTagRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("ModifyUHostInstanceTag", request.toMap()), ModifyUHostInstanceTagResponse.class);
    }

    public ModifyUHostInstanceRemarkResponse ModifyUHostInstanceRemark(ModifyUHostInstanceRemarkRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("ModifyUHostInstanceRemark", request.toMap()), ModifyUHostInstanceRemarkResponse.class);
    }

    public GetUHostInstancePriceResponse GetUHostInstancePrice(GetUHostInstancePriceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("GetUHostInstancePrice", request.toMap()), GetUHostInstancePriceResponse.class);
    }

    public GetUHostInstanceVncInfoResponse GetUHostInstanceVncInfo(GetUHostInstanceVncInfoRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("GetUHostInstanceVncInfo", request.toMap()), GetUHostInstanceVncInfoResponse.class);
    }

    public CreateCustomImageResponse CreateCustomImage(CreateCustomImageRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("CreateCustomImage", request.toMap()), CreateCustomImageResponse.class);
    }

    public TerminateCustomImageResponse TerminateCustomImage(TerminateCustomImageRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("TerminateCustomImage", request.toMap()), TerminateCustomImageResponse.class);
    }

    public AttachUDiskResponse AttachUDisk(AttachUDiskRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("AttachUDisk", request.toMap()), AttachUDiskResponse.class);
    }

    public DetachUDiskResponse DetachUDisk(DetachUDiskRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute(" DetachUDisk", request.toMap()), DetachUDiskResponse.class);
    }

    public CreateUHostInstanceSnapshotResponse CreateUHostInstanceSnapshot(CreateUHostInstanceSnapshotRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("CreateUHostInstanceSnapshot", request.toMap()), CreateUHostInstanceSnapshotResponse.class);
    }

    public DescribeUHostInstanceSnapshotResponse DescribeUHostInstanceSnapshot(DescribeUHostInstanceSnapshotRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeUHostInstanceSnapshot", request.toMap()), DescribeUHostInstanceSnapshotResponse.class);
    }

    public GetRegionsResponse GetRegions(GetRegionsRequest regionsRequest) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("GetRegion", regionsRequest.toMap()), GetRegionsResponse.class);
    }

    public GetProjectIdResponse GetProjects(GetProjectRequest getProjectRequest) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("GetProjectList", getProjectRequest.toMap()), GetProjectIdResponse.class);
    }

    public GetMetricsResponse GetMetrics(GetMetricsRequest metricsRequest) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("GetMetric", metricsRequest.toMap()), GetMetricsResponse.class);
    }

    //获取资源当前各项监控数据
    public GetMetricsResponse GetMetricsOverview(GetMetricsRequest metricsRequest) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("GetMetricOverview", metricsRequest.toMap()), GetMetricsResponse.class);
    }

    /* UNet API */

    public AllocateEIPResponse AllocateEIP(AllocateEIPRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("AllocateEIP", request.toMap()), AllocateEIPResponse.class);
    }

    public DescribeEIPResponse DescribeEIP(DescribeEIPRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeEIP", request.toMap()), DescribeEIPResponse.class);
    }

    public UpdateEIPAttributeResponse UpdateEIPAttribute(UpdateEIPAttributeRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("UpdateEIPAttribute", request.toMap()), UpdateEIPAttributeResponse.class);
    }

    public BindEIPResponse BindEIP(BindEIPRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("BindEIP", request.toMap()), BindEIPResponse.class);
    }

    public DescribeSecurityGroupResponse DescribeSecurityGroup(DescribeSecurityGroupRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeSecurityGroup", request.toMap()), DescribeSecurityGroupResponse.class);
    }

    public ReleaseEIPResponse ReleaseEIP(ReleaseEIPRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("ReleaseEIP", request.toMap()), ReleaseEIPResponse.class);
    }

    public DescribeVIPResponse DescribeVIP(DescribeVIPRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeVIP", request.toMap()), DescribeVIPResponse.class);
    }

    public SendSmsResponse SendSms(SendSmsRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("SendSms", request.toMap()), SendSmsResponse.class);
    }

    //    ULB API
    public CreateULBResponse CreateULB(CreateULBRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("CreateULB", request.toMap()), CreateULBResponse.class);
    }

    public DeleteULBResponse DeleteULB(DeleteULBRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DeleteULB", request.toMap()), DeleteULBResponse.class);
    }

    public DescribeULBResponse DescribeULB(DescribeULBRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeULB", request.toMap()), DescribeULBResponse.class);
    }

    public UpdateULBAttributeResponse UpdateULBAttribute(UpdateULBAttributeRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("UpdateULBAttribute", request.toMap()), UpdateULBAttributeResponse.class);
    }

    public CreateVServerResponse CreateVServer(CreateVServerRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("CreateVServer", request.toMap()), CreateVServerResponse.class);
    }

    public DeleteVServerResponse DeleteVServer(DeleteVServerRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DeleteVServer", request.toMap()), DeleteVServerResponse.class);
    }

    public UpdateVServerAttributeResponse UpdateVServerAttribute(UpdateVServerAttributeRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("UpdateVServerAttribute", request.toMap()), UpdateVServerAttributeResponse.class);
    }

    public AllocateBackendResponse AllocateBackend(AllocateBackendRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("AllocateBackend", request.toMap()), AllocateBackendResponse.class);
    }

    public ReleaseBackendResponse ReleaseBackend(ReleaseBackendRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("ReleaseBackend", request.toMap()), ReleaseBackendResponse.class);
    }

    public UpdateBackendAttributeResponse UpdateBackendAttribute(UpdateBackendAttributeRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("UpdateBackendAttribute", request.toMap()), UpdateBackendAttributeResponse.class);
    }

    public CreateSSLResponse CreateSSL(CreateSSLRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("CreateSSL", request.toMap()), CreateSSLResponse.class);
    }

    public DeleteSSLResponse DeleteSSL(DeleteSSLRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DeleteSSL", request.toMap()), DeleteSSLResponse.class);
    }

    public BindSSLResponse BindSSL(BindSSLRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("BindSSL", request.toMap()), BindSSLResponse.class);
    }

    public DescribeSSLResponse DescribeSSL(DescribeSSLRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeSSL", request.toMap()), DescribeSSLResponse.class);
    }

    public CreatePolicyGroupResponse CreatePolicyGroup(CreatePolicyGroupRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("CreatePolicyGroup", request.toMap()), CreatePolicyGroupResponse.class);
    }

    public DeletePolicyGroupResponse DeletePolicyGroup(DeletePolicyGroupRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DeletePolicyGroup", request.toMap()), DeletePolicyGroupResponse.class);
    }

    public DescribePolicyGroupResponse DescribePolicyGroup(DescribePolicyGroupRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribePolicyGroup", request.toMap()), DescribePolicyGroupResponse.class);
    }

    public UpdatePolicyGroupAttributeResponse UpdatePolicyGroupAttribute(UpdatePolicyGroupAttributeRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("UpdatePolicyGroupAttribute", request.toMap()), UpdatePolicyGroupAttributeResponse.class);
    }

    public CreatePolicyResponse CreatePolicy(CreatePolicyRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("CreatePolicy", request.toMap()), CreatePolicyResponse.class);
    }

    public DeletePolicyResponse DeletePolicy(DeletePolicyRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DeletePolicy", request.toMap()), DeletePolicyResponse.class);
    }

//    UDB API

    public UploadUDBParamGroupResponse UploadUDBParamGroup(UploadUDBParamGroupRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("UploadUDBParamGroup", request.toMap()), UploadUDBParamGroupResponse.class);
    }

    public UpdateUDBParamGroupResponse UpdateUDBParamGroup(UpdateUDBParamGroupRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("UpdateUDBParamGroup", request.toMap()), UpdateUDBParamGroupResponse.class);
    }

    public StopUDBInstanceResponse StopUDBInstance(StopUDBInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("StopUDBInstance", request.toMap()), StopUDBInstanceResponse.class);
    }

    public ModifyUDBInstanceNameResponse ModifyUDBInstanceName(ModifyUDBInstanceNameRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("ModifyUDBInstanceName", request.toMap()), ModifyUDBInstanceNameResponse.class);
    }

    public EditUDBBackupBlacklistResponse EditUDBBackupBlacklist(EditUDBBackupBlacklistRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("EditUDBBackupBlacklist", request.toMap()), EditUDBBackupBlacklistResponse.class);
    }

    public DescribeUDBTypeResponse DescribeUDBType(DescribeUDBTypeRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeUDBType", request.toMap()), DescribeUDBTypeResponse.class);
    }

    public RestartUDBInstanceResponse RestartUDBInstance(RestartUDBInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("RestartUDBInstance", request.toMap()), RestartUDBInstanceResponse.class);
    }

    public PromoteUDBSlaveResponse PromoteUDBSlave(PromoteUDBSlaveRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("PromoteUDBSlave", request.toMap()), PromoteUDBSlaveResponse.class);
    }

    public StartUDBInstanceResponse StartUDBInstance(StartUDBInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("StartUDBInstance", request.toMap()), StartUDBInstanceResponse.class);
    }

    public DescribeUDBParamGroupResponse DescribeUDBParamGroup(DescribeUDBParamGroupRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeUDBParamGroup", request.toMap()), DescribeUDBParamGroupResponse.class);
    }

    public DescribeUDBInstanceStateResponse DescribeUDBInstanceState(DescribeUDBInstanceStateRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeUDBInstanceState", request.toMap()), DescribeUDBInstanceStateResponse.class);
    }

    public DescribeUDBInstanceResponse DescribeUDBInstance(DescribeUDBInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeUDBInstance", request.toMap()), DescribeUDBInstanceResponse.class);
    }

    public DescribeUDBInstancePriceResponse DescribeUDBInstancePrice(DescribeUDBInstancePriceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeUDBInstancePrice", request.toMap()), DescribeUDBInstancePriceResponse.class);
    }

    public DescribeUDBBackupResponse DescribeUDBBackup(DescribeUDBBackupRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeUDBBackup", request.toMap()), DescribeUDBBackupResponse.class);
    }

    public DescribeUDBBackupBlacklistResponse DescribeUDBBackupBlacklist(DescribeUDBBackupBlacklistRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeUDBBackupBlacklist", request.toMap()), DescribeUDBBackupBlacklistResponse.class);
    }

    public DeleteUDBParamGroupResponse DeleteUDBParamGroup(DeleteUDBParamGroupRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DeleteUDBParamGroup", request.toMap()), DeleteUDBParamGroupResponse.class);
    }

    public DeleteUDBInstanceResponse DeleteUDBInstance(DeleteUDBInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DeleteUDBInstance", request.toMap()), DeleteUDBInstanceResponse.class);
    }

    public DeleteUDBBackupResponse DeleteUDBBackup(DeleteUDBBackupRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DeleteUDBBackup", request.toMap()), DeleteUDBBackupResponse.class);
    }

    public CreateUDBSlaveResponse CreateUDBSlave(CreateUDBSlaveRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("CreateUDBSlave", request.toMap()), CreateUDBSlaveResponse.class);
    }

    public CreateUDBReplicationInstanceResponse CreateUDBReplicationInstance(CreateUDBReplicationInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("CreateUDBReplicationInstance", request.toMap()), CreateUDBReplicationInstanceResponse.class);
    }

    public BackupUDBInstanceResponse BackupUDBInstance(BackupUDBInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("BackupUDBInstance", request.toMap()), BackupUDBInstanceResponse.class);
    }

    public CreateUDBParamGroupResponse CreateUDBParamGroup(CreateUDBParamGroupRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("CreateUDBParamGroup", request.toMap()), CreateUDBParamGroupResponse.class);
    }

    public CreateUDBInstanceResponse CreateUDBInstance(CreateUDBInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("CreateUDBInstance", request.toMap()), CreateUDBInstanceResponse.class);
    }

    public ClearUDBLogResponse ClearUDBLog(ClearUDBLogRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("ClearUDBLog", request.toMap()), ClearUDBLogResponse.class);
    }

    // UDisk API

    public DescribeUDiskResponse describeUDisk(DescribeUDiskRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeUDisk", request.toMap()), DescribeUDiskResponse.class);
    }

    public CreateUDiskResponse createUDisk(Map<String, Object> params) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("CreateUDisk", params), CreateUDiskResponse.class);
    }

    public DescribeUDiskResponse resizeUDisk(Map<String, Object> params) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("ResizeUDisk", params), DescribeUDiskResponse.class);
    }

    public DetachUDiskResponse detachUDisk(Map<String, Object> params) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DetachUDisk", params), DetachUDiskResponse.class);
    }

    public AttachUDiskResponse attachUDisk(Map<String, Object> params) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("AttachUDisk", params), AttachUDiskResponse.class);
    }

    public DeleteUDiskResponse deleteUDisk(Map<String, Object> params) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DeleteUDisk", params), DeleteUDiskResponse.class);
    }
}

