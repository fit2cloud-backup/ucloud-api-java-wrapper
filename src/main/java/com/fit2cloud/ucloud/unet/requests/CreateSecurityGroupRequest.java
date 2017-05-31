
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreateSecurityGroupRequest extends Request {
    private String Region;
    private String GroupName;
    private String Description;
    private List<String> Rule;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<String> getRule() {
        return Rule;
    }

    public void setRule(List<String> rule) {
        Rule = rule;
    }

    @Override
    public String toString() {
        return "CreateSecurityGroupRequest{" +
                "Region='" + Region + '\'' +
                ", GroupName='" + GroupName + '\'' +
                ", Description='" + Description + '\'' +
                ", Rule=" + Rule +
                '}';
    }

    @Override
    public Map toMap() {
    	List<String> ruleList = null;
    	if(Rule != null) {
    		ruleList = new ArrayList<String>(Rule);
    		Rule = null;
    	}
        Map<String, String> map = gson.fromJson(gson.toJson(this), new TypeToken<Map<String, String>>() {
        }.getType());
        map.remove("Rule");
        if(ruleList != null) {
        	int i = 1;
        	for (String rule : ruleList) {
        		map.put("Rule." + i, rule);
        		i++;
        	}
        }

        return map;
    }
}

