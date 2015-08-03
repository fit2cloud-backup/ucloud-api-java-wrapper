package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:11 PM
 * Email: xqiang.chi@samsung.com
 */
public class ResizeUHostInstanceRequest extends Request {
    private String Region;
    private String UHostId;
    private int CPU;
    private int Memory;
    private int DiskSpace;

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

    public int getCPU() {
        return CPU;
    }

    public void setCPU(int CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public int getDiskSpace() {
        return DiskSpace;
    }

    public void setDiskSpace(int diskSpace) {
        DiskSpace = diskSpace;
    }

    @Override
    public String toString() {
        return "ResizeUHostInstanceRequest{" +
                "Region='" + Region + '\'' +
                ", UHostId='" + UHostId + '\'' +
                ", CPU=" + CPU +
                ", Memory=" + Memory +
                ", DiskSpace=" + DiskSpace +
                '}';
    }
}
