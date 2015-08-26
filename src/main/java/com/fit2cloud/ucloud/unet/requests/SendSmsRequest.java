package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangbohan on 15/8/26.
 */
public class SendSmsRequest extends Request {
    private String Content;
    private List<String> Phones;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public List<String> getPhones() {
        return Phones;
    }

    public void setPhones(List<String> phones) {
        Phones = phones;
    }

    @Override
    public Map toMap() {
        Map<String, String> map = gson.fromJson(gson.toJson(this), new TypeToken<Map<String, String>>(){}.getType());

        if (Phones != null) {
            int i = 0;
            for(String phone : Phones) {
                map.put("Phone." + i, phone);
                i++;
            }
            map.remove("phones");
        }
        return map;
    }
}
