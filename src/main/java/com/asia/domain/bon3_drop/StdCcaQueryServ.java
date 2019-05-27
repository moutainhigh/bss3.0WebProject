package com.asia.domain.bon3_drop;

import com.asia.common.baseObj.BaseBonResDomain;
import com.asia.common.baseObj.BaseDomain;
import com.asia.common.baseObj.Constant;
/**
 * 用户信息查询返回消息格式
 * ClassName: StdCcaQueryServ <br/>
 * date: 2019年4月24日 上午9:15:31 <br/>
 * @author yinyanzhen
 */
@Deprecated
public class StdCcaQueryServ extends BaseBonResDomain{
	public static void main(String[] args) {
		StdCcaQueryServ a =new StdCcaQueryServ();
		a.getStdCcaQueryServ().setCustName("客户名称");
		a.getStdCcaQueryServ().setGroupUser("1");
		a.getStdCcaQueryServ().setHomeAreaCode("0531");
		a.getStdCcaQueryServ().setServId("11123123");
		a.getStdCcaQueryServ().setProductId("1121212");
		a.getStdCcaQueryServ().setPaymentFlag("1");
		a.getStdCcaQueryServ().setServState("0");
		a.getStdCcaQueryServ().setStateDate("20180903120101");
		
		System.out.println(a.toString());
		
	}
	
	private static final long serialVersionUID = -8601527345354773339L;
	
	private Bon3StdCcaQueryServ stdCcaQueryServ =new Bon3StdCcaQueryServ();
	
	public Bon3StdCcaQueryServ getStdCcaQueryServ() {
		return stdCcaQueryServ;
	}

	public void setStdCcaQueryServ(Bon3StdCcaQueryServ stdCcaQueryServ) {
		this.stdCcaQueryServ = stdCcaQueryServ;
	}

	public static class Bon3StdCcaQueryServ extends BaseDomain{
		private static final long serialVersionUID = -6100167385306688671L;
		//客户名称
		private String custName;
		//用户标识
		private String servId;
		//产品标识
		private String productId;
		//产品名称
		private String productName;
		//用户属性，0：拥有集团帐户，1：没有集团帐户
		private String groupUser;
		//用户状态0：正常；1：停机；2：欠费停机；3：拆机
		private String servState;
		//状态时间
		private String stateDate;
		//付费方式，0：后付费，1：预付费
		private String paymentFlag;
		//本地网区号
		private String homeAreaCode;

		public String getCustName() {
			return custName;
		}

		public void setCustName(String custName) {
			this.custName = custName;
		}

		public String getServId() {
			return servId;
		}

		public void setServId(String servId) {
			this.servId = servId;
		}

		public String getProductId() {
			return productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getGroupUser() {
			return groupUser;
		}

		public void setGroupUser(String groupUser) {
			this.groupUser = groupUser;
		}

		public String getServState() {
			return servState;
		}

		public void setServState(String servState) {
			this.servState = servState;
		}

		public String getStateDate() {
			return stateDate;
		}

		public void setStateDate(String stateDate) {
			this.stateDate = stateDate;
		}

		public String getPaymentFlag() {
			return paymentFlag;
		}

		public void setPaymentFlag(String paymentFlag) {
			this.paymentFlag = paymentFlag;
		}

		public String getHomeAreaCode() {
			return homeAreaCode;
		}

		public void setHomeAreaCode(String homeAreaCode) {
			this.homeAreaCode = homeAreaCode;
		}
		
	}
}