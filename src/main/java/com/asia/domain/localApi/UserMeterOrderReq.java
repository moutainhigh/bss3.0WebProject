package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author WangBaoQiang
 * @ClassName: UserMeterOrderReq
 * @description: 详单禁查
 * @date 2019/8/1013:40
 * @Version 1.0
 */
public class UserMeterOrderReq  extends BaseDomain {

    /**
     * action :
     * queryType :
     * queryValue :
     * regionCode :
     * systemId :
     * userType :
     */

    private String action;
    private String queryType;
    private String queryValue;
    private String regionCode;
    private String systemId;
    private String userType;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getQueryValue() {
        return queryValue;
    }

    public void setQueryValue(String queryValue) {
        this.queryValue = queryValue;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
