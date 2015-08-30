
package com.fit2cloud.ucloud.udb.responses;

import com.fit2cloud.ucloud.Response;
import com.fit2cloud.ucloud.udb.model.DescribeUDBInstance;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeUDBInstanceResponse extends Response {
    private List<DescribeUDBInstance> DataSet;

    public List<DescribeUDBInstance> getDataSet() {
        return DataSet;
    }

    public void setDataSet(List<DescribeUDBInstance> dataSet) {
        DataSet = dataSet;
    }
}

