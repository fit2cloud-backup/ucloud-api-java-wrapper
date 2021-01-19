package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class AttachUDiskRequest extends Request {
    private String Zone;
    private String ProjectId;
    private String Region;
    private String UHostId;
    private String UDiskId;


    @Override
    public String toString() {
        return "AttachUDiskRequest{" +
                "Zone='" + Zone + '\'' +
                ", ProjectId='" + ProjectId + '\'' +
                ", Region='" + Region + '\'' +
                ", UHostId='" + UHostId + '\'' +
                ", UDiskId='" + UDiskId + '\'' +
                '}';
    }

    public String getUHostId() {
        return UHostId;
    }

    public void setUHostId(String UHostId) {

        this.UHostId = UHostId;
    }

    public String getUDiskId() {
        return UDiskId;
    }

    public void setUDiskId(String UDiskId) {
        this.UDiskId = UDiskId;
    }

    public String getRegion() {

        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getZone() {
        return Zone;
    }

    public void setZone(String zone) {
        Zone = zone;
    }

    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String projectId) {
        ProjectId = projectId;
    }
}
