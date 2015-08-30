package com.fit2cloud.ucloud.udb.model;

/**
 * Created by chixq on 8/30/15.
 */
public class DescribeUDBDataSet {
    private Integer BackupId;
    private String BackupName;
    private Integer BackupTime;
    private Integer BackupSize;
    private Integer BackupType;
    private String State;
    private String DBId;
    private String DBName;

    public Integer getBackupId() {
        return BackupId;
    }

    public void setBackupId(Integer backupId) {
        BackupId = backupId;
    }

    public String getBackupName() {
        return BackupName;
    }

    public void setBackupName(String backupName) {
        BackupName = backupName;
    }

    public Integer getBackupTime() {
        return BackupTime;
    }

    public void setBackupTime(Integer backupTime) {
        BackupTime = backupTime;
    }

    public Integer getBackupSize() {
        return BackupSize;
    }

    public void setBackupSize(Integer backupSize) {
        BackupSize = backupSize;
    }

    public Integer getBackupType() {
        return BackupType;
    }

    public void setBackupType(Integer backupType) {
        BackupType = backupType;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getDBId() {
        return DBId;
    }

    public void setDBId(String DBId) {
        this.DBId = DBId;
    }

    public String getDBName() {
        return DBName;
    }

    public void setDBName(String DBName) {
        this.DBName = DBName;
    }
}
