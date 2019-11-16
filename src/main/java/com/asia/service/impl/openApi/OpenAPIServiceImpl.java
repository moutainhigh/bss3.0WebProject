package com.asia.service.impl.openApi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.AcctApiUrl;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.HttpUtil;
import com.asia.common.utils.HttpUtil.HttpResult;
import com.asia.common.utils.LogUtil;
import com.asia.common.utils.StringUtil;
import com.asia.dao.OrclCommonDao;
import com.asia.domain.bon3.GetOweListReq;
import com.asia.domain.bon3.GetOweListReq.StdCcrCustomizeBillQueryBill;
import com.asia.domain.bon3.StdCcrQueryServReq;
import com.asia.domain.bon3.StdCcrQueryServRes;
import com.asia.domain.bon3.StdCcrQueryServRes.StdCcaQueryServResBean.StdCcaQueryServListBean;
import com.asia.domain.bon3.StdCcrUserResourceQuery;
import com.asia.domain.bon3.StdCcrUserResourceQuery.StdCcrUserResourceQueryBean;
import com.asia.domain.bon3.StdCcrUserResourceQuery.StdCcrUserResourceQueryBean.ResourceInformationBean;
import com.asia.domain.openApi.*;
import com.asia.domain.openApi.PointInfoQryFroBillApiRes.ContractRootClass.ResponseMess;
import com.asia.domain.openApi.QryForeignBillRes.DataBean;
import com.asia.domain.openApi.QryForeignBillRes.DataBean.*;
import com.asia.domain.openApi.QryForeignBillRes.DataBean.BillConsumeInfo.EchartsDataBeanBean;
import com.asia.domain.openApi.QryJTBillInfoRes.DataBean.ArrearsBean;
import com.asia.domain.openApi.RtBillItemRes.DataBillItem;
import com.asia.domain.openApi.RtBillItemRes.VoiceBillItem;
import com.asia.domain.openApi.child.BillingCycle;
import com.asia.domain.openApi.child.SvcObjectStruct;
import com.asia.domain.plcaApi.OtherRemindReq;
import com.asia.domain.plcaApi.OtherRemindReq.MsgInfoBean;
import com.asia.domain.plcaApi.OtherRemindRes;
import com.asia.internal.common.BillException;
import com.asia.internal.common.CommonUserInfo;
import com.asia.internal.common.ResultInfo;
import com.asia.internal.errcode.ErrorCodeCompEnum;
import com.asia.internal.errcode.ErrorCodePublicEnum;
import com.asia.mapper.orclmapper.IfUserMeterMapper;
import com.asia.mapper.ordmapper.IntfServCustChangeContrastMapper;
import com.asia.service.impl.Bon3ServiceImpl;
import com.asiainfo.account.model.domain.StdCcrQueryServ;
import com.asiainfo.account.model.response.StdCcaUserResourceQueryResponse;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 * 服务调用层,但本处不涉及事务
 * ClassName: OpenAPIServiceImpl <br/>
 * date: 2019年4月23日 下午8:29:42 <br/>
 *
 * @author yinyanzhen
 */
@Service
public class OpenAPIServiceImpl {


    /**
     * qryInstantFee:(实时话费查询). <br/>
     *
     * @author yinyanzhen
     * @param body
     * @param headers
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @since V1.0.0
     */
    @Autowired
    OrclCommonDao orclCommonDao;
    @Autowired
    private Bon3ServiceImpl bon3Service;
    @Autowired
    private IntfServCustChangeContrastMapper intfServCustChangeContrastDao;
    @Autowired
    CommonUserInfo commonUserInfo;
    @Autowired
    IfUserMeterMapper ifUserMeterMapperDao;
    @Autowired
    AcctApiUrl acctApiUrl;

    public QryInstantFeeRes qryInstantFee(QryInstantFeeReq qryInstantFeeReq, Map<String, String> headers)
            throws ClientProtocolException, IOException {
        HttpResult result = HttpUtil.doPostJson(Constant.OpenApi.qryInstantFee, qryInstantFeeReq.toString(), headers);
        //状态码为请求成功
        if (result.getCode() == HttpStatus.SC_OK) {
            headers.clear();
            headers.putAll(result.getHeaders());
            return JSON.parseObject(result.getData(), QryInstantFeeRes.class);
        } else {
            return new QryInstantFeeRes();
        }
    }

    /**
     * qryInstantFeeList:(实时话费明细查询). <br/>
     *
     * @param body
     * @param headers
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @author yinyanzhen
     * @since V1.0.0
     */
    public QryInstantFeeListRes qryInstantFeeList(QryInstantFeeListReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException {
        HttpResult result = HttpUtil.doPostJson(Constant.OpenApi.qryInstantFeeList, body.toString(), headers);
        //状态码为请求成功
        if (result.getCode() == HttpStatus.SC_OK) {
            headers.clear();
            headers.putAll(result.getHeaders());
            return JSON.parseObject(result.getData(), QryInstantFeeListRes.class);
        } else {
            return new QryInstantFeeListRes();
        }
    }

    /**
     * qryPayment:(缴费销帐记录查询). <br/>
     *
     * @param body
     * @param headers
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @author yinyanzhen
     * @since V1.0.0
     */
    public QryPaymentRes qryPayment(QryPaymentReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException {
        LogUtil.info("[开始调用远程服务 缴费记录查询]" + acctApiUrl.getQryPayment(), null, this.getClass());
        LogUtil.info("输入参数[qryPaymentReq]=" + body.toString(), null, this.getClass());
        HttpResult result = null;
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getQryPayment(), body.toString(), headers);
        } catch (ClientProtocolException e) {
            LogUtil.error("连接错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        } catch (IOException e) {
            LogUtil.error("IO流错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        //状态码为请求成功
        if (result.getCode() == HttpStatus.SC_OK) {
            headers.clear();
            headers.putAll(result.getHeaders());
            QryPaymentRes qryPaymentRes=JSON.parseObject(result.getData(), QryPaymentRes.class);
            List<QryPaymentRes.PaymentInfo> paymentInfoList= qryPaymentRes.getPaymentInfoList();
            List<QryPaymentRes.PaymentInfo> list=new ArrayList<>();
            for(int i=0;i<paymentInfoList.size();i++){
                QryPaymentRes.PaymentInfo paymentInfo=paymentInfoList.get(i);
                int paymentMethod=paymentInfo.getPaymentMethod();
                if(paymentMethod==11){//现金
                    paymentInfo.setPaymentMethod(100000);
                }else if(paymentMethod==12){//转帐
                    paymentInfo.setPaymentMethod(110400);
                }else if(paymentMethod==13){//信用卡缴费
                    paymentInfo.setPaymentMethod(110100);
                }else if(paymentMethod==14){//代缴
                    paymentInfo.setPaymentMethod(170000);
                }else if(paymentMethod==15){//退费转预存
                    paymentInfo.setPaymentMethod(140200);
                }else if(paymentMethod==16){//翼支付
                    paymentInfo.setPaymentMethod(120100);
                }else if(paymentMethod==17){//充值卡
                    paymentInfo.setPaymentMethod(110300);
                }else if(paymentMethod==20){//充值卡
                    paymentInfo.setPaymentMethod(150400);
                }
                list.add(paymentInfo);
            }
            qryPaymentRes.setPaymentInfoList(list);
            return qryPaymentRes;
        } else {
            String errorMsg = getHttpErrorInfo(acctApiUrl.getQryPayment(), result);
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
    }

    /**
     * qryCustBill:(账单查询). <br/>
     *
     * @param body
     * @param headers
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @author yinyanzhen
     * @since V1.0.0
     */
    public QryCustBillRes qryCustBill(QryCustBillReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException {
        LogUtil.info("[开始调用远程服务 客户化账单查询]" + acctApiUrl.getQryCustBill(), null, this.getClass());
        LogUtil.info("输入参数[qryCustBillRes]=" + body.toString(), null, this.getClass());
        HttpResult result = null;
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getQryCustBill(), body.toString(), headers);
        } catch (ClientProtocolException e) {
            LogUtil.error("连接错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        } catch (IOException e) {
            LogUtil.error("IO流错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        //状态码为请求成功
        if (result.getCode() == HttpStatus.SC_OK) {
            headers.clear();
            headers.putAll(result.getHeaders());
            return JSON.parseObject(result.getData(), QryCustBillRes.class);
        } else {
            String errorMsg = getHttpErrorInfo(acctApiUrl.getQryCustBill(), result);
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
    }

    /**
     * qryBill:(欠费查询). <br/>
     *
     * @param body
     * @param headers
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @author yinyanzhen
     * @since V1.0.0
     */
    public QryBillRes qryBill(QryBillReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException {
        HttpResult result = null;
        LogUtil.info("[开始调用远程服务 欠费查询]" + acctApiUrl.getQryBill(), null, this.getClass());
        LogUtil.info("输入参数[qryBillResReq]=" + body.toString(), null, this.getClass());
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getQryBill(), body.toString(), headers);
        } catch (ClientProtocolException e) {
            LogUtil.error("连接错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        } catch (IOException e) {
            LogUtil.error("IO流错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        //状态码为请求成功
        if (result.getCode() == HttpStatus.SC_OK) {
            headers.clear();
            headers.putAll(result.getHeaders());
            return JSON.parseObject(result.getData(), QryBillRes.class);
        } else {
            String errorMsg = getHttpErrorInfo(acctApiUrl.getQryBill(), result);
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
    }

    /**
     * queryBalance:(余额查询). <br/>
     *
     * @param body
     * @param headers
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @author yinyanzhen
     * @since V1.0.0
     */
    public QueryBalanceRes queryBalance(QueryBalanceReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException {
        HttpResult result = null;
        LogUtil.info("[开始调用远程服务 余额查询]" + acctApiUrl.getQueryBalance(), null, this.getClass());
        LogUtil.info("输入参数[queryBalanceReq]=" + body.toString(), null, this.getClass());
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getQueryBalance(), body.toString(), headers);
        } catch (ClientProtocolException e) {
            LogUtil.error("连接错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        } catch (IOException e) {
            LogUtil.error("IO流错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        //状态码为请求成功
        if (result.getCode() == HttpStatus.SC_OK) {
            headers.clear();
            headers.putAll(result.getHeaders());
            return JSON.parseObject(result.getData(), QueryBalanceRes.class);
        } else {
            String errorMsg = getHttpErrorInfo(acctApiUrl.getQueryBalance(), result);
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
    }

    /**
     * qryBalanceRecordDetail:(余额变动明细查询). <br/>
     *
     * @param body()
     * @param headers
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @author yinyanzhen
     * @since V1.0.0
     */
    public QryBalanceRecordDetailRes qryBalanceRecordDetail(QryBalanceRecordDetailReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException {
        HttpResult result = null;
        LogUtil.info("[开始调用远程服务 余额变动明细查询]" + acctApiUrl.getQryBalanceRecordDetail(), null, this.getClass());
        LogUtil.info("输入参数[qryBalanceRecordDetailReq]=" + body.toString(), null, this.getClass());
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getQryBalanceRecordDetail(), body.toString(), headers);
        } catch (ClientProtocolException e) {
            LogUtil.error("连接错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        } catch (IOException e) {
            LogUtil.error("IO流错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        //状态码为请求成功
        if (result.getCode() == HttpStatus.SC_OK) {
            headers.clear();
            headers.putAll(result.getHeaders());
            return JSON.parseObject(result.getData(), QryBalanceRecordDetailRes.class);
        } else {
            String errorMsg = getHttpErrorInfo(acctApiUrl.getQryBalanceRecordDetail(), result);
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
    }

    /**
     * billingCycle:(查询账务周期). <br/>
     *
     * @param body
     * @param headers
     * @return
     * @author yinyanzhen
     * @since V1.0.0
     */
    public List<BillingCycle> billingCycle(BillingCycle body, Map<String, String> headers)
            throws ClientProtocolException, URISyntaxException, IOException {
        @SuppressWarnings("unchecked")
        Map<String, String> bodyMap = JSON.parseObject(JSON.toJSONString(body), Map.class);
        HttpResult result = HttpUtil.doGet(Constant.OpenApi.billingCycle, bodyMap, headers);
        //状态码为请求成功
        if (result.getCode() == HttpStatus.SC_OK) {
            headers.clear();
            headers.putAll(result.getHeaders());
            return JSON.parseArray(result.getData(), BillingCycle.class);
        } else {
            return new ArrayList<>();
        }
    }

    /**
     * rechargeBalance:(余额充值服务(非卡充)). <br/>
     *
     * @param body
     * @param headers
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @author yinyanzhen
     * @since V1.0.0
     */
    public RechargeBalanceRes rechargeBalance(RechargeBalanceReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException, ParseException {
        // TODO: 2019/9/3 判断计费流水是否重复
        ResultInfo resultInfo = new ResultInfo();
        resultInfo = orclCommonDao.checkSerialnumberExist(body);
        RechargeBalanceRes rechargeBalanceRes = new RechargeBalanceRes();
        if (!"0".equals(resultInfo.getCode())) {
            throw new BillException(ErrorCodePublicEnum.PAY_SERIALNUMBER_IS_EXIST);
        }//end

        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
        SvcObjectStruct svcObjectStruct = body.getSvcObjectStruct();
        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(svcObjectStruct.getObjValue(), "0431", "2",
                "1", headers);
        //用户校验
        checkServExist(stdCcaQueryServ);
        String localNet = stdCcaQueryServ.getHomeAreaCode();
        String productName = stdCcaQueryServ.getProductId();
        String paymentFlag = stdCcaQueryServ.getPaymentFlag();
        productName = productName != null ? productName : "379";
        paymentFlag = paymentFlag != null ? paymentFlag : "1";
        //特殊业务组的跨地市缴费限制
        if ("3003".equals(body.getSystemId())) {
            if (!"433".equals(localNet)) {
                throw new BillException(ErrorCodeCompEnum.ACROSS_CITIES_ERR);
            }
        }
        LogUtil.info("[开始调用远程服务 余额充值]" + acctApiUrl.getRechargeBalance(), null, this.getClass());
        LogUtil.info("输入参数[RechargeBalanceReq]=" + body.toString(), null, this.getClass());
        HttpResult result = null;
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getRechargeBalance(), JSON.toJSONString(body, SerializerFeature.WriteMapNullValue), headers);
        } catch (ClientProtocolException e) {
            LogUtil.error("连接错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        } catch (IOException e) {
            LogUtil.error("IO流错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        //状态码为请求成功
        if (result.getCode() == HttpStatus.SC_OK) {
            headers.clear();
            headers.putAll(result.getHeaders());
            //插入充值记录
            rechargeBalanceRes = JSON.parseObject(result.getData(), RechargeBalanceRes.class);
            long paymentId = rechargeBalanceRes.getPaymentId();
            String acctId = rechargeBalanceRes.getAcctId();
            if ("0".equals(rechargeBalanceRes.getResultCode())) {
                resultInfo = orclCommonDao.insertSerialnumber(body, paymentId, localNet,productName,paymentFlag,acctId);
                if (!"0".equals(resultInfo.getCode())) {
                    throw new BillException(ErrorCodeCompEnum.INSERT_CHARGE_BALANCE_ERR);
                }
            }
            return JSON.parseObject(result.getData(), RechargeBalanceRes.class);
        } else {
            String errorMsg = getHttpErrorInfo(acctApiUrl.getRechargeBalance(), result);
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
    }

    /**
     * rtBillItem:(详单查询). <br/>
     *
     * @param body
     * @param headers
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @author yinyanzhen
     * @since V1.0.0
     */
    public RtBillItemRes rtBillItem(RtBillItemReq body, Map<String, String> headers, boolean isSms)
            throws BillException, IOException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        // TODO: 2019/7/30 过户增加判断
        String accNbr = body.getSvcObjectStruct().getObjValue();
        String objAttr = body.getSvcObjectStruct().getObjAttr();
        String objType = body.getSvcObjectStruct().getObjType();
        Map map = new HashMap();
        //调用用户信息查询接口 begin
        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
        stdCcaQueryServ = commonUserInfo.getUserInfo(String.valueOf(accNbr), "", objType, objAttr, headers);
        //用户校验
        checkServExist(stdCcaQueryServ);
        String servId = stdCcaQueryServ.getServId();
        //增加详单禁查功能
        long iCount = ifUserMeterMapperDao.selectcountUserMeter(servId);
        if (iCount > 0) {
            String errorMsg = "用户" + accNbr + "已开通详单禁查功能";
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException("2004", "用户" + accNbr + "已开通详单禁查功能");
        }

        map.put("servId", servId);
        //读取过户表,取过户时间为开始时间
        LogUtil.info("[读取用户" + servId +  "的过户信息]", null, this.getClass());
        List<Map<String, Object>> owenCustList = intfServCustChangeContrastDao.selectIntfServCustChangeContrast(map);
        if (owenCustList.size() > 0) {
            Map owenCustMap = owenCustList.get(0);
            Integer effDate = Integer.parseInt(owenCustMap.get("changeDate").toString());
            body.setStartDate(effDate);
        }
        LogUtil.info("[用户的过户信息]" + owenCustList.toString(), null, this.getClass());
        LogUtil.info("[开始调用远程服务 详单信息查询]" + acctApiUrl.getRtBillItem(), null, this.getClass());
        LogUtil.info("输入参数[RtBillItemReq]=" + body.toString(), null, this.getClass());
        HttpResult result = null;
        HttpResult resultSms = null;
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getRtBillItem(), body.toString(), headers);
        } catch (ClientProtocolException e) {
            LogUtil.error("连接错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        } catch (IOException e) {
            LogUtil.error("IO流错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        //状态码为请求成功
        if (result.getCode() == HttpStatus.SC_OK) {
            // TODO: 2019/9/14 插入短信通知表
            RtBillItemRes res =  JSON.parseObject(result.getData(), RtBillItemRes.class);
            //增加详单查询结束时间返回
            List<VoiceBillItem> voiceBillItems = new ArrayList<>();
            List<DataBillItem> dataBillItems = new ArrayList<>();
            if (!StringUtil.isEmpty(res.getVoiceBillItems())) {
                voiceBillItems = res.getVoiceBillItems();
                for (VoiceBillItem voiceBillItem : voiceBillItems) {
                    String startDate = voiceBillItem.getBeginTime();
                    long duration = voiceBillItem.getDuration();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(sdf.parse(startDate));
                    Date curentDate = calendar.getTime();
                    long l = curentDate.getTime();
                    Date date = new Date( l+duration*1000 );
                    voiceBillItem.setEndDate(sdf.format(date));
                }
            }
            if (!StringUtil.isEmpty(res.getDataBillItems())) {
                dataBillItems = res.getDataBillItems();
                for (RtBillItemRes.DataBillItem dataBillItem : dataBillItems) {
                    String startDate = dataBillItem.getStartTime();
                    long duration = dataBillItem.getDuration();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(sdf.parse(startDate));
                    Date curentDate = calendar.getTime();
                    long l = curentDate.getTime();
                    Date date = new Date( l+duration*1000 );
                    dataBillItem.setEndDate(sdf.format(date));
                }
            }

            if (isSms) {
                if (doSendRemindMsg(body, headers, accNbr,servId) < 0) {
                    LogUtil.error("短信推送到plca失败", null, this.getClass());
                }
                LogUtil.info("短信推送到plca成功", null, this.getClass());
            }
            headers.clear();
            headers.putAll(result.getHeaders());
            return res;
        } else {
            String errorMsg = getHttpErrorInfo(acctApiUrl.getSearchServInfo(), result);
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
    }

    /**
     * @return void
     * @Author WangBaoQiang
     * @Description //短信推送方法
     * @Date 15:22 2019/10/6
     * @Param [body, headers, accNbr]
     */
    private int doSendRemindMsg(RtBillItemReq body, Map<String, String> headers, String accNbr,String servId) throws IOException, BillException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        HttpResult resultSms = null;
        OtherRemindReq otherRemindReq = new OtherRemindReq();
        OtherRemindRes otherRemindRes = new OtherRemindRes();
        MsgInfoBean msgInfoBean = new MsgInfoBean();
        List<MsgInfoBean> msgInfoBeanList = new ArrayList<>();
        try {
            String system = "";
            if ("1002".equals(body.getSystemId())) {
                system = "10000号";
            } else if ("1003".equals(body.getSystemId())) {
                system = "网上营业厅";
            } else if ("1014".equals(body.getSystemId())) {
                system = "自助终端";
            } else if ("3001".equals(body.getSystemId())) {
                system = "触摸屏";
            }
            String busiType = "";
            if (body.getQryType() == 1) {
                busiType = "语音通话";
            } else if (body.getQryType() == 2) {
                busiType = "数据通信";
            } else if (body.getQryType() == 3) {
                busiType = "短信通信";
            } else if (body.getQryType() == 4) {
                busiType = "增值服务";
            }
            String time = sdf.format(new Date());
            String sendTime = time.substring(0, 4) + "年"
                    + time.substring(4, 6) + "月" + time.substring(6, 8)
                    + "日" + time.substring(8, 10) + "时"
                    + time.substring(10, 12) + "分";
            String billingCycleId = String.valueOf(body.getBillingCycleId());
            String sendMsgInfo = "JLJF000042|{\"msgInfo\":\"中国电信提醒您：您于" + sendTime + "在电信" + system +
                    "查询了" + billingCycleId.substring(0, 4) + "年" + billingCycleId.substring(4)
                    + "月的" + busiType + "业务的详单\"}";
            msgInfoBean.setAccNbr(accNbr);
            msgInfoBean.setBusinessId(sdf.format(new Date()));
            msgInfoBean.setRemindType("查询中心详单查询查询提醒");
            msgInfoBean.setRemindCreateTime(time);
            msgInfoBean.setRemindCode("JLJF000042");
            msgInfoBean.setChannelId(body.getSystemId());
            msgInfoBean.setRemindText(sendMsgInfo);
            msgInfoBean.setRemindServId(servId);
            msgInfoBeanList.add(msgInfoBean);
            otherRemindReq.setMsgInfo(msgInfoBeanList);
            LogUtil.info("[开始调用远程服务 短信发送提醒]" + acctApiUrl.getOtheRemind(), null, this.getClass());
            LogUtil.info("输入参数[OtherRemindReq]=" + JSON.toJSONString(otherRemindReq), null, this.getClass());
            try {
                resultSms = HttpUtil.doPostJson(acctApiUrl.getOtheRemind(), JSON.toJSONString(otherRemindReq, SerializerFeature.WriteMapNullValue), headers);
                otherRemindRes = JSON.parseObject(resultSms.getData(), OtherRemindRes.class);
                LogUtil.info("输出参数[OtherRemindRes]=" + JSON.toJSONString(otherRemindRes), null, this.getClass());
            } catch (IOException e) {
                LogUtil.error("输入参数[OtherRemindReq]=" + JSON.toJSONString(otherRemindReq), null, this.getClass());
                LogUtil.error("IO流错误", e, this.getClass());
                return -1;
            }
            if (resultSms.getCode() != HttpStatus.SC_OK) {
                String errMsg = "调用远程服务：" + acctApiUrl.getOtheRemind() + "异常，HTTP状态码：" + resultSms.getCode() + "，响应内容：" + resultSms.getData();
                LogUtil.error("输入参数[OtherRemindReq]=" + JSON.toJSONString(otherRemindReq), null, this.getClass());
                LogUtil.error(errMsg, null, this.getClass());
                return -1;
            }
        } catch (Exception e) {
            LogUtil.error("输入参数[OtherRemindReq]=" + JSON.toJSONString(otherRemindReq), e, this.getClass());
            return -1;
        }
        return 1;
    }

    /**
     * 充值回退（冲正）
     */
    public RollRechargeBalanceRes rollRechargeBalnce(RollRechargeBalanceReq body,
                                                     Map<String, String> headers) throws IOException, BillException {
        RollRechargeBalanceRes rechargeBalanceRes = new RollRechargeBalanceRes();
        HttpResult result = null;
        LogUtil.info("[开始调用远程服务 余额冲正]" + acctApiUrl.getRollRechargeBalance(), null, this.getClass());
        LogUtil.info("输入参数[RollRechargeBalanceReq]=" + body.toString(), null, this.getClass());
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getRollRechargeBalance(), body.toString(), headers);
        } catch (ClientProtocolException e) {
            LogUtil.error("连接错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        } catch (IOException e) {
            LogUtil.error("IO流错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        //状态码为请求成功
        if (result.getCode() == HttpStatus.SC_OK) {
            headers.clear();
            headers.putAll(result.getHeaders());
            rechargeBalanceRes = JSON.parseObject(result.getData(), RollRechargeBalanceRes.class);
            ResultInfo resultInfo = null;
            String paymentId=rechargeBalanceRes.getReversePaymentId();
            System.out.println(body.getOperAttrStruct().getOperOrgId());
            //VC更新缴费历史表记录
            if ("4102".equals(body.getSystemId())||"3005".equals(body.getSystemId())) {
                String reqServiceId = rechargeBalanceRes.getReqServiceId();
                resultInfo = orclCommonDao.updateSerialnumber(body, paymentId, reqServiceId);
                if (!"0".equals(resultInfo.getCode())) {
                    String errorMsg = "更新缴费记录表，记录冲正信息异常";
                    LogUtil.error(errorMsg, null, this.getClass());
                    throw new BillException(ErrorCodeCompEnum.INSERT_ROLL_CHARGE_BALANCE_ERR);
                }
            }
            return JSON.parseObject(result.getData(), RollRechargeBalanceRes.class);
        } else {
            String errorMsg = getHttpErrorInfo(acctApiUrl.getRollRechargeBalance(), result);
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
    }

    /**
     * 话费返还记录查询
     */
    public QryReturnBalanceDetailRes qryReturnBalanceDetail(QryReturnBalanceDetailReq body,
                                                            Map<String, String> headers) throws IOException, BillException {
        LogUtil.info("[开始调用远程服务 话费返还记录查询]" + acctApiUrl.getQryReturnBalanceDetail(), null, this.getClass());
        LogUtil.info("输入参数[qryReturnBalanceDetailReq]=" + body.toString(), null, this.getClass());
        HttpResult result = null;
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getQryReturnBalanceDetail(), body.toString(), headers);
        } catch (ClientProtocolException e) {
            LogUtil.error("连接错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        } catch (IOException e) {
            LogUtil.error("IO流错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        //状态码为请求成功
        if (result.getCode() == HttpStatus.SC_OK) {
            headers.clear();
            headers.putAll(result.getHeaders());
            return JSON.parseObject(result.getData(), QryReturnBalanceDetailRes.class);
        } else {
            String errorMsg = getHttpErrorInfo(acctApiUrl.getQryReturnBalanceDetail(), result);
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }

    }


    /**
     * @return com.asia.domain.openApi.QryBalanceRecordRes
     * @Author WangBaoQiang
     * @Description 客户化账单查询
     * @Date 21:10 2019/10/16
     * @Param [body, headers]
     */
    public QryForeignBillRes qryForeignBill(QryForeignBillReq body,
                                            Map<String, String> headers) throws IOException, BillException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");// 格式化为年月
        LogUtil.info("[开始调用远程服务 客户化账单查询]" + acctApiUrl.getQryForeignBill(), null, this.getClass());
        LogUtil.info("输入参数[qryForeignBillReq]=" + body.toString(), null, this.getClass());
        HttpResult result = null;
        HttpResult rtFeeResult = null;
        HttpResult accuResult = null;
        HttpResult servInfo = null;
        HttpResult custBill = null;
        QryForeignBillRes qryForeignBillRes = new QryForeignBillRes();
        DataBean dataBean = new DataBean();
        Arrears arrears = new Arrears();
        List<BillsBean> billsBeanList = new ArrayList<>();
        BillsBean billsBean = new BillsBean();
        BillCionInfo billCionInfo = new BillCionInfo();
        OfferConsumerInfosBean offerConsumerInfosBean = new OfferConsumerInfosBean();
        UserInfoBean userInfoBean = new UserInfoBean();
        //客户账单查询开始
        QryJTBillInfoReq qryJTBillInfoReq = new QryJTBillInfoReq();
        qryJTBillInfoReq.setCycleId(body.getCycleId());
        qryJTBillInfoReq.setQryValue(body.getQryValue());
        qryJTBillInfoReq.setZdType("998");
        qryJTBillInfoReq.setQryFlag(1);
        LogUtil.info("[开始调用远程服务 客户账单查询]" + acctApiUrl.getQryJTBillInfo(), null, this.getClass());
        LogUtil.info("输入参数[qryJTBillInfoReq]=" + qryJTBillInfoReq.toString(), null, this.getClass());
        custBill = HttpUtil.doPostJson(acctApiUrl.getQryJTBillInfo(), qryJTBillInfoReq.toString(), headers);
        LogUtil.info("输出参数[qryJTBillInfoRes]=" + JSON.toJSONString(custBill), null, this.getClass());
        if (custBill.getCode() == HttpStatus.SC_OK) {
            JSONObject custBilljson = JSON.parseObject(custBill.getData());
            DecimalFormat df1=new DecimalFormat("#.#");
            QryForeignBillRes qryForeignBillRes1 = JSON.parseObject(custBill.getData(),QryForeignBillRes.class);
            String userResourceQuery =  custBilljson.getString("data");
            arrears = qryForeignBillRes1.getData().getArrears();
            String billedFee =df1.format(Double.parseDouble(StringUtil.isEmpty(arrears.getBilledFee())?"0":arrears.getBilledFee())*100);
            String cashDeduct = df1.format(Double.parseDouble(StringUtil.isEmpty(arrears.getCashDeduct())?"0":arrears.getCashDeduct())*100);
            String consumeAmount=df1.format(Double.parseDouble(StringUtil.isEmpty(arrears.getConsumeAmount())?"0":arrears.getConsumeAmount())*100);
            String corpusDeduct=df1.format(Double.parseDouble(StringUtil.isEmpty(arrears.getCorpusDeduct())?"0":arrears.getCorpusDeduct())*100);
            String curDeposit=df1.format(Double.parseDouble(StringUtil.isEmpty(arrears.getCurDeposit())?"0":arrears.getCurDeposit())*100);
            String needPay=df1.format(Double.parseDouble(StringUtil.isEmpty(arrears.getNeedPay())?"0":arrears.getNeedPay())*100);
            String returnBalance=df1.format(Double.parseDouble(StringUtil.isEmpty(arrears.getReturnBalance())?"0":arrears.getReturnBalance())*100);
            String returnBalancePayed=df1.format(Double.parseDouble(StringUtil.isEmpty(arrears.getReturnBalancePayed())?"0":arrears.getReturnBalancePayed())*100);
            arrears.setBilledFee(billedFee);
            arrears.setCashDeduct(cashDeduct);
            arrears.setConsumeAmount(consumeAmount);
            arrears.setCorpusDeduct(corpusDeduct);
            arrears.setCurDeposit(curDeposit);
            arrears.setNeedPay(needPay);
            arrears.setReturnBalance(returnBalance);
            arrears.setReturnBalancePayed(returnBalancePayed);
            billsBean = JSON.parseObject(userResourceQuery,BillsBean.class);
            List<QryForeignBillRes.DataBean.BillsBean.BillItemsBeanXXXX> list=billsBean.getBillItems();
            List<QryForeignBillRes.DataBean.BillsBean.BillItemsBeanXXXX> list2=new ArrayList<>();
            if(list.size()>0){
                for(int i=0;i<list.size();i++){
                    String amount=df1.format(Double.parseDouble(list.get(i).getAmount())*100);
                    QryForeignBillRes.DataBean.BillsBean.BillItemsBeanXXXX billItemsBeanXXXX=list.get(i);
                    billItemsBeanXXXX.setAmount(amount);
                    List<QryForeignBillRes.DataBean.BillsBean.BillItemsBeanXXXX.BillItemsBeanXXX> billItemsBeanXXXList=billItemsBeanXXXX.getBillItems();
                    List<QryForeignBillRes.DataBean.BillsBean.BillItemsBeanXXXX.BillItemsBeanXXX> billItemsBeanXXXList2=new ArrayList<>();
                    for(int m=0;m<billItemsBeanXXXList.size();m++){
                        String amount2=df1.format(Double.parseDouble(billItemsBeanXXXList.get(m).getAmount())*100);
                        QryForeignBillRes.DataBean.BillsBean.BillItemsBeanXXXX.BillItemsBeanXXX billItemsBeanXXX=billItemsBeanXXXList.get(m);
                        billItemsBeanXXX.setAmount(amount2);
                        List<QryForeignBillRes.DataBean.BillsBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX> billItemsBeanXXList=billItemsBeanXXXList.get(m).getBillItems();
                        List<QryForeignBillRes.DataBean.BillsBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX> billItemsBeanXXList2=new ArrayList<>();
                        for(int n=0;n<billItemsBeanXXList.size();n++){
                            String amount3=df1.format(Double.parseDouble(billItemsBeanXXList.get(n).getAmount())*100);
                            QryForeignBillRes.DataBean.BillsBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX billItemsBeanXX=billItemsBeanXXList.get(n);
                            billItemsBeanXX.setAmount(amount3);
                            List<QryForeignBillRes.DataBean.BillsBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX.BillItemsBeanX> billItemsBeanXList=billItemsBeanXXList.get(n).getBillItems();
                            List<QryForeignBillRes.DataBean.BillsBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX.BillItemsBeanX> billItemsBeanXList2=new ArrayList<>();
                            for(int x=0;x<billItemsBeanXList.size();x++){
                                String amount4=df1.format(Double.parseDouble(billItemsBeanXList.get(x).getAmount())*100);
                                QryForeignBillRes.DataBean.BillsBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX.BillItemsBeanX billItemsBeanX=billItemsBeanXList.get(x);
                                billItemsBeanX.setAmount(amount4);
                                List<QryForeignBillRes.DataBean.BillsBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX.BillItemsBeanX.BillItemsBean> billItemsBeanList=billItemsBeanXList.get(x).getBillItems();
                                List<QryForeignBillRes.DataBean.BillsBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX.BillItemsBeanX.BillItemsBean> billItemsBeanList2=
                                        new ArrayList<>();
                                for(int y=0;y<billItemsBeanList.size();y++){
                                    String amount5=df1.format(Double.parseDouble(billItemsBeanList.get(y).getAmount())*100);
                                    QryForeignBillRes.DataBean.BillsBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX.BillItemsBeanX.BillItemsBean billItemsBean=billItemsBeanList.get(y);
                                    billItemsBean.setAmount(amount5);
                                    billItemsBeanList2.add(billItemsBean);
                                }
                                billItemsBeanX.setBillItems(billItemsBeanList2);
                                billItemsBeanXList2.add(billItemsBeanX);
                            }
                            billItemsBeanXX.setBillItems(billItemsBeanXList2);
                            billItemsBeanXXList2.add(billItemsBeanXX);
                        }
                        billItemsBeanXXX.setBillItems(billItemsBeanXXList2);
                        billItemsBeanXXXList2.add(billItemsBeanXXX);
                    }
                    billItemsBeanXXXX.setBillItems(billItemsBeanXXXList2);
                    list2.add(billItemsBeanXXXX);
                }
                billsBean.setBillItems(list2);
            }
            billsBeanList.add(billsBean);
        }
        //历史账单查询开始
        GetOweListReq getOweListReq = new GetOweListReq();
        StdCcrCustomizeBillQueryBill stdCcrCustomizeBillQueryBill = new StdCcrCustomizeBillQueryBill();
        stdCcrCustomizeBillQueryBill.setAccNbr(body.getQryValue());
        stdCcrCustomizeBillQueryBill.setDestinationAttr("2");
        stdCcrCustomizeBillQueryBill.setQueryFlag("0");
        String month = body.getCycleId();
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        date = sdf.parse(month);
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -6);
        BillConsumeInfo billConsumeInfo = new BillConsumeInfo();
        List<EchartsDataBeanBean> echartsDataBeanBeanList = new ArrayList<>();
        //循环调用服务取用户的近六个月账单
        for (int i = 0; i < 6; i++) {
            EchartsDataBeanBean echartsDataBeanBean = new EchartsDataBeanBean();
            calendar.add(Calendar.MONTH, 1);
            String billingCyclyId = sdf.format(calendar.getTime());
            stdCcrCustomizeBillQueryBill.setBillingCycle(billingCyclyId);
            getOweListReq.setStdCcrCustomizeBillQueryBill(stdCcrCustomizeBillQueryBill);
            String totalCharge = "";
            rtFeeResult = HttpUtil.doPostJson(acctApiUrl.getGetOweList(), getOweListReq.toString(), headers);
            if (rtFeeResult.getCode() == HttpStatus.SC_OK) {
                JSONObject json = JSON.parseObject(rtFeeResult.getData());
                Map RealTimeBillQueryMap = (Map) json.get("stdCcaCustomizeBillQueryBill");
                if (!StringUtil.isEmpty(RealTimeBillQueryMap)) {
                    totalCharge = String.valueOf(RealTimeBillQueryMap.get("sumCharge"));
                } else {
                    totalCharge = "";
                }
                echartsDataBeanBean.setBillMonth(billingCyclyId);
                echartsDataBeanBean.setBillFee(totalCharge);
                echartsDataBeanBeanList.add(echartsDataBeanBean);
            } else {
                String errorMsg = getHttpErrorInfo(acctApiUrl.getGetOweList(), result);
                LogUtil.error(errorMsg, null, this.getClass());
                throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
            }
        }
        billConsumeInfo.setEchartsDataBean(echartsDataBeanBeanList);
        //调用累计量查询
        StdCcrUserResourceQuery stdCcrUserResourceQuery = new StdCcrUserResourceQuery();
        ResourceInformationBean resourceInformationBean = new ResourceInformationBean();
        StdCcrUserResourceQueryBean stdCcrUserResourceQueryBean = new StdCcrUserResourceQueryBean();
        resourceInformationBean.setAccNbr(body.getQryValue());
        resourceInformationBean.setBillingCycle(body.getCycleId());
        resourceInformationBean.setDestinationAttr("1");
        resourceInformationBean.setQueryFlag("1");
        stdCcrUserResourceQueryBean.setResourceInformation(resourceInformationBean);
        stdCcrUserResourceQuery.setStdCcrUserResourceQuery(stdCcrUserResourceQueryBean);
        LogUtil.info("[开始调用远程服务 累积量查询]" + acctApiUrl.getGetUnitedAccu(), null, this.getClass());
        LogUtil.info("输入参数[stdCcrUserResourceQuery]=" + qryJTBillInfoReq.toString(), null, this.getClass());
        accuResult = HttpUtil.doPostJson(acctApiUrl.getGetUnitedAccu(), stdCcrUserResourceQuery.toString(), headers);
        LogUtil.info("输入参数[stdCcrUserResourceQueryRes]=" + JSON.parseObject(accuResult.getData(), StdCcaUserResourceQueryResponse.class), null, this.getClass());
        if (accuResult.getCode() == HttpStatus.SC_OK) {
            JSONObject json = JSON.parseObject(accuResult.getData());
            String userResourceQuery = json.getString("stdCcaUserResourceQuery");
            offerConsumerInfosBean = JSON.parseObject(userResourceQuery, OfferConsumerInfosBean.class);
        } else {
            String errorMsg = getHttpErrorInfo(acctApiUrl.getGetUnitedAccu(), result);
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }//调用累计量查询END
        //开始调用用户信息查询
        StdCcrQueryServReq stdCcrQueryServReq = new StdCcrQueryServReq();
        StdCcrQueryServ stdCcrQueryServ = new StdCcrQueryServ();
        stdCcrQueryServ.setQueryType("1");
        stdCcrQueryServ.setValue(body.getQryValue());
        stdCcrQueryServ.setValueType("1");
        stdCcrQueryServ.setAreaCode(body.getAreaCode());
        stdCcrQueryServReq.setStdCcrQueryServ(stdCcrQueryServ);
        LogUtil.info("[开始调用远程服务 用户信息查询]" + acctApiUrl.getSearchServInfo(), null, this.getClass());
        LogUtil.info("输入参数[stdCcrQueryServReq]=" + stdCcrQueryServReq.toString(), null, this.getClass());
        servInfo = HttpUtil.doPostJson(acctApiUrl.getSearchServInfo(), stdCcrQueryServReq.toString(), headers);
        LogUtil.info("输出参数[StdCcrQueryServRes]=" + JSON.parseObject(servInfo.getData(), StdCcrQueryServRes.class), null, this.getClass());
        if (servInfo.getCode() == HttpStatus.SC_OK) {
            JSONObject json = JSON.parseObject(servInfo.getData());
            String userResourceQuery = json.getString("stdCcaQueryServRes");
            JSONObject servListjson = JSON.parseObject(userResourceQuery);
            List<Map<String, Object>> servList = (List<Map<String, Object>>) servListjson.get("stdCcaQueryServList");
            String custName = String.valueOf(servList.get(0).get("custName"));
            String custId = String.valueOf(servList.get(0).get("servId"));
            String productName = String.valueOf(servList.get(0).get("productName"));
            userInfoBean.setBillingCycle(body.getCycleId());
            userInfoBean.setCustName(custName);
            userInfoBean.setServId(custId);
            userInfoBean.setProductName(productName);
        } else {
            String errorMsg = getHttpErrorInfo(acctApiUrl.getGetUnitedAccu(), result);
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        dataBean.setArrears(arrears);
        dataBean.setBills(billsBeanList);
        dataBean.setBillConsumeInfo(billConsumeInfo);
        dataBean.setOfferConsumerInfos(offerConsumerInfosBean);
        dataBean.setUserInfo(userInfoBean);
        ResponseMess responseMess=this.pointInfoQryFroBillApi(body,headers);
        if(!StringUtil.isEmpty(responseMess)){
             long lastCoin=Long.parseLong(StringUtil.isEmpty(responseMess.getLastMonthPoint())?"0":responseMess.getLastMonthPoint());
             long thisAddCoin=Long.parseLong(StringUtil.isEmpty(responseMess.getAddPointValue())?"0":responseMess.getAddPointValue());
             long thisUserCoin=Long.parseLong(StringUtil.isEmpty(responseMess.getUesdPointValue())?"0":responseMess.getUesdPointValue());
             long currentCoin= lastCoin+thisAddCoin;
             //long yearUnvalidCoin=Long.parseLong(responseMess.getExpirePointValue());
             billCionInfo.setCurrentCoin(currentCoin);
             billCionInfo.setLastCoin(lastCoin);
             billCionInfo.setThisAddCoin(thisAddCoin);
             billCionInfo.setThisUserCoin(thisUserCoin);
             //billCionInfo.setYearUnvalidCoin(yearUnvalidCoin);
        }
        dataBean.setBillCionInfo(billCionInfo);
        qryForeignBillRes.setData(dataBean);
        qryForeignBillRes.setResultCode("0");
        qryForeignBillRes.setResultMsg("SUCESS");
        headers.clear();
        headers.putAll(accuResult.getHeaders());
        return qryForeignBillRes;
    }

    /**
     * @return com.asia.domain.openApi.QryJTBillInfoRes
     * @Author WangBaoQiang
     * @Description //查询客户账户，三级账单展示
     * @Date 15:35 2019/10/20
     * @Param [body, headers]
     */
    public QryJTBillInfoRes qryJTBillInfo(QryJTBillInfoReq body,
                                          Map<String, String> headers) throws IOException, BillException {
        LogUtil.info("[开始调用远程服务 客户账单查询]" + acctApiUrl.getQryJTBillInfo(), null, this.getClass());
        LogUtil.info("输入参数[qryJTBillInfoReq]=" + body.toString(), null, this.getClass());
        HttpResult result = null;
        HttpResult servResult = null;
        QryJTBillInfoRes qryJTBillInfoRes = new QryJTBillInfoRes();
        String custName = "";
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getQryJTBillInfo(), body.toString(), headers);
            //开始调用用户信息查询
            StdCcrQueryServReq stdCcrQueryServReq = new StdCcrQueryServReq();
            StdCcrQueryServ stdCcrQueryServ = new StdCcrQueryServ();
            stdCcrQueryServ.setQueryType("1");
            stdCcrQueryServ.setValue(body.getQryValue());
            stdCcrQueryServ.setValueType("1");
            stdCcrQueryServ.setAreaCode(body.getAreaCode());
            stdCcrQueryServReq.setStdCcrQueryServ(stdCcrQueryServ);
            LogUtil.info("[开始调用远程服务 用户信息查询]" + acctApiUrl.getSearchServInfo(), null, this.getClass());
            LogUtil.info("输入参数[stdCcrQueryServReq]=" + stdCcrQueryServReq.toString(), null, this.getClass());
            servResult = HttpUtil.doPostJson(acctApiUrl.getSearchServInfo(), stdCcrQueryServReq.toString(), headers);
            LogUtil.info("输出参数[StdCcrQueryServRes]=" + JSON.parseObject(servResult.getData(), StdCcrQueryServRes.class), null, this.getClass());
            if (servResult.getCode() == HttpStatus.SC_OK) {
                JSONObject json = JSON.parseObject(servResult.getData());
                String userResourceQuery = json.getString("stdCcaQueryServRes");
                JSONObject servListjson = JSON.parseObject(userResourceQuery);
                List<Map<String, Object>> servList = (List<Map<String, Object>>) servListjson.get("stdCcaQueryServList");
                if (servList.size() > 0) {
                    custName = String.valueOf(servList.get(0).get("custName"));
                }

            } else {
                String errorMsg = getHttpErrorInfo(acctApiUrl.getGetUnitedAccu(), result);
                LogUtil.error(errorMsg, null, this.getClass());
                throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
            }
        } catch (ClientProtocolException e) {
            LogUtil.error("连接错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        } catch (IOException e) {
            LogUtil.error("IO流错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        //状态码为请求成功
        if (result.getCode() == HttpStatus.SC_OK) {
            headers.clear();
            headers.putAll(result.getHeaders());
            qryJTBillInfoRes = JSON.parseObject(result.getData(), QryJTBillInfoRes.class);
            DecimalFormat df1=new DecimalFormat("#.#");
            QryJTBillInfoRes.DataBean dataBean= qryJTBillInfoRes.getData();
            ArrearsBean arrearsBean=dataBean.getArrears();
            String billedFee =df1.format(Double.parseDouble(StringUtil.isEmpty(arrearsBean.getBilledFee())?"0":arrearsBean.getBilledFee())*100);
            String cashDeduct = df1.format(Double.parseDouble(StringUtil.isEmpty(arrearsBean.getCashDeduct())?"0":arrearsBean.getCashDeduct())*100);
            String consumeAmount=df1.format(Double.parseDouble(StringUtil.isEmpty(arrearsBean.getConsumeAmount())?"0":arrearsBean.getConsumeAmount())*100);
            String corpusDeduct=df1.format(Double.parseDouble(StringUtil.isEmpty(arrearsBean.getCorpusDeduct())?"0":arrearsBean.getCorpusDeduct())*100);
            String curDeposit=df1.format(Double.parseDouble(StringUtil.isEmpty(arrearsBean.getCurDeposit())?"0":arrearsBean.getCurDeposit())*100);
            String needPay=df1.format(Double.parseDouble(StringUtil.isEmpty(arrearsBean.getNeedPay())?"0":arrearsBean.getNeedPay())*100);
            String returnBalance=df1.format(Double.parseDouble(StringUtil.isEmpty(arrearsBean.getReturnBalance())?"0":arrearsBean.getReturnBalance())*100);
            String returnBalancePayed=df1.format(Double.parseDouble(StringUtil.isEmpty(arrearsBean.getReturnBalancePayed())?"0":arrearsBean.getReturnBalancePayed())*100);
             arrearsBean.setBilledFee(billedFee);
             arrearsBean.setCashDeduct(cashDeduct);
             arrearsBean.setConsumeAmount(consumeAmount);
             arrearsBean.setCorpusDeduct(corpusDeduct);
             arrearsBean.setCurDeposit(curDeposit);
             arrearsBean.setNeedPay(needPay);
             arrearsBean.setReturnBalance(returnBalance);
             arrearsBean.setReturnBalancePayed(returnBalancePayed);
             dataBean.setArrears(arrearsBean);
            List<QryJTBillInfoRes.DataBean.BillItemsBeanXXXX> list=dataBean.getBillItems();
            List<QryJTBillInfoRes.DataBean.BillItemsBeanXXXX> list2=new ArrayList<>();
            if(list.size()>0){
                for(int i=0;i<list.size();i++){
                    String amount=df1.format(Double.parseDouble(list.get(i).getAmount())*100);
                    QryJTBillInfoRes.DataBean.BillItemsBeanXXXX billItemsBeanXXXX=list.get(i);
                    billItemsBeanXXXX.setAmount(amount);
                    List<QryJTBillInfoRes.DataBean.BillItemsBeanXXXX.BillItemsBeanXXX> billItemsBeanXXXList=billItemsBeanXXXX.getBillItems();
                    List<QryJTBillInfoRes.DataBean.BillItemsBeanXXXX.BillItemsBeanXXX> billItemsBeanXXXList2=new ArrayList<>();
                    for(int m=0;m<billItemsBeanXXXList.size();m++){
                        String amount2=df1.format(Double.parseDouble(billItemsBeanXXXList.get(m).getAmount())*100);
                        QryJTBillInfoRes.DataBean.BillItemsBeanXXXX.BillItemsBeanXXX billItemsBeanXXX=billItemsBeanXXXList.get(m);
                        billItemsBeanXXX.setAmount(amount2);
                        List<QryJTBillInfoRes.DataBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX> billItemsBeanXXList=billItemsBeanXXXList.get(m).getBillItems();
                        List<QryJTBillInfoRes.DataBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX> billItemsBeanXXList2=new ArrayList<>();
                        for(int n=0;n<billItemsBeanXXList.size();n++){
                            String amount3=df1.format(Double.parseDouble(billItemsBeanXXList.get(n).getAmount())*100);
                            QryJTBillInfoRes.DataBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX billItemsBeanXX=billItemsBeanXXList.get(n);
                            billItemsBeanXX.setAmount(amount3);
                            List<QryJTBillInfoRes.DataBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX.BillItemsBeanX> billItemsBeanXList=billItemsBeanXXList.get(n).getBillItems();
                            List<QryJTBillInfoRes.DataBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX.BillItemsBeanX> billItemsBeanXList2=new ArrayList<>();
                            for(int x=0;x<billItemsBeanXList.size();x++){
                                String amount4=df1.format(Double.parseDouble(billItemsBeanXList.get(x).getAmount())*100);
                                QryJTBillInfoRes.DataBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX.BillItemsBeanX billItemsBeanX=billItemsBeanXList.get(x);
                                billItemsBeanX.setAmount(amount4);
                                List<QryJTBillInfoRes.DataBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX.BillItemsBeanX.BillItemsBean> billItemsBeanList=billItemsBeanXList.get(x).getBillItems();
                                List<QryJTBillInfoRes.DataBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX.BillItemsBeanX.BillItemsBean> billItemsBeanList2=
                                        new ArrayList<>();
                                for(int y=0;y<billItemsBeanList.size();y++){
                                    String amount5=df1.format(Double.parseDouble(billItemsBeanList.get(y).getAmount())*100);
                                    QryJTBillInfoRes.DataBean.BillItemsBeanXXXX.BillItemsBeanXXX.BillItemsBeanXX.BillItemsBeanX.BillItemsBean billItemsBean=billItemsBeanList.get(y);
                                    billItemsBean.setAmount(amount5);
                                    billItemsBeanList2.add(billItemsBean);
                                }
                                billItemsBeanX.setBillItems(billItemsBeanList2);
                                billItemsBeanXList2.add(billItemsBeanX);
                            }
                            billItemsBeanXX.setBillItems(billItemsBeanXList2);
                            billItemsBeanXXList2.add(billItemsBeanXX);
                        }
                        billItemsBeanXXX.setBillItems(billItemsBeanXXList2);
                        billItemsBeanXXXList2.add(billItemsBeanXXX);
                    }
                    billItemsBeanXXXX.setBillItems(billItemsBeanXXXList2);
                    list2.add(billItemsBeanXXXX);
                }
                dataBean.setBillItems(list2);
            }
            qryJTBillInfoRes.setData(dataBean);
            qryJTBillInfoRes.getData().setUserName(custName);
            return qryJTBillInfoRes;
        } else {
            String errorMsg = getHttpErrorInfo(acctApiUrl.getQryForeignBill(), result);
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }

    }

    public QryBalanceRecordRes qryBalanceRecord(QryBalanceRecordReq body,
                                                Map<String, String> headers) throws IOException, BillException {
        LogUtil.info("[开始调用远程服务 余额变动汇总查询]" + acctApiUrl.getQryBalanceRecord(), null, this.getClass());
        LogUtil.info("输入参数[qryBalanceRecordReq]=" + body.toString(), null, this.getClass());
        HttpResult result = null;
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getQryBalanceRecord(), body.toString(), headers);
        } catch (ClientProtocolException e) {
            LogUtil.error("连接错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        } catch (IOException e) {
            LogUtil.error("IO流错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        //状态码为请求成功
        if (result.getCode() == HttpStatus.SC_OK) {
            headers.clear();
            headers.putAll(result.getHeaders());
            return JSON.parseObject(result.getData(), QryBalanceRecordRes.class);
        } else {
            String errorMsg = getHttpErrorInfo(acctApiUrl.getQryBalanceRecord(), result);
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }

    }

    /**
     * 话费返还记录明细查询
     */
    public QryReturnBalanceDetailInfoRes qryReturnBalanceInfoDetail(QryReturnBalanceDetailInfoReq body,
                                                                    Map<String, String> headers) throws IOException, BillException {
        LogUtil.info("[开始调用远程服务 话费返还记录明细查询]" + acctApiUrl.getQryReturnBalanceInfoDetail(), null, this.getClass());
        LogUtil.info("输入参数[qryReturnBalanceDetailInfoReq]=" + body.toString(), null, this.getClass());
        HttpResult result = null;
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getQryReturnBalanceInfoDetail(), body.toString(), headers);
        } catch (ClientProtocolException e) {
            LogUtil.error("连接错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        } catch (IOException e) {
            LogUtil.error("IO流错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        //状态码为请求成功
        if (result.getCode() == HttpStatus.SC_OK) {
            headers.clear();
            headers.putAll(result.getHeaders());
            return JSON.parseObject(result.getData(), QryReturnBalanceDetailInfoRes.class);
        } else {
            String errorMsg = getHttpErrorInfo(acctApiUrl.getQryReturnBalanceInfoDetail(), result);
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }

    }

    /**
     * 获取调用远程HTTP接口状态码不为200时的错误信息
     *
     * @param url
     * @param result
     * @return
     */
    private String getHttpErrorInfo(String url, HttpResult result) throws BillException {
        String errMsg = "";
        try {
            errMsg = "调用远程服务：" + url + "异常，HTTP状态码：" + result.getCode() + "，响应内容：" + result.getData();
        } catch (NullPointerException e) {
            LogUtil.error("远程服务无响应", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        return errMsg;
    }

    /**
     * @return void
     * @Author WangBaoQiang
     * @Description //查询用户是否存在
     * @Date 19:42 2019/9/29
     * @Param [stdCcaQueryServ]
     */
    private void checkServExist(StdCcaQueryServListBean stdCcaQueryServ) throws BillException {
        if (stdCcaQueryServ != null) {
            String state = stdCcaQueryServ.getServState();
            if ("2HN".equals(state) || "2HX".equals(state) || "2HF".equals(state)) {
                String errorMsg = "找不到用户或帐户档案";
                LogUtil.error(errorMsg, null, this.getClass());
                throw new BillException(ErrorCodeCompEnum.HSS_SEARCH_SERV_INFO_NOT_EXIST);
            }
        } else {
            String errorMsg = "找不到用户或帐户档案";
            LogUtil.error(errorMsg, null, this.getClass());
            throw new BillException(ErrorCodeCompEnum.HSS_SEARCH_SERV_INFO_NOT_EXIST);
        }
    }

    /**
     * 积分查询
     *
     * */
    public  ResponseMess pointInfoQryFroBillApi(QryForeignBillReq body,Map<String, String> headers)throws IOException{
        ResponseMess responseMess=new ResponseMess();

        //PointInfoQryFroBillApiReq pointInfoQryFroBillApiReq=new PointInfoQryFroBillApiReq();
        String qryNbr=body.getQryValue();
        String pointMonth=body.getCycleId();
        Date now=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String reqTime=dateFormat.format(now);
        String transactionId=reqTime.substring(4,reqTime.length());
        //ContractRootClass contractRootClass=new ContractRootClass();

       /* TcpContClass tcpContClass =new TcpContClass();
        tcpContClass.setReqTime(reqTime);
        tcpContClass.setTransactionId(transactionId);*/

       /* RequestMess requestMess=new RequestMess();
        requestMess.setQryNbr(qryNbr);
        requestMess.setPointMonth(pointMonth);

        contractRootClass.setRequestMess(requestMess);
        contractRootClass.setTcpCont(tcpContClass);*/

        //pointInfoQryFroBillApiReq.setContractRoot(contractRootClass);

        String pointInfoQryFroBillApiReq="{" +
                "  \"ContractRoot\": {" +
                "    \"TcpCont\": {" +
                "      \"EventType\": \"SYNC\"," +
                "      \"BusCode\": \"BUS\"," +
                "      \"ServiceCode\": \"QRY1001\"," +
                "      \"TransactionId\": "+transactionId+"," +
                "      \"AreaCode\": \"0431\"," +
                "      \"ChannelId\": \"1003\"," +
                "      \"StaffCode\": \"4\"," +
                "      \"ReqTime\":"+reqTime+"," +
                "      \"EncryptStr\": \"N\"" +
                "    }," +
                "    \"requestMess\": {" +
                "      \"nbrType\": \"1\"," +
                "      \"qryNbr\": "+qryNbr+"," +
                "      \"pointMonth\":"+pointMonth +
                "    }" +
                "  }" +
                "}";

        LogUtil.info("[开始调用远程服务 积分查询]" + acctApiUrl.getPointInfoQryFroBillApi(), null, this.getClass());
        LogUtil.info("输入参数[pointInfoQryFroBillApiReq]=" + pointInfoQryFroBillApiReq.toString(), null, this.getClass());
        HttpResult info = null;
        try {
            info = HttpUtil.doPostJson(acctApiUrl.getPointInfoQryFroBillApi(), pointInfoQryFroBillApiReq, headers);
        } catch (IOException e) {
            LogUtil.error("输入参数[pointInfoQryFroBillApiReq]=" + JSON.toJSONString(pointInfoQryFroBillApiReq), null, this.getClass());
            LogUtil.error("IO流错误", e, this.getClass());
            return responseMess;
        }
        if (info.getCode() != HttpStatus.SC_OK) {
            String errMsg = "调用远程服务：" + acctApiUrl.getOtheRemind() + "异常，HTTP状态码：" + info.getCode() + "，响应内容：" + info.getData();
            LogUtil.error("输入参数[pointInfoQryFroBillApiReq]=" + JSON.toJSONString(pointInfoQryFroBillApiReq), null, this.getClass());
            LogUtil.error(errMsg, null, this.getClass());
            return responseMess;
        }
        LogUtil.info("输出参数[pointInfoQryFroBillApiRes]=" + JSON.parseObject(info.getData(), StdCcrQueryServRes.class), null, this.getClass());
        PointInfoQryFroBillApiRes pointInfoQryFroBillApiRes= JSON.parseObject(info.getData(),PointInfoQryFroBillApiRes.class);
        if (pointInfoQryFroBillApiRes!= null){
            responseMess=pointInfoQryFroBillApiRes.getContractRoot().getResponseMess();
        }
        return responseMess;

    }
}