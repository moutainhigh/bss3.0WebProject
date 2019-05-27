package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseApiResDomain;
/**
 * ClassName: QryInstantFeeRes <br/>
 * date: 2019年4月29日 下午3:39:42 <br/>
 * @author yinyanzhen
 */
public class QryInstantFeeRes extends BaseApiResDomain{
	private static final long serialVersionUID = 5387255828328822517L;
	
	private Integer sumCharge;
	
	private String acctName;

	public Integer getSumCharge() {
		return sumCharge;
	}

	public void setSumCharge(Integer sumCharge) {
		this.sumCharge = sumCharge;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
}
