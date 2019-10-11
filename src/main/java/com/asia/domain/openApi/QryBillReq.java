package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;
import com.asia.domain.openApi.child.OperAttrStruct;
/**
 * 
 * ClassName: QryBillReq <br/>
 * date: 2019年4月29日 下午1:55:46 <br/>
 * @author yinyanzhen
 */
public class QryBillReq extends BaseDomain{
	private static final long serialVersionUID = -5601602596622010016L;
	/**
	 * 查询条件类型
	 */
	private Integer billQueryType;
	/**
	 * 查询条件标识
	 */
	private String destinationAccount;
	/**
	 * 用户属性
	 */
	private Integer destinationAttr;
	/**
	 * 查询业务类型
	 */
	private Integer queryFlag;
	/**
	 * 查询费用类型
	 */
	private Integer feeQueryFlag;
	/**
	 * 操作人属性
	 */
	private OperAttrStruct operAttrStruct;
	private String systemId;
	public Integer getBillQueryType() {
		return billQueryType;
	}

	public void setBillQueryType(Integer billQueryType) {
		this.billQueryType = billQueryType;
	}

	public String getDestinationAccount() {
		return destinationAccount;
	}

	public void setDestinationAccount(String destinationAccount) {
		this.destinationAccount = destinationAccount;
	}

	public Integer getDestinationAttr() {
		return destinationAttr;
	}

	public void setDestinationAttr(Integer destinationAttr) {
		this.destinationAttr = destinationAttr;
	}

	public Integer getQueryFlag() {
		return queryFlag;
	}

	public void setQueryFlag(Integer queryFlag) {
		this.queryFlag = queryFlag;
	}

	public Integer getFeeQueryFlag() {
		return feeQueryFlag;
	}

	public void setFeeQueryFlag(Integer feeQueryFlag) {
		this.feeQueryFlag = feeQueryFlag;
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
