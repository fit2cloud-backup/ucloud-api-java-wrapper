package com.fit2cloud.ucloud.uhost.requests;


import com.fit2cloud.ucloud.Request;

import java.util.Map;

public class DescribeResourceMetricRequest extends Request {

    private String ResourceType;

    public String getResourceType() {
        return ResourceType;
    }

    public void setResourceType(String resourceType) {
        ResourceType = resourceType;
    }

    @Override
    public Map toMap() {
        return super.toMap();
    }
}
