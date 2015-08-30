
package com.fit2cloud.ucloud.udb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeUDBInstancePriceRequest extends Request {
    private String Region;
    private Integer Count;
    private String ChargeType;
    private Integer Quantity;
    private Integer MemoryLimit;
    private Integer DiskSpace;
    private Boolean UseSSD;
    private String SSDType;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setCount(Integer Count) {
        this.Count = Count;
    }

    public Integer getCount() {
        return Count;
    }

    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    public String getChargeType() {
        return ChargeType;
    }

    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setMemoryLimit(Integer MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    public Integer getMemoryLimit() {
        return MemoryLimit;
    }

    public void setDiskSpace(Integer DiskSpace) {
        this.DiskSpace = DiskSpace;
    }

    public Integer getDiskSpace() {
        return DiskSpace;
    }

    public void setUseSSD(Boolean UseSSD) {
        this.UseSSD = UseSSD;
    }

    public Boolean getUseSSD() {
        return UseSSD;
    }

    public void setSSDType(String SSDType) {
        this.SSDType = SSDType;
    }

    public String getSSDType() {
        return SSDType;
    }


}
        