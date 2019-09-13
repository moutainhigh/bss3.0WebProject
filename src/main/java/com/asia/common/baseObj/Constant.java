package com.asia.common.baseObj;
/**
 * 系统常量定义
 * ClassName: Constant <br/>
 * date: 2019年4月20日 下午3:32:00 <br/>
 * @author yinyanzhen
 */
public class Constant{
	/**
	 * 集团交互,统一错误码
	 * ClassName: ResultCode <br/>
	 * date: 2019年5月10日 下午4:00:06 <br/>
	 * @author yinyanzhen
	 */
	public static class ResultCode{
		public static final String BON3_OK="0";
		public static final String OPENAPI_OK="0000";
		public static final String ERROR="0500";
	}
	
	public static final String BASE_URL_BON3="http://136.160.153.42:8026/";
	//"http://XX.XX.XX.XX:xx/";
	public static final String BASE_URL_OPENAPI="http://136.160.161.224:8085/bss/billing/qcdr/";
	public static final String BASE_URL_OPENAPI_INVOICE="http://137.0.31.177:8001/serviceAgent/rest";
	
	/**
	 * 标准openAPI
	 * ClassName: OpenApi <br/>
	 * date: 2019年5月10日 下午3:58:17 <br/>
	 * @author yinyanzhen
	 */
	public static class OpenApi{
		/**
		 * 实时话费查询
		 */
		public static final String qryInstantFee=Constant.BASE_URL_OPENAPI+"/QryInstantFee";
		/**
		 * 实时话费明细查询
		 */
		public static final String qryInstantFeeList=Constant.BASE_URL_OPENAPI+"/QryInstantFeeList";
		/**
		 * 缴费销账记录查询
		 */
		public static final String qryPayment=Constant.BASE_URL_OPENAPI+"/QryPayment";
		/**
		 * 账单查询
		 */
		public static final String qryCustBill=Constant.BASE_URL_OPENAPI+"/QryCustBill";
		/**
		 * 欠费查询
		 */
		public static final String qryBill=Constant.BASE_URL_OPENAPI+"/QryBill";
		/**
		 * 余额查询
		 */
		public static final String queryBalance=Constant.BASE_URL_OPENAPI+"/QueryBalance";
		/**
		 * 余额明细变动查询
		 */
		public static final String qryBalanceRecordDetail=Constant.BASE_URL_OPENAPI+"/QryBalanceRecordDetail";
		/**
		 * 账务周期查询
		 */
		public static final String billingCycle=Constant.BASE_URL_OPENAPI+"/billingCycle";
		/**
		 * 余额充值服务(非卡充)
		 */
		public static final String rechargeBalance=Constant.BASE_URL_OPENAPI+"/RechargeBalance";
		/**
		 * 详单查询
		 */
		public static final String rtBillItem=Constant.BASE_URL_OPENAPI+"/RtBillItem";
	}
	
	/**
	 * 电子发票相关接口
	 * ClassName: OpenApiInvoice <br/>
	 * date: 2019年5月10日 上午9:35:38 <br/>
	 * @author yinyanzhen
	 */
	public static class OpenApiInvoice{
		/**
		 * 月结费用查询(带发票号)
		 */
		public static final String monthlyBill=Constant.BASE_URL_OPENAPI_INVOICE+"/monthlyBill1/monthlyBill";
		/**
		 * 发票详情,附带发票下载URL
		 */
		public static final String invoice=Constant.BASE_URL_OPENAPI_INVOICE+"/invoice1/invoice";
		/**
		 * 发票开具
		 */
		public static final String issueInvoice=Constant.BASE_URL_OPENAPI_INVOICE+"/issueInvoice1/issueInvoice";
	}
	
	/**
	 * 场景三,请求url
	 * ClassName: Bon3 <br/>
	 * date: 2019年4月20日 下午3:40:49 <br/>
	 * @author yinyanzhen
	 */
	public static class Bon3{
		/**
		 * 用户信息查询
		 */
//		public static final String searchServInfo=Constant.BASE_URL_BON3+"/billing/acct/std/searchServInfo";
		public static final String searchServInfo=Constant.BASE_URL_BON3+"/billsrv/bon3/searchServInfo";
		/**
		 * 流量卡充值记录查询
		 */
		public static final String getFcDeposit=Constant.BASE_URL_BON3+"/billing/acct/std/getFcDeposit";
		/**
		 * 流量卡使用量查询
		 */
		public static final String flowGetRate=Constant.BASE_URL_BON3+"/billing/acct/std/flowGetRate";
		/**
		 * 余额查询
		 */
		public static final String qryBalance=Constant.BASE_URL_BON3+"/billing/acct/std/qryBalance";
		/**
		 * 余额查询
		 */
		public static final String getUnitedBalance=Constant.BASE_URL_BON3+"/billing/acct/std/getUnitedBalance";
		/**
		 * 套餐使用量查询
		 */
		public static final String getUnitedAccu=Constant.BASE_URL_BON3+"/billing/acct/std/getUnitedAccu";
		/**
		 * 套餐使用量明细查询
		 */
		public static final String getUnitedAccuDetail=Constant.BASE_URL_BON3+"/billing/acct/std/getUnitedAccuDetail";
		/**
		 * 账单查询
		 */
		public static final String getOweList=Constant.BASE_URL_BON3+"/billing/acct/std/getOweList";
		private Bon3(){}
	}
	
	private Constant(){}
}