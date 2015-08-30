
package com.fit2cloud.ucloud.udb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeUDBInstanceRequest extends Request {
    private String Region;
    private String ProjectId;
    private String DBId;
    private String ClassType;
    private Integer Offset;
    private Integer Limit;


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

    public void setDBId(String DBId) {
        this.DBId = DBId;
    }

    public String getDBId() {
        return DBId;
    }

    public void setClassType(String ClassType) {
        this.ClassType = ClassType;
    }

    public String getClassType() {
        return ClassType;
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


}
        