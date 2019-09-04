package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseBonResDomain;
import com.asia.domain.localApi.child.BalanceInfosListBean;
import com.asia.domain.localApi.child.BalanceItemsListBean;
import com.asia.domain.localApi.child.MobileNumberQueryServiceListTypeBean;

import java.util.List;

/**
 * @author WangBaoQiang
 * @ClassName: MeterPrintActionRes
 * @description: 详单打印记录
 * @date 2019/8/1219:09
 * @Version 1.0
 */
public class AccountBalanceCpcpQueryRes extends BaseBonResDomain {



    private String balanceAvl;
    private String balanceInfoMsg;
    private List<BalanceInfosListBean> balanceInfos;
    private String balanceItemMsg;
    private List<BalanceItemsListBean> balanceItems;
    private String dueCharge;
    private String isBalanceInfoSucess;
    private String isBalanceItemSucess;
    private String isOweInfoSucess;
    private String isSucess;
    private String msg;
    private String oweCharge;
    private String oweInfoMsg;

    public String getBalanceAvl() {
        return balanceAvl;
    }

    public void setBalanceAvl(String balanceAvl) {
        this.balanceAvl = balanceAvl;
    }

    public String getBalanceInfoMsg() {
        return balanceInfoMsg;
    }

    public void setBalanceInfoMsg(String balanceInfoMsg) {
        this.balanceInfoMsg = balanceInfoMsg;
    }

    public List<BalanceInfosListBean> getBalanceInfos() {
        return balanceInfos;
    }

    public void setBalanceInfos(List<BalanceInfosListBean> balanceInfos) {
        this.balanceInfos = balanceInfos;
    }

    public String getBalanceItemMsg() {
        return balanceItemMsg;
    }

    public void setBalanceItemMsg(String balanceItemMsg) {
        this.balanceItemMsg = balanceItemMsg;
    }

    public List<BalanceItemsListBean> getBalanceItems() {
        return balanceItems;
    }

    public void setBalanceItems(List<BalanceItemsListBean> balanceItems) {
        this.balanceItems = balanceItems;
    }

    public String getDueCharge() {
        return dueCharge;
    }

    public void setDueCharge(String dueCharge) {
        this.dueCharge = dueCharge;
    }

    public String getIsBalanceInfoSucess() {
        return isBalanceInfoSucess;
    }

    public void setIsBalanceInfoSucess(String isBalanceInfoSucess) {
        this.isBalanceInfoSucess = isBalanceInfoSucess;
    }

    public String getIsBalanceItemSucess() {
        return isBalanceItemSucess;
    }

    public void setIsBalanceItemSucess(String isBalanceItemSucess) {
        this.isBalanceItemSucess = isBalanceItemSucess;
    }

    public String getIsOweInfoSucess() {
        return isOweInfoSucess;
    }

    public void setIsOweInfoSucess(String isOweInfoSucess) {
        this.isOweInfoSucess = isOweInfoSucess;
    }

    public String getIsSucess() {
        return isSucess;
    }

    public void setIsSucess(String isSucess) {
        this.isSucess = isSucess;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getOweCharge() {
        return oweCharge;
    }

    public void setOweCharge(String oweCharge) {
        this.oweCharge = oweCharge;
    }

    public String getOweInfoMsg() {
        return oweInfoMsg;
    }

    public void setOweInfoMsg(String oweInfoMsg) {
        this.oweInfoMsg = oweInfoMsg;
    }
}
