
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class UpdateEIPAttributeRequest extends Request {
    private String Region;
    private String EIPId;
    private String Name;
    private String Tag;
    private String Remark;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setEIPId(String EIPId) {
        this.EIPId = EIPId;
    }

    public String getEIPId() {
        return EIPId;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public String getTag() {
        return Tag;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public String getRemark() {
        return Remark;
    }

    @Override
    public String toString() {
        return "UpdateEIPAttributeRequest{" +
                "Region='" + Region + '\'' +
                ", EIPId='" + EIPId + '\'' +
                ", Name='" + Name + '\'' +
                ", Tag='" + Tag + '\'' +
                ", Remark='" + Remark + '\'' +
                '}';
    }
}
        