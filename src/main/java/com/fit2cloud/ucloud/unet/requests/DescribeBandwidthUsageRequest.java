
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeBandwidthUsageRequest extends Request {
    private String Region;
    private int OffSet;
    private int Limit;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setOffSet(Integer OffSet) {
        this.OffSet = OffSet;
    }

    public int getOffSet() {
        return OffSet;
    }

    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    public int getLimit() {
        return Limit;
    }

    @Override
    public String toString() {
        return "DescribeBandwidthUsageRequest{" +
                "Region='" + Region + '\'' +
                ", OffSet=" + OffSet +
                ", Limit=" + Limit +
                '}';
    }
}
        