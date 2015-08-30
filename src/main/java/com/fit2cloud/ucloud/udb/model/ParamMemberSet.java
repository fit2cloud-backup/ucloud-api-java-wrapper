package com.fit2cloud.ucloud.udb.model;

/**
 * Created by chixq on 8/30/15.
 */
public class ParamMemberSet {
    private String Key;
    private String Value;
    private Integer ValueType;
    private String AllowedVal;
    private Integer ApplyType;
    private Boolean Modifiable;
    private Integer FormatType;

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public Integer getValueType() {
        return ValueType;
    }

    public void setValueType(Integer valueType) {
        ValueType = valueType;
    }

    public String getAllowedVal() {
        return AllowedVal;
    }

    public void setAllowedVal(String allowedVal) {
        AllowedVal = allowedVal;
    }

    public Integer getApplyType() {
        return ApplyType;
    }

    public void setApplyType(Integer applyType) {
        ApplyType = applyType;
    }

    public Boolean getModifiable() {
        return Modifiable;
    }

    public void setModifiable(Boolean modifiable) {
        Modifiable = modifiable;
    }

    public Integer getFormatType() {
        return FormatType;
    }

    public void setFormatType(Integer formatType) {
        FormatType = formatType;
    }
}
