package com.asia.domain.bon3_drop;

import com.asia.common.baseObj.BaseDomain;

/**
 * 
 * ClassName: StdCcrQueryServ <br/>
 * date: 2019年4月23日 下午8:41:12 <br/>
 * 
 * @author yinyanzhen
 */
@Deprecated
public class StdCcrQueryServ extends BaseDomain {
	public static void main(String[] args) {
		StdCcrQueryServ a = new StdCcrQueryServ();
		a.getStdCcrQueryServ().setAreaCode("0531");
		a.getStdCcrQueryServ().setValue("111");
		a.getStdCcrQueryServ().setValueType("1");
		a.getStdCcrQueryServ().setQueryType("11");
		
		System.out.println(a.toString());
	}
	private static final long serialVersionUID = 4732297460958626455L;
	private Bon3StdCcrQueryServ stdCcrQueryServ = new Bon3StdCcrQueryServ();

	public Bon3StdCcrQueryServ getStdCcrQueryServ() {
		return stdCcrQueryServ;
	}

	public void setStdCcrQueryServ(Bon3StdCcrQueryServ stdCcrQueryServ) {
		this.stdCcrQueryServ = stdCcrQueryServ;
	}

	public static class Bon3StdCcrQueryServ extends BaseDomain {
		private static final long serialVersionUID = -6681408815310882189L;
		//
		private String areaCode;
		//
		private String valueType;
		//
		private String value;
		//
		private String queryType;

		public String getAreaCode() {
			return areaCode;
		}

		public void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}

		public String getValueType() {
			return valueType;
		}

		public void setValueType(String valueType) {
			this.valueType = valueType;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getQueryType() {
			return queryType;
		}

		public void setQueryType(String queryType) {
			this.queryType = queryType;
		}
	}
}