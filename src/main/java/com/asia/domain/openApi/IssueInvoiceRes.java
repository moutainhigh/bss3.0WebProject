package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;
/**
 * 发票开具 响应体
 * ClassName: IssueInvoiceRes <br/>
 * date: 2019年4月29日 上午10:50:37 <br/>
 * @author yinyanzhen
 */
public class IssueInvoiceRes extends BaseDomain{
	private static final long serialVersionUID = -1537705839564347991L;
	//状态码
	private String resultCode;
	//描述信息
	private String resultMsg;

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	
}
