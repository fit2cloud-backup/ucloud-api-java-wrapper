package com.fit2cloud.ucloud.udisk.responses;

import com.fit2cloud.ucloud.Response;

import java.util.List;

public class CreateUDiskResponse extends Response{
    private List<String> UDiskId;

    public List<String> getUDiskId() {
        return UDiskId;
    }

    public void setUDiskId(List<String> UDiskId) {
        this.UDiskId = UDiskId;
    }
}
