package com.fit2cloud.ucloud.udb.model;

/**
 * Created by chixq on 8/30/15.
 */
public class DescribeUDBInstancePriceDataSet {
    private String ChargeType;
    private Float Price;

    public String getChargeType() {
        return ChargeType;
    }

    public void setChargeType(String chargeType) {
        ChargeType = chargeType;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }
}
