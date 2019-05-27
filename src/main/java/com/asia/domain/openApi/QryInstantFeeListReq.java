package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;
import com.asia.domain.openApi.child.OperAttrStruct;
import com.asia.domain.openApi.child.SvcObjectStruct;
/**
 * ClassName: QryInstantFeeListReq <br/>
 * date: 2019年4月29日 下午3:35:07 <br/>
 * @author yinyanzhen
 */
public class QryInstantFeeListReq extends BaseDomain{
	private static final long serialVersionUID = -8909983547511453659L;
	
	private OperAttrStruct operAttrStruct;
	
	private SvcObjectStruct svcObjectStruct;
	
	private Integer billingCycleId;

	public OperAttrStruct getOperAttrStruct() {
		return operAttrStruct;
	}

	public void setOperAttrStruct(OperAttrStruct operAttrStruct) {
		this.operAttrStruct = operAttrStruct;
	}

	public SvcObjectStruct getSvcObjectStruct() {
		return svcObjectStruct;
	}

	public void setSvcObjectStruct(SvcObjectStruct svcObjectStruct) {
		this.svcObjectStruct = svcObjectStruct;
	}

	public Integer getBillingCycleId() {
		return billingCycleId;
	}

	public void setBillingCycleId(Integer billingCycleId) {
		this.billingCycleId = billingCycleId;
	}
}
