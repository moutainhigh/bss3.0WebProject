package com.asia.domain.openApi.child;

import com.asia.common.baseObj.BaseDomain;
/**
 * 服务对象条件
 * ClassName: SvcObjectStruct <br/>
 * date: 2019年4月23日 下午8:18:39 <br/>
 * @author yinyanzhen
 */
public class SvcObjectStruct extends BaseDomain{
	private static final long serialVersionUID = -1885463092786365226L;
	//对象类型 
	private String objType;
	//对象值 
	private String objValue;
	//用户号码属性 
	private String objAttr;
	//数据范围 
	private String dataArea;
	
	public String getObjType() {
		return objType;
	}
	
	public void setObjType(String objType) {
		this.objType = objType;
	}
	
	public String getObjValue() {
		return objValue;
	}
	public void setObjValue(String objValue) {
		this.objValue = objValue;
	}
	
	public String getObjAttr() {
		return objAttr;
	}
	
	public void setObjAttr(String objAttr) {
		this.objAttr = objAttr;
	}
	public String getDataArea() {
		return dataArea;
	}
	
	public void setDataArea(String dataArea) {
		this.dataArea = dataArea;
	}
}