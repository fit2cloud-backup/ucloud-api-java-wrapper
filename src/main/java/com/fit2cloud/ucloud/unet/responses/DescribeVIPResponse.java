
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
public class DescribeVIPResponse extends Response {
    private List<String> DataSet;


    public void setDataSet(List<String> DataSet) {
        this.DataSet = DataSet;
    }

    public List<String> getDataSet() {
        return DataSet;
    }

    @Override
    public String toString() {
        return "DescribeVIPResponse{" +
                "DataSet=" + DataSet +
                '}';
    }
}
        