package com.asia.domain.bon3_drop;

import java.util.ArrayList;
import java.util.List;

import com.asia.common.baseObj.BaseBonResDomain;
import com.asia.common.baseObj.BaseDomain;
import com.asia.domain.bon3_drop.StdCcaQueryBalance.Bon3StdCcaQueryBalance.BalanceItemDetail;

@Deprecated
public class StdCcaQueryBalance extends BaseBonResDomain{
	public static void main(String[] args) {
		StdCcaQueryBalance a=new StdCcaQueryBalance();
		a.setTotalBalanceAvailable("0");
		BalanceItemDetail balanceItemDetail = new BalanceItemDetail();
		balanceItemDetail.setBalanceItemTypeDetail("赠款账本");
		balanceItemDetail.setBalanceAmount("10000");
		balanceItemDetail.setBalanceAvailable("10000");
		balanceItemDetail.setBalanceUsed("10000");
		balanceItemDetail.setBalanceReserved("0");
		balanceItemDetail.setEffDate("20190501000000");
		balanceItemDetail.setExpDate("20190601000000");
		
		a.getStdCcaQueryBalance().getBalanceItemDetail().add(balanceItemDetail);
		System.out.println(a.toString());
	}
	private static final long serialVersionUID = -1356438195160459909L;
	private Bon3StdCcaQueryBalance stdCcaQueryBalance = new Bon3StdCcaQueryBalance();
	private String totalBalanceAvailable;
	
	public Bon3StdCcaQueryBalance getStdCcaQueryBalance() {
		return stdCcaQueryBalance;
	}

	public void setStdCcaQueryBalance(Bon3StdCcaQueryBalance stdCcaQueryBalance) {
		this.stdCcaQueryBalance = stdCcaQueryBalance;
	}
	
	public String getTotalBalanceAvailable() {
		return totalBalanceAvailable;
	}

	public void setTotalBalanceAvailable(String totalBalanceAvailable) {
		this.totalBalanceAvailable = totalBalanceAvailable;
	}


	/**
	 * 内部类
	 * ClassName: Bon3StdCcaQueryBalance <br/>
	 * date: 2019年4月24日 上午10:55:29 <br/>
	 * @author yinyanzhen
	 */
	public static class Bon3StdCcaQueryBalance extends BaseDomain{
		private static final long serialVersionUID = 9021351715919324932L;
		
		private List<BalanceItemDetail> balanceItemDetail =new ArrayList<>();
		
		public List<BalanceItemDetail> getBalanceItemDetail() {
			return balanceItemDetail;
		}


		public void setBalanceItemDetail(List<BalanceItemDetail> balanceItemDetail) {
			this.balanceItemDetail = balanceItemDetail;
		}


		/**
		 * 内部类
		 * ClassName: BalanceItemDetail <br/>
		 * Function: TODO ADD FUNCTION. <br/>
		 * date: 2019年4月24日 上午10:56:40 <br/>
		 * @author yinyanzhen
		 */
		public static class BalanceItemDetail extends BaseDomain{
			private static final long serialVersionUID = -4033607983148039431L;
			//余额帐本描述（如：赠送帐本，市话帐本）
			private String balanceItemTypeDetail;
			//余额的单位类型
			private String unitTypeId;
			//余额帐本还剩余额
			private String balanceAmount;
			//生效时间
			private String effDate;
			//失效时间
			private String expDate;
			//当月已消费值
			private String balanceUsed;
			//预授权余额
			private String balanceReserved;
			//余额帐本当月可使用额
			private String balanceAvailable;

			public String getBalanceItemTypeDetail() {
				return balanceItemTypeDetail;
			}

			public void setBalanceItemTypeDetail(String balanceItemTypeDetail) {
				this.balanceItemTypeDetail = balanceItemTypeDetail;
			}

			public String getUnitTypeId() {
				return unitTypeId;
			}

			public void setUnitTypeId(String unitTypeId) {
				this.unitTypeId = unitTypeId;
			}

			public String getBalanceAmount() {
				return balanceAmount;
			}

			public void setBalanceAmount(String balanceAmount) {
				this.balanceAmount = balanceAmount;
			}

			public String getExpDate() {
				return expDate;
			}

			public void setExpDate(String expDate) {
				this.expDate = expDate;
			}

			public String getBalanceUsed() {
				return balanceUsed;
			}

			public void setBalanceUsed(String balanceUsed) {
				this.balanceUsed = balanceUsed;
			}

			public String getBalanceReserved() {
				return balanceReserved;
			}

			public void setBalanceReserved(String balanceReserved) {
				this.balanceReserved = balanceReserved;
			}

			public String getEffDate() {
				return effDate;
			}

			public void setEffDate(String effDate) {
				this.effDate = effDate;
			}

			public String getBalanceAvailable() {
				return balanceAvailable;
			}

			public void setBalanceAvailable(String balanceAvailable) {
				this.balanceAvailable = balanceAvailable;
			}
		}
	}
}