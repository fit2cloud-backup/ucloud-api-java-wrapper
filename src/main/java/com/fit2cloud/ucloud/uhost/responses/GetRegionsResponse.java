package com.fit2cloud.ucloud.uhost.responses;


import com.fit2cloud.ucloud.Response;
import com.fit2cloud.ucloud.uhost.model.Regions;

import java.util.List;

/**
 * Created by chixq on 8/15/15.
 */
public class GetRegionsResponse extends Response {
    List<Regions> Regions;

    public List<com.fit2cloud.ucloud.uhost.model.Regions> getRegions() {
        return Regions;
    }

    public void setRegions(List<com.fit2cloud.ucloud.uhost.model.Regions> regions) {
        Regions = regions;
    }

    @Override
    public String toString() {
        return "GetRegionsResponse{" +
                "Regions=" + Regions +
                '}';
    }
}
