package com.asia.domain.openApi;

import java.util.ArrayList;
import java.util.List;

import com.asia.common.baseObj.BaseApiResDomain;
import com.asia.common.baseObj.BaseDomain;
/**
 * ClassName: QryBillRes <br/>
 * date: 2019年4月29日 下午2:16:19 <br/>
 * @author yinyanzhen
 */
public class QryBillRes extends BaseApiResDomain{
	private static final long serialVersionUID = 638256277682422410L;
	//帐户标识
	private long acctId;
	//帐户名称
	private String acctName;
	//接入号码
	private String accNbr;
	//欠费帐务周期
	private List<FeeBillingCycle> feeBillingCycle = new ArrayList<>();
	//滞纳金
	private Integer due;
	//减免滞纳金
	private Integer derateDue;
	//可用余额
	private Integer validBalance;
	//应收金额
	private Integer shouldCharge;
	//上次零头
	private Integer previousChange;
	//本次零头
	private Integer currentChange;
	
	/**
	 * 欠费帐务周期
	 * ClassName: FeeBillingCycle <br/>
	 * date: 2019年4月29日 下午2:15:17 <br/>
	 * @author yinyanzhen
	 */
	public static class FeeBillingCycle extends BaseDomain{
		private static final long serialVersionUID = -6795464334833528214L;
		//帐务周期 
		private Integer billingCycleId;
		
		private List<AcctItemGroup> acctItemGroupList;
		
		/**
		 * 费用类型
		 * ClassName: AcctItemGroup <br/>
		 * date: 2019年4月29日 下午2:15:52 <br/>
		 * @author yinyanzhen
		 */
		public static class AcctItemGroup extends BaseDomain{
			private static final long serialVersionUID = -2187782026196558181L;
			//费用类型
			private String acctItemGroupId;
			
			private List<AcctItemType> acctItemType =new ArrayList<>();
			
			/**
			 * 帐目类型
			 * ClassName: AcctItemType <br/>
			 * date: 2019年4月29日 下午2:16:04 <br/>
			 * @author yinyanzhen
			 */
			public static class AcctItemType extends BaseDomain{
				private static final long serialVersionUID = -8540445737223839025L;
				//帐目类型名称
				private String acctItemTypeName;
				//欠费金额
				private Integer acctItemCharge;

				public String getAcctItemTypeName() {
					return acctItemTypeName;
				}

				public void setAcctItemTypeName(String acctItemTypeName) {
					this.acctItemTypeName = acctItemTypeName;
				}

				public Integer getAcctItemCharge() {
					return acctItemCharge;
				}

				public void setAcctItemCharge(Integer acctItemCharge) {
					this.acctItemCharge = acctItemCharge;
				}
			}

			public String getAcctItemGroupId() {
				return acctItemGroupId;
			}

			public void setAcctItemGroupId(String acctItemGroupId) {
				this.acctItemGroupId = acctItemGroupId;
			}

			public List<AcctItemType> getAcctItemType() {
				return acctItemType;
			}

			public void setAcctItemType(List<AcctItemType> acctItemType) {
				this.acctItemType = acctItemType;
			}
			
		}

		public Integer getBillingCycleId() {
			return billingCycleId;
		}

		public void setBillingCycleId(Integer billingCycleId) {
			this.billingCycleId = billingCycleId;
		}

		public List<AcctItemGroup> getAcctItemGroupList() {
			return acctItemGroupList;
		}

		public void setAcctItemGroupList(List<AcctItemGroup> acctItemGroupList) {
			this.acctItemGroupList = acctItemGroupList;
		}
	}
	
	public Long getAcctId() {
		return acctId;
	}

	public void setAcctId(Long acctId) {
		this.acctId = acctId;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getAccNbr() {
		return accNbr;
	}

	public void setAccNbr(String accNbr) {
		this.accNbr = accNbr;
	}

	public Integer getDue() {
		return due;
	}

	public void setDue(Integer due) {
		this.due = due;
	}

	public Integer getDerateDue() {
		return derateDue;
	}

	public void setDerateDue(Integer derateDue) {
		this.derateDue = derateDue;
	}

	public Integer getValidBalance() {
		return validBalance;
	}

	public void setValidBalance(Integer validBalance) {
		this.validBalance = validBalance;
	}

	public Integer getShouldCharge() {
		return shouldCharge;
	}

	public void setShouldCharge(Integer shouldCharge) {
		this.shouldCharge = shouldCharge;
	}

	public Integer getPreviousChange() {
		return previousChange;
	}

	public void setPreviousChange(Integer previousChange) {
		this.previousChange = previousChange;
	}

	public Integer getCurrentChange() {
		return currentChange;
	}

	public void setCurrentChange(Integer currentChange) {
		this.currentChange = currentChange;
	}

	public List<FeeBillingCycle> getFeeBillingCycle() {
		return feeBillingCycle;
	}

	public void setFeeBillingCycle(List<FeeBillingCycle> feeBillingCycle) {
		this.feeBillingCycle = feeBillingCycle;
	}
	
}
