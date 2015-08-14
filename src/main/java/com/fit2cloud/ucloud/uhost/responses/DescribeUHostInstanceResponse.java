package com.fit2cloud.ucloud.uhost.responses;

import com.fit2cloud.ucloud.Response;

import java.util.List;

/**
 * Created by chixq on 8/12/15.
 */
public class DescribeUHostInstanceResponse extends Response {
    private List<com.fit2cloud.ucloud.uhost.model.UHostSet> UHostSet;

    public List<com.fit2cloud.ucloud.uhost.model.UHostSet> getUHostSet() {
        return UHostSet;
    }

    public void setUHostSet(List<com.fit2cloud.ucloud.uhost.model.UHostSet> UHostSet) {

        this.UHostSet = UHostSet;
    }

    @Override
    public String toString() {
        return "DescribeUHostInstanceResponse{" +
                "UHostSet=" + UHostSet +
                '}';
    }
}
