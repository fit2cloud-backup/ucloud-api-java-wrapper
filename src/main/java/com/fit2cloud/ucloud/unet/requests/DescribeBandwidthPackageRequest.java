
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeBandwidthPackageRequest extends Request {
    private String Region;
    private int Limit;
    private int Offset;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setLimit(int Limit) {
        this.Limit = Limit;
    }

    public int getLimit() {
        return Limit;
    }

    public void setOffset(int Offset) {
        this.Offset = Offset;
    }

    public int getOffset() {
        return Offset;
    }

    @Override
    public String toString() {
        return "DescribeBandwidthPackageRequest{" +
                "Region='" + Region + '\'' +
                ", Limit=" + Limit +
                ", Offset=" + Offset +
                '}';
    }
}
        