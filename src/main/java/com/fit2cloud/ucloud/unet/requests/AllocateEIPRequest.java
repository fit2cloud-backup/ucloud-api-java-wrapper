
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
    private String ProjectId;
    private String OperatorName;
    private Integer Bandwidth;
    private String ChargeType;
    private Integer Quantity;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getOperatorName() {
        return OperatorName;
    }

    public void setOperatorName(String operatorName) {
        OperatorName = operatorName;
    }

    public Integer getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        Bandwidth = bandwidth;
    }

    public String getChargeType() {
        return ChargeType;
    }

    public void setChargeType(String chargeType) {
        ChargeType = chargeType;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String projectId) {
        ProjectId = projectId;
    }

    @Override
    public String toString() {
        return "AllocateEIPRequest{" +
                "Region='" + Region + '\'' +
                ", ProjectId='" + ProjectId + '\'' +
                ", OperatorName='" + OperatorName + '\'' +
                ", Bandwidth=" + Bandwidth +
                ", ChargeType='" + ChargeType + '\'' +
                ", Quantity=" + Quantity +
                '}';
    }
}
        