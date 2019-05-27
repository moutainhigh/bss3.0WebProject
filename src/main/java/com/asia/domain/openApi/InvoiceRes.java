package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseApiResDomain;
import com.asia.common.baseObj.BaseDomain;

/**
 * 发票查询 响应
 * ClassName: InvoiceRes <br/>
 * date: 2019年4月29日 上午10:36:24 <br/>
 * @author yinyanzhen
 */
public class InvoiceRes extends BaseApiResDomain{
	private static final long serialVersionUID = -2201478279343423316L;
	private Invoice invoice =new Invoice();
	
	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	/**
	 * 发票信息
	 * ClassName: Invoice <br/>
	 * date: 2019年4月29日 上午11:15:15 <br/>
	 * @author yinyanzhen
	 */
	public static class Invoice extends BaseDomain{
		private static final long serialVersionUID = -1260097269627130085L;
		//发票实例ID
		private String invoiceId;
		//发票文件地址
		private String url;
		//开票时间
		private String invoiceDate;
		//发票代码
		private String invoiceCode;
		//发票号码
		private String invoiceNo;
		//发票价格
		private String value;
		//发票类型
		private String type;
		
		public String getInvoiceId() {
			return invoiceId;
		}
		
		public void setInvoiceId(String invoiceId) {
			this.invoiceId = invoiceId;
		}
		
		public String getUrl() {
			return url;
		}
		
		public void setUrl(String url) {
			this.url = url;
		}
		
		public String getInvoiceDate() {
			return invoiceDate;
		}
		
		public void setInvoiceDate(String invoiceDate) {
			this.invoiceDate = invoiceDate;
		}
		
		public String getInvoiceCode() {
			return invoiceCode;
		}
		
		public void setInvoiceCode(String invoiceCode) {
			this.invoiceCode = invoiceCode;
		}
		
		public String getInvoiceNo() {
			return invoiceNo;
		}
		
		public void setInvoiceNo(String invoiceNo) {
			this.invoiceNo = invoiceNo;
		}
		
		public String getValue() {
			return value;
		}
		
		public void setValue(String value) {
			this.value = value;
		}
		
		public String getType() {
			return type;
		}
		
		public void setType(String type) {
			this.type = type;
		}
	}
}
