package com.fit2cloud.ucloud.udisk.model;

/**
 * Created by linjinbo on 2017/11/15.
 */
public class DescribeUDIskDataSet {

    private String UDiskId;

    private String Name;

    private String Size;

    private String Status;

    private int CreateTime;

    private int ExpiredTime;

    private String UHostId;

    private String UHostName;

    private String UHostIp;

    private String DeviceName;

    private String ChargeType;

    private String Tag;

    private String IsExpire;

    private String Version;

    private String UDataArkMode;

    private String Zone;

    private int SnapshotCount;

    private int SnapshotLimit;

    private String DiskType;

    public DescribeUDIskDataSet() {
    }

    public DescribeUDIskDataSet(String UDiskId, String name, String size, String status, int createTime, int expiredTime, String UHostId, String UHostName, String UHostIp, String deviceName, String chargeType, String tag, String isExpire, String version, String UDataArkMode, int snapshotCount, int snapshotLimit,String DiskType) {
        this.UDiskId = UDiskId;
        Name = name;
        Size = size;
        Status = status;
        CreateTime = createTime;
        ExpiredTime = expiredTime;
        this.UHostId = UHostId;
        this.UHostName = UHostName;
        this.UHostIp = UHostIp;
        DeviceName = deviceName;
        ChargeType = chargeType;
        Tag = tag;
        IsExpire = isExpire;
        Version = version;
        this.UDataArkMode = UDataArkMode;
        SnapshotCount = snapshotCount;
        SnapshotLimit = snapshotLimit;
        this.DiskType  = DiskType;
    }

    public String getUDiskId() {
        return UDiskId;
    }

    public void setUDiskId(String UDiskId) {
        this.UDiskId = UDiskId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(int createTime) {
        CreateTime = createTime;
    }

    public int getExpiredTime() {
        return ExpiredTime;
    }

    public void setExpiredTime(int expiredTime) {
        ExpiredTime = expiredTime;
    }

    public String getUHostId() {
        return UHostId;
    }

    public void setUHostId(String UHostId) {
        this.UHostId = UHostId;
    }

    public String getUHostName() {
        return UHostName;
    }

    public void setUHostName(String UHostName) {
        this.UHostName = UHostName;
    }

    public String getUHostIp() {
        return UHostIp;
    }

    public void setUHostIp(String UHostIp) {
        this.UHostIp = UHostIp;
    }

    public String getDeviceName() {
        return DeviceName;
    }

    public void setDeviceName(String deviceName) {
        DeviceName = deviceName;
    }

    public String getChargeType() {
        return ChargeType;
    }

    public void setChargeType(String chargeType) {
        ChargeType = chargeType;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public String getIsExpire() {
        return IsExpire;
    }

    public void setIsExpire(String isExpire) {
        IsExpire = isExpire;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getUDataArkMode() {
        return UDataArkMode;
    }

    public void setUDataArkMode(String UDataArkMode) {
        this.UDataArkMode = UDataArkMode;
    }

    public int getSnapshotCount() {
        return SnapshotCount;
    }

    public void setSnapshotCount(int snapshotCount) {
        SnapshotCount = snapshotCount;
    }

    public int getSnapshotLimit() {
        return SnapshotLimit;
    }

    public void setSnapshotLimit(int snapshotLimit) {
        SnapshotLimit = snapshotLimit;
    }

    public String getZone() {
        return Zone;
    }

    public void setZone(String zone) {
        Zone = zone;
    }

    public String getDiskType() {
        return DiskType;
    }

    public void setDiskType(String diskType) {
        DiskType = diskType;
    }
}
