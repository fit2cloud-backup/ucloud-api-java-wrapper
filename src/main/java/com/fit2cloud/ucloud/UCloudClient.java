package com.fit2cloud.ucloud;

import com.fit2cloud.ucloud.exception.UCloudClientException;
import com.fit2cloud.ucloud.exception.UCloudServiceException;
import com.fit2cloud.ucloud.unet.requests.*;
import com.fit2cloud.ucloud.unet.responses.*;
import com.fit2cloud.ucloud.utils.GlobalConst;
import com.fit2cloud.ucloud.uhost.requests.*;
import com.fit2cloud.ucloud.uhost.responses.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by chixq on 7/22/15.
 */
public class UCloudClient {
    private BaseModuleRequest request;
    private Gson gson = new GsonBuilder().create();

    public UCloudClient(UCloudCredentials credentials) {
        this.request = new BaseModuleRequest(credentials, GlobalConst.DEFAULT_BASE_URL);
    }

    public UCloudClient(UCloudCredentials credentials, String apiEndpoint){
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

    public DescribeImageResponse DescribeImage (DescribeImageRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeImage", request.toMap()), DescribeImageResponse.class);
    }

    public TerminateUHostInstanceResponse TerminateUHostInstance (TerminateUHostInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("TerminateUHostInstance", request.toMap()), TerminateUHostInstanceResponse.class);
    }

    public DescribeUHostInstanceResponse DescribeUHostInstance(DescribeUHostInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeUHostInstance", request.toMap()), DescribeUHostInstanceResponse.class);
    }
    public ResizeUHostInstanceResponse ResizeUHostInstance (ResizeUHostInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("ResizeUHostInstance", request.toMap()), ResizeUHostInstanceResponse.class);
    }
    
    public ReinstallUHostInstanceResponse ReinstallUHostInstance (ReinstallUHostInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("ReinstallUHostInstance", request.toMap()), ReinstallUHostInstanceResponse.class);
    }
    
    public StartUHostInstanceResponse StartUHostInstance (StartUHostInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("StartUHostInstance", request.toMap()), StartUHostInstanceResponse.class);
    }
    
    public StopUHostInstanceResponse StopUHostInstance (StopUHostInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("StopUHostInstance", request.toMap()), StopUHostInstanceResponse.class);
    }
    
    public RebootUHostInstanceResponse RebootUHostInstance (RebootUHostInstanceRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("RebootUHostInstance", request.toMap()), RebootUHostInstanceResponse.class);
    }

    public ResetUHostInstancePasswordResponse ResetUHostInstancePassword (ResetUHostInstancePasswordRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("ResetUHostInstancePassword", request.toMap()), ResetUHostInstancePasswordResponse.class);
    }

    public ModifyUHostInstanceNameResponse ModifyUHostInstanceName (ModifyUHostInstanceNameRequest request) throws UCloudClientException, UCloudServiceException {     
        return gson.fromJson(this.request.execute("ModifyUHostInstanceName", request.toMap()), ModifyUHostInstanceNameResponse.class);
    }
    public ModifyUHostInstanceTagResponse ModifyUHostInstanceTag (ModifyUHostInstanceTagRequest request) throws UCloudClientException, UCloudServiceException {     
        return gson.fromJson(this.request.execute("ModifyUHostInstanceTag", request.toMap()), ModifyUHostInstanceTagResponse.class);
    }
    public ModifyUHostInstanceRemarkResponse ModifyUHostInstanceRemark (ModifyUHostInstanceRemarkRequest request) throws UCloudClientException, UCloudServiceException {     
        return gson.fromJson(this.request.execute("ModifyUHostInstanceRemark", request.toMap()), ModifyUHostInstanceRemarkResponse.class);
    }
    
    public GetUHostInstancePriceResponse GetUHostInstancePrice (GetUHostInstancePriceRequest request) throws UCloudClientException, UCloudServiceException {     
        return gson.fromJson(this.request.execute("GetUHostInstancePrice", request.toMap()), GetUHostInstancePriceResponse.class);
    }
    
    public GetUHostInstanceVncInfoResponse GetUHostInstanceVncInfo (GetUHostInstanceVncInfoRequest request) throws UCloudClientException, UCloudServiceException {     
        return gson.fromJson(this.request.execute("GetUHostInstanceVncInfo", request.toMap()), GetUHostInstanceVncInfoResponse.class);
    }
    
    public CreateCustomImageResponse CreateCustomImage (CreateCustomImageRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("CreateCustomImage", request.toMap()), CreateCustomImageResponse.class);
    }

    public TerminateCustomImageResponse TerminateCustomImage (TerminateCustomImageRequest request) throws UCloudClientException, UCloudServiceException {     
        return gson.fromJson(this.request.execute("TerminateCustomImage", request.toMap()), TerminateCustomImageResponse.class);
    }
    
    public AttachUDiskResponse AttachUDisk (AttachUDiskRequest request) throws UCloudClientException, UCloudServiceException {     
        return gson.fromJson(this.request.execute("AttachUDisk", request.toMap()), AttachUDiskResponse.class);
    }
    
    public  DetachUDiskResponse  DetachUDisk ( DetachUDiskRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute(" DetachUDisk", request.toMap()),  DetachUDiskResponse.class);
    }

    public CreateUHostInstanceSnapshotResponse CreateUHostInstanceSnapshot (CreateUHostInstanceSnapshotRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("CreateUHostInstanceSnapshot", request.toMap()), CreateUHostInstanceSnapshotResponse.class);
    }

    public DescribeUHostInstanceSnapshotResponse DescribeUHostInstanceSnapshot (DescribeUHostInstanceSnapshotRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeUHostInstanceSnapshot", request.toMap()), DescribeUHostInstanceSnapshotResponse.class);
    }

    public GetRegionsResponse GetRegions(GetRegionsRequest regionsRequest) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("GetRegion", regionsRequest.toMap()), GetRegionsResponse.class);
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

    public SendSmsResponse SendSms(SendSmsRequest request)  throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("SendSms", request.toMap()), SendSmsResponse.class);
    }

}

