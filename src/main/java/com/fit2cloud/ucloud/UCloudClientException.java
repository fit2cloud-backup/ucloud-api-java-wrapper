package com.fit2cloud.ucloud;

/**
 * Created by chixq on 7/22/15.
 */
public class UCloudClientException extends Exception{

    private static final long serialVersionUID = 8484373440710721528L;

    public UCloudClientException(String msg){
        super(msg);
    }

    public UCloudClientException(String msg, Throwable cause){
        super(msg, cause);
    }
}
