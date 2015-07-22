package com.fit2cloud.ucloud;

/**
 * Created by chixq on 7/22/15.
 */
public class UCloudServiceException extends Exception{
    private int retCode;
    private String errorMsg;
    private String action;

    public UCloudServiceException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public UCloudServiceException(String errorMsg, Throwable cause) {
        super(errorMsg, cause);
        this.errorMsg = errorMsg;
    }

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

}
