package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;
import com.asia.domain.openApi.child.OperAttrStruct;
import com.asia.domain.openApi.child.SvcObjectStruct;
/**
 * ClassName: QryPaymentReq <br/>
 * date: 2019年4月29日 下午2:45:26 <br/>
 * @author yinyanzhen
 */
public class QryPaymentReq extends BaseDomain{
	private static final long serialVersionUID = 7412880823240382009L;
	//服务对象 
	private SvcObjectStruct svcObjectStruct;
	//帐务周期 
	private OperAttrStruct operAttrStruct;
	//操作人属性
	private Integer billingCycleId;

	public SvcObjectStruct getSvcObjectStruct() {
		return svcObjectStruct;
	}

	public void setSvcObjectStruct(SvcObjectStruct svcObjectStruct) {
		this.svcObjectStruct = svcObjectStruct;
	}

	public OperAttrStruct getOperAttrStruct() {
		return operAttrStruct;
	}

	public void setOperAttrStruct(OperAttrStruct operAttrStruct) {
		this.operAttrStruct = operAttrStruct;
	}

	public Integer getBillingCycleId() {
		return billingCycleId;
	}

	public void setBillingCycleId(Integer billingCycleId) {
		this.billingCycleId = billingCycleId;
	}
}
