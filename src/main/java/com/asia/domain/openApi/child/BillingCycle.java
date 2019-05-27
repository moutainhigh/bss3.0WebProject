package com.asia.domain.openApi.child;

import com.asia.common.baseObj.BaseDomain;

/**
 * 账务周期
 * ClassName: BillingCycle <br/>
 * date: 2019年5月10日 下午1:45:14 <br/>
 * @author yinyanzhen
 */
public class BillingCycle extends BaseDomain{
	private static final long serialVersionUID = -65567158575292251L;
	
	private Integer billingCycleId;
	
	private Integer billingCycleTypleId;
	
	private String cycleBeginDate;
	
	private String cycleEndDate;
	
	private String blockDate;
	
	private Integer lastBillingCycleId;
	
	private Integer statusCd;
	
	private String statusDate;

	public Integer getBillingCycleId() {
		return billingCycleId;
	}

	public void setBillingCycleId(Integer billingCycleId) {
		this.billingCycleId = billingCycleId;
	}

	public Integer getBillingCycleTypleId() {
		return billingCycleTypleId;
	}

	public void setBillingCycleTypleId(Integer billingCycleTypleId) {
		this.billingCycleTypleId = billingCycleTypleId;
	}

	public String getCycleBeginDate() {
		return cycleBeginDate;
	}

	public void setCycleBeginDate(String cycleBeginDate) {
		this.cycleBeginDate = cycleBeginDate;
	}

	public String getCycleEndDate() {
		return cycleEndDate;
	}

	public void setCycleEndDate(String cycleEndDate) {
		this.cycleEndDate = cycleEndDate;
	}

	public String getBlockDate() {
		return blockDate;
	}

	public void setBlockDate(String blockDate) {
		this.blockDate = blockDate;
	}

	public Integer getLastBillingCycleId() {
		return lastBillingCycleId;
	}

	public void setLastBillingCycleId(Integer lastBillingCycleId) {
		this.lastBillingCycleId = lastBillingCycleId;
	}

	public Integer getStatusCd() {
		return statusCd;
	}

	public void setStatusCd(Integer statusCd) {
		this.statusCd = statusCd;
	}

	public String getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(String statusDate) {
		this.statusDate = statusDate;
	}
}
