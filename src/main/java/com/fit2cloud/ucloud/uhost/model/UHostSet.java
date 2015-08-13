package com.fit2cloud.ucloud.uhost.model;

import java.util.List;

/**
 * Created by chixq on 7/23/15.
 */
public class UHostSet {
    private String UHostId;
    private String UHostType;
    private String ImageId;
    private String BasicImageId;
    private String BasicImageName;
    private String Tag;
    private String Remark;
    private String Name;
    private String State;
    private int CreateTime;
    private String ChargeType;
    private int ExpireTime;
    private int CPU;
    private int Memory;
    private List<DiskSet> DiskSet;
    private List<IPSet> IPSet;
    private String NetCapability;

    public String getUHostId() {
        return UHostId;
    }

    public void setUHostId(String UHostId) {
        this.UHostId = UHostId;
    }

    public String getUHostType() {
        return UHostType;
    }

    public void setUHostType(String UHostType) {
        this.UHostType = UHostType;
    }

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
        ImageId = imageId;
    }

    public String getBasicImageId() {
        return BasicImageId;
    }

    public void setBasicImageId(String basicImageId) {
        BasicImageId = basicImageId;
    }

    public String getBasicImageName() {
        return BasicImageName;
    }

    public void setBasicImageName(String basicImageName) {
        BasicImageName = basicImageName;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(int createTime) {
        CreateTime = createTime;
    }

    public String getChargeType() {
        return ChargeType;
    }

    public void setChargeType(String chargeType) {
        ChargeType = chargeType;
    }

    public int getExpireTime() {
        return ExpireTime;
    }

    public void setExpireTime(int expireTime) {
        ExpireTime = expireTime;
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

    public List<com.fit2cloud.ucloud.uhost.model.DiskSet> getDiskSet() {
        return DiskSet;
    }

    public void setDiskSet(List<com.fit2cloud.ucloud.uhost.model.DiskSet> diskSet) {
        DiskSet = diskSet;
    }

    public List<com.fit2cloud.ucloud.uhost.model.IPSet> getIPSet() {
        return IPSet;
    }

    public void setIPSet(List<com.fit2cloud.ucloud.uhost.model.IPSet> IPSet) {
        this.IPSet = IPSet;
    }

    public String getNetCapability() {
        return NetCapability;
    }

    public void setNetCapability(String netCapability) {

        NetCapability = netCapability;
    }

    @Override
    public String toString() {
        return "UHostSet{" +
                "UHostId='" + UHostId + '\'' +
                ", UHostType='" + UHostType + '\'' +
                ", ImageId='" + ImageId + '\'' +
                ", BasicImageId='" + BasicImageId + '\'' +
                ", BasicImageName='" + BasicImageName + '\'' +
                ", Tag='" + Tag + '\'' +
                ", Remark='" + Remark + '\'' +
                ", Name='" + Name + '\'' +
                ", State='" + State + '\'' +
                ", CreateTime=" + CreateTime +
                ", ChargeType='" + ChargeType + '\'' +
                ", ExpireTime=" + ExpireTime +
                ", CPU=" + CPU +
                ", Memory=" + Memory +
                ", DiskSet=" + DiskSet +
                ", IPSet=" + IPSet +
                ", NetCapability='" + NetCapability + '\'' +
                '}';
    }
}
