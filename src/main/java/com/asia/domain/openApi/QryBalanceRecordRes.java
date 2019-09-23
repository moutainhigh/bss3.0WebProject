package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseApiResDomain;
import com.asia.domain.openApi.child.BalanceTypeFlagQuery;

import java.util.List;

public class QryBalanceRecordRes extends BaseApiResDomain {
    private Integer billingCycleId;
    private List<BalanceTypeFlagQuery>  balanceTypeFlagQuery;

    public Integer getBillingCycleId() {
        return billingCycleId;
    }

    public void setBillingCycleId(Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    public List<BalanceTypeFlagQuery> getBalanceTypeFlagQuery() {
        return balanceTypeFlagQuery;
    }

    public void setBalanceTypeFlagQuery(List<BalanceTypeFlagQuery> balanceTypeFlagQuery) {
        this.balanceTypeFlagQuery = balanceTypeFlagQuery;
    }
}
