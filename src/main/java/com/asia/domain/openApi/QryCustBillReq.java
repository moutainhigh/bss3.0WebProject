package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;
import com.asia.domain.openApi.child.OperAttrStruct;
/**
 * QryCustBillReq请求体
 * ClassName: QryCustBillReq <br/>
 * date: 2019年4月29日 下午2:19:23 <br/>
 * @author yinyanzhen
 */
public class QryCustBillReq extends BaseDomain{
	private static final long serialVersionUID = -1828170323360486650L;
	//接入号码
	private String accNbr;
	//用户属性
	private Integer destinationAttr;
	//查询帐期
	private String billingCycle;
	//查询业务类型
	private String queryFlag;
	//操作人属性
	private OperAttrStruct operAttrStruct;
	//系统id
	private String systemId;
	public String getAccNbr() {
		return accNbr;
	}

	public void setAccNbr(String accNbr) {
		this.accNbr = accNbr;
	}

	public Integer getDestinationAttr() {
		return destinationAttr;
	}

	public void setDestinationAttr(Integer destinationAttr) {
		this.destinationAttr = destinationAttr;
	}

	public String getBillingCycle() {
		return billingCycle;
	}

	public void setBillingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
	}

	public String getQueryFlag() {
		return queryFlag;
	}

	public void setQueryFlag(String queryFlag) {
		this.queryFlag = queryFlag;
	}

	public OperAttrStruct getOperAttrStruct() {
		return operAttrStruct;
	}

	public void setOperAttrStruct(OperAttrStruct operAttrStruct) {
		this.operAttrStruct = operAttrStruct;
	}

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
}
