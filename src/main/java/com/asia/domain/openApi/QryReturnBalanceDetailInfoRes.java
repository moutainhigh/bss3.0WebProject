package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseApiResDomain;
import com.asia.domain.openApi.child.ReturnPlanDetInfo;
import com.asia.domain.openApi.child.ReturnPlanInfo;

import java.util.List;

public class QryReturnBalanceDetailInfoRes extends BaseApiResDomain {
    private List<ReturnPlanDetInfo> returnPlanDetInfo;

    public List<ReturnPlanDetInfo> getReturnPlanDetInfo() {
        return returnPlanDetInfo;
    }

    public void setReturnPlanDetInfo(List<ReturnPlanDetInfo> returnPlanDetInfo) {
        this.returnPlanDetInfo = returnPlanDetInfo;
    }
}
