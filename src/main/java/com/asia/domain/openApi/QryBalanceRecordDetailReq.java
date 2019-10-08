package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;
import com.asia.domain.openApi.child.OperAttrStruct;
import com.asia.domain.openApi.child.SvcObjectStruct;
/**
 * 
 * ClassName: QryBalanceRecordDetailReq <br/>
 * date: 2019年4月29日 上午11:33:04 <br/>
 * @author yinyanzhen
 */
public class QryBalanceRecordDetailReq extends BaseDomain{
	private static final long serialVersionUID = -431721907367951299L;

	private OperAttrStruct operAttrStruct;
	
	private SvcObjectStruct svcObjectStruct ;
	
	private String billingCycleId;

	private String systemId;
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

	public String getBillingCycleId() {
		return billingCycleId;
	}

	public void setBillingCycleId(String billingCycleId) {
		this.billingCycleId = billingCycleId;
	}

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
}
