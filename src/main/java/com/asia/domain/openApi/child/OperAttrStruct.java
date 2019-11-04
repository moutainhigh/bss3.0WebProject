package com.asia.domain.openApi.child;

import com.asia.common.baseObj.BaseDomain;

/**
 * 操作人属性
 * ClassName: OperAttrStruct <br/>
 * date: 2019年4月23日 下午8:19:21 <br/>
 * @author yinyanzhen
 */
public class OperAttrStruct extends BaseDomain{
	private static final long serialVersionUID = 676567141613097287L;
	//操作工号标识 
	private String staffId;
	//操作组织标识 
	private Integer operOrgId;
	//操作时间 
	private String operTime;
	//操作岗位 
	private Integer operPost;
	//业务流水标识 
	private String operServiceId ;
	//本地网标识 
	private Integer lanId;

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public Integer getOperOrgId() {
		return operOrgId;
	}

	public void setOperOrgId(Integer operOrgId) {
		this.operOrgId = operOrgId;
	}

	public String getOperTime() {
		return operTime;
	}

	public void setOperTime(String operTime) {
		this.operTime = operTime;
	}

	public Integer getOperPost() {
		return operPost;
	}

	public void setOperPost(Integer operPost) {
		this.operPost = operPost;
	}

	public String getOperServiceId() {
		return operServiceId;
	}

	public void setOperServiceId(String operServiceId) {
		this.operServiceId = operServiceId;
	}

	public Integer getLanId() {
		return lanId;
	}

	public void setLanId(Integer lanId) {
		this.lanId = lanId;
	}
	
}