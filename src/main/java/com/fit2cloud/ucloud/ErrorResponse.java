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

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    private String Action;
    private String Code;
    private String Message;

}

