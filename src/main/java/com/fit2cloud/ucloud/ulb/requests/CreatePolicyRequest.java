
package com.fit2cloud.ucloud.ulb.requests;

import com.fit2cloud.ucloud.Request;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreatePolicyRequest extends Request {
    private String Region;
    private String GroupId;
    private String Match;
    private String ULBId;
    private String VServerId;
    private List<String> BackendIds;
    private String Type;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public String getGroupId() {
        return GroupId;
    }

    public void setMatch(String Match) {
        this.Match = Match;
    }

    public String getMatch() {
        return Match;
    }

    public void setULBId(String ULBId) {
        this.ULBId = ULBId;
    }

    public String getULBId() {
        return ULBId;
    }

    public void setVServerId(String VServerId) {
        this.VServerId = VServerId;
    }

    public String getVServerId() {
        return VServerId;
    }

    public List<String> getBackendIds() {
        return BackendIds;
    }

    public void setBackendIds(List<String> backendIds) {
        BackendIds = backendIds;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }


    @Override
    public Map toMap() {
        Map<String, String> map = gson.fromJson(gson.toJson(this), new TypeToken<Map<String, String>>(){}.getType());

        if (BackendIds != null) {
            int i = 0;
            for(String backendId : BackendIds) {
                map.put("BackendId." + i, backendId);
                i++;
            }
            map.remove("BackendIds");
        }

        return map;
    }
}
        