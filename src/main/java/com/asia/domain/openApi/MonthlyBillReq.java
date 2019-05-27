package com.asia.domain.openApi;
/**
 * 月结账单查询 请求体
 * ClassName: MonthlyBillReq <br/>
 * date: 2019年4月29日 上午10:53:34 <br/>
 * @author yinyanzhen
 */
public class MonthlyBillReq {
	//号码
	private String serialNumber;
	//本地网标识
	private String lanId;

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getLanId() {
		return lanId;
	}

	public void setLanId(String lanId) {
		this.lanId = lanId;
	}
	
}
