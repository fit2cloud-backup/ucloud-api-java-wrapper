
package com.fit2cloud.ucloud.unet.responses;

import com.fit2cloud.ucloud.Response;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreateBandwidthPackageResponse extends Response {
    private String BandwidthPackageId;


    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    public String getBandwidthPackageId() {
        return BandwidthPackageId;
    }

    @Override
    public String toString() {
        return "CreateBandwidthPackageResponse{" +
                "BandwidthPackageId='" + BandwidthPackageId + '\'' +
                '}';
    }
}
        