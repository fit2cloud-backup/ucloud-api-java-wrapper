
package com.fit2cloud.ucloud.udb.responses;

import com.fit2cloud.ucloud.Response;
import com.fit2cloud.ucloud.udb.model.DescribeUDBTypeDataSet;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeUDBTypeResponse extends Response {
    private List<DescribeUDBTypeDataSet> DataSet;

    public List<DescribeUDBTypeDataSet> getDataSet() {
        return DataSet;
    }

    public void setDataSet(List<DescribeUDBTypeDataSet> dataSet) {
        DataSet = dataSet;
    }
}
