package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:28 PM
 * Email: xqiang.chi@samsung.com
 */
public class GetUHostInstancePriceRequest extends Request {
    private String Region;
    private String ImageId;
    private int CPU;
    private int Memory;
    private int Count;
    private com.fit2cloud.ucloud.uhost.model.ChargeType ChargeType;
    private int DiskSpace;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
        ImageId = imageId;
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

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public com.fit2cloud.ucloud.uhost.model.ChargeType getChargeType() {
        return ChargeType;
    }

    public void setChargeType(com.fit2cloud.ucloud.uhost.model.ChargeType chargeType) {
        ChargeType = chargeType;
    }

    public int getDiskSpace() {
        return DiskSpace;
    }

    public void setDiskSpace(int diskSpace) {
        DiskSpace = diskSpace;
    }

    @Override
    public String toString() {
        return "GetUHostInstancePriceRequest{" +
                "Region='" + Region + '\'' +
                ", ImageId='" + ImageId + '\'' +
                ", CPU=" + CPU +
                ", Memory=" + Memory +
                ", Count=" + Count +
                ", ChargeType=" + ChargeType +
                ", DiskSpace=" + DiskSpace +
                '}';
    }
}
