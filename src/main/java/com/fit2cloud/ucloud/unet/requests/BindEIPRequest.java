
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class BindEIPRequest extends Request {
    private String Region;
    private String ProjectId;
    private String EIPId;
    private String ResourceType;
    private String ResourceId;

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

    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public String getResourceType() {
        return ResourceType;
    }

    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public String getResourceId() {
        return ResourceId;
    }

    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String projectId) {
        ProjectId = projectId;
    }

    @Override
    public String toString() {
        return "BindEIPRequest{" +
                "Region='" + Region + '\'' +
                ", ProjectId='" + ProjectId + '\'' +
                ", EIPId='" + EIPId + '\'' +
                ", ResourceType='" + ResourceType + '\'' +
                ", ResourceId='" + ResourceId + '\'' +
                '}';
    }
}
        