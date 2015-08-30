
package com.fit2cloud.ucloud.udb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreateUDBReplicationInstanceRequest extends Request {
    private String Region;
    private String ProjectId;
    private String SrcId;
    private String Name;
    private Integer Port;
    private Boolean IsArbiter;
    private String CouponId;


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

    public void setSrcId(String SrcId) {
        this.SrcId = SrcId;
    }

    public String getSrcId() {
        return SrcId;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setPort(Integer Port) {
        this.Port = Port;
    }

    public Integer getPort() {
        return Port;
    }

    public void setIsArbiter(Boolean IsArbiter) {
        this.IsArbiter = IsArbiter;
    }

    public Boolean getIsArbiter() {
        return IsArbiter;
    }

    public void setCouponId(String CouponId) {
        this.CouponId = CouponId;
    }

    public String getCouponId() {
        return CouponId;
    }


}
        