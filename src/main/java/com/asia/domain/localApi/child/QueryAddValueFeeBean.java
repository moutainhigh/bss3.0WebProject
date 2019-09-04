package com.asia.domain.localApi.child;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author ChenJian
 * @ClassName: QueryAddValueFeeBean
 * @description: TODO
 * @date 2019/9/3
 * @Version 1.0
 */
public class QueryAddValueFeeBean {


    private String queryFlag;
    private String billingCycle;
    private String destinationAttr;
    private String accNbr;
    private String systemId;

    public String getQueryFlag() {
        return queryFlag;
    }

    public void setQueryFlag(String queryFlag) {
        this.queryFlag = queryFlag;
    }

    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }

    public String getDestinationAttr() {
        return destinationAttr;
    }

    public void setDestinationAttr(String destinationAttr) {
        this.destinationAttr = destinationAttr;
    }

    public String getAccNbr() {
        return accNbr;
    }

    public void setAccNbr(String accNbr) {
        this.accNbr = accNbr;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }
}

