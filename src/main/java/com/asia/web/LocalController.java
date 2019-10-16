package com.asia.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.LogUtil;
import com.asia.common.utils.StringUtil;
import com.asia.domain.bon3.GetOweListReq;
import com.asia.domain.localApi.*;
import com.asia.internal.common.BillException;
import com.asia.internal.errcode.ErrorCodeCompEnum;
import com.asia.service.impl.Bon3ServiceImpl;
import com.asia.service.impl.LocalSeviceImpl;
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
                                 @RequestHeader Map<String,String> headers, HttpServletResponse response) {
        //记录业务日志
        LogUtil.debug("START [queryMonthHighFee] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/queryMonthHighFee" + " body>>" + JSON.toJSONString(qryMonthHighFeeReq, SerializerFeature.WriteMapNullValue)
                + " header>>" + JSON.toJSONString(headers), null, this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        try {
            //入参校验
            checkCommonServiceRequest(qryMonthHighFeeReq);

            qryMonthHighFeeRes = localSevice.qryMonthHighFee(qryMonthHighFeeReq, headers);
            headers.forEach((key, val) -> {
                response.setHeader(key, val);
            });
        } catch (BillException err) {
            LogUtil.error("/local/queryMonthHighFee服务调用失败" + "body>>" + JSON.toJSONString(qryMonthHighFeeReq, SerializerFeature.WriteMapNullValue)
                    + " header>>" + JSON.toJSONString(headers), err, this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            LogUtil.error("/local/queryMonthHighFee服务调用失败" + "body>>" + JSON.toJSONString(qryMonthHighFeeReq, SerializerFeature.WriteMapNullValue)
                    + " header>>" + JSON.toJSONString(headers), e, this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 qryMonthHighFeeRes=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
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
            //用户校验
            checkCommonServiceRequest(qryMonthHighFeeReq);
            qryMonthHighFeeRes = localSevice.qryRealHighFee(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/qryRealHighFee服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/qryRealHighFee服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 qryMonthHighFeeRes=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
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
            //用户校验
            checkCommonServiceRequest(qryMonthHighFeeReq);
            qryMonthHighFeeRes = localSevice.qryDataHighFlow(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/qryDataHighFlow服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/qryDataHighFlow服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 qryMonthHighFeeRes=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
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
            //用户校验
            checkCommonServiceRequest(qryMonthHighFeeReq);
            qryMonthHighFeeRes = localSevice.qryAccuOverFlow(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/qryAccuOverFlow服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/qryAccuOverFlow服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 qryMonthHighFeeRes=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
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
            //用户校验
            checkCommonServiceRequest(qryMonthHighFeeReq);
            qryMonthHighFeeRes = localSevice.qrySendMsgUser(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/qrySendMsgUser服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/qrySendMsgUser服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 qryMonthHighFeeRes=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
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
            //用户校验
            checkCommonServiceRequest(qryMonthHighFeeReq);
            qryMonthHighFeeRes = localSevice.qryUserFlowFee(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/qryUserFlowFee服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/qryUserFlowFee服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 qryMonthHighFeeRes=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
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
            //用户校验
            checkCommonServiceRequest(qryMonthHighFeeReq);
            qryMonthHighFeeRes = localSevice.qryWlanRemain(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/qryWlanRemain服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/qryWlanRemain服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 qryMonthHighFeeRes=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
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
            //用户校验
            //checkCommonServiceRequest(qryMonthHighFeeReq);
            checkQryOverAccuFeeRequest(qryMonthHighFeeReq);
            qryMonthHighFeeRes = localSevice.qryOverAccuFee(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/qryOverAccuFee服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(err.getErrCode());
            qryMonthHighFeeRes.setMsg(err.getErrMsg());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/qryOverAccuFee服务调用失败"+ "body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            LogUtil.error("输出参数[qryMonthHighFeeRes]=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 qryMonthHighFeeRes=" + JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue), null, this.getClass());
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
            //系统id
            if (StringUtil.isEmpty(userMeterOrderReq.getSystemId())) {
                throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
            }
            //查询值
            if (StringUtil.isEmpty(userMeterOrderReq.getQueryValue())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
            }
            //开通取消
            if (StringUtil.isEmpty(userMeterOrderReq.getAction())) {
                throw new BillException(ErrorCodeCompEnum.ACTION_TYPE_IS_EMPTY);
            }
            userMeterOrderRes = localSevice.userMeterOrderService(userMeterOrderReq, headers);
            headers.forEach((key, val) -> { response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/userMeterOrderService服务调用失败"+ "body>>"+JSON.toJSONString(userMeterOrderReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            userMeterOrderRes.setResult("1");
            userMeterOrderRes.setCode(err.getErrCode());
            userMeterOrderRes.setMsg(err.getErrMsg());
            LogUtil.error("输出参数[userMeterOrderRes]=" + JSON.toJSONString(userMeterOrderRes,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(userMeterOrderRes, SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            LogUtil.error("/local/userMeterOrderService服务调用失败"+ "body>>"+JSON.toJSONString(userMeterOrderReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            userMeterOrderRes.setResult("1");
            userMeterOrderRes.setCode(Constant.ResultCode.ERROR);
            userMeterOrderRes.setMsg(e.getMessage());
            LogUtil.error("输出参数[userMeterOrderRes]=" + JSON.toJSONString(userMeterOrderRes,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(userMeterOrderRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 userMeterOrderRes=" + JSON.toJSONString(userMeterOrderRes,SerializerFeature.WriteMapNullValue), null, this.getClass());
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
            if (StringUtil.isEmpty(meterPrintActionReq.getAccNbr())) {
                throw  new BillException("1","AccNbr节点元素不符合规范, AccNbr节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getSystemId())) {
                throw  new BillException("1","systemId节点元素不符合规范, systemId节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getActionType())) {
                throw new BillException("1","actionType节点元素不符合规范, actionType节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getAreaCode())) {
                throw new BillException("1", "areaCode节点元素不符合规范, areaCode节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getPrintMonth())) {
                throw new BillException("1", "printMonth节点元素不符合规范, printMonth节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getTerminalId())) {
                throw new BillException("1", "terminalId节点元素不符合规范, terminalId节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getStaffId())) {
                throw new BillException("1", "staffId节点元素不符合规范, staffId节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getSerialId())) {
                throw new BillException("1", "serialId节点元素不符合规范, serialId节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getPrintDate())) {
                throw new BillException("1", "printDate节点元素不符合规范, printDate节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getValidDate())) {
                throw new BillException("1", "validDate节点元素不符合规范, validDate节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getExpirDate())) {
                throw new BillException("1", "expirDate节点元素不符合规范, expirDate节点元素值不能null");
            }
            meterPrintActionRes = localSevice.printRecordService(meterPrintActionReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/printRecordService服务调用失败"+ "body>>"+JSON.toJSONString(meterPrintActionReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            meterPrintActionRes.setResult("1");
            meterPrintActionRes.setCode(err.getErrCode());
            meterPrintActionRes.setMsg(err.getErrMsg());
            LogUtil.error("输出参数[printRecordService]=" + JSON.toJSONString(meterPrintActionRes,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(meterPrintActionRes, SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            LogUtil.error("/local/printRecordService服务调用失败"+ "body>>"+JSON.toJSONString(meterPrintActionRes,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            meterPrintActionRes.setResult("1");
            meterPrintActionRes.setCode(Constant.ResultCode.ERROR);
            meterPrintActionRes.setMsg(e.getMessage());
            LogUtil.error("输出参数[printRecordService]=" + JSON.toJSONString(meterPrintActionRes,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(meterPrintActionRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 meterPrintActionRes=" + JSON.toJSONString(meterPrintActionRes,SerializerFeature.WriteMapNullValue), null, this.getClass());
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
            if (StringUtil.isEmpty(queryAgreementConsumptionReq.getValue())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
            }
            if (StringUtil.isEmpty(queryAgreementConsumptionReq.getSystemID())) {
                throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
            }
            queryAgreementConsumptionRes = localSevice.queryAgreementConsumption(queryAgreementConsumptionReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/queryAgreementConsumption服务调用失败"+ "body>>"+JSON.toJSONString(queryAgreementConsumptionReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            queryAgreementConsumptionRes.setResult("1");
            queryAgreementConsumptionRes.setCode(err.getErrCode());
            queryAgreementConsumptionRes.setMsg(err.getErrMsg());
            LogUtil.error("输出参数[queryAgreementConsumptionRes]=" + JSON.toJSONString(queryAgreementConsumptionReq,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(queryAgreementConsumptionRes, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/queryAgreementConsumption服务调用失败"+ "body>>"+JSON.toJSONString(queryAgreementConsumptionReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            queryAgreementConsumptionRes.setResult("1");
            queryAgreementConsumptionRes.setCode(Constant.ResultCode.ERROR);
            queryAgreementConsumptionRes.setMsg(e.getMessage());
            LogUtil.error("输出参数[queryAgreementConsumptionRes]=" + JSON.toJSONString(queryAgreementConsumptionRes,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(queryAgreementConsumptionRes, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 queryAgreementConsumptionRes=" + JSON.toJSONString(queryAgreementConsumptionRes,SerializerFeature.WriteMapNullValue), null, this.getClass());
        LogUtil.debug("END [queryAgreementConsumption] SERVICE...", null, this.getClass());
        return JSON.toJSONString(queryAgreementConsumptionRes, SerializerFeature.WriteMapNullValue);
    }
    //增值账单查询
    @PostMapping("/queryAddValueList")
    public String queryAddValueList(@RequestBody GetOweListReq stdCcrRealTimeBillQueryRequest,
                                            @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [queryAddValueList] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/queryAddValueList" +" body>>"+JSON.toJSONString(stdCcrRealTimeBillQueryRequest,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        StdCcaRealTimeBillQueryResponse info=new StdCcaRealTimeBillQueryResponse();
        try {
            //查询类型
            if (StringUtil.isEmpty(stdCcrRealTimeBillQueryRequest.getStdCcrCustomizeBillQueryBill().getQueryFlag())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_FLAG_IS_EMPTY);
            }
            //查询值类型
            if (StringUtil.isEmpty(stdCcrRealTimeBillQueryRequest.getStdCcrCustomizeBillQueryBill().getDestinationAttr())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_ATTR_IS_EMPTY);
            }
            //查询值
            if (StringUtil.isEmpty(stdCcrRealTimeBillQueryRequest.getStdCcrCustomizeBillQueryBill().getAccNbr())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
            }
            //系统id
            String systemId = stdCcrRealTimeBillQueryRequest.getSystemId();
            if (StringUtil.isEmpty(systemId)) {
                throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
            }
            info = bon3Service.getOweList(stdCcrRealTimeBillQueryRequest,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/queryAddValueList服务调用失败"+ "body>>"+JSON.toJSONString(stdCcrRealTimeBillQueryRequest,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            info.setErrorCode(err.getErrCode());
            info.setErrorMsg(err.getErrMsg());
            LogUtil.error("输出参数[StdCcaRealTimeBillQueryResponse]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/queryAddValueList服务调用失败"+ "body>>"+JSON.toJSONString(stdCcrRealTimeBillQueryRequest,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            info.setErrorCode(Constant.ResultCode.ERROR);
            info.setErrorMsg(e.getMessage());
            LogUtil.error("输出参数[StdCcaRealTimeBillQueryResponse]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 stdCcaRealTimeBillQueryResponse=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
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
            if (StringUtil.isEmpty(mobileNumberQueryReq.getSystemId())) {
                throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
            }
            if (StringUtil.isEmpty(mobileNumberQueryReq.getValue())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
            }
            info = localSevice.moBileNumberQuery(mobileNumberQueryReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (BillException err) {
            LogUtil.error("/local/mobileNumberQueryService服务调用失败"+ "body>>"+JSON.toJSONString(mobileNumberQueryReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            info.setResult("1");
            info.setCode(err.getErrCode());
            info.setMsg(err.getErrMsg());
            LogUtil.error("输出参数[mobileNumberQueryRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        }catch (Exception e) {
            LogUtil.error("/local/mobileNumberQueryService服务调用失败"+ "body>>"+JSON.toJSONString(mobileNumberQueryReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            info.setResult("1");
            info.setErrorCode(Constant.ResultCode.ERROR);
            info.setErrorMsg(e.getMessage());
            LogUtil.error("输出参数[mobileNumberQueryRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 mobileNumberQueryRes=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
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
            LogUtil.error("输出参数[accountBalanceCpcpQueryRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            LogUtil.error("/local/accountBalanceCpcpQuery服务调用失败"+ "body>>"+JSON.toJSONString(accountBalanceCpcpQueryReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            info.setIsSucess(Constant.ResultCode.ERROR);
            info.setMsg(e.getMessage());
            LogUtil.error("输出参数[accountBalanceCpcpQueryRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 accountBalanceCpcpQueryRes=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
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
            //查询类型
            if (StringUtil.isEmpty(queryAddValueFeeReq.getStdCcrCustomizeBillQueryBill().getQueryFlag())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_FLAG_IS_EMPTY);
            }
            //查询值类型
            if (StringUtil.isEmpty(queryAddValueFeeReq.getStdCcrCustomizeBillQueryBill().getDestinationAttr())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_ATTR_IS_EMPTY);
            }
            //查询值
            if (StringUtil.isEmpty(queryAddValueFeeReq.getStdCcrCustomizeBillQueryBill().getAccNbr())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
            }
            //系统id
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
            LogUtil.error("输出参数[queryAddValueFeeRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            LogUtil.error("/local/queryAddValueFeeReq服务调用失败"+ "body>>"+JSON.toJSONString(queryAddValueFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            info.setErrorCode(Constant.ResultCode.ERROR);
            info.setErrorMsg(e.getMessage());
            LogUtil.error("输出参数[queryAddValueFeeRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 queryAddValueFeeRes=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
        LogUtil.debug("END [queryAddValueFee] SERVICE...", null, this.getClass());
        return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
    }
    /**
     * @Author WangBaoQiang
     * @Description 判断本网异网，本地异地
     * @Date 20:21 2019/10/15
     * @Param [userByPhoneQueryServiceReq, headers, response]
     * @return java.lang.String
    */
    @PostMapping("/userByPhoneQueryService")
    public String userByPhoneQueryService(@RequestBody UserByPhoneQueryServiceReq userByPhoneQueryServiceReq,
                                   @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [userByPhoneQueryService] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/userByPhoneQueryService" +" body>>"+JSON.toJSONString(userByPhoneQueryServiceReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        UserByPhoneQueryServiceRes info=new UserByPhoneQueryServiceRes();
        try {
            //查询值类型
            if (StringUtil.isEmpty(userByPhoneQueryServiceReq.getAccNumType())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_ATTR_IS_EMPTY);
            }
            //查询值
            if (StringUtil.isEmpty(userByPhoneQueryServiceReq.getAccNum())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
            }
            //系统id
            String systemId = userByPhoneQueryServiceReq.getSystemId();
            if (StringUtil.isEmpty(systemId)) {
                throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
            }
            //工号
            //系统id
            String staffId = userByPhoneQueryServiceReq.getStaffId();
            if (StringUtil.isEmpty(staffId)) {
                throw new BillException(ErrorCodeCompEnum.STAFF_ID_IS_EMPTY);
            }
            info = localSevice.userByPhoneQueryService(userByPhoneQueryServiceReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        }catch (BillException err) {
            LogUtil.error("/local/userByPhoneQueryService服务调用失败"+ "body>>"+JSON.toJSONString(userByPhoneQueryServiceReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), err,this.getClass());
            info.setErrorCode(err.getErrCode());
            info.setErrorMsg(err.getMessage());
            LogUtil.error("输出参数[UserByPhoneQueryServiceRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            LogUtil.error("/local/userByPhoneQueryService服务调用失败"+ "body>>"+JSON.toJSONString(userByPhoneQueryServiceReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            info.setErrorCode(Constant.ResultCode.ERROR);
            info.setErrorMsg(e.getMessage());
            LogUtil.error("输出参数[UserByPhoneQueryServiceRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 UserByPhoneQueryServiceRes=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
        LogUtil.debug("END [userByPhoneQueryService] SERVICE...", null, this.getClass());
        return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
    }
    /**
     * @Author WangBaoQiang
     * @Description //万号通用接口的校验方法
     * @Date 21:40 2019/9/29
     * @Param [qryMonthHighFeeReq]
     * @return void
    */
    private void checkCommonServiceRequest(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq) throws BillException {
        if (StringUtil.isEmpty(qryMonthHighFeeReq.getQueryType())) {
            throw new BillException(ErrorCodeCompEnum.QUERY_FLAG_IS_EMPTY);
        }
        //查询值类型
        if (StringUtil.isEmpty(qryMonthHighFeeReq.getUserType())) {
            throw new BillException(ErrorCodeCompEnum.QUERY_ATTR_IS_EMPTY);
        }
        //查询值
        if (StringUtil.isEmpty(qryMonthHighFeeReq.getQueryValue())) {
            throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
        }
        //系统id
        String systemId = qryMonthHighFeeReq.getSystemId();
        if (StringUtil.isEmpty(systemId)) {
            throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
        }
        //按月份查询
        if ("2".equals(qryMonthHighFeeReq.getQueryTimeType())) {
            if (StringUtil.isEmpty(qryMonthHighFeeReq.getQueryMonth())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_TIME_IS_EMPTY);
            } else if (qryMonthHighFeeReq.getQueryMonth().length() != 6) {
                throw new BillException(ErrorCodeCompEnum.QUERY_TIME_IS_ILLEGAL);
            }
        }
        if ("1".equals(qryMonthHighFeeReq.getQueryTimeType())) {
            if (StringUtil.isEmpty(qryMonthHighFeeReq.getBeginDate()) ||
                    StringUtil.isEmpty(qryMonthHighFeeReq.getEndDate())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_TIME_IS_EMPTY);
            } else if (qryMonthHighFeeReq.getBeginDate().length() != 8 ||
                    qryMonthHighFeeReq.getEndDate().length() != 8 ||
                    qryMonthHighFeeReq.getBeginDate().compareTo(qryMonthHighFeeReq.getEndDate()) > 0) {
                throw new BillException(ErrorCodeCompEnum.QUERY_TIME_IS_ILLEGAL);
            }
        }
    }
    /**
     * qryOverAccuFee校验
     *
     * */
    private void checkQryOverAccuFeeRequest(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq) throws BillException {
        if (StringUtil.isEmpty(qryMonthHighFeeReq.getQueryType())) {
            throw new BillException(ErrorCodeCompEnum.QUERY_FLAG_IS_EMPTY);
        }
        //查询值类型
        if (StringUtil.isEmpty(qryMonthHighFeeReq.getUserType())) {
            throw new BillException(ErrorCodeCompEnum.QUERY_ATTR_IS_EMPTY);
        }
        //查询值
        if (StringUtil.isEmpty(qryMonthHighFeeReq.getQueryValue())) {
            throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
        }
        //系统id
        String systemId = qryMonthHighFeeReq.getSystemId();
        if (StringUtil.isEmpty(systemId)) {
            throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
        }
        //按月份查询
        if ("2".equals(qryMonthHighFeeReq.getQueryTimeType())) {
            if (StringUtil.isEmpty(qryMonthHighFeeReq.getQueryMonth())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_TIME_IS_EMPTY);
            } else if (qryMonthHighFeeReq.getQueryMonth().length() != 8) {
                throw new BillException(ErrorCodeCompEnum.QUERY_TIME_IS_ILLEGAL);
            }
        }
        if ("1".equals(qryMonthHighFeeReq.getQueryTimeType())) {
            if (StringUtil.isEmpty(qryMonthHighFeeReq.getBeginDate()) ||
                    StringUtil.isEmpty(qryMonthHighFeeReq.getEndDate())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_TIME_IS_EMPTY);
            } else if (qryMonthHighFeeReq.getBeginDate().length() != 8 ||
                    qryMonthHighFeeReq.getEndDate().length() != 8 ||
                    qryMonthHighFeeReq.getBeginDate().compareTo(qryMonthHighFeeReq.getEndDate()) > 0) {
                throw new BillException(ErrorCodeCompEnum.QUERY_TIME_IS_ILLEGAL);
            }
        }
    }

}







