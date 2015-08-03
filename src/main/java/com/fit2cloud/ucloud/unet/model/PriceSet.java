package com.fit2cloud.ucloud.unet.model;

/**
 * Created by chixq on 8/2/15.
 */
public class PriceSet {
    private String ChargeType;
    private float Price;
    private int PurchaseValue;

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

    public int getPurchaseValue() {
        return PurchaseValue;
    }

    public void setPurchaseValue(int purchaseValue) {
        PurchaseValue = purchaseValue;
    }
}
