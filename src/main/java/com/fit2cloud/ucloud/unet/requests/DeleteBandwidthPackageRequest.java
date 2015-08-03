
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DeleteBandwidthPackageRequest extends Request {
    private String Region;
    private String BandwidthPackageId;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    public String getBandwidthPackageId() {
        return BandwidthPackageId;
    }

    @Override
    public String toString() {
        return "DeleteBandwidthPackageRequest{" +
                "Region='" + Region + '\'' +
                ", BandwidthPackageId='" + BandwidthPackageId + '\'' +
                '}';
    }
}
        