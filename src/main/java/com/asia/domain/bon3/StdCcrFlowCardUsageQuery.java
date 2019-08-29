package com.asia.domain.bon3;

import com.asia.common.baseObj.BaseDomain;

/**
 * 
 * ClassName: StdCcrFlowCardUsageQuery <br/>
 * date: 2019年4月24日 上午10:35:34 <br/>
 * @author yinyanzhen
 */
@Deprecated
public class StdCcrFlowCardUsageQuery extends BaseDomain{
	private static final long serialVersionUID = 8972705343802839153L;
	//
	private String queryFlag;
	//
	private String areaCode;
	//
	private String destinationAttr;
	//
	private String destinationId;
	
	public String getQueryFlag() {
		return queryFlag;
	}
	public void setQueryFlag(String queryFlag) {
		this.queryFlag = queryFlag;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getDestinationAttr() {
		return destinationAttr;
	}
	public void setDestinationAttr(String destinationAttr) {
		this.destinationAttr = destinationAttr;
	}
	public String getDestinationId() {
		return destinationId;
	}
	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}
}

