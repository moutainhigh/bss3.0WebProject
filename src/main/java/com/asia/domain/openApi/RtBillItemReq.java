package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;
import com.asia.domain.openApi.child.OperAttrStruct;
import com.asia.domain.openApi.child.SvcObjectStruct;
/**
 * ClassName: RtBillItemReq <br/>
 * date: 2019年4月29日 下午3:16:00 <br/>
 * @author yinyanzhen
 */
public class RtBillItemReq extends BaseDomain{
	private static final long serialVersionUID = 4004559995072007631L;
	//操作人属性
	private OperAttrStruct operAttrStruct;
	//服务对象条件 
	private SvcObjectStruct svcObjectStruct;
	//查询帐期 
	private Integer billingCycleId ;
	//话单类型
	private Integer cdrType ;
	//查询类型
	private Integer qryType ;
	//页码
	private Integer page ;
	//行数
	private Integer row ;
	//查询条件1
	private Integer firstQryCond ;
	//查询条件2
	private Integer secondQryCond ;
	//查询开始时间
	private Integer startDate;
	//查询结束时间
	private Integer endDate;

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

	public Integer getBillingCycleId() {
		return billingCycleId;
	}

	public void setBillingCycleId(Integer billingCycleId) {
		this.billingCycleId = billingCycleId;
	}

	public Integer getCdrType() {
		return cdrType;
	}

	public void setCdrType(Integer cdrType) {
		this.cdrType = cdrType;
	}

	public Integer getQryType() {
		return qryType;
	}

	public void setQryType(Integer qryType) {
		this.qryType = qryType;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getFirstQryCond() {
		return firstQryCond;
	}

	public void setFirstQryCond(Integer firstQryCond) {
		this.firstQryCond = firstQryCond;
	}

	public Integer getSecondQryCond() {
		return secondQryCond;
	}

	public void setSecondQryCond(Integer secondQryCond) {
		this.secondQryCond = secondQryCond;
	}

	public Integer getStartDate() {
		return startDate;
	}

	public void setStartDate(Integer startDate) {
		this.startDate = startDate;
	}

	public Integer getEndDate() {
		return endDate;
	}

	public void setEndDate(Integer endDate) {
		this.endDate = endDate;
	}
}
