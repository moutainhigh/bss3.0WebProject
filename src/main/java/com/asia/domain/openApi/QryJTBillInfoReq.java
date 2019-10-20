package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author WangBaoQiang
 * @ClassName: QryJTBillInfoReq
 * @description: TODO
 * @date 2019/10/2015:43
 * @Version 1.0
 */
public class QryJTBillInfoReq extends BaseDomain {
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
    private String zdType;
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

    public String getZdType() {
        return zdType;
    }

    public void setZdType(String zdType) {
        this.zdType = zdType;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }
}
