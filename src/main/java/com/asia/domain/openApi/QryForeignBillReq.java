package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author WangBaoQiang
 * @ClassName: QryForeignBillReq
 * @description: TODO
 * @date 2019/10/1620:24
 * @Version 1.0
 */
public class QryForeignBillReq extends BaseDomain {

    /**
     * qryValue : 18946593727
     * qryFlag : 1
     * cycleId : 201908
     * zdType : 998
     * queryType : 1
     */

    private String qryValue;
    private int qryFlag;
    private String cycleId;
    private String areaCode;
    private String queryType;
    private String systemId;

    public String getQryValue() {
        return qryValue;
    }

    public void setQryValue(String qryValue) {
        this.qryValue = qryValue;
    }

    public int getQryFlag() {
        return qryFlag;
    }

    public void setQryFlag(int qryFlag) {
        this.qryFlag = qryFlag;
    }

    public String getCycleId() {
        return cycleId;
    }

    public void setCycleId(String cycleId) {
        this.cycleId = cycleId;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}
