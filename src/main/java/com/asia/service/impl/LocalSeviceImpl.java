package com.asia.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.AcctApiUrl;
import com.asia.common.utils.HttpUtil;
import com.asia.common.utils.HttpUtil.HttpResult;
import com.asia.common.utils.LogUtil;
import com.asia.dao.OrclCommonDao;
import com.asia.domain.bon3.SearchAcctInfoReq;
import com.asia.domain.bon3.SearchAcctInfoReq.StdCcrQueryAcct;
import com.asia.domain.bon3.SearchAcctInfoRes;
import com.asia.domain.bon3.StdCcrQueryServRes.StdCcaQueryServResBean.StdCcaQueryServListBean;
import com.asia.domain.localApi.*;
import com.asia.domain.localApi.UserByPhoneQueryServiceRes.UserByPhoneQueryServiceResBean;
import com.asia.domain.localApi.UserByPhoneQueryServiceRes.UserByPhoneQueryServiceResBean.UserInfoListBean;
import com.asia.domain.localApi.child.*;
import com.asia.internal.common.BillException;
import com.asia.internal.common.CommonUserInfo;
import com.asia.internal.common.ResultInfo;
import com.asia.internal.errcode.ErrorCodeCompEnum;
import com.asia.mapper.billingmapper.ABalanceReturnLogMapper;
import com.asia.mapper.billingmapper.ABestPayReturnInfoDetailMapper;
import com.asia.mapper.billingmapper.ABestPayReturnInfoMapper;
import com.asia.mapper.billingmapper.AReturnRuleInstanceMapper;
import com.asia.mapper.billmapper.BillInstMappper;
import com.asia.mapper.cpcpmapper.POfferPayPlanInfoMapper;
import com.asia.mapper.orclmapper.*;
import com.asia.service.IlocalService;
import com.asia.vo.*;
import com.asiainfo.account.model.request.StdCcrRealTimeBillQueryRequest;
import com.asiainfo.account.model.response.StdCcaRealTimeBillQueryResponse;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asia.domain.localApi.QuerySubsidiesRes.SubsidiesInfo;
import com.asia.domain.localApi.QueryWingPaymentRedPackRes.WingPaymentRedPackSetType;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WangBaoQiang
 * @ClassName: LocalSeviceImpl
 * @description: TODO
 * @date 2019/8/616:40
 * @Version 1.0
 */
@Service
public class LocalSeviceImpl implements IlocalService {
    @Autowired
    private Info3mExeFeeMapper info3mExeFeeMapperDao;
    @Autowired
    private InfoAccu2ServiceMapper infoAccu2ServiceMapperDao;
    @Autowired
    private InfoAccu5gUserMapper infoAccu5gUserMapperDao;
    @Autowired
    private InfoHighFeeQueMapper infoHighFeeQueMapperDao;
    @Autowired
    private InfoNoAccu2ServiceMapper infoNoAccu2ServiceMapperDao;
    @Autowired
    private RemindKdRemainMapper remindKdRemainMapperDao;
    @Autowired
    private UmpSmsInfoMapper umpSmsInfoMapperDao;
    @Autowired
    private OrclCommonDao orclCommonDao;
    @Autowired
    ResultInfo resultInfo;
    @Autowired
    CommonUserInfo commonUserInfo;
    @Autowired
    InfoHdUserFeeMapper infoHdUserFeeMapperDao;
    @Autowired
    Bon3ServiceImpl bon3Service;
    @Autowired
    AcctApiUrl acctApiUrl;
    @Autowired
    BillInstMappper billInstMappperDao;
    @Autowired
    HeadRegionMapper headRegionMapperDao;
    @Autowired
    POfferPayPlanInfoMapper pOfferPayPlanInfoDao;
    @Autowired
    AReturnRuleInstanceMapper aReturnRuleInstanceDao;
    @Autowired
    ABalanceReturnLogMapper aBalanceReturnLogDao;
    @Autowired
    NfoHDUserFeeMapper nfoHDUserFeeDao;
    @Autowired
    ABestPayReturnInfoMapper aBestPayReturnInfoDao;
    @Autowired
    ABestPayReturnInfoDetailMapper aBestPayReturnInfoDetailDao;
    @Autowired
    QueryWingPaymentRedPackMapper queryWingPaymentRedPackDao;
    @Autowired
    InfoOverAccuFeeMapper infoOverAccuFeeMapperDao;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //月账话费高额
    @Override
    public QryMonthHighFeeRes qryMonthHighFee(QryMonthHighFeeReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        Info3mExeFee info3mExeFeeMap = new Info3mExeFee();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean> intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean intfCommServiceListBean = new IntfCommServiceListBean();

        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
        String accNumb = body.getQueryValue();

        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(accNumb, "", "", "", headers);
        //查询用户是否存在
        try {
            checkServExist(stdCcaQueryServ);
        }catch (BillException b){
            throw new BillException(b);
        }


        String custName = stdCcaQueryServ.getCustName();
        String accNbr = String.valueOf(accNumb);
        String servId = stdCcaQueryServ.getServId();
        //访问数据库

        String billMonth = body.getQueryMonth();
        String queryTimeType = body.getQueryTimeType();
        List<Info3mExeFee> info3mExeFeeList = new ArrayList<>();
        LogUtil.debug("[Begin 数据库查询月账话费高额]-------------------",null,this.getClass());
        if ("1".equals(queryTimeType)) {
            info3mExeFeeList = info3mExeFeeMapperDao.selectInfoHighFeeByBeginDate(accNumb, body.getBeginDate(), body.getEndDate());
        } else {//按月查询
            info3mExeFeeList = info3mExeFeeMapperDao.selectInfo3MExeFee(accNumb, billMonth);
        }
        LogUtil.debug("[数据库查询月账话费高额] " + info3mExeFeeList.toString(),null,this.getClass());
        if (info3mExeFeeList.size() > 0) {
            info3mExeFeeMap = info3mExeFeeList.get(0);
            intfCommServiceListBean.setAccNbr(accNbr);
            intfCommServiceListBean.setCustName(custName);
            intfCommServiceListBean.setServId(servId);
            intfCommServiceListBean.setRetCol1(info3mExeFeeMap.getCurCharge().toString());
            intfCommServiceListBean.setRetCol2(info3mExeFeeMap.getThreeMonAvgCharge().toString());
            intfCommServiceListBean.setRetCol3(info3mExeFeeMap.getAlarmDate());
            intfCommServiceList.add(intfCommServiceListBean);
            intfCommServiceListTypeBean.setIntfCommServiceList(intfCommServiceList);
            qryMonthHighFeeRes.setIntfCommServiceListType(intfCommServiceListTypeBean);
            qryMonthHighFeeRes.setResult("0");
            qryMonthHighFeeRes.setMsg("SUCCESS");
            return qryMonthHighFeeRes;
        } else {
            throw new BillException(ErrorCodeCompEnum.QUERY_NO_DATA);
        }

    }

    //实时话费高额
    @Override
    public QryMonthHighFeeRes qryRealHighFee(QryMonthHighFeeReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        InfoHighFeeQue infoHighFeeQueMap = new InfoHighFeeQue();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean> intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean intfCommServiceListBean = new IntfCommServiceListBean();

        String accNumb = body.getQueryValue();
        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(accNumb, "", "", "", headers);
        //查询用户是否存在
        try {
            checkServExist(stdCcaQueryServ);
        }catch (BillException b){
            throw new BillException(b);
        }
        String custName = stdCcaQueryServ.getCustName();
        String accNbr = String.valueOf(accNumb);
        String servId = stdCcaQueryServ.getServId();

        String billMonth = body.getQueryMonth();
        String queryTimeType = body.getQueryTimeType();
        String itemGroupName = "";
        List<InfoHighFeeQue> info3mExeFeeList = new ArrayList<>();
        LogUtil.debug("[Begin 数据库查询实时话费高额]-------------------",null,this.getClass());
        //按起止时间查询
        if ("1".equals(queryTimeType)) {
            info3mExeFeeList = infoHighFeeQueMapperDao.selectInfoHighFeeByBeginDate(accNumb, body.getBeginDate(), body.getEndDate());
        } else {//按月查询
            info3mExeFeeList = infoHighFeeQueMapperDao.selectInfoHighFee(accNumb, billMonth);
        }
        LogUtil.debug("[数据库查询实时话费高额] " + info3mExeFeeList.toString(),null,this.getClass());
        if (info3mExeFeeList.size() > 0) {
            infoHighFeeQueMap = info3mExeFeeList.get(0);
            intfCommServiceListBean.setAccNbr(accNbr);
            intfCommServiceListBean.setCustName(custName);
            intfCommServiceListBean.setServId(servId);
            switch (infoHighFeeQueMap.getItemGroupId()){
                case 1 :
                    itemGroupName = "国内语音";break;
                case 2:
                    itemGroupName = "国际语音";break;
                case 3:
                    itemGroupName = "国内数据";break;
                case 4:
                    itemGroupName = "国际数据";break;
                case 5:
                    itemGroupName = "增值业务";break;
                case 6:
                    itemGroupName = "国际数据漫出";break;
                case 7:
                    itemGroupName = "国际短信漫出";break;
                case 8:
                    itemGroupName = "国际语音漫出";break;
                    default:
                        break;
            }
            intfCommServiceListBean.setRetCol1(infoHighFeeQueMap.getItemGroupId().toString());
            intfCommServiceListBean.setRetCol2(itemGroupName);
            intfCommServiceListBean.setRetCol3(infoHighFeeQueMap.getCharge().toString());
            intfCommServiceListBean.setRetCol4(infoHighFeeQueMap.getAlarmDate());
            intfCommServiceList.add(intfCommServiceListBean);
            intfCommServiceListTypeBean.setIntfCommServiceList(intfCommServiceList);
            qryMonthHighFeeRes.setIntfCommServiceListType(intfCommServiceListTypeBean);
            qryMonthHighFeeRes.setResult("0");
            qryMonthHighFeeRes.setMsg("SUCCESS");
            return qryMonthHighFeeRes;
        } else {
            throw new BillException(ErrorCodeCompEnum.QUERY_NO_DATA);
        }

    }

    //日流量告警
    @Override
    public QryMonthHighFeeRes qryDataHighFlow(QryMonthHighFeeReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        InfoAccu5gUser infoAccu5gUserMap = new InfoAccu5gUser();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean> intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean intfCommServiceListBean = new IntfCommServiceListBean();

        String accNumb = body.getQueryValue();
        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(accNumb, "", "", "", headers);
        //查询用户是否存在
        try {
            checkServExist(stdCcaQueryServ);
        }catch (BillException b){
            throw new BillException(b);
        }
        String custName = stdCcaQueryServ.getCustName();
        String accNbr = String.valueOf(accNumb);
        String servId = stdCcaQueryServ.getServId();
        String billMonth = body.getQueryMonth();
        String queryTimeType = body.getQueryTimeType();
        List<InfoAccu5gUser> info3mExeFeeList = new ArrayList<>();
        LogUtil.debug("[Begin 数据库查询日流量告警]-------------------",null,this.getClass());
        //按起止时间查询
        if ("1".equals(queryTimeType)) {
            info3mExeFeeList = infoAccu5gUserMapperDao.selectInfoAccu5gUserByBeginDate(accNumb, body.getBeginDate(), body.getEndDate());
        } else {//按月查询
            info3mExeFeeList = infoAccu5gUserMapperDao.selectInfoAccu5gUser(accNumb, billMonth);
        }
        LogUtil.debug("[数据库查询日流量告警] " + info3mExeFeeList.toString(),null,this.getClass());
        //List<InfoAccu5gUser> info3mExeFeeList = infoAccu5gUserMapperDao.selectInfoAccu5gUser(accNumb, billMonth);
        if (info3mExeFeeList.size() > 0) {
            infoAccu5gUserMap = info3mExeFeeList.get(0);
            intfCommServiceListBean.setAccNbr(accNbr);
            intfCommServiceListBean.setCustName(custName);
            intfCommServiceListBean.setServId(servId);
            intfCommServiceListBean.setRetCol1(infoAccu5gUserMap.getDayStream().toString());
            intfCommServiceListBean.setRetCol2(infoAccu5gUserMap.getExecDay());
            intfCommServiceListBean.setRetCol3(infoAccu5gUserMap.getTotalStream().toString());
            intfCommServiceListBean.setRetCol4(infoAccu5gUserMap.getAlarmDate());
            intfCommServiceList.add(intfCommServiceListBean);
            intfCommServiceListTypeBean.setIntfCommServiceList(intfCommServiceList);
            qryMonthHighFeeRes.setIntfCommServiceListType(intfCommServiceListTypeBean);
            qryMonthHighFeeRes.setResult("0");
            qryMonthHighFeeRes.setMsg("SUCCESS");
            return qryMonthHighFeeRes;
        } else {
            throw new BillException(ErrorCodeCompEnum.QUERY_NO_DATA);
        }

    }

    //累积量超出提醒
    @Override
    public QryMonthHighFeeRes  qryAccuOverFlow(QryMonthHighFeeReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        InfoAccu2Service infoAccu2ServiceMap = new InfoAccu2Service();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean> intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean intfCommServiceListBean = new IntfCommServiceListBean();

        String accNumb = body.getQueryValue();

        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(accNumb, "", "",
                "", headers);
        //查询用户是否存在
        try {
            checkServExist(stdCcaQueryServ);
        }catch (BillException b){
            throw new BillException(b);
        }
        String custName = stdCcaQueryServ.getCustName();
        String accNbr = String.valueOf(accNumb);
        String servId = stdCcaQueryServ.getServId();

        String billMonth = body.getQueryMonth();
        String queryTimeType = body.getQueryTimeType();
        List<InfoAccu2Service> info3mExeFeeList = new ArrayList<>();
        LogUtil.debug("[Begin 数据库查询累积量超出提醒]-------------------",null,this.getClass());
        //按起止时间查询
        if ("1".equals(queryTimeType)) {
            info3mExeFeeList = infoAccu2ServiceMapperDao.selectInfoAccu2ServiceByBeginDate(accNbr, body.getBeginDate(), body.getEndDate());
        } else {//按月查询
            info3mExeFeeList = infoAccu2ServiceMapperDao.selectInfoAccu2Service(accNbr, billMonth);
        }
        LogUtil.debug("[数据库查询累积量超出提醒] " + info3mExeFeeList.toString(),null,this.getClass());
        //List<InfoAccu2Service> info3mExeFeeList = infoAccu2ServiceMapperDao.selectInfoAccu2Service(accNumb, billMonth);
        if (info3mExeFeeList.size() > 0) {
            infoAccu2ServiceMap = info3mExeFeeList.get(0);
            intfCommServiceListBean.setAccNbr(accNbr);
            intfCommServiceListBean.setCustName(custName);
            intfCommServiceListBean.setServId(servId);
            intfCommServiceListBean.setRetCol1(infoAccu2ServiceMap.getTotalStream().toString());
            intfCommServiceListBean.setRetCol2(infoAccu2ServiceMap.getCurStream().toString());
            intfCommServiceListBean.setRetCol3(infoAccu2ServiceMap.getAlarmDate());
            intfCommServiceList.add(intfCommServiceListBean);
            intfCommServiceListTypeBean.setIntfCommServiceList(intfCommServiceList);
            qryMonthHighFeeRes.setIntfCommServiceListType(intfCommServiceListTypeBean);
            qryMonthHighFeeRes.setResult("0");
            qryMonthHighFeeRes.setMsg("SUCCESS");
            return qryMonthHighFeeRes;
        } else {
            throw new BillException(ErrorCodeCompEnum.QUERY_NO_DATA);
        }

    }

    //月账话费高额
    @Override
    public QryMonthHighFeeRes qryUserFlowFee(QryMonthHighFeeReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        InfoNoAccu2Service infoNoAccu2ServiceMap = new InfoNoAccu2Service();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean> intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean intfCommServiceListBean = new IntfCommServiceListBean();

        String accNumb = body.getQueryValue();

        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(accNumb, "", "",
                "", headers);
        //查询用户是否存在
        try {
            checkServExist(stdCcaQueryServ);
        }catch (BillException b){
            throw new BillException(b);
        }
        String custName = stdCcaQueryServ.getCustName();
        String accNbr = String.valueOf(accNumb);
        String servId = stdCcaQueryServ.getServId();

        String billMonth = body.getQueryMonth();
        String queryTimeType = body.getQueryTimeType();
        List<InfoNoAccu2Service> info3mExeFeeList = new ArrayList<>();
        LogUtil.debug("[Begin 数据库查询月账话费高额]-------------------",null,this.getClass());
        //按起止时间查询
        if ("1".equals(queryTimeType)) {
            info3mExeFeeList = infoNoAccu2ServiceMapperDao.selectInfoNoAccu2ServiceByBeginDate(accNumb, body.getBeginDate(), body.getEndDate());
        } else {//按月查询
            info3mExeFeeList = infoNoAccu2ServiceMapperDao.selectInfoNoAccu2Service(accNumb, billMonth);
        }
        LogUtil.debug("[数据库查询月账话费高额] " + info3mExeFeeList.toString(),null,this.getClass());
        //List<InfoNoAccu2Service> info3mExeFeeList = infoNoAccu2ServiceMapperDao.selectInfoNoAccu2Service(accNumb, billMonth);
        if (info3mExeFeeList.size() > 0) {
            infoNoAccu2ServiceMap = info3mExeFeeList.get(0);
            //qryMonthHighFeeRes.setResult("0");
            intfCommServiceListBean.setAccNbr(accNbr);
            intfCommServiceListBean.setCustName(custName);
            intfCommServiceListBean.setServId(servId);
            intfCommServiceListBean.setRetCol1(infoNoAccu2ServiceMap.getStatMonth());
            intfCommServiceListBean.setRetCol2(infoNoAccu2ServiceMap.getMonthStream().toString());
            intfCommServiceListBean.setRetCol3(infoNoAccu2ServiceMap.getMonthCharge().toString());
            intfCommServiceListBean.setRetCol4(infoNoAccu2ServiceMap.getAlarmDate());
            intfCommServiceList.add(intfCommServiceListBean);
            intfCommServiceListTypeBean.setIntfCommServiceList(intfCommServiceList);
            qryMonthHighFeeRes.setIntfCommServiceListType(intfCommServiceListTypeBean);
            qryMonthHighFeeRes.setResult("0");
            qryMonthHighFeeRes.setMsg("SUCCESS");
            return qryMonthHighFeeRes;
        } else {
            throw new BillException(ErrorCodeCompEnum.QUERY_NO_DATA);
        }

    }

    //发送日志
    @Override
    public QryMonthHighFeeRes qrySendMsgUser(QryMonthHighFeeReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        UmpSmsInfo umpSmsInfoMap = new UmpSmsInfo();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean> intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean intfCommServiceListBean = new IntfCommServiceListBean();

        String accNumb = body.getQueryValue();

        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(accNumb, "", "",
                "", headers);
        //查询用户是否存在
        try {
            checkServExist(stdCcaQueryServ);
        }catch (BillException b){
            throw new BillException(b);
        }
        String custName = stdCcaQueryServ.getCustName();
        String accNbr = String.valueOf(accNumb);
        String servId = stdCcaQueryServ.getServId();

        String billMonth = body.getQueryMonth();
        String beginDate = body.getBeginDate();
        String endDate = body.getEndDate();
        List<UmpSmsInfo> info3mExeFeeList = umpSmsInfoMapperDao.selectUmpSmsInfo(accNumb, beginDate, endDate);
        if (info3mExeFeeList.size() > 0) {
            umpSmsInfoMap = info3mExeFeeList.get(0);
            //qryMonthHighFeeRes.setResult("0");
            intfCommServiceListBean.setAccNbr(accNbr);
            intfCommServiceListBean.setCustName(custName);
            intfCommServiceListBean.setServId(servId);
            intfCommServiceListBean.setRetCol1(umpSmsInfoMap.getMsgId());
            intfCommServiceListBean.setRetCol2(umpSmsInfoMap.getMsg());
            intfCommServiceListBean.setRetCol3(umpSmsInfoMap.getGetDate());
            intfCommServiceListBean.setRetCol4(umpSmsInfoMap.getSendDate());
            intfCommServiceList.add(intfCommServiceListBean);
            intfCommServiceListTypeBean.setIntfCommServiceList(intfCommServiceList);
            qryMonthHighFeeRes.setIntfCommServiceListType(intfCommServiceListTypeBean);
            qryMonthHighFeeRes.setResult("0");
            qryMonthHighFeeRes.setMsg("SUCCESS");
            return qryMonthHighFeeRes;
        } else {
            throw new BillException(ErrorCodeCompEnum.QUERY_NO_DATA);
        }

    }

    //宽带到期提醒
    @Override
    public QryMonthHighFeeRes qryWlanRemain(QryMonthHighFeeReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        RemindKdRemain remindKdRemainMap = new RemindKdRemain();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean> intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean intfCommServiceListBean = new IntfCommServiceListBean();

        String accNumb = String.valueOf(body.getQueryValue());

        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(String.valueOf(accNumb), "", "",
                "", headers);
        //查询用户是否存在
        try {
            checkServExist(stdCcaQueryServ);
        }catch (BillException b){
            throw new BillException(b);
        }
        String custName = stdCcaQueryServ.getCustName();
        String accNbr = String.valueOf(accNumb);
        String servId = stdCcaQueryServ.getServId();

        String billMonth = body.getQueryMonth();
        String beginDate = body.getBeginDate();
        String endDate = body.getEndDate();
        String queryTimeType = body.getQueryTimeType();
        List<RemindKdRemain> info3mExeFeeList = new ArrayList<>();
        LogUtil.debug("[Begin 数据库查询宽带到期提醒]-------------------",null,this.getClass());
        //按起止时间查询
        if ("1".equals(queryTimeType)) {
            info3mExeFeeList = remindKdRemainMapperDao.selectRemindKdRemain(accNumb, body.getBeginDate(), body.getEndDate());
        } else {//按月查询
            info3mExeFeeList = remindKdRemainMapperDao.selectRemindKdRemainByMonth(accNumb, billMonth);
        }
        LogUtil.debug("[数据库查询宽带到期提醒]-------------------",null,this.getClass());
        //List<RemindKdRemain> info3mExeFeeList = remindKdRemainMapperDao.selectRemindKdRemain(accNumb, beginDate,endDate);
        if (info3mExeFeeList.size() > 0) {
            remindKdRemainMap = info3mExeFeeList.get(0);
            //qryMonthHighFeeRes.setResult("0");
            intfCommServiceListBean.setAccNbr(accNbr);
            intfCommServiceListBean.setCustName(custName);
            intfCommServiceListBean.setServId(servId);
            intfCommServiceListBean.setRetCol1(String.valueOf(remindKdRemainMap.getOfferId()));
            intfCommServiceListBean.setRetCol2(remindKdRemainMap.getOfferName());
            intfCommServiceListBean.setRetCol3(String.valueOf(remindKdRemainMap.getOfferInstId()));
            intfCommServiceListBean.setRetCol4(String.valueOf(remindKdRemainMap.getDayRent()));
            intfCommServiceListBean.setRetCol5(String.valueOf(remindKdRemainMap.getCurMonRent()));
            intfCommServiceListBean.setRetCol6(String.valueOf(remindKdRemainMap.getCurBalance()));
            intfCommServiceListBean.setRetCol7(remindKdRemainMap.getExpDate());
            intfCommServiceListBean.setRetCol8(String.valueOf(remindKdRemainMap.getLastDays()));
            intfCommServiceListBean.setRetCol9(remindKdRemainMap.getStateDate());
            intfCommServiceList.add(intfCommServiceListBean);
            intfCommServiceListTypeBean.setIntfCommServiceList(intfCommServiceList);
            qryMonthHighFeeRes.setIntfCommServiceListType(intfCommServiceListTypeBean);
            qryMonthHighFeeRes.setResult("0");
            qryMonthHighFeeRes.setMsg("SUCCESS");
            return qryMonthHighFeeRes;
        } else {
            throw new BillException(ErrorCodeCompEnum.QUERY_NO_DATA);
        }

    }



    //累积量超出量查询
    @Override
    public QryMonthHighFeeRes qryOverAccuFee(QryMonthHighFeeReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        Info3mExeFee info3mExeFeeMap = new Info3mExeFee();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean> intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean intfCommServiceListBean = new IntfCommServiceListBean();

        String accNumb = body.getQueryValue();

        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(accNumb, "", "",
                "", headers);
        //查询用户是否存在
        try {
            checkServExist(stdCcaQueryServ);
        }catch (BillException b){
            throw new BillException(b);
        }
        String custName = stdCcaQueryServ.getCustName();
        String servId = stdCcaQueryServ.getServId();
        String areaCode = stdCcaQueryServ.getHomeAreaCode();
        String billMonth = body.getQueryMonth();
        String prodInstId = stdCcaQueryServ.getServId();
        Map map = new HashMap();
        //resultInfo = orclCommonDao.overAccuData(prodInstId, billMonth, map,areaCode);
        billMonth+="01";
        map=orclCommonDao.overAccuData(prodInstId, billMonth,areaCode);
        if (map!=null) {//
            //qryMonthHighFeeRes.setResult("0");
            intfCommServiceListBean.setAccNbr(accNumb);
            intfCommServiceListBean.setCustName(custName);
            intfCommServiceListBean.setServId(servId);
            intfCommServiceListBean.setRetCol1(map.get("OVERCHARGE").toString());
            intfCommServiceListBean.setRetCol2(map.get("OVERDATA").toString());
            intfCommServiceList.add(intfCommServiceListBean);
            intfCommServiceListTypeBean.setIntfCommServiceList(intfCommServiceList);
            qryMonthHighFeeRes.setIntfCommServiceListType(intfCommServiceListTypeBean);
            qryMonthHighFeeRes.setResult("0");
            qryMonthHighFeeRes.setMsg("SUCCESS");
            return qryMonthHighFeeRes;
        } else {
            throw new BillException(ErrorCodeCompEnum.QUERY_NO_DATA);
        }
    }

    //详单打印记录
    @Override
    public MeterPrintActionRes printRecordService(MeterPrintActionReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException {
        MeterPrintActionRes meterPrintActionRes = new MeterPrintActionRes();
        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();

        String accNumb = body.getAccNbr();
        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(accNumb, "", "",
                "", headers);
        //查询用户是否存在
        try {
            checkServExist(stdCcaQueryServ);
        }catch (BillException b){
            throw new BillException(b);
        }
        //访问数据库
        resultInfo = orclCommonDao.preserveMeterPrintLog(body);
        if ("0".equals(resultInfo.getCode())) {
            meterPrintActionRes.setResult("0");
            meterPrintActionRes.setCode("0");
            meterPrintActionRes.setMsg(resultInfo.getMessage());
            return meterPrintActionRes;
        } else {
            meterPrintActionRes.setResult("1");
            meterPrintActionRes.setMsg(resultInfo.getMessage());
            return meterPrintActionRes;
        }
    }

    //详单禁查
    @Override
    public UserMeterOrderRes userMeterOrderService(UserMeterOrderReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException, BillException {
        UserMeterOrderRes userMeterOrderRes = new UserMeterOrderRes();
        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
        String accNumb = body.getQueryValue();
        String action = body.getAction();
        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(accNumb, "", "", "", headers);
        //查询用户
        try {
            checkServExist(stdCcaQueryServ);
        }catch (BillException b){
            throw new BillException(b);
        }
        String servId = stdCcaQueryServ.getServId();

        String areaCode = stdCcaQueryServ.getHomeAreaCode();
        //访问数据库
        resultInfo = orclCommonDao.userMeterOrder(servId, action, areaCode);
        if ("0".equals(resultInfo.getCode())) {
            userMeterOrderRes.setResult("0");
            userMeterOrderRes.setCode("0");
            userMeterOrderRes.setMsg(resultInfo.getMessage());
            return userMeterOrderRes;
        } else {
            userMeterOrderRes.setResult("1");
            userMeterOrderRes.setCode(resultInfo.getCode());
            userMeterOrderRes.setMsg(resultInfo.getMessage());
            return userMeterOrderRes;
        }
    }
    /*
     * @Author WangBaoQiang
     * @Description 协议金额查询
     * @Date 20:27 2019/10/15
     * @Param [body, headers]
     * @return com.asia.domain.localApi.QueryAgreementConsumptionRes
    */
    @Override
    public QueryAgreementConsumptionRes queryAgreementConsumption(QueryAgreementConsumptionReq body,
                                                                  Map<String, String> headers) throws ClientProtocolException, IOException, BillException {
        QueryAgreementConsumptionRes queryAgreementConsumptionRes = new QueryAgreementConsumptionRes();
        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
        List<AgreementConsumeSetBean> agreementConsumeSetBeanList = new ArrayList<>();
        AgreementConsumeSetBean agreementConsumeSetBean = new AgreementConsumeSetBean();
        AgreementConsumeSetTypeBean agreementConsumeSetTypeBean = new AgreementConsumeSetTypeBean();
        String accNumb = body.getValue();
        String userType = body.getUserType();
        String valueType = body.getValueType();
        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(accNumb, "", "", "", headers);
        //用户信息查询
        try {
            checkServExist(stdCcaQueryServ);
        }catch (BillException b){
            throw new BillException(b);
        }
        String servId = stdCcaQueryServ.getServId();
        queryAgreementConsumptionRes.setResult("0");
        List<InfoHdUserFee> infoHdUserFeeList = infoHdUserFeeMapperDao.selectInfoHdUserFee(servId);
        if (infoHdUserFeeList.size() > 0) {
            for (InfoHdUserFee hdUserFee : infoHdUserFeeList) {
                agreementConsumeSetBean.setOfferInstId(hdUserFee.getOfferId().toString());
                agreementConsumeSetBean.setProdInstId(hdUserFee.getProdId().toString());
                agreementConsumeSetBean.setRentMonth(hdUserFee.getRentMonth().toString());
                agreementConsumeSetBean.setTotalFee(hdUserFee.getCrmTotalFee());
                agreementConsumeSetBean.setUsedFee(hdUserFee.getBillTotalFee().toString());
                agreementConsumeSetBeanList.add(agreementConsumeSetBean);
                agreementConsumeSetTypeBean.setAgreementConsumeSetType(agreementConsumeSetBeanList);
            }
            queryAgreementConsumptionRes.setAgreementConsumeSet(agreementConsumeSetTypeBean);
        } else {
            throw new BillException(ErrorCodeCompEnum.QUERY_NO_DATA);
            //queryAgreementConsumptionRes.setMsg("数据为空");
        }
        return queryAgreementConsumptionRes;
    }
    /**
     * @Author WangBaoQiang
     * @Description 判断本网异网
     * @Date 20:30 2019/10/15
     * @Param [body, headers]
     * @return com.asia.domain.localApi.UserByPhoneQueryServiceRes
    */
    @Override
    public UserByPhoneQueryServiceRes userByPhoneQueryService(UserByPhoneQueryServiceReq body,
                                                              Map<String, String> headers) throws ClientProtocolException, IOException, BillException {
        UserByPhoneQueryServiceRes userByPhoneQueryServiceRes = new UserByPhoneQueryServiceRes();
        UserByPhoneQueryServiceResBean userByPhoneQueryServiceResBean = new UserByPhoneQueryServiceResBean();
        UserInfoListBean userInfoListBean = new UserInfoListBean();
        //用户信息查询
        String accNum = body.getAccNum();
        Map map = new HashMap();
        map.put("accNbr", accNum);
        //先屏蔽掉携号转网
       /*
       Map npMap = new HashMap();
        Map netWorkMap = new HashMap();
       List<Map<String,Object>> npList =  billInstMappperDao.selectNpAccNbr(map);
        List<Map<String, Object>> netWorkList = new ArrayList<>();
       if(npList.size() > 0){
           npMap = npList.get(0);
           netWorkList = billInstMappperDao.selectNewWorkPartner(npMap);
           netWorkMap = netWorkList.get(0);
           if ("00104310".equals(netWorkMap.get("networkId"))) {
               userInfoListBean.setNetType("0");
           }

       }*/
        LogUtil.debug("[开始查询数据库，查询用户归属信息]-----------------",null, this.getClass());
        List<Map<String,Object>> regionList = headRegionMapperDao.selectHeadRegion(map);
        LogUtil.debug("[数据库返回结果]" + regionList.toString(),null, this.getClass());
        if (regionList.size() > 0) {
            map = regionList.get(0);
            userInfoListBean.setAreaCode(String.valueOf(map.get("orgAreaCode")));
            userInfoListBean.setPhoneId(body.getAccNum());
            userInfoListBean.setUserType(body.getAccNumType());
            userInfoListBean.setNetType(String.valueOf(map.get("nettype")));
            userByPhoneQueryServiceResBean.setUserInfoList(userInfoListBean);
        }else {
            throw new BillException(ErrorCodeCompEnum.QUERY_NO_DATA);
        }
        userByPhoneQueryServiceRes.setResult("0");
        userByPhoneQueryServiceRes.setMsg("SUCESS");
        userByPhoneQueryServiceRes.setUserByPhoneQueryServiceRes(userByPhoneQueryServiceResBean);
        return userByPhoneQueryServiceRes;
    }
    @Override
    public StdCcaRealTimeBillQueryResponse queryAddValueList(StdCcrRealTimeBillQueryRequest body, Map<String, String> headers) throws ClientProtocolException, IOException {
        StdCcaRealTimeBillQueryResponse stdCcaRealTimeBillQueryResponse = new StdCcaRealTimeBillQueryResponse();

        return new StdCcaRealTimeBillQueryResponse();
    }

    //是否为电信号段（查号头表）
    public MobileNumberQueryRes moBileNumberQuery(MobileNumberQueryReq mobileNumberQueryReq, Map<String, String> headers) throws IOException, BillException {
        MobileNumberQueryRes info = new MobileNumberQueryRes();
        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(mobileNumberQueryReq.getValue(), "", "",
                "", headers);
        try {
            checkServExist(stdCcaQueryServ);
        }catch (BillException b){
            throw new BillException(b);
        }
        MobileNumberQueryRes mobileNumberQueryRes=orclCommonDao.moBileNumberQuery(mobileNumberQueryReq, headers);
        return mobileNumberQueryRes;
    }

    //查询余额信息，返回违约金、专用账目组、专用账目组
    public AccountBalanceCpcpQueryRes accountBalanceCpcpQuery(AccountBalanceCpcpQueryReq accountBalanceCpcpQueryReq, Map<String, String> headers) throws IOException, BillException {
        AccountBalanceCpcpQueryRes result = new AccountBalanceCpcpQueryRes();
        HashMap<String, Object> operAttrStructMap = new HashMap<String, Object>();//操作人属性
        String staffId = accountBalanceCpcpQueryReq.getStaffId();
        String systemId = accountBalanceCpcpQueryReq.getSystemId();
        String accNum = accountBalanceCpcpQueryReq.getAccNum();
        String accNumType = accountBalanceCpcpQueryReq.getAccNumType();
        String areaId = accountBalanceCpcpQueryReq.getAccNumAreaCode();
        String operOrgId = "0";
        if (systemId == "1") {//随便写的业务逻辑
            operOrgId = "2";
        }
        operAttrStructMap.put("staffId", staffId);
        operAttrStructMap.put("operOrgId", operOrgId);
        operAttrStructMap.put("operTime", "");
        operAttrStructMap.put("operPost", 0);
        operAttrStructMap.put("operServiceId", "");
        operAttrStructMap.put("lanId", 0);

        HashMap<String, Object> svcObjectStructMap = new HashMap<String, Object>();//服务对象条件
        svcObjectStructMap.put("objType", "3");
        svcObjectStructMap.put("objValue", accNum);
        svcObjectStructMap.put("objAttr", accNumType);
        svcObjectStructMap.put("dataArea", "");

        JSONObject obj = new JSONObject();
        obj.put("operAttrStruct", operAttrStructMap);
        obj.put("svcObjectStruct", svcObjectStructMap);
        obj.put("queryFlag", "1");
        obj.put("queryItemType", "0");
        obj.put("areacode", areaId);
        obj.put("systemId", systemId);
        String balanceQuery = obj.toString();

        Map<String, String> object = new HashMap<String, String>();
        object.put("appID", "1111111");

        HttpResult balanceResult = null;
        LogUtil.debug("[开始调用远程服务 余额查询]"+ acctApiUrl.getQueryBalance(),null, this.getClass());
        LogUtil.debug("输入参数[balanceQuery]="+balanceQuery.toString(),null, this.getClass());
        try {
            balanceResult = HttpUtil.doPostJson(acctApiUrl.getQueryBalance(), balanceQuery, object);
        } catch (ClientProtocolException e) {
            LogUtil.error("连接错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        } catch (IOException e) {
            LogUtil.error("IO流错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        if (balanceResult.getData() == null) {
            throw new BillException(ErrorCodeCompEnum.QUERY_NO_DATA);
        }
        if(balanceResult.getCode() != HttpStatus.SC_OK){
            String errorMsg=getHttpErrorInfo(acctApiUrl.getQryBill(),balanceResult);
            LogUtil.error(errorMsg,null,this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        LogUtil.debug("[调用远程服务 余额查询]"+acctApiUrl.getQueryBalance()+"输出结果[result]="
                +balanceResult.toString(),null,this.getClass());

        JSONObject json = JSON.parseObject(balanceResult.getData());
        List<Map<String, Object>> list = (List<Map<String, Object>>) json.get("balanceQuery");
        String realBalance = json.get("realBalance").toString();
        List<BalanceInfosListBean> infosList = new ArrayList<BalanceInfosListBean>();
        List<BalanceItemsListBean> itemsList = new ArrayList<BalanceItemsListBean>();
        int tyBalance = 0;
        int zyBalance = 0;
        int userLevelBalance = 0;
        int userAcctBalance = 0;
        int acctLevelBalance = 0;
        for (int i = 0; i < list.size(); i++) {

            String balance = list.get(i).get("balance").toString();
            String balanceTypeFlag = list.get(i).get("balanceTypeFlag").toString();
            String available = list.get(i).get("available").toString();
            String desc = list.get(i).get("desc").toString();
            String effDate = list.get(i).get("effDate").toString();
            String expDate = list.get(i).get("expDate").toString();
            if (balanceTypeFlag.equals("0")) {
                tyBalance += Integer.parseInt(balance);
            } else if (balanceTypeFlag.equals("1")) {
                zyBalance += Integer.parseInt(balance);
            } else if (balanceTypeFlag.equals("2")) {
                userLevelBalance += Integer.parseInt(balance);
            } else if (balanceTypeFlag.equals("3")) {
                userAcctBalance += Integer.parseInt(balance);
            } else if (balanceTypeFlag.equals("4")) {
                acctLevelBalance += Integer.parseInt(balance);
            }


            BalanceItemsListBean balanceItemsListBean = new BalanceItemsListBean();
            balanceItemsListBean.setAcctNbr(accNum);
            balanceItemsListBean.setBalance(available);
            balanceItemsListBean.setBalanceType(desc);
            balanceItemsListBean.setEffDate(effDate);
            balanceItemsListBean.setExpDate(expDate);
            balanceItemsListBean.setItem_group_name("");
            balanceItemsListBean.setLevel("帐户级别");


            itemsList.add(balanceItemsListBean);
        }
        BalanceInfosListBean balanceInfosListBean = new BalanceInfosListBean();
        balanceInfosListBean.setAocBalance(String.valueOf(tyBalance));
        balanceInfosListBean.setAocUnitName("通用余额");
        infosList.add(balanceInfosListBean);
        BalanceInfosListBean balanceInfosListZy = new BalanceInfosListBean();
        balanceInfosListZy.setAocBalance(String.valueOf(zyBalance));
        balanceInfosListZy.setAocUnitName("专用余额");
        infosList.add(balanceInfosListZy);
        BalanceInfosListBean balanceInfosListYh = new BalanceInfosListBean();
        balanceInfosListYh.setAocBalance(String.valueOf(userLevelBalance));
        balanceInfosListYh.setAocUnitName("用户级");
        infosList.add(balanceInfosListYh);
        BalanceInfosListBean balanceInfosListYhAcct = new BalanceInfosListBean();
        balanceInfosListYhAcct.setAocBalance(String.valueOf(userAcctBalance));
        balanceInfosListYhAcct.setAocUnitName("用户账目组级");
        infosList.add(balanceInfosListYhAcct);
        BalanceInfosListBean balanceInfosListZh = new BalanceInfosListBean();
        balanceInfosListZh.setAocBalance(String.valueOf(acctLevelBalance));
        balanceInfosListZh.setAocUnitName("账户账目组级");
        infosList.add(balanceInfosListZh);

        result.setBalanceInfos(infosList);
        result.setBalanceItems(itemsList);
        DecimalFormat fnum = new DecimalFormat("##0.00");
        //判断是否欠费
        if (Integer.parseInt(realBalance) > 0) {
            result.setBalanceAvl(realBalance);
            result.setDueCharge("0");
        } else {
            JSONObject obj2 = new JSONObject();
            obj2.put("billQueryType", "2");
            obj2.put("destinationAccount",  accNum);
            obj2.put("destinationAttr", accNumType);
            obj2.put("queryFlag", "1");
            obj2.put("feeQueryFlag", "0");
            obj2.put("operAttrStruct", operAttrStructMap);
            String oweQry = obj2.toString();

            Map<String, String> object2 = new HashMap<String, String>();
            object2.put("appID", "1111111");

            LogUtil.debug("[开始调用远程服务 欠费查询]"+ acctApiUrl.getQryBill(),null, this.getClass());
            LogUtil.debug("输入参数[oweQry]="+oweQry.toString(),null, this.getClass());
            HttpResult oweResult = null;
            try {
                oweResult = HttpUtil.doPostJson(acctApiUrl.getQryBill(), oweQry, object2);
            } catch (ClientProtocolException e) {
                LogUtil.error("连接错误", e, this.getClass());
                throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
            } catch (IOException e) {
                LogUtil.error("IO流错误", e, this.getClass());
                throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
            }
            if(oweResult.getCode() != HttpStatus.SC_OK){
                String errorMsg=getHttpErrorInfo(acctApiUrl.getQryBill(),oweResult);
                LogUtil.error(errorMsg,null,this.getClass());
                throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
            }
            if (oweResult.getData() == null) {
                throw new BillException(ErrorCodeCompEnum.QUERY_BILL_Err);
            }
            LogUtil.debug("[调用远程服务 欠费查询]"+acctApiUrl.getGetOweList()+"输出结果[result]="
                    +oweResult.toString(),null,this.getClass());

            JSONObject oweJson = JSON.parseObject(oweResult.getData());
            result.setBalanceAvl("0");
            //float due=Float.parseFloat(oweJson.get("due").toString());
            //String duecharge="0";
           /* if(due!=0) {
                duecharge = fnum.format(due / 100);
            }*/
            String duecharge=oweJson.get("due").toString();
            result.setDueCharge(duecharge);
           // String oweCharge=fnum.format((Float.parseFloat(realBalance)*(-1))/100);
            String oweCharge=String.valueOf(Integer.parseInt(realBalance)*(-1));
            result.setOweCharge(oweCharge);
        }
        result.setIsBalanceInfoSucess("1");
        result.setIsBalanceItemSucess("1");
        result.setIsOweInfoSucess("1");
        result.setIsSucess("1");
        result.setMsg("成功");
        result.setOweInfoMsg("成功");
        return result;
    }

    //查询用户的增值账单，（三级账单递归展示）
    public QueryAddValueFeeRes queryAddValueFee(QueryAddValueFeeReq queryAddValueFeeReq,
                                                Map<String, String> heads) throws Exception, BillException {
        QueryAddValueFeeRes queryAddValueFeeRes = new QueryAddValueFeeRes();
        QueryAddValueFeeResBean queryAddValueFeeResBean = new QueryAddValueFeeResBean();
        String query = queryAddValueFeeReq.toString();
        List<QueryAddValueFeeResListBean> list = new ArrayList<QueryAddValueFeeResListBean>();
        //要是需要消息头这里增加
        Map<String, String> object = new HashMap<String, String>();
        object.put("appID", "1111111");

        LogUtil.debug("[开始调用远程服务 账单查询]"+ acctApiUrl.getGetOweList(),null, this.getClass());
        LogUtil.debug("输入参数[queryAddValueFeeReq]="+queryAddValueFeeReq.toString(),null, this.getClass());
        HttpResult resultOweList = null;
        try {
            resultOweList = HttpUtil.doPostJson(acctApiUrl.getGetOweList(), query, object);
        } catch (ClientProtocolException e) {
            LogUtil.error("连接错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        } catch (IOException e) {
            LogUtil.error("IO流错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        //状态码为请求成功
        if(resultOweList.getCode() != HttpStatus.SC_OK){
            String errorMsg=getHttpErrorInfo(acctApiUrl.getGetOweList(),resultOweList);
            LogUtil.error(errorMsg,null,this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        if (resultOweList.getData() == null) {
            throw new BillException(ErrorCodeCompEnum.QUERY_NO_DATA);
        }
        LogUtil.debug("[调用远程服务 账单查询]"+acctApiUrl.getGetOweList()+"输出结果[result]="
                +resultOweList.toString(),null,this.getClass());
        JSONObject json = JSON.parseObject(resultOweList.getData());
        Map<String, Object> map = (Map) json.get("stdCcaCustomizeBillQueryBill");
        String acctName = map.get("acctName").toString();
        List<Map<String, Object>> itemList = (List) map.get("itemInformation");
        int sumCharge = 0;
        for (int i = 0; i < itemList.size(); i++) {
            String showlevel = String.valueOf(itemList.get(i).get("showlevel"));
            String classId = String.valueOf(itemList.get(i).get("classId"));
            String parentClassId = String.valueOf(itemList.get(i).get("parentClassId"));
            String charge = String.valueOf(itemList.get(i).get("charge"));
            String accNbrDetail = String.valueOf(itemList.get(i).get("accNbrDetail"));
            String chargeTypeName = String.valueOf(itemList.get(i).get("chargeTypeName"));
            String productOffName = String.valueOf(itemList.get(i).get("productOffName"));
            if ("2005".equals(classId) || "2006".equals(classId)) {
                QueryAddValueFeeResListBean beanLevel2 = new QueryAddValueFeeResListBean();
                sumCharge += Integer.parseInt(charge);
                beanLevel2.setShowlevel(showlevel);
                beanLevel2.setClassId(classId);
                beanLevel2.setParentClassId(parentClassId);
                beanLevel2.setCharge(charge);
                beanLevel2.setAccNbrDetail(accNbrDetail);
                beanLevel2.setChargeTypeName(chargeTypeName);
                beanLevel2.setProductOffName(productOffName);
                list.add(beanLevel2);
                for (int m = 0; m < itemList.size(); m++) {
                    String showlevel2 = String.valueOf(itemList.get(m).get("showlevel"));
                    String classId2 = String.valueOf(itemList.get(m).get("classId"));
                    String parentClassId2 = String.valueOf(itemList.get(m).get("parentClassId"));
                    String charge2 = String.valueOf(itemList.get(m).get("charge"));
                    String accNbrDetail2 = String.valueOf(itemList.get(m).get("accNbrDetail"));
                    String chargeTypeName2 = String.valueOf(itemList.get(m).get("chargeTypeName"));
                    String productOffName2 = String.valueOf(itemList.get(m).get("productOffName"));
                    if (classId2.equals(parentClassId) ) {
                        QueryAddValueFeeResListBean beanLevel3 = new QueryAddValueFeeResListBean();
                        beanLevel3.setShowlevel(showlevel2);
                        beanLevel3.setClassId(classId2);
                        beanLevel3.setParentClassId(parentClassId2);
                        beanLevel3.setCharge(charge2);
                        beanLevel3.setAccNbrDetail(accNbrDetail2);
                        beanLevel3.setChargeTypeName(chargeTypeName2);
                        beanLevel3.setProductOffName(productOffName2);
                        list.add(beanLevel3);
                    }
                    //取其父类
                    if (parentClassId2.equals(classId)) {
                        QueryAddValueFeeResListBean beanLevel1 = new QueryAddValueFeeResListBean();
                        beanLevel1.setShowlevel(showlevel2);
                        beanLevel1.setClassId(classId2);
                        beanLevel1.setParentClassId(parentClassId2);
                        beanLevel1.setCharge(charge2);
                        beanLevel1.setAccNbrDetail(accNbrDetail2);
                        beanLevel1.setChargeTypeName(chargeTypeName2);
                        beanLevel1.setProductOffName(productOffName2);
                        list.add(beanLevel1);
                    }

                }

            }

        }
        queryAddValueFeeResBean.setItemInformation(list);
        queryAddValueFeeResBean.setSumCharge(String.valueOf(sumCharge));
        queryAddValueFeeResBean.setAcctName(acctName);
        queryAddValueFeeRes.setStdCcaCustomizeBillQueryBill(queryAddValueFeeResBean);
        return queryAddValueFeeRes;

    }
    /**
     * @Author WangBaoQiang
     * @Description //调用账务能力失败信息
     * @Date 19:42 2019/9/29
     * @Param [url, result]
     * @return java.lang.String
    */
    private String getHttpErrorInfo(String url,HttpResult result) throws BillException {
        String errMsg="";
        try{
            errMsg= "调用远程服务："+url+"异常，HTTP状态码："+result.getCode()+"，响应内容："+result.getData();
        }catch(NullPointerException e){
            LogUtil.error("远程服务无响应",e,this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        return errMsg;
    }
    /**
     * @Author WangBaoQiang
     * @Description //查询用户是否存在
     * @Date 19:42 2019/9/29
     * @Param [stdCcaQueryServ]
     * @return void
    */
    private void checkServExist(StdCcaQueryServListBean stdCcaQueryServ) throws BillException {
        if (stdCcaQueryServ != null) {
            String state = stdCcaQueryServ.getServState();
            if ("2HN".equals(state) || "2HX".equals(state) || "2HF".equals(state)) {
                String errorMsg = "找不到用户或帐户档案";
                LogUtil.error(errorMsg,null,this.getClass());
                throw new BillException(ErrorCodeCompEnum.HSS_SEARCH_SERV_INFO_NOT_EXIST);
            }
        } else {
            String errorMsg = "找不到用户或帐户档案";
            LogUtil.error(errorMsg,null,this.getClass());
            throw new BillException(ErrorCodeCompEnum.HSS_SEARCH_SERV_INFO_NOT_EXIST);
        }
    }

    //补贴信息查询
    public QuerySubsidiesRes querySubsidies(QuerySubsidiesReq querySubsidiesReq, Map<String, String> headers)
            throws IOException, BillException {
        String returnRoleId=querySubsidiesReq.getSearchInfo().getReturnRoleId();
        String accNbr=querySubsidiesReq.getSearchInfo().getAccNbr();
        QuerySubsidiesRes returnResult=new QuerySubsidiesRes();
        HttpResult result = null;
        SearchAcctInfoReq searchAcctInfoReq=new SearchAcctInfoReq();
        StdCcrQueryAcct stdCcrQueryAcct=new StdCcrQueryAcct();
        searchAcctInfoReq.setSystemId(querySubsidiesReq.getSearchInfo().getSystemId());
        stdCcrQueryAcct.setAreaCode("0431");
        stdCcrQueryAcct.setQueryType("1");
        stdCcrQueryAcct.setValue(querySubsidiesReq.getSearchInfo().getAccNbr());
        stdCcrQueryAcct.setValueType("1");
        searchAcctInfoReq.setStdCcrQueryAcct(stdCcrQueryAcct);
        LogUtil.debug("[开始调用远程服务 账户信息查询]"+ acctApiUrl.searchAcctInfo(),null, this.getClass());
        LogUtil.debug("输入参数[searchAcctInfoReq]="+searchAcctInfoReq.toString(),null, this.getClass());
        try {
            result = HttpUtil.doPostJson(acctApiUrl.searchAcctInfo(),
                    JSON.toJSONString(searchAcctInfoReq, SerializerFeature.WriteMapNullValue), headers);
            LogUtil.debug("[调用远程服务 账户信息查询]"+acctApiUrl.searchAcctInfo()+"输出结果[result]="
                    +JSON.toJSONString(result,SerializerFeature.WriteMapNullValue),null,this.getClass());
        } catch (ClientProtocolException e) {
            LogUtil.error("连接错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        } catch (IOException e) {
            LogUtil.error("IO流错误", e, this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
        //状态码为请求成功
        if(result.getCode() == HttpStatus.SC_OK){
            String totalSubsidies="";
            String realPerformMonth="";
            String subsidiesAvg="";
            String oneTimeSubsidies="";
            SearchAcctInfoRes searchAcctInfoRes=JSON.parseObject(result.getData(), SearchAcctInfoRes.class);
            String acct_id=searchAcctInfoRes.getStdCcaQueryAcct().getQueryAcctInfo().get(0).getAcctId();
            List<Map<String,Object>> list=pOfferPayPlanInfoDao.queryPOfferPayPlanInfo(returnRoleId);
            if(list.size()==0){
                returnResult.setResultCode("0");
                returnResult.setResultMsg("");
                StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
                //调账务服务查询用户信息
                stdCcaQueryServ = commonUserInfo.getUserInfo(accNbr, "", "", "", headers);
                //查询用户是否存在
                try {
                    checkServExist(stdCcaQueryServ);
                }catch (BillException b){
                    throw new BillException(b);
                }
                String servId = stdCcaQueryServ.getServId();
                String totalConsumed=nfoHDUserFeeDao.queryTotalConsumed(servId);
                if(totalConsumed==null||totalConsumed.equals("")){
                    totalConsumed="";
                }
                SubsidiesInfo subsidiesInfo=new SubsidiesInfo();
                subsidiesInfo.setOneTimeSubsidies(oneTimeSubsidies);
                subsidiesInfo.setRealPerformMonth(realPerformMonth);
                subsidiesInfo.setSubsidiesAvg(String.valueOf(subsidiesAvg));
                subsidiesInfo.setTotalConsumed(totalConsumed);
                subsidiesInfo.setTotalSubsidies(totalSubsidies);
                returnResult.setSubsidiesInfo(subsidiesInfo);
                return  returnResult;
            }else{
                Map<String,Object> pOfferPayPlanInfo=list.get(0);
                String conferflag=pOfferPayPlanInfo.get("CONFER_FLAG").toString();
                oneTimeSubsidies=pOfferPayPlanInfo.get("TOTAL_MONEY").toString();//一次性补贴

                if(conferflag.equals("1")){//普通返还
                    String instance_id=aReturnRuleInstanceDao.queryAReturnRuleInstance(acct_id,returnRoleId);
                    if(instance_id==null||instance_id.equals("")){
                        returnResult.setResultCode("0");
                        returnResult.setResultMsg("");

                        //return  returnResult;
                    }else{
                        totalSubsidies=aBalanceReturnLogDao.queryTotalSubsidies(instance_id);//用户实际补贴总额
                        if(totalSubsidies==null||totalSubsidies.equals("")){
                            totalSubsidies="";
                        }
                        realPerformMonth=aBalanceReturnLogDao.queryRealPerformMonth(instance_id);//用户实际履约月份数
                        if(realPerformMonth==null||realPerformMonth.equals("")){
                            realPerformMonth="";
                        }
                        if(totalSubsidies!=""&&realPerformMonth!="") {
                            int avg = Integer.parseInt(totalSubsidies) / Integer.parseInt(realPerformMonth);//用户每月享受补贴平均值
                            subsidiesAvg=String.valueOf(avg);
                        }
                        returnResult.setResultCode("0");
                        returnResult.setResultMsg("SUCCESS");
                    }
                    StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
                    //调账务服务查询用户信息
                    stdCcaQueryServ = commonUserInfo.getUserInfo(accNbr, "", "", "", headers);
                    //查询用户是否存在
                    try {
                        checkServExist(stdCcaQueryServ);
                    }catch (BillException b){
                        throw new BillException(b);
                    }
                    String servId = stdCcaQueryServ.getServId();
                    String totalConsumed=nfoHDUserFeeDao.queryTotalConsumed(servId);
                    if(totalConsumed==null||totalConsumed.equals("")){
                        totalConsumed="";
                    }
                    SubsidiesInfo subsidiesInfo=new SubsidiesInfo();
                    subsidiesInfo.setOneTimeSubsidies(oneTimeSubsidies);
                    subsidiesInfo.setRealPerformMonth(realPerformMonth);
                    subsidiesInfo.setSubsidiesAvg(String.valueOf(subsidiesAvg));
                    subsidiesInfo.setTotalConsumed(totalConsumed);
                    subsidiesInfo.setTotalSubsidies(totalSubsidies);
                    returnResult.setSubsidiesInfo(subsidiesInfo);

                }else if(conferflag.equals("2")){//翼支付反还
                    String bestPayReturnId= aBestPayReturnInfoDao.queryBestPayReturnId(acct_id,returnRoleId,accNbr);
                    if(bestPayReturnId==null||bestPayReturnId.equals("")){
                        returnResult.setResultCode("0");
                        returnResult.setResultMsg("");
                        //return  returnResult;
                    }else{
                        totalSubsidies=aBestPayReturnInfoDetailDao.queryTotalSubsidies(bestPayReturnId);//用户实际补贴总额
                        if(totalSubsidies==null||totalSubsidies.equals("")){
                            totalSubsidies="";
                        }
                        realPerformMonth=aBestPayReturnInfoDetailDao.queryRealPerformMonth(bestPayReturnId);//用户实际履约月份数
                        if(realPerformMonth==null||realPerformMonth.equals("")){
                            realPerformMonth="";
                        }
                        if(totalSubsidies!=""&&realPerformMonth!="") {
                            int avg = Integer.parseInt(totalSubsidies) / Integer.parseInt(realPerformMonth);//用户每月享受补贴平均值
                            subsidiesAvg=String.valueOf(avg);
                        }
                        returnResult.setResultCode("0");
                        returnResult.setResultMsg("SUCCESS");
                    }
                    StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
                    //调账务服务查询用户信息
                    stdCcaQueryServ = commonUserInfo.getUserInfo(accNbr, "", "", "", headers);
                    //查询用户是否存在
                    try {
                        checkServExist(stdCcaQueryServ);
                    }catch (BillException b){
                        throw new BillException(b);
                    }
                    String servId = stdCcaQueryServ.getServId();
                    String totalConsumed=nfoHDUserFeeDao.queryTotalConsumed(servId);
                    if(totalConsumed==null||totalConsumed.equals("")){
                        totalConsumed="";
                    }
                    SubsidiesInfo subsidiesInfo=new SubsidiesInfo();
                    subsidiesInfo.setOneTimeSubsidies(oneTimeSubsidies);
                    subsidiesInfo.setRealPerformMonth(realPerformMonth);
                    subsidiesInfo.setSubsidiesAvg(String.valueOf(subsidiesAvg));
                    subsidiesInfo.setTotalConsumed(totalConsumed);
                    subsidiesInfo.setTotalSubsidies(totalSubsidies);
                    returnResult.setSubsidiesInfo(subsidiesInfo);

                }else{
                    SubsidiesInfo subsidiesInfo=new SubsidiesInfo();
                    subsidiesInfo.setOneTimeSubsidies("");
                    subsidiesInfo.setRealPerformMonth("");
                    subsidiesInfo.setSubsidiesAvg("");
                    subsidiesInfo.setTotalConsumed("");
                    subsidiesInfo.setTotalSubsidies("");
                    returnResult.setSubsidiesInfo(subsidiesInfo);
                    returnResult.setResultCode("0");
                    returnResult.setResultMsg("无返还记录！");
                }
            }

            return returnResult;
        }else{
            String errorMsg=getHttpErrorInfo(acctApiUrl.searchAcctInfo(),result);
            LogUtil.error(errorMsg,null,this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
    }

    /**
     * 翼支付红包返还
     *
     * */
    public QueryWingPaymentRedPackRes queryWingPaymentRedPack(QueryWingPaymentRedPackReq queryWingPaymentRedPackReq, Map<String, String> headers)
            throws IOException, BillException{
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        QueryWingPaymentRedPackRes returnResult=new QueryWingPaymentRedPackRes();
        String accNbr=queryWingPaymentRedPackReq.getValue();
        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(accNbr, "", "", "", headers);
        //查询用户是否存在
        try {
            checkServExist(stdCcaQueryServ);
        }catch (BillException b){
            throw new BillException(b);
        }
        String servId = stdCcaQueryServ.getServId();
        List<Map<String,Object>> list=queryWingPaymentRedPackDao.QueryWingPaymentRedPack(servId);
        List<WingPaymentRedPackSetType> wingPaymentRedPackSet=new ArrayList<>();
        if(list.size()!=0){
            for(int i=0;i<list.size();i++){
                WingPaymentRedPackSetType wingPaymentRedPackSetType=new WingPaymentRedPackSetType();
                Map<String,Object> map=list.get(i);
                String amount=String.valueOf(map.get("amount"));
                String outFlag=String.valueOf(map.get("outFlag"));
                String returnCycleId=String.valueOf(map.get("returnCycleId"));
                List<BillingCycle> billingCycles = infoOverAccuFeeMapperDao.selectBillingCyleFromCyleId(returnCycleId);
                if (billingCycles.size() > 0) {
                    BillingCycle billingCycle = billingCycles.get(0);
                    wingPaymentRedPackSetType.setReturnCycleId(df.format(billingCycle.getCycleBeginDate()));
                }
                wingPaymentRedPackSetType.setEachrewardsAmt(amount);
                wingPaymentRedPackSetType.setProdInstId(servId);
                wingPaymentRedPackSetType.setReserved3(outFlag);
                wingPaymentRedPackSet.add(wingPaymentRedPackSetType);
                returnResult.setResult("0");
                returnResult.setCode("");
                returnResult.setMsg("SUCCESS");
            }
        }else{
            returnResult.setResult("0");
            returnResult.setCode("");
            returnResult.setMsg("记录为空！");
        }

        returnResult.setWingPaymentRedPackSet(wingPaymentRedPackSet);
        return  returnResult;
    }
}
