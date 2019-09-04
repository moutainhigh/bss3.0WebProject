package com.asia.domain.localApi.child;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author ChenJian
 * @ClassName: BalanceInfosListBean
 * @description: TODO
 * @date 2019/8/31
 * @Version 1.0
 */
public class BalanceInfosListBean extends BaseDomain {

    /**
     * aocBalance
     * aocUnitName
     */

    private String aocBalance;
    private String aocUnitName;

    public String getAocBalance() {
        return aocBalance;
    }

    public void setAocBalance(String aocBalance) {
        this.aocBalance = aocBalance;
    }

    public String getAocUnitName() {
        return aocUnitName;
    }

    public void setAocUnitName(String aocUnitName) {
        this.aocUnitName = aocUnitName;
    }
}

