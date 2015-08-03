
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class AllocateEIPRequest extends Request {
    private String Region;
    private String OperatorName;
    private int Bandwidth;
    private String ChargeType;
    private int Quantity;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    public String getOperatorName() {
        return OperatorName;
    }

    public void setBandwidth(int Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public int getBandwidth() {
        return Bandwidth;
    }

    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    public String getChargeType() {
        return ChargeType;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getQuantity() {
        return Quantity;
    }

    @Override
    public String toString() {
        return "AllocateEIPRequest{" +
                "Region='" + Region + '\'' +
                ", OperatorName='" + OperatorName + '\'' +
                ", Bandwidth=" + Bandwidth +
                ", ChargeType='" + ChargeType + '\'' +
                ", Quantity=" + Quantity +
                '}';
    }
}
        