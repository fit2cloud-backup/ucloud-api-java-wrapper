
package com.fit2cloud.ucloud.unet.responses;

import com.fit2cloud.ucloud.Response;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class GetEIPPriceResponse extends Response {
    private List<com.fit2cloud.ucloud.unet.model.PriceSet> PriceSet;

    @Override
    public String toString() {
        return "GetEIPPriceResponse{" +
                "PriceSet=" + PriceSet +
                '}';
    }

    public List<com.fit2cloud.ucloud.unet.model.PriceSet> getPriceSet() {
        return PriceSet;
    }

    public void setPriceSet(List<com.fit2cloud.ucloud.unet.model.PriceSet> priceSet) {
        PriceSet = priceSet;
    }
}
        