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
    private String Tag;
    private int Offset = 0;
    private int Limit = 20;
    private Integer ProjectId;

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
        //当UHostIds的size大于1时用原先的方法会出现Json解析的异常因为UHostIds在Json中时数组，而new TypeToken<Map<String, String>中为String，
        //这就导致冲突了，但是换成new TypeToken<Map<String, Object>又回引发新的Bug，正常的String值最后返回的不是字面值而是java.lang.Object
        //所以这里对UHosIds进行处理，但是这种处理目前好像没有必要，因为目前没有出现UHostIds.size大于1的情况，因为目前的需求时要么获取所有虚拟机要么
        //获取某个虚拟机，但是这里还是处理一下。
        if(null != UHostIds && UHostIds.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            for(String UHostId : UHostIds) {
                stringBuilder.append(UHostId + " ");
            }
            UHostIds = Collections.singletonList(stringBuilder.substring(0, stringBuilder.length() - 1));
        }
        Map<String, String> map = gson.fromJson(gson.toJson(this), new TypeToken<Map<String, String>>(){}.getType());

        if (UHostIds != null) {
            int i = 1;
            String[] uHostIds = UHostIds.get(0).split(" ");
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
