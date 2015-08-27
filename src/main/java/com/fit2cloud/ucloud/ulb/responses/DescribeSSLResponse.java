
package com.fit2cloud.ucloud.ulb.responses;

import com.fit2cloud.ucloud.Response;
import com.fit2cloud.ucloud.ulb.model.SSLDataSet;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeSSLResponse extends Response {
    private String TotalCOunt;
    private List<SSLDataSet> DataSet;


    public void setTotalCOunt(String TotalCOunt) {
        this.TotalCOunt = TotalCOunt;
    }

    public String getTotalCOunt() {
        return TotalCOunt;
    }

    public List<SSLDataSet> getDataSet() {
        return DataSet;
    }

    public void setDataSet(List<SSLDataSet> dataSet) {
        DataSet = dataSet;
    }
}
