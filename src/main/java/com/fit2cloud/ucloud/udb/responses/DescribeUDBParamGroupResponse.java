
package com.fit2cloud.ucloud.udb.responses;

import com.fit2cloud.ucloud.Response;
import com.fit2cloud.ucloud.udb.model.DescribeUDBParamGroupDataSet;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeUDBParamGroupResponse extends Response {
    private List<DescribeUDBParamGroupDataSet> DataSet;

    public List<DescribeUDBParamGroupDataSet> getDataSet() {
        return DataSet;
    }

    public void setDataSet(List<DescribeUDBParamGroupDataSet> dataSet) {
        DataSet = dataSet;
    }
}

