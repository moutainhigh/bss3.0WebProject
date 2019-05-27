package com.asia.domain.bon3_drop;

import java.util.ArrayList;
import java.util.List;

import com.asia.common.baseObj.BaseBonResDomain;
import com.asia.common.baseObj.BaseDomain;
import com.asia.common.baseObj.Constant;
import com.asia.domain.bon3_drop.StdCcaFlowCardUsageQuery.Bon3StdCcaFlowCardUsageQuery.FlowCardUsageInfo;
/**
 * 
 * ClassName: StdCcaFlowCardUsageQuery <br/>
 * date: 2019年4月24日 上午10:44:11 <br/>
 * @author yinyanzhen
 */
@Deprecated
public class StdCcaFlowCardUsageQuery extends BaseBonResDomain{
	public static void main(String[] args) {
		StdCcaFlowCardUsageQuery a= new StdCcaFlowCardUsageQuery();
		FlowCardUsageInfo flowCardUsageInfo = new FlowCardUsageInfo();
		flowCardUsageInfo.setRemindLevel("2");
		flowCardUsageInfo.setAccNbr("15339991999");
		flowCardUsageInfo.setDestinationType("1");
		flowCardUsageInfo.setUnitTypeId("3");
		flowCardUsageInfo.setRatableAmount("500");
		flowCardUsageInfo.setBalanceAmount("300");
		flowCardUsageInfo.setUsageAmount("200");
		flowCardUsageInfo.setEffDate("20190501000000");
		flowCardUsageInfo.setExpDate("20190601000000");
		System.out.println(a.toString());
	}
	
	private static final long serialVersionUID = -8717182686496462845L;
	//
	private Bon3StdCcaFlowCardUsageQuery stdCcaFlowCardUsageQuery=new Bon3StdCcaFlowCardUsageQuery();
	
	public Bon3StdCcaFlowCardUsageQuery getStdCcaFlowCardUsageQuery() {
		return stdCcaFlowCardUsageQuery;
	}

	public void setStdCcaFlowCardUsageQuery(Bon3StdCcaFlowCardUsageQuery stdCcaFlowCardUsageQuery) {
		this.stdCcaFlowCardUsageQuery = stdCcaFlowCardUsageQuery;
	}
	
	/**
	 * 
	 * ClassName: Bon3StdCcaFlowCardUsageQuery <br/>
	 * date: 2019年4月24日 上午10:41:07 <br/>
	 * @author yinyanzhen
	 */
	public static class Bon3StdCcaFlowCardUsageQuery extends BaseDomain{
		private static final long serialVersionUID = 7346171902149302463L;
		//
		private List<FlowCardUsageInfo> flowCardUsageInfo = new ArrayList<>();
		
		public List<FlowCardUsageInfo> getFlowCardUsageInfo() {
			return flowCardUsageInfo;
		}

		public void setFlowCardUsageInfo(List<FlowCardUsageInfo> flowCardUsageInfo) {
			this.flowCardUsageInfo = flowCardUsageInfo;
		}

		/**
		 * 
		 * ClassName: FlowCardUsageInfo <br/>
		 * date: 2019年4月24日 上午10:44:51 <br/>
		 * @author yinyanzhen
		 */
		public static class FlowCardUsageInfo extends BaseDomain{
			private static final long serialVersionUID = 8022886421371737706L;
			//量本级别1-帐户级2-用户级
			private String remindLevel;
			//量本使用对象。账户级为账户标识,用户级为用户号码
			private String accNbr;
			//卡类型：1、全国流量卡；2、省流量卡3、全国促销卡
			private String destinationType;
			//单位 流量Kb
			private String unitTypeId;
			//生效时间
			private String effDate;
			//失效时间
			private String expDate;
			//量本总额
			private String ratableAmount;
			//量本余额
			private String balanceAmount;
			//已用额度
			private String usageAmount;

			public String getRemindLevel() {
				return remindLevel;
			}

			public void setRemindLevel(String remindLevel) {
				this.remindLevel = remindLevel;
			}

			public String getAccNbr() {
				return accNbr;
			}

			public void setAccNbr(String accNbr) {
				this.accNbr = accNbr;
			}

			public String getDestinationType() {
				return destinationType;
			}

			public void setDestinationType(String destinationType) {
				this.destinationType = destinationType;
			}

			public String getUnitTypeId() {
				return unitTypeId;
			}

			public void setUnitTypeId(String unitTypeId) {
				this.unitTypeId = unitTypeId;
			}

			public String getExpDate() {
				return expDate;
			}

			public void setExpDate(String expDate) {
				this.expDate = expDate;
			}

			public String getBalanceAmount() {
				return balanceAmount;
			}

			public void setBalanceAmount(String balanceAmount) {
				this.balanceAmount = balanceAmount;
			}

			public String getUsageAmount() {
				return usageAmount;
			}

			public void setUsageAmount(String usageAmount) {
				this.usageAmount = usageAmount;
			}

			public String getEffDate() {
				return effDate;
			}

			public void setEffDate(String effDate) {
				this.effDate = effDate;
			}

			public String getRatableAmount() {
				return ratableAmount;
			}

			public void setRatableAmount(String ratableAmount) {
				this.ratableAmount = ratableAmount;
			}
		}
	}
}
