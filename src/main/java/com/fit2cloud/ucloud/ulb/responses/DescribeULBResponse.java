
package com.fit2cloud.ucloud.ulb.responses;

import com.fit2cloud.ucloud.Response;
import com.fit2cloud.ucloud.ulb.model.ULBDataSet;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeULBResponse extends Response {
    private List<ULBDataSet> DataSet;

    public List<ULBDataSet> getDataSet() {
        return DataSet;
    }

    public void setDataSet(List<ULBDataSet> dataSet) {
        DataSet = dataSet;
    }
}

