package com.asia.web.openApi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.LogUtil;
import com.asia.common.utils.StringUtil;
import com.asia.domain.openApi.*;
import com.asia.domain.openApi.QryInstantFeeListRes.ItemInformation;
import com.asia.domain.openApi.child.BillingCycle;
import com.asia.domain.openApi.child.OperAttrStruct;
import com.asia.domain.openApi.child.SvcObjectStruct;
import com.asia.internal.common.BillException;
import com.asia.internal.errcode.ErrorCodeCompEnum;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
		LogUtil.info("START [QryPayment] SERVICE...",null, this.getClass());
		LogUtil.info("/openApi/QryPayment" + " body>>"+JSON.toJSONString(qryPaymentReq,SerializerFeature.WriteMapNullValue)
				+" header>>"+JSON.toJSONString(headers), null,this.getClass());
		QryPaymentRes returnInfo=new QryPaymentRes();
		try {
			//验证操作人属性
			OperAttrStruct operAttrStruct = qryPaymentReq.getOperAttrStruct();
			String[] isOperAttrStruct = isOperAttrStruct(operAttrStruct);
			if (!isOperAttrStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			// 验证操作对象属性
			SvcObjectStruct svcObjectStruct = qryPaymentReq.getSvcObjectStruct();
			String[] isSvcObjectStruct = isSvcObjectStruct(svcObjectStruct);
			if (!isSvcObjectStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			//系统标识
			String systemId = qryPaymentReq.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}
            String billingCycyId = qryPaymentReq.getBillingCycleId();
			if (StringUtil.isEmpty(billingCycyId)) {
				throw new BillException(ErrorCodeCompEnum.BILLING_CYCYLE_ERR);
			}
			returnInfo=openAPIServiceImpl.qryPayment(qryPaymentReq, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (BillException err) {
			LogUtil.error("/openApi/qryPayment服务调用失败"+ "body>>"+JSON.toJSONString(qryPaymentReq,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			returnInfo.setResultCode(err.getErrCode());
			returnInfo.setResultMsg(err.getErrMsg());
			LogUtil.error("[输出参数] qryPaymentRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		} catch (Exception e) {
			LogUtil.error("/openApi/qryPayment服务调用失败"+ "body>>"+JSON.toJSONString(qryPaymentReq,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), e,this.getClass());
			returnInfo.setResultCode(Constant.ResultCode.ERROR);
			returnInfo.setResultMsg(e.getMessage());
			LogUtil.error("[输出参数] qryPaymentRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		}
		LogUtil.info("[输出参数] qryPaymentRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue),null, this.getClass());
		LogUtil.info("END [QryPayment] SERVICE...",null, this.getClass());
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
            //验证操作人属性
            OperAttrStruct operAttrStruct = body.getOperAttrStruct();
            String[] isOperAttrStruct = isOperAttrStruct(operAttrStruct);
            if (!isOperAttrStruct[0].equals("0")) {
                throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
            }
            //系统标识
            String systemId = body.getSystemId();
            if (StringUtil.isEmpty(systemId)) {
                throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
            }
            /**
             * 查询业务类型 0：按帐户查询1：按用户查询
             */
            String queryFlag = body.getQueryFlag();
            if (StringUtil.isEmpty(queryFlag)) {
                throw new BillException(ErrorCodeCompEnum.QUERY_FLAG_IS_EMPTY);
            }
            String billingCycleId = body.getBillingCycle();
            if (StringUtil.isEmpty(billingCycleId)) {
                throw new BillException(ErrorCodeCompEnum.BILLING_CYCYLE_ERR);
            }
			returnInfo=openAPIServiceImpl.qryCustBill(body, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (BillException err) {
            LogUtil.error("/openApi/qryCustBill服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            returnInfo.setResultCode(err.getErrCode());
            returnInfo.setResultMsg(err.getErrMsg());
            LogUtil.error("[输出参数] qryCustBillRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            LogUtil.error("/openApi/qryCustBill服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            returnInfo.setResultCode(Constant.ResultCode.ERROR);
            returnInfo.setResultMsg(e.getMessage());
            LogUtil.error("[输出参数] qryCustBillRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
        }
        LogUtil.info("[输出参数] qryCustBillRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue),null, this.getClass());
        LogUtil.info("END [QryCustBill] SERVICE...",null, this.getClass());
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
		LogUtil.info("START [QryBill] SERVICE...",null, this.getClass());
		LogUtil.info("/openApi/QryBill" +"body>>"+body+" header>>"+JSON.toJSONString(headers), null,this.getClass());
		QryBillRes returnInfo=new QryBillRes();
        try {
            //验证操作人属性
            OperAttrStruct operAttrStruct = body.getOperAttrStruct();
            String[] isOperAttrStruct = isOperAttrStruct(operAttrStruct);
            if (!isOperAttrStruct[0].equals("0")) {
                throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
            }
            //系统标识
            String systemId = body.getSystemId();
            if (StringUtil.isEmpty(systemId)) {
                throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
            }
            if (StringUtil.isEmpty(body.getFeeQueryFlag())) {
				throw new BillException(ErrorCodeCompEnum.FEE_QRY_FLAG_IS_EMPTY);
			}
            if (StringUtil.isEmpty(body.getDestinationAttr())) {
				throw new BillException(ErrorCodeCompEnum.QUERY_ATTR_IS_EMPTY);
            }
            /**
             * 查询业务类型 0：按帐户查询1：按用户查询
             */
            Integer queryFlag = body.getQueryFlag();
            if (StringUtil.isEmpty(queryFlag)) {
                throw new BillException(ErrorCodeCompEnum.QUERY_FLAG_IS_EMPTY);
            }

            returnInfo=openAPIServiceImpl.qryBill(body, headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/openApi/QryBill服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            returnInfo.setResultCode(err.getErrCode());
            returnInfo.setResultMsg(err.getErrMsg());
            LogUtil.error("[输出参数] qryBillRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            LogUtil.error("/openApi/QryBill服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            returnInfo.setResultCode(Constant.ResultCode.ERROR);
            returnInfo.setResultMsg(e.getMessage());
            LogUtil.error("[输出参数] qryBillRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
        }
        LogUtil.info("[输出参数] qryBillRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue),null, this.getClass());
        LogUtil.info("END [QryBill] SERVICE...",null, this.getClass());
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
		LogUtil.info("START [queryBalance] SERVICE...",null, this.getClass());
		LogUtil.info("/openApi/queryBalance" +"body>>"+body+" header>>"+JSON.toJSONString(headers), null,this.getClass());
		QueryBalanceRes returnInfo=new QueryBalanceRes();
		try {
			//验证操作人属性
			OperAttrStruct operAttrStruct = body.getOperAttrStruct();
			String[] isOperAttrStruct = isOperAttrStruct(operAttrStruct);
			if (!isOperAttrStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			// 验证操作对象属性
			SvcObjectStruct svcObjectStruct = body.getSvcObjectStruct();
			String[] isSvcObjectStruct = isSvcObjectStruct(svcObjectStruct);
			if (!isSvcObjectStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			//系统标识
			String systemId = body.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}
			/**
			 * 查询业务类型 0：按帐户查询1：按用户查询
			 */
			String queryFlag = body.getQueryFlag();
			if (StringUtil.isEmpty(queryFlag)) {
				throw new BillException(ErrorCodeCompEnum.QUERY_FLAG_IS_EMPTY);
			}
			returnInfo = openAPIServiceImpl.queryBalance(body, headers);
			headers.forEach((key, val) -> {
				response.setHeader(key, val);
			});
		} catch (BillException err) {
			LogUtil.error("/openApi/queryBalance服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			returnInfo.setResultCode(err.getErrCode());
			returnInfo.setResultMsg(err.getErrMsg());
			LogUtil.error("输出参数[queryBalanceRes]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		} catch (Exception e) {
			LogUtil.error("/openApi/queryBalance服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), e,this.getClass());
			returnInfo.setResultCode(Constant.ResultCode.ERROR);
			returnInfo.setResultMsg(e.getMessage());
			LogUtil.error("输出参数[queryBalanceRes]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		}
		LogUtil.info("[输出参数] queryBalanceRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue),null, this.getClass());
		LogUtil.info("END [queryBalance] SERVICE...",null, this.getClass());
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
			//验证操作人属性
			OperAttrStruct operAttrStruct = body.getOperAttrStruct();
			String[] isOperAttrStruct = isOperAttrStruct(operAttrStruct);
			if (!isOperAttrStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			// 验证操作对象属性
			SvcObjectStruct svcObjectStruct = body.getSvcObjectStruct();
			String[] isSvcObjectStruct = isSvcObjectStruct(svcObjectStruct);
			if (!isSvcObjectStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			//系统标识
			String systemId = body.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}
			//账期
			String billingCycleId = body.getBillingCycleId();
			if (StringUtil.isEmpty(billingCycleId)) {
				throw new BillException(ErrorCodeCompEnum.BILLING_CYCYLE_ERR);
			}
			returnInfo=openAPIServiceImpl.qryBalanceRecordDetail(body, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (BillException err) {
			LogUtil.error("/openApi/qryBalanceRecordDetail服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			returnInfo.setResultCode(err.getErrCode());
			returnInfo.setResultMsg(err.getErrMsg());
			LogUtil.error("输出参数[qryBalanceRecordDetailRes]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		} catch (Exception e) {
			LogUtil.error("/openApi/qryBalanceRecordDetail服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), null,this.getClass());
			returnInfo.setResultCode(Constant.ResultCode.ERROR);
			returnInfo.setResultMsg(e.getMessage());
			LogUtil.error("输出参数[qryBalanceRecordDetailRes]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		}
		LogUtil.info("[输出参数] qryBalanceRecordDetailRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue),null, this.getClass());
		LogUtil.info("END [qryBalanceRecordDetail] SERVICE...",null, this.getClass());
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
		LogUtil.info("START [RechargeBalance] SERVICE...",null, this.getClass());
		LogUtil.info("/openApi/rechargeBalance" + " body>>"
				+body.toString()+" header>>"+JSON.toJSONString(headers), null,this.getClass());
		RechargeBalanceRes returnInfo=new RechargeBalanceRes();
		try {
		    //验证操作人属性
            OperAttrStruct operAttrStruct = body.getOperAttrStruct();
            String[] isOperAttrStruct = isOperAttrStruct(operAttrStruct);
            if (!isOperAttrStruct[0].equals("0")) {
                String errinfo = isOperAttrStruct[1];
                LogUtil.error(errinfo, null, this.getClass());
                throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
            }
            // 验证操作对象属性
            SvcObjectStruct svcObjectStruct = body.getSvcObjectStruct();
            String[] isSvcObjectStruct = isSvcObjectStruct(svcObjectStruct);
            if (!isSvcObjectStruct[0].equals("0")) {
                String errinfo = isSvcObjectStruct[1];
                LogUtil.error(errinfo, null, this.getClass());
                throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
            }
            //充值请求流水
            String flowId = body.getFlowId();
            if (StringUtil.isEmpty(flowId)) {
                String errinfo = "充值请求流水[flowId]字段不能为空，请重新输入！";
                LogUtil.error(errinfo, null, this.getClass());
                throw new BillException(ErrorCodeCompEnum.OHTER_PAYMENT_IS_EMPTY);
            }
            if (flowId.length() > 50) {
                String errinfo = "充值请求流水[flowId=" + flowId + "]不能超过50位，请重新输入！";
                LogUtil.error(errinfo, null, this.getClass());
                throw new BillException(ErrorCodeCompEnum.OHTER_PAYMENT_IS_OUTRANGE);
            }
            //充值量验证
            Integer rechargeAmount = body.getRechargeAmount();
            if (StringUtil.isEmpty(rechargeAmount)) {
                String errinfo = "充值量[rechargeAmount]字段不能为空，请重新输入！";
                LogUtil.error(errinfo, null, this.getClass());
                throw new BillException(ErrorCodeCompEnum.OHTER_PAYMENT_CHARGE_IS_EMPTY);
            }
            if (rechargeAmount <= 0) {
                String errinfo = "缴费金额[rechargeAmount=" + rechargeAmount + "]不能小于等于0";
                LogUtil.error(errinfo, null, this.getClass());
                throw new BillException(ErrorCodeCompEnum.OHTER_PAYMENT_CHARGE_IS_NEG);
            }
            //充值量单位验证 0– 分（金额） 1– 分钟（时长） 2– 次数 3– 流量（KB)
            String rechargeUnit = body.getRechargeUnit();
            if (rechargeUnit != null && !"".equals(rechargeUnit)) {
                if (!("0".equals(rechargeUnit) || "1".equals(rechargeUnit) || "2".equals(rechargeUnit)
                        || "3".equals(rechargeUnit))) {
                    String errinfo = "充值量单位类型[rechargeUnit=" + rechargeUnit + "]错误，请重新输入";
                    LogUtil.error(errinfo, null, this.getClass());
                    throw new BillException(ErrorCodeCompEnum.OHTER_PAYMENT_UNIT_WRONG);
                }
            }
            //充值请求来源
            String rechargeSource = body.getRechargeSource();
            if (rechargeSource == null || "".equals(rechargeSource)) {
                String errinfo = "充值请求来源[rechargeSource]不能为空，请重新输入";
                LogUtil.error(errinfo, null, this.getClass());
                throw new BillException(ErrorCodeCompEnum.OHTER_PAYMENT_CHARGE_RESOURCE);
            }
            //验证系统id
			String systemId = body.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
                String errinfo = "充值系统标识[systemId]不能为空，请重新输入！";
                LogUtil.error(errinfo, null, this.getClass());
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}
			//vc充值需要传入卡号
			if ("4102".equals(systemId)) {
				String cardNo = body.getCardNo();
				StringUtil.isEmpty(cardNo);
				String errinfo = "充值卡号[cardNo]不能为空，请重新输入！";
				LogUtil.error(errinfo, null, this.getClass());
				throw new BillException(ErrorCodeCompEnum.CARD_NO_ERROR);
			}
			returnInfo=openAPIServiceImpl.rechargeBalance(body, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (BillException err){
			LogUtil.error("/openApi/rechargeBalance服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			returnInfo.setResultCode(err.getErrCode());
			returnInfo.setResultMsg(err.getErrMsg());
			LogUtil.error("输出参数[rechargeBalanceRes]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		}catch (Exception e) {
			LogUtil.error("/openApi/rechargeBalance服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), e,this.getClass());
			returnInfo.setResultCode(Constant.ResultCode.ERROR);
			returnInfo.setResultMsg(e.getMessage());
			LogUtil.error("输出参数[rechargeBalanceRes]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		}
		returnInfo.setFlowId(body.getFlowId());
        LogUtil.info("[输出参数] rechargeBalanceRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue),null, this.getClass());
		LogUtil.info("END [RechargeBalance] SERVICE...",null, this.getClass());
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
		LogUtil.info("START [RtBillItem] SERVICE...",null, this.getClass());
		LogUtil.info("/openApi/rtBillItem" + " body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
			+" header>>"+JSON.toJSONString(headers), null,this.getClass());
		RtBillItemRes returnInfo=new RtBillItemRes();
		try {
			//验证操作人属性
			OperAttrStruct operAttrStruct = body.getOperAttrStruct();
			String[] isOperAttrStruct = isOperAttrStruct(operAttrStruct);
			if (!isOperAttrStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			// 验证操作对象属性
			SvcObjectStruct svcObjectStruct = body.getSvcObjectStruct();
			String[] isSvcObjectStruct = isSvcObjectStruct(svcObjectStruct);
			if (!isSvcObjectStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			//验证系统id
			String systemId = body.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}
			//验证查询类型
			if (body.getQryType() == null||"".equals(body.getQryType())) {
				throw new BillException(ErrorCodeCompEnum.QRY_TYPE_IS_EMPTY);
			}
			returnInfo = openAPIServiceImpl.rtBillItem(body, headers,true);
			headers.forEach(response::setHeader);
		} catch (BillException err) {
			LogUtil.error("/openApi/rtBillItem服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			returnInfo.setResultCode(err.getErrCode());
			returnInfo.setResultMsg(err.getErrMsg());
			LogUtil.error("输出参数[RtBillItemRes]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		} catch (Exception e) {
			LogUtil.error("/openApi/rtBillItem服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), e,this.getClass());
			returnInfo.setResultCode(Constant.ResultCode.ERROR);
			returnInfo.setResultMsg(e.getMessage());
			LogUtil.error("输出参数[RtBillItemRes]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		}
		LogUtil.info("[输出参数] rtBillItemRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue),null, this.getClass());
		LogUtil.info("END [RtBillItem] SERVICE...",null, this.getClass());
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
		LogUtil.info("START [RollRechargeBalance] SERVICE...",null, this.getClass());
		LogUtil.info("/openApi/RollRechargeBalance" + " body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
				+" header>>"+JSON.toJSONString(headers), null,this.getClass());
		RollRechargeBalanceRes returnInfo=new RollRechargeBalanceRes();
        String errinfo = "";
		try {
            //验证操作人属性
            OperAttrStruct operAttrStruct = body.getOperAttrStruct();
            String[] isOperAttrStruct = isOperAttrStruct(operAttrStruct);
            if (!isOperAttrStruct[0].equals("0")) {
                errinfo = isOperAttrStruct[1];
                LogUtil.error(errinfo+ "---请求参数[rollRechargeBalanceRequest]=" + body.toString(), null, this.getClass());
                throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
            }
            // 验证原充值请求流水号
            if (StringUtil.isEmpty(body.getSrcServiceId())) {
                errinfo = "原充值请求流水号[SrcServiceId]不能为空";
                LogUtil.error(errinfo + "---请求参数[rollRechargeBalanceRequest]=" + body.toString(), null, this.getClass());
                throw new BillException(ErrorCodeCompEnum.OHTER_PAYMENT_IS_EMPTY);
            }
            // 验证余额充值回退请求流水号
            if (StringUtil.isEmpty(body.getReqServiceId())) {
                errinfo = "余额充值回退请求流水号[ReqServiceId]不能为空";
                LogUtil.error(errinfo + "---请求参数[rollRechargeBalanceRequest]=" + body.toString(), null, this.getClass());
                throw new BillException(ErrorCodeCompEnum.OHTER_PAYMENT_IS_EMPTY);
            }
            //判断号码是否异常
            String destinationAccount = body.getDestinationAccount();
            if(StringUtil.isEmpty(destinationAccount)){
                errinfo = "被充值用户的标识[destinationAccount]不能为空";
                LogUtil.error(errinfo+"---请求参数[rollRechargeBalanceRequest]="+ body.toString(), null, this.getClass());
                throw new BillException(ErrorCodeCompEnum.OHTER_PAYMENT_ATTR_EMPTY);
            }
            Integer destinationAttr = body.getDestinationAttr();
            if(destinationAttr==0){
                String substring = destinationAccount.substring(0, 1);
                if(!"0".equals(substring)){
                    errinfo = "被充值用户的标识[destinationAccount]固话号码异常";
                    LogUtil.error(errinfo+"---请求参数[rollRechargeBalanceRequest]="+ body.toString(), null, this.getClass());
                    throw new BillException(ErrorCodeCompEnum.OHTER_PAYMENT_ATTR_ILLEGAL);
                }
            }
			String systemId = body.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
				errinfo = "系统来源ID[SystemId]字段不能为空";
				LogUtil.error(errinfo+"---请求参数[rollRechargeBalanceRequest]="+ body.toString(), null, this.getClass());
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}
            returnInfo=openAPIServiceImpl.rollRechargeBalnce(body, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (BillException err){
			LogUtil.error("/openApi/rollRechargeBalnce服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			returnInfo.setResultCode(err.getErrCode());
			returnInfo.setResultMsg(err.getErrMsg());
			LogUtil.error("输出参数[rollRechargeBalanceRes]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		}catch (Exception e) {
			LogUtil.error("/openApi/rollRechargeBalnce服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), e,this.getClass());
			returnInfo.setResultCode(Constant.ResultCode.ERROR);
			returnInfo.setResultMsg(e.getMessage());
			LogUtil.error("输出参数[rollRechargeBalanceRes]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		}
        LogUtil.info("[输出参数] rollRechargeBalanceRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue),null, this.getClass());
		LogUtil.info("END [RollRechargeBalance] SERVICE...",null, this.getClass());
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
		LogUtil.info("START [RtBillItemNoSms] SERVICE...",null, this.getClass());
		LogUtil.info("/openApi/RtBillItemNoSms" +" body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
				+" header>>"+JSON.toJSONString(headers),null, this.getClass());
		RtBillItemRes returnInfo=new RtBillItemRes();
		try {
			//验证操作人属性
			OperAttrStruct operAttrStruct = body.getOperAttrStruct();
			String[] isOperAttrStruct = isOperAttrStruct(operAttrStruct);
			if (!isOperAttrStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			// 验证操作对象属性
			SvcObjectStruct svcObjectStruct = body.getSvcObjectStruct();
			String[] isSvcObjectStruct = isSvcObjectStruct(svcObjectStruct);
			if (!isSvcObjectStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			//验证系统id
			String systemId = body.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}
			//验证查询类型
			if (body.getQryType() == null||"".equals(body.getQryType())) {
				throw new BillException(ErrorCodeCompEnum.QRY_TYPE_IS_EMPTY);
			}
			returnInfo = openAPIServiceImpl.rtBillItem(body, headers,false);
			headers.forEach(response::setHeader);
		} catch (BillException err) {
			LogUtil.error("/openApi/rtBillItemNoSms服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			returnInfo.setResultCode(err.getErrCode());
			returnInfo.setResultMsg(err.getErrMsg());
			LogUtil.error("输出参数[RtBillItemRes]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), err, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		} catch (Exception e) {
			LogUtil.error("/openApi/rtBillItemNoSms服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), e,this.getClass());
			returnInfo.setResultCode(Constant.ResultCode.ERROR);
			returnInfo.setResultMsg(e.getMessage());
			LogUtil.error("输出参数[RtBillItemRes]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), e, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		}
        LogUtil.info("[输出参数] rtBillItemRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue),null, this.getClass());
		LogUtil.info("END [RtBillItemNoSms] SERVICE...",null, this.getClass());
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}


    /**
     * QryReturnBalanceDetail:(话费返还记录查询). <br/>
     * @author Chenjian
     * @param body
     * @param headers
     * @param response
     * @return
     * @since V1.0.0
     */
    @PostMapping("/QryReturnBalanceDetail")
    public String QryReturnBalanceDetail(@RequestBody QryReturnBalanceDetailReq body,
                              @RequestHeader Map<String,String> headers,HttpServletResponse response){
        //记录业务日志
		LogUtil.info("START [QryReturnBalanceDetail] SERVICE...",null, this.getClass());
		LogUtil.info("/openApi/QryReturnBalanceDetail" +" body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
				+" header>>"+JSON.toJSONString(headers),null, this.getClass());
		QryReturnBalanceDetailRes returnInfo=new QryReturnBalanceDetailRes();
        try {
			//验证操作人属性
			OperAttrStruct operAttrStruct = body.getOperAttrStruct();
			String[] isOperAttrStruct = isOperAttrStruct(operAttrStruct);
			if (!isOperAttrStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			// 验证操作对象属性
			SvcObjectStruct svcObjectStruct = body.getSvcObjectStruct();
			String[] isSvcObjectStruct = isSvcObjectStruct(svcObjectStruct);
			if (!isSvcObjectStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			String systemId = body.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}
			returnInfo=openAPIServiceImpl.qryReturnBalanceDetail(body, headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
			LogUtil.error("/openApi/QryReturnBalanceDetail服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			returnInfo.setResultCode(err.getErrCode());
			returnInfo.setResultMsg(err.getErrMsg());
			LogUtil.error("输出参数[qryReturnBalanceDetailRes]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), err, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		} catch (Exception e) {
			LogUtil.error("/openApi/QryReturnBalanceDetail服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), e,this.getClass());
			returnInfo.setResultCode(Constant.ResultCode.ERROR);
			returnInfo.setResultMsg(e.getMessage());
			LogUtil.error("输出参数[qryReturnBalanceDetailRes]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), e, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		}
		LogUtil.info("[输出参数] qryReturnBalanceDetailRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue),null, this.getClass());
		LogUtil.info("END [QryReturnBalanceDetail] SERVICE...",null, this.getClass());
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
    }


    /**
     * QryReturnBalanceInfoDetail:(话费返还记录明细查询). <br/>
     * @author Chenjian
     * @param body
     * @param headers
     * @param response
     * @return
     * @since V1.0.0
     */
    @PostMapping("/QryReturnBalanceInfoDetail")
    public String QryReturnBalanceInfoDetail(@RequestBody QryReturnBalanceDetailInfoReq body,
                                         @RequestHeader Map<String,String> headers,HttpServletResponse response){
        //记录业务日志
		LogUtil.info("START [QryReturnBalanceInfoDetail] SERVICE...",null, this.getClass());
		LogUtil.info("/openApi/QryReturnBalanceInfoDetail" +" body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
				+" header>>"+JSON.toJSONString(headers),null, this.getClass());
		QryReturnBalanceDetailInfoRes returnInfo=new QryReturnBalanceDetailInfoRes();
        try {
			//验证操作人属性
			OperAttrStruct operAttrStruct = body.getOperAttrStruct();
			String[] isOperAttrStruct = isOperAttrStruct(operAttrStruct);
			if (!isOperAttrStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			// 验证操作对象属性
			SvcObjectStruct svcObjectStruct = body.getSvcObjectStruct();
			String[] isSvcObjectStruct = isSvcObjectStruct(svcObjectStruct);
			if (!isSvcObjectStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			String systemId = body.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}
            returnInfo=openAPIServiceImpl.qryReturnBalanceInfoDetail(body, headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
			LogUtil.error("/openApi/QryReturnBalanceInfoDetail服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			returnInfo.setResultCode(err.getErrCode());
			returnInfo.setResultMsg(err.getErrMsg());
			LogUtil.error("输出参数[qryReturnBalanceDetailRes]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), err, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		} catch (Exception e) {
			LogUtil.error("/openApi/QryReturnBalanceInfoDetail服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), e,this.getClass());
			returnInfo.setResultCode(Constant.ResultCode.ERROR);
			returnInfo.setResultMsg(e.getMessage());
			LogUtil.error("[输出参数] QryReturnBalanceInfoDetailRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), e, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		}
		LogUtil.info("[输出参数] QryReturnBalanceInfoDetailRes=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue),null, this.getClass());
		LogUtil.info("END [QryReturnBalanceInfoDetail] SERVICE...",null, this.getClass());
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
    }

    /**
     * QryBalanceRecord:(余额变动汇总查询). <br/>
     * @author Chenjian
     * @param body
     * @param headers
     * @param response
     * @return
     * @since V1.0.0
     */
    @PostMapping("/QryBalanceRecord")
    public String QryBalanceRecord(@RequestBody QryBalanceRecordReq body,
                                         @RequestHeader Map<String,String> headers,HttpServletResponse response){
        //记录业务日志
		LogUtil.info("START [QryBalanceRecord] SERVICE...",null, this.getClass());
		LogUtil.info("/openApi/QryBalanceRecord" +" body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
				+" header>>"+JSON.toJSONString(headers),null, this.getClass());
        QryBalanceRecordRes returnInfo=new QryBalanceRecordRes();
        try {
			//验证操作人属性
			OperAttrStruct operAttrStruct = body.getOperAttrStruct();
			String[] isOperAttrStruct = isOperAttrStruct(operAttrStruct);
			if (!isOperAttrStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			// 验证操作对象属性
			SvcObjectStruct svcObjectStruct = body.getSvcObjectStruct();
			String[] isSvcObjectStruct = isSvcObjectStruct(svcObjectStruct);
			if (!isSvcObjectStruct[0].equals("0")) {
				throw new BillException(isOperAttrStruct[0], isOperAttrStruct[1]);
			}
			String systemId = body.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}
            returnInfo=openAPIServiceImpl.qryBalanceRecord(body, headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
			LogUtil.error("/openApi/QryBalanceRecord服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			returnInfo.setResultCode(err.getErrCode());
			returnInfo.setResultMsg(err.getErrMsg());
			LogUtil.error("输出参数[qryBalanceRecordReq]=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), err, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		} catch (Exception e) {
			LogUtil.error("/openApi/QryBalanceRecord服务调用失败"+ "body>>"+JSON.toJSONString(body,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), e,this.getClass());
			returnInfo.setResultCode(Constant.ResultCode.ERROR);
			returnInfo.setResultMsg(e.getMessage());
			LogUtil.error("[输出参数] qryBalanceRecordReq=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue), e, this.getClass());
			return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
		}
		LogUtil.info("[输出参数] qryBalanceRecordReq=" + JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue),null, this.getClass());
		LogUtil.info("END [QryBalanceRecord] SERVICE...",null, this.getClass());
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
    }
    /**
     * 判断操作人属性是否符合规则
     * @param operAttrStruct
     * @return
     */
    public String[] isOperAttrStruct(OperAttrStruct operAttrStruct){
        String[] result=new String[2];
        if(operAttrStruct==null){
            result[0]="";
            result[1]="操作人属性[operAttrStruct]不能为空，请重新输入";
            return result;
        }

        //操作工号标识
        Integer staffId =operAttrStruct.getStaffId();
        if(staffId==null){
            result[0]="1002";
            result[1]="操作工号标识[staffId]字段不能为空，请重新输入";
            return result;
        }
        //操作组织标识
//		Integer operOrgId=operAttrStruct.getOperOrgId();
//		if(operOrgId==null){
//			result[0]="1002";
//			result[1]="操作组织标识[operOrgId]字段不能为空，请重新输入";
//			return result;
//		}
        result[0]="0";
        result[1]="";
        return result;
    }
    /**
     * 判断服务条件对象是否符合规则
     * @param svcObjectStruct
     * @return
     * 		result[0] 错误码
     * 		result[1] 错误信息
     */
    public String[] isSvcObjectStruct(SvcObjectStruct svcObjectStruct){
        String[] result=new String[2];

        if(svcObjectStruct==null){
            result[0]="";
            result[1]="服务条件对象[svcObjectStruct]不能为空，请重新输入";
            return result;
        }

        //对象类型 1-帐户标识 2-用户标识 3-用户号码 4-客户标识 5-销售品实例
        String objType=svcObjectStruct.getObjType();
        if(objType==null||"".equals(objType)){
            result[0]="1002";
            result[1]="对象类型[objType]字段不能为空，请重新输入";
            return result;
        }else if(!("1".equals(objType)||"2".equals(objType)||"3".equals(objType)||"4".equals(objType)||"5".equals(objType))){
            result[0]="1000";
            result[1]="对象类型[objType]输入有误，请重新输入";
            return result;
        }

        //对象值 如果是用户号码且用户号码属性为固话、宽带时，此值要求带区号，含0
        String objValue=svcObjectStruct.getObjValue();
        if(objValue==null||"".equals(objValue)){
            result[0]="1002";
            result[1]="对象值[objValue]字段不能为空，请重新输入";
            return result;
        }

        //用户号码属性,仅当对象类型为3时，有效   0-固话 1-小灵通 2-移动 3-宽带 4-智能公话 5-互联星空 6-天翼高清 99-未知
        String objAttr=svcObjectStruct.getObjAttr();
        if("3".equals(objType)){
            if(objAttr==null||"".equals(objAttr)){
                result[0]="1002";
                result[1]="用户号码属性[objAttr]字段不能为空，请重新输入";
                return result;
            }else if(!("0".equals(objType)||"1".equals(objType)||"2".equals(objType)||"3".equals(objType)||"4".equals(objType)
                    ||"5".equals(objType)||"6".equals(objType)||"99".equals(objType))){
                result[0]="1000";
                result[1]="用户号码属性[objAttr]输入有误，请重新输入";
                return result;
            }
        }
        /*if("2".equals(objAttr)&&!numberPhone(objValue)){
            result[0]="1011";
            result[1]="号码[objType]字段不符合规则，请重新输入";
            return result;
        }*/
        //数据范围 1-按帐户范围 2-按用户范围 3-按客户范围 4-按销售品范围
        String dataArea=svcObjectStruct.getDataArea();
        if(!(dataArea==null||"".equals(dataArea))){
            if(!("1".equals(dataArea)||"2".equals(dataArea)||"3".equals(dataArea)||"4".equals(dataArea))){
                result[0]="1000";
                result[1]="数据范围[dataArea]输入有误，请重新输入";
                return result;
            }
        }

        result[0]="0";
        result[1]="";
        return result;
    }
    /**
     * 判断手机号是否符合规则
     *
     * @param nbr
     *            手机号
     * @return boolean
     */
    public static boolean numberPhone(String nbr) {
        String phone = nbr;
        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9])|(19[0,5-9]))\\d{8}$";
        if (phone.length() != 11) {
            return false;
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            boolean isMatch = m.matches();
            if (isMatch) {
                return true;
            } else {
                return false;
            }
        }
    }
}