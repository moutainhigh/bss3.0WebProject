package com.asia.domain.bon3_drop;

import com.asia.common.baseObj.BaseDomain;
/**
 * 
 * ClassName: StdCcrQueryUnitedBalance <br/>
 * date: 2019年4月24日 上午11:03:05 <br/>
 * @author yinyanzhen
 */
@Deprecated
public class StdCcrQueryUnitedBalance extends BaseDomain{
	public static void main(String[] args) {
		StdCcrQueryUnitedBalance a = new StdCcrQueryUnitedBalance();
		System.out.println(a.toString());
	}
	private static final long serialVersionUID = -225273870737946595L;
	private BalanceQueryInformation balanceQueryInformation = new BalanceQueryInformation();
	
	public BalanceQueryInformation getBalanceQueryInformation() {
		return balanceQueryInformation;
	}

	public void setBalanceQueryInformation(BalanceQueryInformation balanceQueryInformation) {
		this.balanceQueryInformation = balanceQueryInformation;
	}

	/**
	 * 内部类
	 * ClassName: BalanceQueryInformation <br/>
	 * date: 2019年4月24日 上午11:01:47 <br/>
	 * @author yinyanzhen
	 */
	public static class BalanceQueryInformation extends BaseDomain{
		private static final long serialVersionUID = 5334050906591450396L;
		
		private String queryFlag;
		
		private String queryItemType;
		
		private String areaCode;
		
		private String destinationIdType;
		
		private String destinationAttr;
		
		private String destinationId;
		
		private String returnPlanId;

		public String getQueryFlag() {
			return queryFlag;
		}

		public void setQueryFlag(String queryFlag) {
			this.queryFlag = queryFlag;
		}

		public String getQueryItemType() {
			return queryItemType;
		}

		public void setQueryItemType(String queryItemType) {
			this.queryItemType = queryItemType;
		}

		public String getAreaCode() {
			return areaCode;
		}

		public void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}

		public String getDestinationIdType() {
			return destinationIdType;
		}

		public void setDestinationIdType(String destinationIdType) {
			this.destinationIdType = destinationIdType;
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

		public String getReturnPlanId() {
			return returnPlanId;
		}

		public void setReturnPlanId(String returnPlanId) {
			this.returnPlanId = returnPlanId;
		}
		
	}
}