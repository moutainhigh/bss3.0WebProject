package com.asia.domain.localApi.child;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author ChenJian
 * @ClassName: BalanceItemsListBean
 * @description: TODO
 * @date 2019/8/31
 * @Version 1.0
 */
public class BalanceItemsListBean extends BaseDomain {

    /**
     * acctNbr
     * balance
     * balanceType
     * effDate
     * expDate
     * item_group_name
     * level
     */

    private String acctNbr;
    private String balance;
    private String balanceType;
    private String effDate;
    private String expDate;
    private String item_group_name;
    private String level;

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    public String getEffDate() {
        return effDate;
    }

    public void setEffDate(String effDate) {
        this.effDate = effDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getItem_group_name() {
        return item_group_name;
    }

    public void setItem_group_name(String item_group_name) {
        this.item_group_name = item_group_name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

