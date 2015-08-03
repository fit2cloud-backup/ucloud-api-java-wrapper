
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
public class DescribeSecurityGroupResourceResponse extends Response {
    private List<String> DataSet;

    public List<String> getDataSet() {
        return DataSet;
    }

    public void setDataSet(List<String> dataSet) {
        DataSet = dataSet;
    }


    @Override
    public String toString() {
        return "DescribeSecurityGroupResourceResponse{" +
                "DataSet=" + DataSet +
                '}';
    }
}
        