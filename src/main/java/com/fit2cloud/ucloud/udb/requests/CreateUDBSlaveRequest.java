
package com.fit2cloud.ucloud.udb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreateUDBSlaveRequest extends Request {
    private String Region;
    private String ProjectId;
    private String SrcId;
    private String Name;
    private Integer Port;
    private Boolean UseSSD;
    private String SSDType;
    private String CouponId;
    private Boolean IsLock;


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

    public void setUseSSD(Boolean UseSSD) {
        this.UseSSD = UseSSD;
    }

    public Boolean getUseSSD() {
        return UseSSD;
    }

    public void setSSDType(String SSDType) {
        this.SSDType = SSDType;
    }

    public String getSSDType() {
        return SSDType;
    }

    public void setCouponId(String CouponId) {
        this.CouponId = CouponId;
    }

    public String getCouponId() {
        return CouponId;
    }

    public void setIsLock(Boolean IsLock) {
        this.IsLock = IsLock;
    }

    public Boolean getIsLock() {
        return IsLock;
    }


}
        