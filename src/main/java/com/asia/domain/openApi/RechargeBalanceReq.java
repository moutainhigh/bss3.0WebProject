package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;
import com.asia.domain.openApi.child.OperAttrStruct;
import com.asia.domain.openApi.child.SvcObjectStruct;
/**
 * ClassName: RechargeBalanceReq <br/>
 * date: 2019年4月29日 下午3:06:58 <br/>
 * @author yinyanzhen
 */
public class RechargeBalanceReq extends BaseDomain{
	private static final long serialVersionUID = 453888562495159124L;
	//操作人属性
	private OperAttrStruct operAttrStruct;
	//服务对象条件 
	private SvcObjectStruct svcObjectStruct;
	//充值请求流水
	private Integer flowId;
	//充值来源 
	private String rechargeSource;
	//被充值用户号码类型
	private String destinationIdType;
	//帐本类型
	private String balanceItemTypeId;
	//充值量单位 
	private String rechargeUnit;
	//充值量 
	private Integer rechargeAmount;
	//工号
	//private String staffId;
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

	public Integer getFlowId() {
		return flowId;
	}

	public void setFlowId(Integer flowId) {
		this.flowId = flowId;
	}

	public String getRechargeSource() {
		return rechargeSource;
	}

	public void setRechargeSource(String rechargeSource) {
		this.rechargeSource = rechargeSource;
	}

	public String getDestinationIdType() {
		return destinationIdType;
	}

	public void setDestinationIdType(String destinationIdType) {
		this.destinationIdType = destinationIdType;
	}

	public String getBalanceItemTypeId() {
		return balanceItemTypeId;
	}

	public void setBalanceItemTypeId(String balanceItemTypeId) {
		this.balanceItemTypeId = balanceItemTypeId;
	}

	public String getRechargeUnit() {
		return rechargeUnit;
	}

	public void setRechargeUnit(String rechargeUnit) {
		this.rechargeUnit = rechargeUnit;
	}

	public Integer getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(Integer rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	/*public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}*/

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
}
