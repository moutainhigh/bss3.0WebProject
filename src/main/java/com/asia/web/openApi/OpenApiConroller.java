package com.asia.web.openApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.LogUtil;
import com.asia.domain.openApi.QryBalanceRecordDetailReq;
import com.asia.domain.openApi.QryBalanceRecordDetailRes;
import com.asia.domain.openApi.QryBalanceRecordDetailRes.BalanceChangeList;
import com.asia.domain.openApi.QryBillReq;
import com.asia.domain.openApi.QryBillRes;
import com.asia.domain.openApi.QryBillRes.FeeBillingCycle;
import com.asia.domain.openApi.QryBillRes.FeeBillingCycle.AcctItemGroup;
import com.asia.domain.openApi.QryBillRes.FeeBillingCycle.AcctItemGroup.AcctItemType;
import com.asia.domain.openApi.QryCustBillReq;
import com.asia.domain.openApi.QryCustBillRes;
import com.asia.domain.openApi.QryInstantFeeListReq;
import com.asia.domain.openApi.QryInstantFeeListRes;
import com.asia.domain.openApi.QryInstantFeeListRes.ItemInformation;
import com.asia.domain.openApi.QryInstantFeeReq;
import com.asia.domain.openApi.QryInstantFeeRes;
import com.asia.domain.openApi.QryPaymentReq;
import com.asia.domain.openApi.QryPaymentRes;
import com.asia.domain.openApi.QryPaymentRes.PaymentInfo;
import com.asia.domain.openApi.QryPaymentRes.PaymentInfo.AccNbrDetail;
import com.asia.domain.openApi.QueryBalanceReq;
import com.asia.domain.openApi.QueryBalanceRes;
import com.asia.domain.openApi.QueryBalanceRes.BalanceQuery;
import com.asia.domain.openApi.RechargeBalanceReq;
import com.asia.domain.openApi.RechargeBalanceRes;
import com.asia.domain.openApi.RtBillItemReq;
import com.asia.domain.openApi.RtBillItemRes;
import com.asia.domain.openApi.RtBillItemRes.DataBillItem;
import com.asia.domain.openApi.RtBillItemRes.IncrBillItem;
import com.asia.domain.openApi.RtBillItemRes.SmsBillItem;
import com.asia.domain.openApi.RtBillItemRes.VoiceBillItem;
import com.asia.domain.openApi.child.BillingCycle;
import com.asia.service.openApi.OpenAPIServiceImpl;

/**
 * openApi服务暴漏
 * ClassName: OpenApiConroller <br/>
 * date: 2019年4月25日 下午2:46:32 <br/>
 * @author yinyanzhen
 */
@RequestMapping(value="/openApi",produces="application/json;charset=UTF-8")
@RestController
public class OpenApiConroller{
	@Autowired
	private OpenAPIServiceImpl openAPIServiceImpl;
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
//			returnInfo=openAPIServiceImpl.qryInstantFeeList(qryInstantFeeListReq, headers);
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
			returnInfo.setBalanceQuery(new ArrayList<>());
			returnInfo.getBalanceQuery().add(new BalanceQuery());
//			returnInfo=openAPIServiceImpl.queryBalance(body, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/queryBalance服务调用失败", e, this.getClass());
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
//			returnInfo=openAPIServiceImpl.rechargeBalance(body, headers);
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
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
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
//			returnInfo=openAPIServiceImpl.rtBillItem(body, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/rtBillItem服务调用失败", e, this.getClass());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
	
}