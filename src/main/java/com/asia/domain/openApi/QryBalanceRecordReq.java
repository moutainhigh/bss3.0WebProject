package com.asia.domain.openApi;


import com.asia.domain.openApi.child.OperAttrStruct;
import com.asia.domain.openApi.child.SvcObjectStruct;

public class QryBalanceRecordReq {
    private OperAttrStruct operAttrStruct;
    private SvcObjectStruct svcObjectStruct;
    private Integer billingCycleId;//账务周期标识
   /* 0：通用余额1：专用余额  2：用户级
        3：用户账目组级 4：账户账目组级*/
    private String balanceTypeFlag;

    private String systemId;

    public OperAttrStruct getOperAttrStruct() {
        return operAttrStruct;
    }

    public void setOperAttrStruct(OperAttrStruct operAttrStruct) {
        this.operAttrStruct = operAttrStruct;
    }

    public SvcObjectStruct getSvcObjectStruct() {
        return svcObjectStruct;
    }

    public void setSvcObjectStruct(SvcObjectStruct svcObjectStruct) {
        this.svcObjectStruct = svcObjectStruct;
    }

    public Integer getBillingCycleId() {
        return billingCycleId;
    }

    public void setBillingCycleId(Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    public String getBalanceTypeFlag() {
        return balanceTypeFlag;
    }

    public void setBalanceTypeFlag(String balanceTypeFlag) {
        this.balanceTypeFlag = balanceTypeFlag;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }
}
