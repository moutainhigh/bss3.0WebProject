package com.asia.domain.bon3_drop;

import com.asia.common.baseObj.BaseDomain;
/**
 * 
 * ClassName: StdCcrQueryBalance <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2019年4月24日 上午10:53:34 <br/>
 * @author yinyanzhen
 */
@Deprecated
public class StdCcrQueryBalance extends BaseDomain{
	/*public static void main(String[] args) {
		StdCcrQueryBalance a = new StdCcrQueryBalance();
		System.out.println(a.toString());
	}*/
	
	private static final long serialVersionUID = 2029164396424338752L;
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
	 * date: 2019年4月24日 上午10:53:22 <br/>
	 * @author yinyanzhen
	 */
	public static class BalanceQueryInformation extends BaseDomain{
		private static final long serialVersionUID = -7589526345142302766L;
		
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
