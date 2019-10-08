package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;
import com.asia.domain.openApi.child.OperAttrStruct;
import com.asia.domain.openApi.child.SvcObjectStruct;
/**
 * ClassName: QueryBalanceReq <br/>
 * date: 2019年4月29日 下午2:56:16 <br/>
 * @author yinyanzhen
 */
public class QueryBalanceReq extends BaseDomain{
	private static final long serialVersionUID = -5364883138029671210L;
	//操作人属性
	private OperAttrStruct operAttrStruct;
	//服务对象 
	private SvcObjectStruct  svcObjectStruct;
	//查询业务类型
	private String queryFlag;
	//查询余额类型
	private String queryItemType;
	//电话区号
	private String areacode;
	//系统id
	private String systemId;
	public OperAttrStruct getOperAttrStruct() {
		return operAttrStruct;
	}

	public void setOperAttrStruct(OperAttrStruct operAttrStruct) {
		this.operAttrStruct = operAttrStruct;
	}

	public SvcObjectStruct getSvcObjectStruct() {
		return svcObjectStruct;
	}

	public void setSvcObjectStruct(SvcObjectStruct svcObjectStruct) {
		this.svcObjectStruct = svcObjectStruct;
	}

	public String getQueryFlag() {
		return queryFlag;
	}

	public void setQueryFlag(String queryFlag) {
		this.queryFlag = queryFlag;
	}

	public String getQueryItemType() {
		return queryItemType;
	}

	public void setQueryItemType(String queryItemType) {
		this.queryItemType = queryItemType;
	}

	public String getAreacode() {
		return areacode;
	}

	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
}
