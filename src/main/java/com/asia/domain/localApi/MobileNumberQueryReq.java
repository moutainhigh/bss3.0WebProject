package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author ChenJian
 * @ClassName: MeterPrintActionReq
 * @description: TODO
 * @date 2019/8/31 14:19
 * @Version 1.0
 */
public class MobileNumberQueryReq extends BaseDomain {

    /**
     * value :
     * systemId :
     */

    private String value;
    private String systemId;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }
}
