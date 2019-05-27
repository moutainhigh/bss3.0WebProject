package com.asia.domain.openApi;

import java.util.ArrayList;
import java.util.List;

import com.asia.common.baseObj.BaseApiResDomain;
import com.asia.common.baseObj.BaseDomain;
/**
 * QryBalanceRecordDetail 响应体
 * ClassName: QryBalanceRecordDetailRes <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2019年4月29日 下午1:52:13 <br/>
 * @author yinyanzhen
 */
public class QryBalanceRecordDetailRes extends BaseApiResDomain{
	private static final long serialVersionUID = -3629374448104503827L;
	private List<BalanceChangeList> balanceChangeList = new ArrayList<>();
	
	public List<BalanceChangeList> getBalanceChangeList() {
		return balanceChangeList;
	}

	public void setBalanceChangeList(List<BalanceChangeList> balanceChangeList) {
		this.balanceChangeList = balanceChangeList;
	}

	/**
	 * 余额变动明细类型
	 * ClassName: BalanceChangeList <br/>
	 * date: 2019年4月29日 下午1:50:57 <br/>
	 * @author yinyanzhen
	 */
	public static class BalanceChangeList extends BaseDomain{
		private static final long serialVersionUID = 6598228482202953673L;
		//变动流水 
		public String serviceId;
		//归属帐期 
		public Integer billingCycleId;
		//状态时间 
		public String stateDate;
		//余额变动类型
		public String balanceChangeType;
		//操作值 
		public Integer balanceVal;
		//操作前值 
		public Integer beforeBalanceVal;
		//操作后值 
		public Integer afterBalanceVal;
		//本期入帐
		public Integer balanceIn;
		//本期支出
		public Integer balanceOut;
		//本期末余额
		public Integer balanceEnd;
		//余额类型标识 
		public Integer balanceTypeFlag;
		//余额类型名称 
		public String balanceTypeName;
		//号码信息描述 
		public String accNbrDetail ;

		public String getServiceId() {
			return serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public Integer getBillingCycleId() {
			return billingCycleId;
		}

		public void setBillingCycleId(Integer billingCycleId) {
			this.billingCycleId = billingCycleId;
		}

		public String getStateDate() {
			return stateDate;
		}

		public void setStateDate(String stateDate) {
			this.stateDate = stateDate;
		}

		public String getBalanceChangeType() {
			return balanceChangeType;
		}

		public void setBalanceChangeType(String balanceChangeType) {
			this.balanceChangeType = balanceChangeType;
		}

		public Integer getBalanceVal() {
			return balanceVal;
		}

		public void setBalanceVal(Integer balanceVal) {
			this.balanceVal = balanceVal;
		}

		public Integer getBeforeBalanceVal() {
			return beforeBalanceVal;
		}

		public void setBeforeBalanceVal(Integer beforeBalanceVal) {
			this.beforeBalanceVal = beforeBalanceVal;
		}

		public Integer getAfterBalanceVal() {
			return afterBalanceVal;
		}

		public void setAfterBalanceVal(Integer afterBalanceVal) {
			this.afterBalanceVal = afterBalanceVal;
		}

		public Integer getBalanceIn() {
			return balanceIn;
		}

		public void setBalanceIn(Integer balanceIn) {
			this.balanceIn = balanceIn;
		}

		public Integer getBalanceOut() {
			return balanceOut;
		}

		public void setBalanceOut(Integer balanceOut) {
			this.balanceOut = balanceOut;
		}

		public Integer getBalanceEnd() {
			return balanceEnd;
		}

		public void setBalanceEnd(Integer balanceEnd) {
			this.balanceEnd = balanceEnd;
		}

		public Integer getBalanceTypeFlag() {
			return balanceTypeFlag;
		}

		public void setBalanceTypeFlag(Integer balanceTypeFlag) {
			this.balanceTypeFlag = balanceTypeFlag;
		}

		public String getBalanceTypeName() {
			return balanceTypeName;
		}

		public void setBalanceTypeName(String balanceTypeName) {
			this.balanceTypeName = balanceTypeName;
		}

		public String getAccNbrDetail() {
			return accNbrDetail;
		}

		public void setAccNbrDetail(String accNbrDetail) {
			this.accNbrDetail = accNbrDetail;
		}
	}
}
