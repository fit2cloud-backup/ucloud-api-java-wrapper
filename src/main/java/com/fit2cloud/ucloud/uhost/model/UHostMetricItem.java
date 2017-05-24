package com.fit2cloud.ucloud.uhost.model;

/**
 * Created by dhf on 2017/5/23.
 */
public class UHostMetricItem {
    private long Timestamp;
    private float Value;

    public long getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(long timestamp) {
        Timestamp = timestamp;
    }

    public float getValue() {
        return Value;
    }

    public void setValue(float value) {
        Value = value;
    }
}
