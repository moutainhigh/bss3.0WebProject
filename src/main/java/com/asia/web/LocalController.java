package com.asia.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.LogUtil;
import com.asia.domain.localApi.QryMonthHighFeeReq;
import com.asia.domain.localApi.QryMonthHighFeeRes;
import com.asia.domain.localApi.UserMeterOrderReq;
import com.asia.domain.localApi.UserMeterOrderRes;
import com.asia.service.impl.LocalSeviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author WangBaoQiang
 * @ClassName: LocalController
 * @description: TODO
 * @date 2019/8/619:29
 * @Version 1.0
 */
@RequestMapping( value="/local",produces="application/json;charset=UTF-8")
@RestController
public class LocalController {
    @Autowired
    private LocalSeviceImpl localSevice;
    //月账高额
    @PostMapping("/queryMonthHighFee")
    public String qryMonthHighFee(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                 @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.opeLog("/local/queryMonthHighFee","body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers), this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qryMonthHighFee(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (Exception e) {
            LogUtil.error("/local/queryMonthHighFee服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setErrorCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //实时费用高额
    @PostMapping("/qryRealHighFee")
    public String qryRealHighFee(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                  @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.opeLog("/local/qryRealHighFee","body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers), this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qryRealHighFee(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (Exception e) {
            LogUtil.error("/local/queryMonthHighFee服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setErrorCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //日流量告警
    @PostMapping("/qryDataHighFlow")
    public String qryDataHighFlow(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                  @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.opeLog("/local/qryDataHighFlow","body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers), this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qryDataHighFlow(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (Exception e) {
            LogUtil.error("/local/queryMonthHighFee服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setErrorCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //累积量超出量
    @PostMapping("/qryAccuOverFlow")
    public String qryAccuOverFlow(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                  @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.opeLog("/local/qryAccuOverFlow","body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers), this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qryAccuOverFlow(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (Exception e) {
            LogUtil.error("/local/queryMonthHighFee服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setErrorCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //短信发送日志
    @PostMapping("/qrySendMsgUser")
    public String qrySendMsgUser(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                  @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.opeLog("/local/qrySendMsgUser","body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers), this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qrySendMsgUser(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (Exception e) {
            LogUtil.error("/local/queryMonthHighFee服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setErrorCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //流量标资费且有流量费用户
    @PostMapping("/qryUserFlowFee")
    public String qryUserFlowFee(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                  @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.opeLog("/local/qryUserFlowFee","body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers), this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qryUserFlowFee(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (Exception e) {
            LogUtil.error("/local/queryMonthHighFee服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setErrorCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //宽带到期提醒
    @PostMapping("/qryWlanRemain")
    public String qryWlanRemain(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                  @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.opeLog("/local/qryWlanRemain","body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers), this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qryWlanRemain(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (Exception e) {
            LogUtil.error("/local/queryMonthHighFee服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setErrorCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //累积量超出部分查询能力
    @PostMapping("/qryOverAccuFee")
    public String qryOverAccuFee(@RequestBody QryMonthHighFeeReq qryMonthHighFeeReq,
                                 @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.opeLog("/local/qryOverAccuFee","body>>"+JSON.toJSONString(qryMonthHighFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers), this.getClass());
        QryMonthHighFeeRes qryMonthHighFeeRes=new QryMonthHighFeeRes();
        try {

            qryMonthHighFeeRes = localSevice.qryOverAccuFee(qryMonthHighFeeReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (Exception e) {
            LogUtil.error("/local/queryMonthHighFee服务调用失败", e, this.getClass());
            qryMonthHighFeeRes.setErrorCode(Constant.ResultCode.ERROR);
            qryMonthHighFeeRes.setMsg(e.getMessage());
            return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
        }
        return JSON.toJSONString(qryMonthHighFeeRes, SerializerFeature.WriteMapNullValue);
    }
    //详单禁查
    @PostMapping("/userMeterOrderService")
    public String userMeterOrderService(@RequestBody UserMeterOrderReq userMeterOrderReq,
                                        @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.opeLog("/local/userMeterOrderService","body>>"+JSON.toJSONString(userMeterOrderReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers), this.getClass());
        UserMeterOrderRes userMeterOrderRes=new UserMeterOrderRes();
        try {
            userMeterOrderRes = localSevice.userMeterOrderService(userMeterOrderReq,headers);
            headers.forEach((key,val)->{response.setHeader(key, val);});
        } catch (Exception e) {
            LogUtil.error("/local/userMeterOrderService服务调用失败", e, this.getClass());
            userMeterOrderRes.setCode(Constant.ResultCode.ERROR);
            userMeterOrderRes.setMsg(e.getMessage());
            return JSON.toJSONString(userMeterOrderRes, SerializerFeature.WriteMapNullValue);
        }
        return JSON.toJSONString(userMeterOrderRes, SerializerFeature.WriteMapNullValue);
    }
}
