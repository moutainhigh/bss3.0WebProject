package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseApiResDomain;
import com.asia.domain.openApi.child.ReturnPlanInfo;

import java.util.List;

public class QryReturnBalanceDetailRes extends BaseApiResDomain {
    private List<ReturnPlanInfo> returnPlanInfo;

    public List<ReturnPlanInfo> getReturnPlanInfo() {
        return returnPlanInfo;
    }

    public void setReturnPlanInfo(List<ReturnPlanInfo> returnPlanInfo) {
        this.returnPlanInfo = returnPlanInfo;
    }
}
