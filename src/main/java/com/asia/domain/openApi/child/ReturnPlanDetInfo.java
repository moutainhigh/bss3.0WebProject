package com.asia.domain.openApi.child;

public class ReturnPlanDetInfo {
    private Integer returnPlanId;//返还计划标识
    private String returnPlanName;//返还计划名称
    private String stateDate;//状态时间：yyyymmddhhmiss
    private String startTime;//生效时间
    private String endTime;//失效时间
    private String state;//状态
    private String returnFlag;//返还类型 0：预存返还 1：赠送返还
    private Integer returnBalance;//剩余返还金额
    private String accNbr;//返还对象号码

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

    public Integer getReturnBalance() {
        return returnBalance;
    }

    public void setReturnBalance(Integer returnBalance) {
        this.returnBalance = returnBalance;
    }

    public String getAccNbr() {
        return accNbr;
    }

    public void setAccNbr(String accNbr) {
        this.accNbr = accNbr;
    }
}
