package com.asia.domain.bon3_drop;

import com.asia.common.baseObj.BaseDomain;

/**
 * 
 * ClassName: stdCcrFlowCardRecQry <br/>
 * date: 2019年4月24日 上午9:24:15 <br/>
 * @author yinyanzhen
 */
@Deprecated
public class StdCcrFlowCardRecQry extends BaseDomain{
	private static final long serialVersionUID = 543985493094582368L;

	private String queryFlag;
	
	private String billingCycle;
	
	private String destinationAttr;
	
	private String accNbr;

	public String getQueryFlag() {
		return queryFlag;
	}

	public void setQueryFlag(String queryFlag) {
		this.queryFlag = queryFlag;
	}

	public String getBillingCycle() {
		return billingCycle;
	}

	public void setBillingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
	}

	public String getDestinationAttr() {
		return destinationAttr;
	}

	public void setDestinationAttr(String destinationAttr) {
		this.destinationAttr = destinationAttr;
	}

	public String getAccNbr() {
		return accNbr;
	}

	public void setAccNbr(String accNbr) {
		this.accNbr = accNbr;
	}
}