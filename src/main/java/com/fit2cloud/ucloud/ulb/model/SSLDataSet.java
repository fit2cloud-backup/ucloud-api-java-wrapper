package com.fit2cloud.ucloud.ulb.model;

/**
 * Created by chixq on 8/27/15.
 */
public class SSLDataSet {
    private String SSLId;
    private String SSLName;
    private String SSLType;
    private String SSLContent;
    private String HashValue;
    private Integer CreateTime;
    private String VServerId;

    public String getSSLId() {
        return SSLId;
    }

    public void setSSLId(String SSLId) {
        this.SSLId = SSLId;
    }

    public String getSSLName() {
        return SSLName;
    }

    public void setSSLName(String SSLName) {
        this.SSLName = SSLName;
    }

    public String getSSLType() {
        return SSLType;
    }

    public void setSSLType(String SSLType) {
        this.SSLType = SSLType;
    }

    public String getSSLContent() {
        return SSLContent;
    }

    public void setSSLContent(String SSLContent) {
        this.SSLContent = SSLContent;
    }

    public String getHashValue() {
        return HashValue;
    }

    public void setHashValue(String hashValue) {
        HashValue = hashValue;
    }

    public Integer getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Integer createTime) {
        CreateTime = createTime;
    }

    public String getVServerId() {
        return VServerId;
    }

    public void setVServerId(String VServerId) {
        this.VServerId = VServerId;
    }
}
