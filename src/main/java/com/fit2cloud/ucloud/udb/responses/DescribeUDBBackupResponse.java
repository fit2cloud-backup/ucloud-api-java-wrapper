
package com.fit2cloud.ucloud.udb.responses;

import com.fit2cloud.ucloud.Response;
import com.fit2cloud.ucloud.udb.model.DescribeUDBDataSet;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeUDBBackupResponse extends Response {
    private List<DescribeUDBDataSet> DataSet;

    public List<DescribeUDBDataSet> getDataSet() {
        return DataSet;
    }

    public void setDataSet(List<DescribeUDBDataSet> dataSet) {
        DataSet = dataSet;
    }
}
