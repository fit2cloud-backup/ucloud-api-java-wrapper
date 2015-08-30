
package com.fit2cloud.ucloud.udb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeUDBBackupRequest extends Request {
    private String Region;
    private String ProjectId;
    private Integer Offset;
    private Integer Limit;
    private String DBId;
    private Integer BackupType;
    private Integer BeginTime;
    private Integer EndTime;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public String getProjectId() {
        return ProjectId;
    }

    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    public Integer getOffset() {
        return Offset;
    }

    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    public Integer getLimit() {
        return Limit;
    }

    public void setDBId(String DBId) {
        this.DBId = DBId;
    }

    public String getDBId() {
        return DBId;
    }

    public void setBackupType(Integer BackupType) {
        this.BackupType = BackupType;
    }

    public Integer getBackupType() {
        return BackupType;
    }

    public void setBeginTime(Integer BeginTime) {
        this.BeginTime = BeginTime;
    }

    public Integer getBeginTime() {
        return BeginTime;
    }

    public void setEndTime(Integer EndTime) {
        this.EndTime = EndTime;
    }

    public Integer getEndTime() {
        return EndTime;
    }


}
        