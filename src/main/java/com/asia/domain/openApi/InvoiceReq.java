package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;
/**
 * 发票查询 请求
 * ClassName: InvoiceReq <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2019年4月29日 上午10:34:58 <br/>
 * @author yinyanzhen
 */
public class InvoiceReq extends BaseDomain{
	private static final long serialVersionUID = 9106850411047217788L;
	//发票实例ID
	private String invoiceId;
	//本地网标识
	private String lanId;
	
	public String getInvoiceId() {
		return invoiceId;
	}
	
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	
	public String getLanId() {
		return lanId;
	}
	
	public void setLanId(String lanId) {
		this.lanId = lanId;
	}
}
