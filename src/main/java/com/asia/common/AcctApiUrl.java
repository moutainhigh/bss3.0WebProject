package com.asia.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author WangBaoQiang
 * @ClassName: acctApiUrl
 * @description: TODO
 * @date 2019/9/1520:54
 * @Version 1.0
 */
@Configuration
@PropertySource("classpath:config/sysConfig.properties")
public class AcctApiUrl {
    @Value("${bon3.searchServInfo}")
    private String searchServInfo;
    @Value("${bon3.getUnitedBalance}")
    private String getUnitedBalance;
    @Value("${bon3.getUnitedAccu}")
    private String getUnitedAccu;
    @Value("${bon3.getUnitedAccuDetail}")
    private String getUnitedAccuDetail;
    @Value("${bon3.getOweList}")
    private String getOweList;
    @Value("${api.QueryBalance}")
    private String queryBalance;
    @Value("${api.RechargeBalance}")
    private String rechargeBalance;
    @Value("${api.RollRechargeBalance}")
    private String rollRechargeBalance;
    @Value("${api.QryPayment}")
    private String qryPayment;
    @Value("${api.QryBill}")
    private String qryBill;
    @Value("${api.QryInstantFee}")
    private String qryInstantFee;
    @Value("${api.QryInstantFeeList}")
    private String qryInstantFeeList;
    @Value("${api.QryBalanceRecord}")
    private String qryBalanceRecord;
    @Value("${api.QryReturnBalanceDetail}")
    private String qryReturnBalanceDetail;
    @Value("${api.QryReturnBalanceInfoDetail}")
    private String qryReturnBalanceInfoDetail;
    @Value("${api.RtBillItem}")
    private String rtBillItem;
    @Value("${bon3.qryBalance}")
    private String qryBalance;

    public String getSearchServInfo() {
        return searchServInfo;
    }

    public void setSearchServInfo(String searchServInfo) {
        this.searchServInfo = searchServInfo;
    }

    public String getGetUnitedBalance() {
        return getUnitedBalance;
    }

    public void setGetUnitedBalance(String getUnitedBalance) {
        this.getUnitedBalance = getUnitedBalance;
    }

    public String getGetUnitedAccu() {
        return getUnitedAccu;
    }

    public String getGetUnitedAccuDetail() {
        return getUnitedAccuDetail;
    }

    public void setGetUnitedAccuDetail(String getUnitedAccuDetail) {
        this.getUnitedAccuDetail = getUnitedAccuDetail;
    }

    public String getGetOweList() {
        return getOweList;
    }

    public void setGetOweList(String getOweList) {
        this.getOweList = getOweList;
    }

    public void setGetUnitedAccu(String getUnitedAccu) {
        this.getUnitedAccu = getUnitedAccu;
    }

    public String getQueryBalance() {
        return queryBalance;
    }

    public void setQueryBalance(String queryBalance) {
        this.queryBalance = queryBalance;
    }

    public String getRechargeBalance() {
        return rechargeBalance;
    }

    public void setRechargeBalance(String rechargeBalance) {
        this.rechargeBalance = rechargeBalance;
    }

    public String getRollRechargeBalance() {
        return rollRechargeBalance;
    }

    public void setRollRechargeBalance(String rollRechargeBalance) {
        this.rollRechargeBalance = rollRechargeBalance;
    }

    public String getQryPayment() {
        return qryPayment;
    }

    public void setQryPayment(String qryPayment) {
        this.qryPayment = qryPayment;
    }

    public String getQryBill() {
        return qryBill;
    }

    public void setQryBill(String qryBill) {
        this.qryBill = qryBill;
    }

    public String getQryInstantFee() {
        return qryInstantFee;
    }

    public void setQryInstantFee(String qryInstantFee) {
        this.qryInstantFee = qryInstantFee;
    }

    public String getQryInstantFeeList() {
        return qryInstantFeeList;
    }

    public void setQryInstantFeeList(String qryInstantFeeList) {
        this.qryInstantFeeList = qryInstantFeeList;
    }

    public String getQryBalanceRecord() {
        return qryBalanceRecord;
    }

    public void setQryBalanceRecord(String qryBalanceRecord) {
        this.qryBalanceRecord = qryBalanceRecord;
    }

    public String getQryReturnBalanceDetail() {
        return qryReturnBalanceDetail;
    }

    public void setQryReturnBalanceDetail(String qryReturnBalanceDetail) {
        this.qryReturnBalanceDetail = qryReturnBalanceDetail;
    }

    public String getRtBillItem() {
        return rtBillItem;
    }

    public void setRtBillItem(String rtBillItem) {
        this.rtBillItem = rtBillItem;
    }

    public String getQryReturnBalanceInfoDetail() {
        return qryReturnBalanceInfoDetail;
    }

    public void setQryReturnBalanceInfoDetail(String qryReturnBalanceInfoDetail) {
        this.qryReturnBalanceInfoDetail = qryReturnBalanceInfoDetail;
    }

    public String getQryBalance() {
        return qryBalance;
    }

    public void setQryBalance(String qryBalance) {
        this.qryBalance = qryBalance;
    }
}
