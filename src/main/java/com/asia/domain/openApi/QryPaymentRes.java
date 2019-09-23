package com.asia.domain.openApi;

import java.util.List;

import com.asia.common.baseObj.BaseApiResDomain;
import com.asia.common.baseObj.BaseDomain;
/**
 * ClassName: QryPaymentRes <br/>
 * date: 2019年4月29日 下午2:46:08 <br/>
 * @author yinyanzhen
 */
public class QryPaymentRes extends BaseApiResDomain{
	private static final long serialVersionUID = -7566066364428868329L;
	//
	private List<PaymentInfo> paymentInfoList;
	/**
	 * 缴费信息对象
	 * ClassName: PaymentInfo <br/>
	 * date: 2019年4月29日 上午10:16:14 <br/>
	 * @author yinyanzhen
	 */
	public static class PaymentInfo extends BaseDomain{
		private static final long serialVersionUID = -5705473646149547302L;
		//缴费流水号
		public String  paymentId;
		//付款方式 
		public Integer paymentMethod;
		//缴费渠道 
		public Integer paymentChannel;
		//缴费金额 
		public Integer amount;
		//缴费时间
		public String paymentDate;
		//余额类型标识 
		public Integer balanceTypeId;
		//号码信息
		public String accNbrDetail;
		//缴费预存余额 
		public Integer balance;
		//帐期明细组 
		public List<AccNbrDetail> accNbrDetailList;
		
		/**
		 * ClassName: AccNbrDetail <br/>
		 * date: 2019年4月29日 下午2:42:54 <br/>
		 * @author yinyanzhen
		 */
		public static class AccNbrDetail extends BaseDomain{
			private static final long serialVersionUID = -7177046133949199710L;
			//号码 
			private String accNbr;
			//帐期 
			private Integer billingCycleId ;
			//金额 
			private Integer amount  ;

			public String getAccNbr() {
				return accNbr;
			}

			public void setAccNbr(String accNbr) {
				this.accNbr = accNbr;
			}

			public Integer getBillingCycleId() {
				return billingCycleId;
			}

			public void setBillingCycleId(Integer billingCycleId) {
				this.billingCycleId = billingCycleId;
			}

			public Integer getAmount() {
				return amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}
		}

		public String getPaymentId() {
			return paymentId;
		}

		public void setPaymentId(String paymentId) {
			this.paymentId = paymentId;
		}

		public Integer getPaymentMethod() {
			return paymentMethod;
		}

		public void setPaymentMethod(Integer paymentMethod) {
			this.paymentMethod = paymentMethod;
		}

		public Integer getPaymentChannel() {
			return paymentChannel;
		}

		public void setPaymentChannel(Integer paymentChannel) {
			this.paymentChannel = paymentChannel;
		}

		public Integer getAmount() {
			return amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public String getPaymentDate() {
			return paymentDate;
		}

		public void setPaymentDate(String paymentDate) {
			this.paymentDate = paymentDate;
		}

		public Integer getBalanceTypeId() {
			return balanceTypeId;
		}

		public void setBalanceTypeId(Integer balanceTypeId) {
			this.balanceTypeId = balanceTypeId;
		}

		public String getAccNbrDetail() {
			return accNbrDetail;
		}

		public void setAccNbrDetail(String accNbrDetail) {
			this.accNbrDetail = accNbrDetail;
		}

		public Integer getBalance() {
			return balance;
		}

		public void setBalance(Integer balance) {
			this.balance = balance;
		}

		public List<AccNbrDetail> getAccNbrDetailList() {
			return accNbrDetailList;
		}

		public void setAccNbrDetailList(List<AccNbrDetail> accNbrDetailList) {
			this.accNbrDetailList = accNbrDetailList;
		}
	}
	public List<PaymentInfo> getPaymentInfoList() {
		return paymentInfoList;
	}
	public void setPaymentInfoList(List<PaymentInfo> paymentInfoList) {
		this.paymentInfoList = paymentInfoList;
	}
}
