package com.fit2cloud.ucloud;

/**
 * Created by chixq on 7/22/15.
 */
public class ErrorResponse {
    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public int getRetCode() {
        return RetCode;
    }

    public void setRetCode(int retCode) {
        RetCode = retCode;
    }

    private String Action;
    private int RetCode;
    private String Message;

}

