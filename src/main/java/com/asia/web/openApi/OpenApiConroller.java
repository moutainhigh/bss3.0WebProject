package com.asia.web.openApi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.LogUtil;
import com.asia.domain.openApi.*;
import com.asia.domain.openApi.QryBalanceRecordDetailRes.BalanceChangeList;
import com.asia.domain.openApi.QryBillRes.FeeBillingCycle;
import com.asia.domain.openApi.QryBillRes.FeeBillingCycle.AcctItemGroup;
import com.asia.domain.openApi.QryBillRes.FeeBillingCycle.AcctItemGroup.AcctItemType;
import com.asia.domain.openApi.QryInstantFeeListRes.ItemInformation;
import com.asia.domain.openApi.QryPaymentRes.PaymentInfo;
import com.asia.domain.openApi.QryPaymentRes.PaymentInfo.AccNbrDetail;
import com.asia.domain.openApi.QueryBalanceRes.BalanceQuery;
import com.asia.domain.openApi.RtBillItemRes.DataBillItem;
import com.asia.domain.openApi.RtBillItemRes.IncrBillItem;
import com.asia.domain.openApi.RtBillItemRes.SmsBillItem;
import com.asia.domain.openApi.RtBillItemRes.VoiceBillItem;
import com.asia.domain.openApi.child.BillingCycle;
import com.asia.internal.common.BillException;
import com.asia.mapper.billmapper.IntfServCustChangeContrastMapper;
import com.asia.mapper.ordmapper.ProdInstRouteMapper;
import com.asia.service.impl.Bon3ServiceImpl;
import com.asia.service.impl.openApi.OpenAPIServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * openApi服务暴漏
 * ClassName: OpenApiConroller <br/>
 * date: 2019年4月25日 下午2:46:32 <br/>
 * @author yinyanzhen
 */
@RequestMapping(value="/openApi",produces="application/json;charset=UTF-8")
@RestController
public class OpenApiConroller{
	private static final Logger logger = LoggerFactory.getLogger(OpenApiConroller.class);
	@Autowired
	private OpenAPIServiceImpl openAPIServiceImpl;
	@Autowired
	private Bon3ServiceImpl bon3Service;
	private static final String X_CTG_REQUEST_ID = "X-CTG-Request-ID";
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private IntfServCustChangeContrastMapper intfServCustChangeContrastDao;
	@Autowired
	private ProdInstRouteMapper prodInstRouteMapperDao;
	/**
	 * qryInstantFee:(实时话费查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/QryInstantFee")
	public String qryInstantFee(@RequestBody QryInstantFeeReq qryInstantFeeReq,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/openApi/QryInstantFee", "body>>"+qryInstantFeeReq.toString()
			+" header>>"+JSON.toJSONString(headers), this.getClass());
		QryInstantFeeRes returnInfo=new QryInstantFeeRes();
		try {
			returnInfo.setResultCode(Constant.ResultCode.OPENAPI_OK);
//			returnInfo=openAPIServiceImpl.qryInstantFee(qryInstantFeeReq, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/QryInstantFee服务调用失败", e, this.getClass());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * qryInstantFee:(实时话费明细查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/QryInstantFeeList")
	public String qryInstantFeeList(@RequestBody QryInstantFeeListReq qryInstantFeeListReq,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/openApi/qryInstantFee","body>>"+qryInstantFeeListReq.toString()
			+" header>>"+JSON.toJSONString(headers), this.getClass());
		QryInstantFeeListRes returnInfo=new QryInstantFeeListRes();
		try {
			returnInfo.setResultCode(Constant.ResultCode.OPENAPI_OK);
			returnInfo.setItemInformatinList(new ArrayList<>());
			returnInfo.getItemInformatinList().add(new ItemInformation());
			returnInfo=openAPIServiceImpl.qryInstantFeeList(qryInstantFeeListReq, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/QryInstantFeeList服务调用失败", e, this.getClass());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * qryPayment:(缴费销帐记录查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/QryPayment")
	public String qryPayment(@RequestBody QryPaymentReq qryPaymentReq,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/openApi/qryPayment","body>>"+qryPaymentReq.toString()
			+" header>>"+JSON.toJSONString(headers), this.getClass());
		QryPaymentRes returnInfo=new QryPaymentRes();
		try {
			returnInfo.setPaymentInfoList(new ArrayList<>());
			
			PaymentInfo paymentInfo =new PaymentInfo();
			paymentInfo.setAccNbrDetailList(new ArrayList<>());
			paymentInfo.getAccNbrDetailList().add(new AccNbrDetail());
			
			returnInfo.getPaymentInfoList().add(paymentInfo);
			
//			returnInfo=openAPIServiceImpl.qryPayment(qryPaymentReq, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/qryPayment服务调用失败", e, this.getClass());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * qryCustBill:(帐单查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/QryCustBill")
	public String qryCustBill(@RequestBody QryCustBillReq body,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/openApi/qryCustBill","body>>"+body.toString()+" header>>"+JSON.toJSONString(headers), this.getClass());
		QryCustBillRes returnInfo=new QryCustBillRes();
		try {
			returnInfo.setItemInformationList(new ArrayList<>());
			returnInfo.getItemInformationList().add(new com.asia.domain.openApi.QryCustBillRes.ItemInformation());
//			returnInfo=openAPIServiceImpl.qryCustBill(body, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/qryCustBill服务调用失败", e, this.getClass());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * qryBill:(欠费查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/QryBill")
	public String qryBill(@RequestBody QryBillReq body,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/openApi/qryBill","body>>"+body+" header>>"+JSON.toJSONString(headers), this.getClass());
		QryBillRes returnInfo=new QryBillRes();
		try {
			returnInfo.setFeeBillingCycle(new ArrayList<>());
			FeeBillingCycle feeBillingCycle= new FeeBillingCycle();
			returnInfo.getFeeBillingCycle().add(feeBillingCycle);
			feeBillingCycle.setAcctItemGroupList(new ArrayList<>());
			AcctItemGroup acctItemGroup=new AcctItemGroup();
			acctItemGroup.setAcctItemType(new ArrayList<>());
			acctItemGroup.getAcctItemType().add(new AcctItemType());
			feeBillingCycle.getAcctItemGroupList().add(acctItemGroup);
//			returnInfo=openAPIServiceImpl.qryBill(body, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/qryBill服务调用失败", e, this.getClass());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * queryBalance:(余额查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/QueryBalance")
	public String queryBalance(@RequestBody QueryBalanceReq body,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/openApi/queryBalance","body>>"+body+" header>>"+JSON.toJSONString(headers), this.getClass());
		QueryBalanceRes returnInfo=new QueryBalanceRes();
		try {
			//returnInfo.setBalanceQuery(new ArrayList<>());
			//returnInfo.getBalanceQuery().add(new BalanceQuery());
			returnInfo=openAPIServiceImpl.queryBalance(body, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/queryBalance服务调用失败", e, this.getClass());
			returnInfo.setResultCode("2001");
			returnInfo.setResultMsg(e.getMessage());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * qryBalanceRecordDetail:(余额变动明细查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/QryBalanceRecordDetail")
	public String qryBalanceRecordDetail(@RequestBody QryBalanceRecordDetailReq body,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/openApi/qryBalanceRecordDetail","body>>"
				+body.toString()+" header>>"+JSON.toJSONString(headers), this.getClass());
		QryBalanceRecordDetailRes returnInfo=new QryBalanceRecordDetailRes();
		try {
			returnInfo.setBalanceChangeList(new ArrayList<>());
			returnInfo.getBalanceChangeList().add(new BalanceChangeList());
//			returnInfo=openAPIServiceImpl.qryBalanceRecordDetail(body, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/qryBalanceRecordDetail服务调用失败", e, this.getClass());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * billingCycle:(账务周期查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @return
	 * @since V1.0.0
	 */
	@GetMapping("/BillingCycle")
	public String billingCycle(@RequestParam Map<String,Object> paramMap,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		BillingCycle body=JSON.parseObject(JSON.toJSONString(paramMap), BillingCycle.class); 
		//记录业务日志
		LogUtil.opeLog("/openApi/billingCycle","body>>"+JSON.toJSONString(paramMap,SerializerFeature.WriteMapNullValue)
			+" header>>"+JSON.toJSONString(headers), this.getClass());
		List<BillingCycle> returnInfo=new ArrayList<>();
		try {
			returnInfo.add(new BillingCycle());
//			returnInfo=openAPIServiceImpl.billingCycle(body, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/billingCycle服务调用失败", e, this.getClass());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * rechargeBalance:(余额充值服务(非卡充)). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/RechargeBalance")
	public String rechargeBalance(@RequestBody RechargeBalanceReq body,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/openApi/rechargeBalance","body>>"
				+body.toString()+" header>>"+JSON.toJSONString(headers), this.getClass());
		RechargeBalanceRes returnInfo=new RechargeBalanceRes();
		try {
			returnInfo=openAPIServiceImpl.rechargeBalance(body, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/rechargeBalance服务调用失败", e, this.getClass());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * rtBillItem:(详单查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/RtBillItem")
	public String rtBillItem(@RequestBody RtBillItemReq body,
			@RequestHeader Map<String,String> headers,HttpServletResponse response) throws IOException {
		//记录业务日志
		LogUtil.opeLog("/openApi/rtBillItem","body>>"+body.toString()
			+" header>>"+JSON.toJSONString(headers), this.getClass());
		RtBillItemRes returnInfo=new RtBillItemRes();
		try {
			returnInfo = openAPIServiceImpl.rtBillItem(body, headers,true);
			headers.forEach(response::setHeader);
		} catch (BillException err) {
			returnInfo.setResultCode(err.getErrCode());
			returnInfo.setResultMsg(err.getErrMsg());
		} catch (Exception e) {
			LogUtil.error("/openApi/rtBillItem服务调用失败", e, this.getClass());
			returnInfo.setResultCode("-1");
			returnInfo.setResultMsg(e.getMessage());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
	/**
	 * @Author WangBaoQiang
	 * @Description //充值回退服务
	 * @Date 17:04 2019/7/29
	 * @Param [body, headers, response]
	 * @return java.lang.String
	*/
	@PostMapping("/RollRechargeBalance")
	public String rollRechargeBalnce(@RequestBody RollRechargeBalanceReq body,
									 @RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/openApi/rollRechargeBalnce","body>>"+body.toString()
				+" header>>"+JSON.toJSONString(headers), this.getClass());
		RollRechargeBalanceRes returnInfo=new RollRechargeBalanceRes();
		try {
		    returnInfo.setReqServiceId("100001111101");
            returnInfo.setResultCode("0");
            returnInfo.setResultMsg("");
            returnInfo=openAPIServiceImpl.rollRechargeBalnce(body, headers);
			//returnInfo=openAPIServiceImpl.rtBillItem(body, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/rollRechargeBalnce服务调用失败", e, this.getClass());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
	@PostMapping("/test")
	public String qryInstantFeeTest(@RequestBody QryInstantFeeReq qryInstantFeeReq,
								@RequestHeader Map<String,String> headers,HttpServletResponse response) throws IOException {
		//记录业务日志
		LogUtil.opeLog("/openApi/QryInstantFee", "body>>"+qryInstantFeeReq.toString()
				+" header>>"+JSON.toJSONString(headers), this.getClass());
		QryInstantFeeRes returnInfo = new QryInstantFeeRes();
		try {
			returnInfo.setResultCode(Constant.ResultCode.OPENAPI_OK);
			returnInfo=openAPIServiceImpl.qryInstantFee(qryInstantFeeReq, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/QryInstantFee服务调用失败", e, this.getClass());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
	/**
	 * @Author WangBaoQiang
	 * @Description //详单查询不发送短信
	 * @Date 10:37 2019/9/14
	 * @Param [body, headers, response]
	 * @return java.lang.String
	*/
	@PostMapping("/RtBillItemNoSms")
	public String RtBillItemNoSms(@RequestBody RtBillItemReq body,
							 @RequestHeader Map<String,String> headers,HttpServletResponse response) throws IOException {
		//记录业务日志
		LogUtil.opeLog("/openApi/rtBillItem","body>>"+body.toString()
				+" header>>"+JSON.toJSONString(headers), this.getClass());
		RtBillItemRes returnInfo=new RtBillItemRes();
		try {
			returnInfo.setSmsBillItems(new ArrayList<>());
			returnInfo.getSmsBillItems().add(new SmsBillItem());
			returnInfo.setVoiceBillItems(new ArrayList<>());
			returnInfo.getVoiceBillItems().add(new VoiceBillItem());
			returnInfo.setIncrBillItems(new ArrayList<>());
			returnInfo.getIncrBillItems().add(new IncrBillItem());
			returnInfo.setDataBillItems(new ArrayList<>());
			returnInfo.getDataBillItems().add(new DataBillItem());
			returnInfo = openAPIServiceImpl.rtBillItem(body, headers,false);
			headers.forEach(response::setHeader);
		} catch (BillException err) {
			returnInfo.setResultCode(err.getErrCode());
			returnInfo.setResultMsg(err.getErrMsg());
		} catch (Exception e) {
			LogUtil.error("/openApi/rtBillItem服务调用失败", e, this.getClass());
			returnInfo.setResultCode("-1");
			returnInfo.setResultMsg(e.getMessage());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
}