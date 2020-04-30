package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;

import java.util.Map;

/**
 * Created by max on 30/04/20.
 */
public class GetProjectRequest extends Request{
    private String IsFinance;

    public String getIsFinance() {
        return IsFinance;
    }

    public void setIsFinance(String isFinance) {
        IsFinance = isFinance;
    }

    @Override
    public Map toMap() {
        return super.toMap();
    }
}
