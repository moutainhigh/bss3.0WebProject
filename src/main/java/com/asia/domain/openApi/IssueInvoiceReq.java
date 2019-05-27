package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;
/**
 * 发票开具 请求体
 * ClassName: IssueInvoiceReq <br/>
 * date: 2019年4月29日 上午10:48:55 <br/>
 * @author yinyanzhen
 */
public class IssueInvoiceReq extends BaseDomain{
	private static final long serialVersionUID = 5291156201376774864L;
	//商品实例Id,可在月结账单查询获取
	private String productid;
	//yyyymm格式
	private String billMonth;
	//本地网标识
	private String lanId;

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getBillMonth() {
		return billMonth;
	}

	public void setBillMonth(String billMonth) {
		this.billMonth = billMonth;
	}

	public String getLanId() {
		return lanId;
	}

	public void setLanId(String lanId) {
		this.lanId = lanId;
	}
	
}
