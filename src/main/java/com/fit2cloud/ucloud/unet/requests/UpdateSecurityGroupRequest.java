
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
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
public class UpdateSecurityGroupRequest extends Request {
    private String Region;
    private String GroupId;
    private List<String> Rule;
    private String Proto;
    private String Dst_port;
    private String Src_ip;
    private String Action;
    private int Priority;


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

    public List<String> getRule() {
        return Rule;
    }

    public void setRule(List<String> rule) {
        Rule = rule;
    }

    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    public String getProto() {
        return Proto;
    }

    public void setDst_port(String Dst_port) {
        this.Dst_port = Dst_port;
    }

    public String getDst_port() {
        return Dst_port;
    }

    public void setSrc_ip(String Src_ip) {
        this.Src_ip = Src_ip;
    }

    public String getSrc_ip() {
        return Src_ip;
    }

    public void setAction(String Action) {
        this.Action = Action;
    }

    public String getAction() {
        return Action;
    }

    public void setPriority(int Priority) {
        this.Priority = Priority;
    }

    public int getPriority() {
        return Priority;
    }

    @Override
    public Map toMap() {
        Type type = new TypeToken<HashMap<String, String>>(){}.getType();
        Map<String, String> map = new HashMap<String, String>();
        map.putAll((Map<? extends String, ? extends String>) gson.fromJson(gson.toJson(this), type));
        map.remove("Rule");

        int count = 1;
        for(String Rule: this.Rule){
            map.put("Rule." + count, Rule);
        }

        return map;
    }

    @Override
    public String toString() {
        return "UpdateSecurityGroupRequest{" +
                "Region='" + Region + '\'' +
                ", GroupId='" + GroupId + '\'' +
                ", Rule=" + Rule +
                ", Proto='" + Proto + '\'' +
                ", Dst_port='" + Dst_port + '\'' +
                ", Src_ip='" + Src_ip + '\'' +
                ", Action='" + Action + '\'' +
                ", Priority=" + Priority +
                '}';
    }
}
        