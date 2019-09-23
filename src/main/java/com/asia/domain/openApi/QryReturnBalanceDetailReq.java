package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;
import com.asia.domain.openApi.child.OperAttrStruct;
import com.asia.domain.openApi.child.SvcObjectStruct;

public class QryReturnBalanceDetailReq extends BaseDomain {
    private OperAttrStruct operAttrStruct;
    private SvcObjectStruct svcObjectStruct;
    private String queryFlag;
    private String queryItemType;

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

    public String getQueryFlag() {
        return queryFlag;
    }

    public void setQueryFlag(String queryFlag) {
        this.queryFlag = queryFlag;
    }

    public String getQueryItemType() {
        return queryItemType;
    }

    public void setQueryItemType(String queryItemType) {
        this.queryItemType = queryItemType;
    }
}
