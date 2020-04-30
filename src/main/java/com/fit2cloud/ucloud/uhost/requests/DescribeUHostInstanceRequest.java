package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by chixq on 8/12/15.
 */
public class DescribeUHostInstanceRequest extends Request{
    private String Region;
    private List<String> UHostIds;
    private String Tag;
    private int Offset = 0;
    private int Limit = 20;
    private String ProjectId;
    private String Zone;

    public String getZone() {
        return Zone;
    }

    public void setZone(String zone) {
        Zone = zone;
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

    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String projectId) {
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
        List<String> tmp = null;
        if(null != UHostIds) {
            tmp = new ArrayList<String>(UHostIds);
            UHostIds = null;
        }
        Map<String, String> map = gson.fromJson(gson.toJson(this), new TypeToken<Map<String, String>>(){}.getType());

        if (tmp != null) {
            int i = 0;
            for(String uHostId : tmp) {
                map.put("UHostIds." + i, uHostId);
                i++;
            }
            map.remove("UHostIds");
        }

        return map;
    }
}
