package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author WangBaoQiang
 * @ClassName: QueryAgreementConsumptionReq
 * @description: TODO
 * @date 2019/8/1310:07
 * @Version 1.0
 */
public class QueryAgreementConsumptionReq extends BaseDomain {

    /**
     * systemID : 9
     * userType : 1
     * value : 19969532297
     * valueType : 1
     */

    private String systemID;
    private String userType;
    private String value;
    private String valueType;

    public String getSystemID() {
        return systemID;
    }

    public void setSystemID(String systemID) {
        this.systemID = systemID;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }
}
