
package com.fit2cloud.ucloud.udb.responses;

import com.fit2cloud.ucloud.Response;
import com.fit2cloud.ucloud.udb.model.DescribeUDBInstancePriceDataSet;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeUDBInstancePriceResponse extends Response {
    private List<DescribeUDBInstancePriceDataSet> DataSet;

    public List<DescribeUDBInstancePriceDataSet> getDataSet() {
        return DataSet;
    }

    public void setDataSet(List<DescribeUDBInstancePriceDataSet> dataSet) {
        DataSet = dataSet;
    }
}

