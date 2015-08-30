package com.fit2cloud.ucloud.udb.model;

import java.util.List;

/**
 * Created by chixq on 8/30/15.
 */
public class DescribeUDBInstance {
    private String DBId;
    private String Name;
    private String DBTypeId;
    private Integer ParamGroupId;
    private String AdminUser;
    private String VirtualIP;
    private String VirtualIPMac;
    private Integer Port;
    private String SrcDBId;
    private Integer BackupCount;
    private Integer BackupBeginTime;
    private Integer BackupDuration;
    private String BackupBlacklist;
    private String State;
    private Integer CreateTime;
    private Integer ModfiyTime;
    private Integer ExpiredTime;
    private String ChargeType;
    private Integer MemoryLimit;
    private Integer DiskSpace;
    private Boolean UseSSD;
    private String SSDType;
    private String Role;
    private Integer DiskUsedSize;
    private Integer DiskFileSize;
    private Integer SystemFileSize;
    private Integer LogFileSize;
    private String BackupDate;
    private List<UBDSlaveDataSet> DataSet;

    public String getDBId() {
        return DBId;
    }

    public void setDBId(String DBId) {
        this.DBId = DBId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDBTypeId() {
        return DBTypeId;
    }

    public void setDBTypeId(String DBTypeId) {
        this.DBTypeId = DBTypeId;
    }

    public Integer getParamGroupId() {
        return ParamGroupId;
    }

    public void setParamGroupId(Integer paramGroupId) {
        ParamGroupId = paramGroupId;
    }

    public String getAdminUser() {
        return AdminUser;
    }

    public void setAdminUser(String adminUser) {
        AdminUser = adminUser;
    }

    public String getVirtualIP() {
        return VirtualIP;
    }

    public void setVirtualIP(String virtualIP) {
        VirtualIP = virtualIP;
    }

    public String getVirtualIPMac() {
        return VirtualIPMac;
    }

    public void setVirtualIPMac(String virtualIPMac) {
        VirtualIPMac = virtualIPMac;
    }

    public Integer getPort() {
        return Port;
    }

    public void setPort(Integer port) {
        Port = port;
    }

    public String getSrcDBId() {
        return SrcDBId;
    }

    public void setSrcDBId(String srcDBId) {
        SrcDBId = srcDBId;
    }

    public Integer getBackupCount() {
        return BackupCount;
    }

    public void setBackupCount(Integer backupCount) {
        BackupCount = backupCount;
    }

    public Integer getBackupBeginTime() {
        return BackupBeginTime;
    }

    public void setBackupBeginTime(Integer backupBeginTime) {
        BackupBeginTime = backupBeginTime;
    }

    public Integer getBackupDuration() {
        return BackupDuration;
    }

    public void setBackupDuration(Integer backupDuration) {
        BackupDuration = backupDuration;
    }

    public String getBackupBlacklist() {
        return BackupBlacklist;
    }

    public void setBackupBlacklist(String backupBlacklist) {
        BackupBlacklist = backupBlacklist;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public Integer getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Integer createTime) {
        CreateTime = createTime;
    }

    public Integer getModfiyTime() {
        return ModfiyTime;
    }

    public void setModfiyTime(Integer modfiyTime) {
        ModfiyTime = modfiyTime;
    }

    public Integer getExpiredTime() {
        return ExpiredTime;
    }

    public void setExpiredTime(Integer expiredTime) {
        ExpiredTime = expiredTime;
    }

    public String getChargeType() {
        return ChargeType;
    }

    public void setChargeType(String chargeType) {
        ChargeType = chargeType;
    }

    public Integer getMemoryLimit() {
        return MemoryLimit;
    }

    public void setMemoryLimit(Integer memoryLimit) {
        MemoryLimit = memoryLimit;
    }

    public Integer getDiskSpace() {
        return DiskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        DiskSpace = diskSpace;
    }

    public Boolean getUseSSD() {
        return UseSSD;
    }

    public void setUseSSD(Boolean useSSD) {
        UseSSD = useSSD;
    }

    public String getSSDType() {
        return SSDType;
    }

    public void setSSDType(String SSDType) {
        this.SSDType = SSDType;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public Integer getDiskUsedSize() {
        return DiskUsedSize;
    }

    public void setDiskUsedSize(Integer diskUsedSize) {
        DiskUsedSize = diskUsedSize;
    }

    public Integer getDiskFileSize() {
        return DiskFileSize;
    }

    public void setDiskFileSize(Integer diskFileSize) {
        DiskFileSize = diskFileSize;
    }

    public Integer getSystemFileSize() {
        return SystemFileSize;
    }

    public void setSystemFileSize(Integer systemFileSize) {
        SystemFileSize = systemFileSize;
    }

    public Integer getLogFileSize() {
        return LogFileSize;
    }

    public void setLogFileSize(Integer logFileSize) {
        LogFileSize = logFileSize;
    }

    public String getBackupDate() {
        return BackupDate;
    }

    public void setBackupDate(String backupDate) {
        BackupDate = backupDate;
    }

    public List<UBDSlaveDataSet> getDataSet() {
        return DataSet;
    }

    public void setDataSet(List<UBDSlaveDataSet> dataSet) {
        DataSet = dataSet;
    }
}
