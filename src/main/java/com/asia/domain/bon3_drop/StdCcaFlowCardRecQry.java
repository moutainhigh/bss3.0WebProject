package com.asia.domain.bon3_drop;

import java.util.ArrayList;
import java.util.List;

import com.asia.common.baseObj.BaseBonResDomain;
import com.asia.common.baseObj.BaseDomain;
import com.asia.common.baseObj.Constant;
import com.asia.domain.bon3_drop.StdCcaFlowCardRecQry.Bon3StdCcaFlowCardRecQry.FlowCardRecInfo;
/**
 * 
 * ClassName: StdCcaFlowCardRecQry <br/>
 * date: 2019年4月24日 上午10:29:02 <br/>
 * @author yinyanzhen
 */
@Deprecated
public class StdCcaFlowCardRecQry extends BaseBonResDomain{
	public static void main(String[] args) {
		StdCcaFlowCardRecQry a =new StdCcaFlowCardRecQry();
		FlowCardRecInfo flowCardRecInfo = new FlowCardRecInfo();
		flowCardRecInfo.setRemindLevel("1");
		flowCardRecInfo.setAccNbr("15310002000");
		flowCardRecInfo.setDestinationType("1");
		flowCardRecInfo.setPayAmount("100");
		flowCardRecInfo.setUnitTypeId("3");
		flowCardRecInfo.setEffDate("20190501000000");
		flowCardRecInfo.setExpDate("20190601000000");
		flowCardRecInfo.setPaidTime("20190510153535");
		a.getStdCcaFlowCardRecQry().getFlowCardRecInfo().add(flowCardRecInfo);
		System.out.println(a.toString());
	}
	
	private static final long serialVersionUID = -4063824674225050205L;
	//
	private Bon3StdCcaFlowCardRecQry stdCcaFlowCardRecQry =new Bon3StdCcaFlowCardRecQry();
	
	public Bon3StdCcaFlowCardRecQry getStdCcaFlowCardRecQry() {
		return stdCcaFlowCardRecQry;
	}

	public void setStdCcaFlowCardRecQry(Bon3StdCcaFlowCardRecQry stdCcaFlowCardRecQry) {
		this.stdCcaFlowCardRecQry = stdCcaFlowCardRecQry;
	}

	/**
	 * 内部类
	 * ClassName: Bon3StdCcaFlowCardRecQry <br/>
	 * date: 2019年4月24日 上午10:25:30 <br/>
	 * @author yinyanzhen
	 */
	public static class Bon3StdCcaFlowCardRecQry extends BaseDomain{
		private static final long serialVersionUID = 1L;
		//
		private List<FlowCardRecInfo> flowCardRecInfo= new ArrayList<>();
		
		public List<FlowCardRecInfo> getFlowCardRecInfo() {
			return flowCardRecInfo;
		}

		public void setFlowCardRecInfo(List<FlowCardRecInfo> flowCardRecInfo) {
			this.flowCardRecInfo = flowCardRecInfo;
		}

		/**
		 * 内部类
		 * ClassName: FlowCardRecInfo <br/>
		 * date: 2019年4月24日 上午10:29:12 <br/>
		 * @author yinyanzhen
		 */
		public static class FlowCardRecInfo extends BaseDomain{
			private static final long serialVersionUID = 1L;
			
			private String remindLevel;
			
			private String accNbr;
			
			private String destinationType;
			
			private String paidTime;
			
			private String unitTypeId;
			
			private String effDate;
			
			private String expDate;
			
			private String payAmount;

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

			public String getPaidTime() {
				return paidTime;
			}

			public void setPaidTime(String paidTime) {
				this.paidTime = paidTime;
			}

			public String getUnitTypeId() {
				return unitTypeId;
			}

			public void setUnitTypeId(String unitTypeId) {
				this.unitTypeId = unitTypeId;
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

			public String getPayAmount() {
				return payAmount;
			}

			public void setPayAmount(String payAmount) {
				this.payAmount = payAmount;
			}
		}
	}
}