
package com.fit2cloud.ucloud.udb.responses;

import com.fit2cloud.ucloud.Response;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreateUDBSlaveResponse extends Response {
    private String DBId;


    public void setDBId(String DBId) {
        this.DBId = DBId;
    }

    public String getDBId() {
        return DBId;
    }


}
        