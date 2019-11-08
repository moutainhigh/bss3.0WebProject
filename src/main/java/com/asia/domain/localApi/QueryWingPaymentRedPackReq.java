package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author ChenJian
 * @ClassName: QueryWingPaymentRedPackReq
 * @description: TODO
 * @date 2019/8/31 14:19
 * @Version 1.0
 */
public class QueryWingPaymentRedPackReq extends BaseDomain {


    private String value;
    private String userType;
    private String valueType;
    private String systemID;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getSystemID() {
        return systemID;
    }

    public void setSystemID(String systemID) {
        this.systemID = systemID;
    }
}
