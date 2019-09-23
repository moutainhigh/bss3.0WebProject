package com.asia.domain.openApi.child;

public class ReturnPlanInfo {
    private Integer returnPlanId;//返还计划标识
    private String returnPlanName;//返还计划名称
    private String stateDate;//状态时间：yyyymmddhhmiss
    private String startTime;//生效时间
    private String endTime;//失效时间
    private String state;//状态
    private String returnFlag;//返还类型 0：预存返还 1：赠送返还
    private Integer returnSumMonth;//累积返还月数
    private Integer returnSumBalance;//累积返还金额
    private Integer returnMonth;//剩余返还月数
    private Integer returnBalance;//剩余返还金额
    private Integer paymentMethod;//付款方式
    private String accNbrDetail;//返还对象

    public Integer getReturnPlanId() {
        return returnPlanId;
    }

    public void setReturnPlanId(Integer returnPlanId) {
        this.returnPlanId = returnPlanId;
    }

    public String getReturnPlanName() {
        return returnPlanName;
    }

    public void setReturnPlanName(String returnPlanName) {
        this.returnPlanName = returnPlanName;
    }

    public String getStateDate() {
        return stateDate;
    }

    public void setStateDate(String stateDate) {
        this.stateDate = stateDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getReturnFlag() {
        return returnFlag;
    }

    public void setReturnFlag(String returnFlag) {
        this.returnFlag = returnFlag;
    }

    public Integer getReturnSumMonth() {
        return returnSumMonth;
    }

    public void setReturnSumMonth(Integer returnSumMonth) {
        this.returnSumMonth = returnSumMonth;
    }

    public Integer getReturnSumBalance() {
        return returnSumBalance;
    }

    public void setReturnSumBalance(Integer returnSumBalance) {
        this.returnSumBalance = returnSumBalance;
    }

    public Integer getReturnMonth() {
        return returnMonth;
    }

    public void setReturnMonth(Integer returnMonth) {
        this.returnMonth = returnMonth;
    }

    public Integer getReturnBalance() {
        return returnBalance;
    }

    public void setReturnBalance(Integer returnBalance) {
        this.returnBalance = returnBalance;
    }

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getAccNbrDetail() {
        return accNbrDetail;
    }

    public void setAccNbrDetail(String accNbrDetail) {
        this.accNbrDetail = accNbrDetail;
    }
}
