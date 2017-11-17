package com.fit2cloud.ucloud.udisk.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created by linjinbo on 2017/11/15.
 */
public class DescribeUDiskRequest extends Request{

    private String Region;

    private String UDiskId;

    private int Offset;

    private int Limit;

    private String ProjectId;

    private String DiskType;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getUDiskId() {
        return UDiskId;
    }

    public void setUDiskId(String UDiskId) {
        this.UDiskId = UDiskId;
    }

    public int getOffset() {
        return Offset;
    }

    public void setOffset(int offset) {
        Offset = offset;
    }

    public int getLimit() {
        return Limit;
    }

    public void setLimit(int limit) {
        Limit = limit;
    }

    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String projectId) {
        ProjectId = projectId;
    }

    public String getDiskType() {
        return DiskType;
    }

    public void setDiskType(String diskType) {
        DiskType = diskType;
    }
}
