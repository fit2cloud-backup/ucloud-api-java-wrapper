package com.fit2cloud.ucloud.uhost.responses;


import com.fit2cloud.ucloud.Response;
import com.fit2cloud.ucloud.uhost.model.GetProjectList;

import java.util.List;

/**
 * Created by max on 30/04/20.
 */
public class GetProjectIdResponse extends Response {
    List<GetProjectList> ProjectSet;

    public List<GetProjectList> getProjectSet() {
        return ProjectSet;
    }

    public void setProjectSet(List<GetProjectList> projectSet) {
        ProjectSet = projectSet;
    }
}
