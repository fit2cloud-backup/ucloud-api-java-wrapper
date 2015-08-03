package com.fit2cloud.ucloud.uhost.responses;

import com.fit2cloud.ucloud.Response;
import com.fit2cloud.ucloud.uhost.model.Price;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:37 PM
 * Email: xqiang.chi@samsung.com
 */
public class GetUHostInstancePriceResponse extends Response {
    private List<Price> PriceSet;

    public List<Price> getPriceSet() {
        return PriceSet;
    }

    public void setPriceSet(List<Price> priceSet) {
        PriceSet = priceSet;
    }

    @Override
    public String toString() {
        return "GetUHostInstancePriceResponse{" +
                "PriceSet=" + PriceSet +
                '}';
    }
}
