
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeEIPRequest extends Request {
    private String Region;
    private List<String> EIPIds;
    private int Offset;
    private int Limit;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public List<String> getEIPIds() {
        return EIPIds;
    }

    public void setEIPIds(List<String> EIPIds) {
        this.EIPIds = EIPIds;
    }

    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    public int getOffset() {
        return Offset;
    }

    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    public int getLimit() {
        return Limit;
    }

    @Override
    public String toString() {
        return "DescribeEIPRequest{" +
                "Region='" + Region + '\'' +
                ", EIPIds=" + EIPIds +
                ", Offset=" + Offset +
                ", Limit=" + Limit +
                '}';
    }

    @Override
    public Map<String, String> toMap() {
    	List<String> eipList = null;
    	if(EIPIds != null) {
    		eipList = new ArrayList<String>(EIPIds);
    		EIPIds = null;
    	}
        Type type = new TypeToken<HashMap<String, String>>(){}.getType();
        Map<String, String> map = new HashMap<String, String>();

        map.putAll(gson.<Map<? extends String, ? extends String>>fromJson(gson.toJson(Region),type));
        map.put("Offset", String.valueOf(Offset));
        map.put("Limit", String.valueOf(Limit));

        if (eipList != null) {
            int count = 0;
            for(String EIPId : eipList){
                map.put("EIPIds." + count, EIPId);
                count ++;
            }
            map.remove("EIPIds");
        }

        return map;
    }
}
