package com.fit2cloud.ucloud.uhost.model;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:38 PM
 * Email: xqiang.chi@samsung.com
 */
public class Price {
    private String ChargeType;
    private float Price;

    public String getChargeType() {
        return ChargeType;
    }

    public void setChargeType(String chargeType) {
        ChargeType = chargeType;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "ChargeType='" + ChargeType + '\'' +
                ", Price=" + Price +
                '}';
    }
}
