package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseApiResDomain;
/**
 * ClassName: RechargeBalanceRes <br/>
 * date: 2019年4月29日 下午3:12:35 <br/>
 * @author yinyanzhen
 */
public class RechargeBalanceRes extends BaseApiResDomain{
	private static final long serialVersionUID = 5375241841102465477L;
	//充值后金额
	private String retBalance;
	//余额帐本标识 
	private String acctBalanceId;
	//余额类型标识 
	private String balanceTypeId;
	//余额类型名称 
	private String balanceTypeName;
	//余额类型
	private String unitTypeId;
	//帐户标识 
	private String acctId;
	//生效时间 
	private String effDate;
	//失效时间 
	private String expDate;
	//赠送金额
	private String bonusAmount;
	//缴费流水
	private long paymentId;
	//外围流水号
	private String flowId;
	public String getRetBalance() {
		return retBalance;
	}

	public void setRetBalance(String retBalance) {
		this.retBalance = retBalance;
	}

	public String getAcctBalanceId() {
		return acctBalanceId;
	}

	public void setAcctBalanceId(String acctBalanceId) {
		this.acctBalanceId = acctBalanceId;
	}

	public String getBalanceTypeId() {
		return balanceTypeId;
	}

	public void setBalanceTypeId(String balanceTypeId) {
		this.balanceTypeId = balanceTypeId;
	}

	public String getBalanceTypeName() {
		return balanceTypeName;
	}

	public void setBalanceTypeName(String balanceTypeName) {
		this.balanceTypeName = balanceTypeName;
	}

	public String getUnitTypeId() {
		return unitTypeId;
	}

	public void setUnitTypeId(String unitTypeId) {
		this.unitTypeId = unitTypeId;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public String getEffDate() {
		return effDate;
	}

	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getBonusAmount() {
		return bonusAmount;
	}

	public void setBonusAmount(String bonusAmount) {
		this.bonusAmount = bonusAmount;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public String getFlowId() {
		return flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
}
