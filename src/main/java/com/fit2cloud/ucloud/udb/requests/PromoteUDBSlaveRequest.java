
package com.fit2cloud.ucloud.udb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class PromoteUDBSlaveRequest extends Request {
    private String Region;
    private String ProjectId;
    private String DBId;
    private Boolean IsForce;


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

    public void setIsForce(Boolean IsForce) {
        this.IsForce = IsForce;
    }

    public Boolean getIsForce() {
        return IsForce;
    }


}
        