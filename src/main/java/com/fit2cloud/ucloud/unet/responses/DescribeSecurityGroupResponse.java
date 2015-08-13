package com.fit2cloud.ucloud.unet.responses;

import com.fit2cloud.ucloud.Response;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeSecurityGroupResponse extends Response {


    private List<com.fit2cloud.ucloud.unet.model.DataSet> DataSet;

    public List<com.fit2cloud.ucloud.unet.model.DataSet> getDataSet() {
        return DataSet;
    }

    public void setDataSet(List<com.fit2cloud.ucloud.unet.model.DataSet> dataSet) {
        DataSet = dataSet;
    }

    @Override
    public String toString() {
        return "DescribeSecurityGroupResourceResponse{" +
                "DataSet=" + DataSet +
                '}';
    }
}
        