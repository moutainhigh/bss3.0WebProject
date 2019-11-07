package com.asia.vo;

import com.asia.common.baseObj.BaseDomain;

import java.util.Date;

/**
 * BILLING_CYCLE_0615
 * @author 
 */
public class BillingCycle extends BaseDomain {
    private Integer billingCycleId;

    private Integer billingCycleTypeId;

    private Date cycleBeginDate;

    private Date cycleEndDate;

    private Date blockDate;

    private Integer lastBillingCycleId;

    private String statusCd;

    private Date statusDate;

    private static final long serialVersionUID = 1L;

    public Integer getBillingCycleId() {
        return billingCycleId;
    }

    public void setBillingCycleId(Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    public Integer getBillingCycleTypeId() {
        return billingCycleTypeId;
    }

    public void setBillingCycleTypeId(Integer billingCycleTypeId) {
        this.billingCycleTypeId = billingCycleTypeId;
    }

    public Date getCycleBeginDate() {
        return cycleBeginDate;
    }

    public void setCycleBeginDate(Date cycleBeginDate) {
        this.cycleBeginDate = cycleBeginDate;
    }

    public Date getCycleEndDate() {
        return cycleEndDate;
    }

    public void setCycleEndDate(Date cycleEndDate) {
        this.cycleEndDate = cycleEndDate;
    }

    public Date getBlockDate() {
        return blockDate;
    }

    public void setBlockDate(Date blockDate) {
        this.blockDate = blockDate;
    }

    public Integer getLastBillingCycleId() {
        return lastBillingCycleId;
    }

    public void setLastBillingCycleId(Integer lastBillingCycleId) {
        this.lastBillingCycleId = lastBillingCycleId;
    }

}