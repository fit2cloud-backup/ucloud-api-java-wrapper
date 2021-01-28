package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;
import com.fit2cloud.ucloud.uhost.model.LoginMode;
import com.fit2cloud.ucloud.utils.EncodeHelper;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/24/15
 * Time: 11:13 AM
 * Email: xqiang.chi@samsung.com
 */
public class CreateUHostInstanceRequest extends Request {
    private String Region;
    private String regionId;
    private String ImageId;
    private com.fit2cloud.ucloud.uhost.model.LoginMode LoginMode;
    private String Password;
    private String KeyPair;
    private int CPU;
    private int cpuCount;
    private int Memory;
    private int DiskSpace;
    private String UHostType;
    private String Name;
    private String NetworkId;
    private String SecurityGroupId;
    private int Quantity;
    private String ChargeType;
    private String VPCId;
    private String SubnetId;
    private com.fit2cloud.ucloud.uhost.model.NetCapability NetCapability;
    private String tag;
    private String ProjectId;

    public String getVPCId() {
        return VPCId;
    }

    public void setVPCId(String VPCId) {
        this.VPCId = VPCId;
    }

    public String getSubnetId() {
        return SubnetId;
    }

    public void setSubnetId(String subnetId) {
        SubnetId = subnetId;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
        ImageId = imageId;
    }

    public void setLoginMode(LoginMode loginMode) {
        LoginMode = loginMode;
    }

    public LoginMode getLoginMode() {
        return LoginMode;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = EncodeHelper.base64(password);
    }

    public String getKeyPair() {
        return KeyPair;
    }

    public void setKeyPair(String keyPair) {
        KeyPair = keyPair;
    }

    public int getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(int cpuCount) {
        this.cpuCount = cpuCount;
    }

    public int getCPU() {
        return CPU;
    }

    public void setCPU(int CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public int getDiskSpace() {
        return DiskSpace;
    }

    public void setDiskSpace(int diskSpace) {
        DiskSpace = diskSpace;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNetworkId() {
        return NetworkId;
    }

    public void setNetworkId(String networkId) {
        NetworkId = networkId;
    }

    public String getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        SecurityGroupId = securityGroupId;
    }

    public String getChargeType() {
        return ChargeType;
    }

    public void setChargeType(String chargeType) {
        ChargeType = chargeType;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public com.fit2cloud.ucloud.uhost.model.NetCapability getNetCapability() {
        return NetCapability;
    }

    public void setNetCapability(com.fit2cloud.ucloud.uhost.model.NetCapability netCapability) {
        NetCapability = netCapability;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String projectId) {
        ProjectId = projectId;
    }

    public String getUHostType() {
        return UHostType;
    }

    public void setUHostType(String UHostType) {
        this.UHostType = UHostType;
    }

    @Override
    public Map<String, Object> toMap() {
        Type type = new TypeToken<HashMap<String, String>>() {
        }.getType();
        Map<String, Object> map = gson.fromJson(gson.toJson(this), type);
        return map;
    }
}
