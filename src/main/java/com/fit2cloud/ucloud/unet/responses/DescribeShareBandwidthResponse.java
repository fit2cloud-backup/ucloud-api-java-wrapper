
package com.fit2cloud.ucloud.unet.responses;

import com.fit2cloud.ucloud.Response;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeShareBandwidthResponse extends Response {
    private String IsShare;
    private int ShareBandwidth;
    private String ShareBandwidthId;
    private String ChargeType;
    private int CreateTime;
    private int ExpireTime;
    private int PurchaseValue;

    public String getIsShare() {
        return IsShare;
    }

    public void setIsShare(String isShare) {
        IsShare = isShare;
    }

    public int getShareBandwidth() {
        return ShareBandwidth;
    }

    public void setShareBandwidth(int shareBandwidth) {
        ShareBandwidth = shareBandwidth;
    }

    public String getShareBandwidthId() {
        return ShareBandwidthId;
    }

    public void setShareBandwidthId(String shareBandwidthId) {
        ShareBandwidthId = shareBandwidthId;
    }

    public String getChargeType() {
        return ChargeType;
    }

    public void setChargeType(String chargeType) {
        ChargeType = chargeType;
    }

    public int getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(int createTime) {
        CreateTime = createTime;
    }

    public int getExpireTime() {
        return ExpireTime;
    }

    public void setExpireTime(int expireTime) {
        ExpireTime = expireTime;
    }

    public int getPurchaseValue() {
        return PurchaseValue;
    }

    public void setPurchaseValue(int purchaseValue) {
        PurchaseValue = purchaseValue;
    }

    @Override
    public String toString() {
        return "DescribeShareBandwidthResponse{" +
                "IsShare='" + IsShare + '\'' +
                ", ShareBandwidth=" + ShareBandwidth +
                ", ShareBandwidthId='" + ShareBandwidthId + '\'' +
                ", ChargeType='" + ChargeType + '\'' +
                ", CreateTime=" + CreateTime +
                ", ExpireTime=" + ExpireTime +
                ", PurchaseValue=" + PurchaseValue +
                '}';
    }
}

