
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeSecurityGroupRequest extends Request {
    private String Region;
    private String ResourceType;
    private int ResourceId;
    private String GroupId;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public String getResourceType() {
        return ResourceType;
    }

    public void setResourceId(Integer ResourceId) {
        this.ResourceId = ResourceId;
    }

    public int getResourceId() {
        return ResourceId;
    }

    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public String getGroupId() {
        return GroupId;
    }

    @Override
    public String toString() {
        return "DescribeSecurityGroupRequest{" +
                "Region='" + Region + '\'' +
                ", ResourceType='" + ResourceType + '\'' +
                ", ResourceId=" + ResourceId +
                ", GroupId='" + GroupId + '\'' +
                '}';
    }
}
        