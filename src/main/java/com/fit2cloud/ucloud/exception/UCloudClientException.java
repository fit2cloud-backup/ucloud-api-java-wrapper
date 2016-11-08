package com.fit2cloud.ucloud.exception;

/**
 * Created by chixq on 7/22/15.
 */
public class UCloudClientException extends Exception{
    private int retCode;
    private String errorMsg;
    private String action;

    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 8484373440710721528L;

    public UCloudClientException(String msg){
        super(msg);
    }

    public UCloudClientException(String msg, Throwable cause){
        super(msg, cause);
    }
}
