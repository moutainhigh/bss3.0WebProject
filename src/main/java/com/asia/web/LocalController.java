package com.asia.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.LogUtil;
import com.asia.common.utils.StringUtil;
import com.asia.domain.localApi.*;
import com.asia.internal.common.BillException;
import com.asia.internal.errcode.ErrorCodeCompEnum;
import com.asia.service.impl.Bon3ServiceImpl;
import com.asia.service.impl.LocalSeviceImpl;
import com.asiainfo.account.model.request.StdCcrRealTimeBillQueryRequest;
import com.asiainfo.account.model.response.StdCcaRealTimeBillQueryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author WangBaoQiang
 * @ClassName: LocalController
 * @description: 本地化接口
 * @date 2019/8/619:29
 * @Version 1.0
 */
@RequestMapping( value="/local",produces="application/json;charset=UTF-8")
@RestController
public class LocalController {
    private static final Logger logger = LoggerFactory.getLogger(LocalController.class);
    @Autowired
    private LocalSeviceImpl localSevice;
    @Autowired
    private Bon3ServiceImpl bon3Service;
    //月账高额
    @PostMapping("/queryMonthHighFee")
    public String qryMonthHighFee(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                 @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [queryMonthHighFee] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/queryMonthHighFee" +" body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qryMonthHighFee(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/queryMonthHighFee服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/queryMonthHighFee服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("END [queryMonthHighFee] SERVICE...", null, this.getClass());
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //实时费用高额
    @PostMapping("/qryRealHighFee")
    public String qryRealHighFee(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                  @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [qryRealHighFee] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/qryRealHighFee" +" body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qryRealHighFee(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/qryRealHighFee服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/qryRealHighFee服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("END [qryRealHighFee] SERVICE...", null, this.getClass());
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //日流量告警
    @PostMapping("/qryDataHighFlow")
    public String qryDataHighFlow(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                  @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [qryDataHighFlow] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/qryDataHighFlow" +" body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qryDataHighFlow(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/qryDataHighFlow服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/qryDataHighFlow服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("END [qryDataHighFlow] SERVICE...", null, this.getClass());
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //累积量超出量
    @PostMapping("/qryAccuOverFlow")
    public String qryAccuOverFlow(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                  @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [qryAccuOverFlow] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/qryAccuOverFlow" +" body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qryAccuOverFlow(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/qryAccuOverFlow服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/qryAccuOverFlow服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("END [qryAccuOverFlow] SERVICE...", null, this.getClass());
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //短信发送日志
    @PostMapping("/qrySendMsgUser")
    public String qrySendMsgUser(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                  @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [qrySendMsgUser] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/qrySendMsgUser" +" body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qrySendMsgUser(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/qrySendMsgUser服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/qrySendMsgUser服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("END [qrySendMsgUser] SERVICE...", null, this.getClass());
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //流量标资费且有流量费用户
    @PostMapping("/qryUserFlowFee")
    public String qryUserFlowFee(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                  @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [qryUserFlowFee] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/qryUserFlowFee" +" body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qryUserFlowFee(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/qryUserFlowFee服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/qryUserFlowFee服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("END [qryUserFlowFee] SERVICE...", null, this.getClass());
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //宽带到期提醒
    @PostMapping("/qryWlanRemain")
    public String qryWlanRemain(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                  @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [qryMonthHighFeeRes] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/qryWlanRemain" +" body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qryWlanRemain(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/qryWlanRemain服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/qryWlanRemain服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("END [qryUserFlowFee] SERVICE...", null, this.getClass());
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //累积量超出部分查询能力
    @PostMapping("/qryOverAccuFee")
    public String qryOverAccuFee(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                 @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [qryOverAccuFee] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/qryOverAccuFee" +" body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qryOverAccuFee(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/qryOverAccuFee服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/qryOverAccuFee服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("END [qryOverAccuFee] SERVICE...", null, this.getClass());
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //详单禁查
    @PostMapping("/userMeterOrderService")
    public String userMeterOrderService(@RequestBody UserMeterOrderReq userMeterOrderReq,
                                        @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [userMeterOrderService] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/userMeterOrderService" +" body>>"+JSON.toJSONString(userMeterOrderReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        UserMeterOrderRes userMeterOrderRes=new UserMeterOrderRes();
        try {
            userMeterOrderRes = localSevice.userMeterOrderService(userMeterOrderReq, headers);
            headers.forEach((key, val) -> { response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/userMeterOrderService服务调用失败"+ "body>>"+JSON.toJSONString(userMeterOrderReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            userMeterOrderRes.setResult("1");
            userMeterOrderRes.setCode(err.getErrCode());
            userMeterOrderRes.setMsg(err.getErrMsg());
            return JSON.toJSONString(userMeterOrderRes, SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            LogUtil.error("/local/userMeterOrderService服务调用失败", e, this.getClass());
            userMeterOrderRes.setResult("1");
            userMeterOrderRes.setCode(Constant.ResultCode.ERROR);
            userMeterOrderRes.setMsg(e.getMessage());
            return JSON.toJSONString(userMeterOrderRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("END [userMeterOrderService] SERVICE...", null, this.getClass());
        return JSON.toJSONString(userMeterOrderRes, SerializerFeature.WriteMapNullValue);
    }
    //详单打印
    @PostMapping("/printRecordService")
    public String printRecordService(@RequestBody MeterPrintActionReq meterPrintActionReq,
                                        @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [printRecordService] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/printRecordService" +" body>>"+JSON.toJSONString(meterPrintActionReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        MeterPrintActionRes meterPrintActionRes=new MeterPrintActionRes();
        try {
            meterPrintActionRes = localSevice.printRecordService(meterPrintActionReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/userMeterOrderService服务调用失败"+ "body>>"+JSON.toJSONString(meterPrintActionReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            meterPrintActionRes.setResult("1");
            meterPrintActionRes.setCode(err.getErrCode());
            meterPrintActionRes.setMsg(err.getErrMsg());
            return JSON.toJSONString(meterPrintActionRes, SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            LogUtil.error("/local/userMeterOrderService服务调用失败", e, this.getClass());
            meterPrintActionRes.setResult("1");
            meterPrintActionRes.setCode(Constant.ResultCode.ERROR);
            meterPrintActionRes.setMsg(e.getMessage());
            return JSON.toJSONString(meterPrintActionRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("END [printRecordService] SERVICE...", null, this.getClass());
        return JSON.toJSONString(meterPrintActionRes, SerializerFeature.WriteMapNullValue);
    }
    //协议消费金额查询
    @PostMapping("/queryAgreementConsumption")
    public String queryAgreementConsumption(@RequestBody QueryAgreementConsumptionReq queryAgreementConsumptionReq,
                                     @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [queryAgreementConsumption] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/queryAgreementConsumption" +" body>>"+JSON.toJSONString(queryAgreementConsumptionReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
         QueryAgreementConsumptionRes queryAgreementConsumptionRes=new QueryAgreementConsumptionRes();
        try {
            queryAgreementConsumptionRes = localSevice.queryAgreementConsumption(queryAgreementConsumptionReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/queryAgreementConsumption服务调用失败"+ "body>>"+JSON.toJSONString(queryAgreementConsumptionReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            queryAgreementConsumptionRes.setResult("1");
            queryAgreementConsumptionRes.setCode(err.getErrCode());
            queryAgreementConsumptionRes.setMsg(err.getErrMsg());
            return JSON.toJSONString(queryAgreementConsumptionRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            logger.error("/local/queryAgreementConsumption服务调用失败", e, this.getClass());
            queryAgreementConsumptionRes.setResult("1");
            queryAgreementConsumptionRes.setCode(Constant.ResultCode.ERROR);
            queryAgreementConsumptionRes.setMsg(e.getMessage());
            return JSON.toJSONString(queryAgreementConsumptionRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("END [queryAgreementConsumption] SERVICE...", null, this.getClass());
        return JSON.toJSONString(queryAgreementConsumptionRes, SerializerFeature.WriteMapNullValue);
    }
    //增值账单查询
    @PostMapping("/queryAddValueList")
    public String queryAddValueList(@RequestBody StdCcrRealTimeBillQueryRequest stdCcrRealTimeBillQueryRequest,
                                            @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [queryAddValueList] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/queryAddValueList" +" body>>"+JSON.toJSONString(stdCcrRealTimeBillQueryRequest,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        StdCcaRealTimeBillQueryResponse info=new StdCcaRealTimeBillQueryResponse();
        try {
            info = bon3Service.getOweList(stdCcrRealTimeBillQueryRequest,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (Exception e) {
            logger.error("/local/queryAddValueList服务调用失败", e, this.getClass());
            info.setErrorCode(Constant.ResultCode.ERROR);
            info.setErrorMsg(e.getMessage());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("END [queryAddValueList] SERVICE...", null, this.getClass());
        return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
    }


    //是否为电信号段（查号头表）
    @PostMapping("/mobileNumberQueryService")
    public String mobileNumberQueryService(@RequestBody MobileNumberQueryReq mobileNumberQueryReq,
                                           @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [mobileNumberQueryService] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/mobileNumberQueryService" +" body>>"+JSON.toJSONString(mobileNumberQueryReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        MobileNumberQueryRes info=new MobileNumberQueryRes();
        try {
            info = localSevice.moBileNumberQuery(mobileNumberQueryReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/mobileNumberQueryService服务调用失败"+ "body>>"+JSON.toJSONString(mobileNumberQueryReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            info.setResult("1");
            info.setCode(err.getErrCode());
            info.setMsg(err.getErrMsg());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            logger.error("/local/mobileNumberQueryService服务调用失败", e, this.getClass());
            info.setResult("1");
            info.setErrorCode(Constant.ResultCode.ERROR);
            info.setErrorMsg(e.getMessage());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("END [mobileNumberQueryService] SERVICE...", null, this.getClass());
        return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
    }


    //查询余额信息，返回违约金、专用账目组、专用账目组
    @PostMapping("/accountBalanceCpcpQuery")
    public String accountBalanceCpcpQuery(@RequestBody AccountBalanceCpcpQueryReq accountBalanceCpcpQueryReq,
                                           @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [accountBalanceCpcpQuery] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/accountBalanceCpcpQuery" +" body>>"+JSON.toJSONString(accountBalanceCpcpQueryReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        AccountBalanceCpcpQueryRes info=new AccountBalanceCpcpQueryRes();
        try {
            String statffId = accountBalanceCpcpQueryReq.getStaffId();
            if (StringUtil.isEmpty(statffId)) {
                throw new BillException(ErrorCodeCompEnum.STAFF_ID_IS_EMPTY);
            }
            String systemId = accountBalanceCpcpQueryReq.getSystemId();
            if (StringUtil.isEmpty(systemId)) {
                throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
            }
            info = localSevice.accountBalanceCpcpQuery(accountBalanceCpcpQueryReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/accountBalanceCpcpQuery服务调用失败"+ "body>>"+JSON.toJSONString(accountBalanceCpcpQueryReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            info.setIsSucess(err.getErrCode());
            info.setMsg(err.getErrMsg());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            logger.error("/local/accountBalanceCpcpQuery服务调用失败", e, this.getClass());
            info.setIsSucess(Constant.ResultCode.ERROR);
            info.setMsg(e.getMessage());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("END [accountBalanceCpcpQuery] SERVICE...", null, this.getClass());
        return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
    }


    //查询用户的增值账单，（三级账单递归展示）
    @PostMapping("/queryAddValueFee")
    public String queryAddValueFee(@RequestBody QueryAddValueFeeReq queryAddValueFeeReq,
                                          @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [queryAddValueFee] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/queryAddValueFee" +" body>>"+JSON.toJSONString(queryAddValueFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        QueryAddValueFeeRes info=new QueryAddValueFeeRes();
        try {
            String systemId = queryAddValueFeeReq.getStdCcrCustomizeBillQueryBill().getSystemId();
            if (StringUtil.isEmpty(systemId)) {
                throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
            }
            info = localSevice.queryAddValueFee(queryAddValueFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        }catch (BillException err) {
            LogUtil.error("/local/queryAddValueFeeReq服务调用失败"+ "body>>"+JSON.toJSONString(queryAddValueFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            info.setErrorCode(err.getErrCode());
            info.setErrorMsg(err.getMessage());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            logger.error("/local/queryAddValueFeeReq服务调用失败", e, this.getClass());
            info.setErrorCode(Constant.ResultCode.ERROR);
            info.setErrorMsg(e.getMessage());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("END [queryAddValueFee] SERVICE...", null, this.getClass());
        return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
    }


}
