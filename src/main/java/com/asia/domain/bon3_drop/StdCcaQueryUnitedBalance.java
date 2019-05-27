package com.asia.domain.bon3_drop;

import java.util.ArrayList;
import java.util.List;

import com.asia.common.baseObj.BaseBonResDomain;
import com.asia.common.baseObj.BaseDomain;
import com.asia.common.baseObj.Constant;
import com.asia.domain.bon3_drop.StdCcaQueryUnitedBalance.Bon3StdCcaQueryUnitedBalance.BalanceInformation;
/**
 * 
 * ClassName: StdCcaQueryUnitedBalance <br/>
 * date: 2019年4月24日 上午11:08:17 <br/>
 * @author yinyanzhen
 */
@Deprecated
public class StdCcaQueryUnitedBalance extends BaseBonResDomain{
	public static void main(String[] args) {
		StdCcaQueryUnitedBalance a =new StdCcaQueryUnitedBalance();
		a.getStdCcaQueryUnitedBalance().setPaymentFlag("1");
		a.getStdCcaQueryUnitedBalance().setTotalBalanceAvailable("50");
		BalanceInformation temp = new BalanceInformation();
		temp.setBalanceTypeFlag("0");
		temp.setBalanceAvailable("50");
		a.getStdCcaQueryUnitedBalance().getBalanceInformation().add(temp);
		System.out.println(a.toString());
	}
	private static final long serialVersionUID = -6293846971642914119L;
	private Bon3StdCcaQueryUnitedBalance stdCcaQueryUnitedBalance = new Bon3StdCcaQueryUnitedBalance();
	
	public Bon3StdCcaQueryUnitedBalance getStdCcaQueryUnitedBalance() {
		return stdCcaQueryUnitedBalance;
	}

	public void setStdCcaQueryUnitedBalance(Bon3StdCcaQueryUnitedBalance stdCcaQueryUnitedBalance) {
		this.stdCcaQueryUnitedBalance = stdCcaQueryUnitedBalance;
	}

	/**
	 * 内部类
	 * ClassName: Bon3StdCcaQueryUnitedBalance <br/>
	 * date: 2019年4月24日 上午11:08:22 <br/>
	 * @author yinyanzhen
	 */
	public static class Bon3StdCcaQueryUnitedBalance extends BaseDomain{
		private static final long serialVersionUID = -2243933553256267746L;
		//付费方式，0：后付费，1：预付费
		private String paymentFlag;
		//实时可用总余额
		private String totalBalanceAvailable;
		//余额类信息组
		private List<BalanceInformation> balanceInformation = new ArrayList<>();
		
		public String getPaymentFlag() {
			return paymentFlag;
		}

		public void setPaymentFlag(String paymentFlag) {
			this.paymentFlag = paymentFlag;
		}

		public String getTotalBalanceAvailable() {
			return totalBalanceAvailable;
		}

		public void setTotalBalanceAvailable(String totalBalanceAvailable) {
			this.totalBalanceAvailable = totalBalanceAvailable;
		}

		public List<BalanceInformation> getBalanceInformation() {
			return balanceInformation;
		}

		public void setBalanceInformation(List<BalanceInformation> balanceInformation) {
			this.balanceInformation = balanceInformation;
		}

		/**
		 * 余额类信息组
		 * ClassName: BalanceInformation <br/>
		 * date: 2019年4月24日 上午11:08:30 <br/>
		 * @author yinyanzhen
		 */
		public static class BalanceInformation extends BaseDomain{
			private static final long serialVersionUID = 1613333106322814315L;
			
			private String balanceAvailable;
			
			private String balanceTypeFlag;

			public String getBalanceAvailable() {
				return balanceAvailable;
			}

			public void setBalanceAvailable(String balanceAvailable) {
				this.balanceAvailable = balanceAvailable;
			}

			public String getBalanceTypeFlag() {
				return balanceTypeFlag;
			}

			public void setBalanceTypeFlag(String balanceTypeFlag) {
				this.balanceTypeFlag = balanceTypeFlag;
			}
		}
	}
}