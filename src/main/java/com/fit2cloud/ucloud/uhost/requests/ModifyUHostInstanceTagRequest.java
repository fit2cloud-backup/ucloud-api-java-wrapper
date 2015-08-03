package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:23 PM
 * Email: xqiang.chi@samsung.com
 */
public class ModifyUHostInstanceTagRequest extends Request {
    private String Region;
    private String UHostId;
    private String Tag;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getUHostId() {
        return UHostId;
    }

    public void setUHostId(String UHostId) {
        this.UHostId = UHostId;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    @Override
    public String toString() {
        return "ModifyUHostInstanceTagRequest{" +
                "Region='" + Region + '\'' +
                ", UHostId='" + UHostId + '\'' +
                ", Tag='" + Tag + '\'' +
                '}';
    }
}
