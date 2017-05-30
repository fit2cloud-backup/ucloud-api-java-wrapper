package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;
import com.google.gson.reflect.TypeToken;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by chixq on 8/12/15.
 */
public class DescribeUHostInstanceRequest extends Request{
    private String Region;
    private List<String> UHostIds;
    private String UHostIdsStr;
    private String Tag;
    private int Offset = 0;
    private int Limit = 20;
    private Integer ProjectId;

    public String getUHostIdsStr() {
        return UHostIdsStr;
    }

    public void setUHostIdsStr(String UHostIdsStr) {
        this.UHostIdsStr = UHostIdsStr;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public List<String> getUHostIds() {
        return UHostIds;
    }

    public void setUHostIds(List<String> UHostIds) {
        this.UHostIds = UHostIds;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public int getOffset() {
        return Offset;
    }

    public void setOffset(int offset) {
        Offset = offset;
    }

    public int getLimit() {
        return Limit;
    }

    public void setLimit(int limit) {
        Limit = limit;
    }

    public int getProjectId() {
        return ProjectId;
    }

    public void setProjectId(Integer projectId) {
        ProjectId = projectId;
    }

    @Override
    public String toString() {
        return "DescribeUHostInstanceRequest{" +
                "Region='" + Region + '\'' +
                ", UHostIds=" + UHostIds +
                ", Tag='" + Tag + '\'' +
                ", Offset=" + Offset +
                ", Limit=" + Limit +
                ", ProjectId=" + ProjectId +
                '}';
    }

    @Override
    public Map toMap() {
        if(null != UHostIds) {
            StringBuilder stringBuilder = new StringBuilder();
            for(String UHostId : UHostIds) {
                stringBuilder.append(UHostId + " ");
            }
            UHostIds = null;
            UHostIdsStr = stringBuilder.substring(0, stringBuilder.length() - 1);
        }
        Map<String, String> map = gson.fromJson(gson.toJson(this), new TypeToken<Map<String, String>>(){}.getType());

        if (UHostIdsStr != null) {
            int i = 1;
            String[] uHostIds = UHostIdsStr.split(" ");
            for(String uHostId : uHostIds) {
                map.put("UHostId." + i, uHostId);
                i++;
            }
            map.remove("UHostIds");
        }

        return map;
    }

//    @Override
//    public Map toMap() {
//        Map<String, Object> map = gson.fromJson(gson.toJson(this), new TypeToken<Map<String, Object>>(){}.getType());
//
//        for(Map.Entry<String, Object> entry : map.entrySet()) {
//            map.put(entry.getKey(), entry.getValue().toString());
//        }
//
//        if (UHostIds != null) {
//            int i = 0;
//            for(String UHostId : UHostIds) {
//                map.put("UHostIds." + i, UHostId);
//                i++;
//            }
//            map.remove("UHostIds");
//        }
//
//        return map;
//    }
}
