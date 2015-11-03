package com.fit2cloud.ucloud.uapp.responses;

import com.fit2cloud.ucloud.Response;
import com.fit2cloud.ucloud.uapp.model.UserInfo;

import java.util.List;

/**
 * Created by zhangbohan on 15/11/2.
 */
public class GetUserInfoResponse extends Response {
    private List<UserInfo> DataSet;

    public List<UserInfo> getDataSet() {
        return DataSet;
    }

    public void setDataSet(List<UserInfo> dataSet) {
        DataSet = dataSet;
    }

    @Override
    public String toString() {
        return "GetUserInfoResponse{" +
                "UserInfos=" + DataSet +
                '}';
    }
}
