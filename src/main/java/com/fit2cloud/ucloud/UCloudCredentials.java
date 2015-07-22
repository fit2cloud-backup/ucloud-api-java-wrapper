package com.fit2cloud.ucloud;

/**
 * Created by chixq on 7/22/15.
 */
public class UCloudCredentials {
    public UCloudCredentials(String publicKey, String privateKey, String baseURL) throws UCloudClientException {
        if (publicKey == null){
            throw new UCloudClientException("Public Key cannot be null!");
        }
        if (privateKey == null){
            throw new UCloudClientException("Private Key cannot be null!");
        }
        this.publicKey = publicKey;
        this.privateKey = privateKey;
        this.baseURL = baseURL;
    }

    public UCloudCredentials(String publicKey, String privateKey) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    private String publicKey;
    private String privateKey;
    private String baseURL = "http://api.ucloud.cn";






}
