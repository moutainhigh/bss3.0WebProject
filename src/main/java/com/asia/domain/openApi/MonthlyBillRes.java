package com.asia.domain.openApi;

import java.util.ArrayList;
import java.util.List;

import com.asia.common.baseObj.BaseApiResDomain;
import com.asia.common.baseObj.BaseDomain;

/**
 * 月结账单查询
 * ClassName: MonthlyBillRes <br/>
 * date: 2019年4月29日 上午11:10:52 <br/>
 * @author yinyanzhen
 */
public class MonthlyBillRes extends BaseApiResDomain{
	private static final long serialVersionUID = 6801923426014361413L;
	//账单信息组
	private List<MonthlyBill> monthlyBills =new ArrayList<>();
	
	public List<MonthlyBill> getMonthlyBills() {
		return monthlyBills;
	}

	public void setMonthlyBills(List<MonthlyBill> monthlyBills) {
		this.monthlyBills = monthlyBills;
	}

	/**
	 * 账单
	 * ClassName: MonthlyBill <br/>
	 * date: 2019年4月29日 上午11:12:46 <br/>
	 * @author yinyanzhen
	 */
	public static class MonthlyBill extends BaseDomain{
		private static final long serialVersionUID = -2463751263588518390L;
		//编码
		private String id;
		//用户实例ID
		private String productId;
		//账单月份
		private String billMonth;
		//额度
		private String amount;
		//发票实例ID
		private String invoiceId;
		//开具状态
		private String status;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getProductId() {
			return productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getBillMonth() {
			return billMonth;
		}

		public void setBillMonth(String billMonth) {
			this.billMonth = billMonth;
		}

		public String getAmount() {
			return amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}

		public String getInvoiceId() {
			return invoiceId;
		}

		public void setInvoiceId(String invoiceId) {
			this.invoiceId = invoiceId;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}
}
