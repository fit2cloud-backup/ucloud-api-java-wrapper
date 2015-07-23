package com.fit2cloud.ucloud;

import com.fit2cloud.ucloud.exception.UCloudClientException;

/**
 * Created by chixq on 7/22/15.
 */
public class UCloudCredentials {
    public UCloudCredentials(String publicKey, String privateKey) throws UCloudClientException {
        if (publicKey == null){
            throw new UCloudClientException("Public Key cannot be null!");
        }
        if (privateKey == null){
            throw new UCloudClientException("Private Key cannot be null!");
        }
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

}
