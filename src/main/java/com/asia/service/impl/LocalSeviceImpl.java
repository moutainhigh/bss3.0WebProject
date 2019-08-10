package com.asia.service.impl;

import com.asia.dao.OrclCommonDao;
import com.asia.domain.localApi.QryMonthHighFeeReq;
import com.asia.domain.localApi.QryMonthHighFeeRes;
import com.asia.domain.localApi.UserMeterOrderReq;
import com.asia.domain.localApi.UserMeterOrderRes;
import com.asia.domain.localApi.child.IntfCommServiceListBean;
import com.asia.domain.localApi.child.IntfCommServiceListTypeBean;
import com.asia.internal.common.CommonUserInfo;
import com.asia.internal.common.ResultInfo;
import com.asia.mapper.orclmapper.*;
import com.asia.service.IlocalService;
import com.asia.vo.*;
import com.asiainfo.account.model.domain.StdCcaQueryServ;
import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
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
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //月账话费高额
    @Override
    public QryMonthHighFeeRes qryMonthHighFee(QryMonthHighFeeReq body, Map<String,String> headers)
			throws ClientProtocolException, IOException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        Info3mExeFee info3mExeFeeMap = new Info3mExeFee();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean>  intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean  intfCommServiceListBean = new IntfCommServiceListBean();

        long accNumb  = body.getQueryValue();
        String billMonth = body.getQueryMonth();
        List<Info3mExeFee> info3mExeFeeList = info3mExeFeeMapperDao.selectInfo3MExeFee(accNumb, billMonth);
        if (info3mExeFeeList.size() > 0) {
            info3mExeFeeMap = info3mExeFeeList.get(0);
            qryMonthHighFeeRes.setResult("0");
            intfCommServiceListBean.setRetCol1(info3mExeFeeMap.getCurCharge().toString());
            intfCommServiceListBean.setRetCol2(info3mExeFeeMap.getThreeMonAvgCharge().toString());
            intfCommServiceListBean.setRetCol3(info3mExeFeeMap.getAlarmDate());
            intfCommServiceList.add(intfCommServiceListBean);
            intfCommServiceListTypeBean.setIntfCommServiceList(intfCommServiceList);
            qryMonthHighFeeRes.setIntfCommServiceListType(intfCommServiceListTypeBean);
            return qryMonthHighFeeRes;
        }else{
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setMsg("数据为空");
            return qryMonthHighFeeRes;
        }

	}
    //实时话费高额
    @Override
    public QryMonthHighFeeRes qryRealHighFee(QryMonthHighFeeReq body, Map<String,String> headers)
            throws ClientProtocolException, IOException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        InfoHighFeeQue infoHighFeeQueMap = new InfoHighFeeQue();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean>  intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean  intfCommServiceListBean = new IntfCommServiceListBean();

        long accNumb  = body.getQueryValue();
        String billMonth = body.getQueryMonth();
        List<InfoHighFeeQue> info3mExeFeeList = infoHighFeeQueMapperDao.selectInfoHighFee(accNumb, billMonth);
        if (info3mExeFeeList.size() > 0) {
            infoHighFeeQueMap = info3mExeFeeList.get(0);
            qryMonthHighFeeRes.setResult("0");
            intfCommServiceListBean.setRetCol1(infoHighFeeQueMap.getItemGroupId().toString());
            intfCommServiceListBean.setRetCol2(infoHighFeeQueMap.getItemGroupId().toString());
            intfCommServiceListBean.setRetCol3(infoHighFeeQueMap.getCharge().toString());
            intfCommServiceListBean.setRetCol4(infoHighFeeQueMap.getAlarmDate());
            intfCommServiceList.add(intfCommServiceListBean);
            intfCommServiceListTypeBean.setIntfCommServiceList(intfCommServiceList);
            qryMonthHighFeeRes.setIntfCommServiceListType(intfCommServiceListTypeBean);
            return qryMonthHighFeeRes;
        }else{
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setMsg("数据为空");
            return qryMonthHighFeeRes;
        }

    }
    //日流量告警
    @Override
    public QryMonthHighFeeRes qryDataHighFlow(QryMonthHighFeeReq body, Map<String,String> headers)
            throws ClientProtocolException, IOException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        InfoAccu5gUser infoAccu5gUserMap = new InfoAccu5gUser();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean>  intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean  intfCommServiceListBean = new IntfCommServiceListBean();

        long accNumb  = body.getQueryValue();
        String billMonth = body.getQueryMonth();
        List<InfoAccu5gUser> info3mExeFeeList = infoAccu5gUserMapperDao.selectInfoAccu5gUser(accNumb, billMonth);
        if (info3mExeFeeList.size() > 0) {
            infoAccu5gUserMap = info3mExeFeeList.get(0);
            qryMonthHighFeeRes.setResult("0");
            intfCommServiceListBean.setRetCol1(infoAccu5gUserMap.getDayStream().toString());
            intfCommServiceListBean.setRetCol2(infoAccu5gUserMap.getExecDay());
            intfCommServiceListBean.setRetCol3(infoAccu5gUserMap.getTotalStream().toString());
            intfCommServiceListBean.setRetCol4(infoAccu5gUserMap.getAlarmDate());
            intfCommServiceList.add(intfCommServiceListBean);
            intfCommServiceListTypeBean.setIntfCommServiceList(intfCommServiceList);
            qryMonthHighFeeRes.setIntfCommServiceListType(intfCommServiceListTypeBean);
            return qryMonthHighFeeRes;
        }else{
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setMsg("数据为空");
            return qryMonthHighFeeRes;
        }

    }
    //累积量超出提醒
    @Override
    public QryMonthHighFeeRes qryAccuOverFlow(QryMonthHighFeeReq body, Map<String,String> headers)
            throws ClientProtocolException, IOException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        InfoAccu2Service infoAccu2ServiceMap = new InfoAccu2Service();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean>  intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean  intfCommServiceListBean = new IntfCommServiceListBean();

        long accNumb  = body.getQueryValue();
        String billMonth = body.getQueryMonth();
        List<InfoAccu2Service> info3mExeFeeList = infoAccu2ServiceMapperDao.selectInfoAccu2Service(accNumb, billMonth);
        if (info3mExeFeeList.size() > 0) {
            infoAccu2ServiceMap = info3mExeFeeList.get(0);
            qryMonthHighFeeRes.setResult("0");
            intfCommServiceListBean.setRetCol1(infoAccu2ServiceMap.getTotalStream().toString());
            intfCommServiceListBean.setRetCol2(infoAccu2ServiceMap.getCurStream().toString());
            intfCommServiceListBean.setRetCol3(infoAccu2ServiceMap.getAlarmDate());
            intfCommServiceList.add(intfCommServiceListBean);
            intfCommServiceListTypeBean.setIntfCommServiceList(intfCommServiceList);
            qryMonthHighFeeRes.setIntfCommServiceListType(intfCommServiceListTypeBean);
            return qryMonthHighFeeRes;
        }else{
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setMsg("数据为空");
            return qryMonthHighFeeRes;
        }

    }
    //月账话费高额
    @Override
    public QryMonthHighFeeRes qryUserFlowFee(QryMonthHighFeeReq body, Map<String,String> headers)
            throws ClientProtocolException, IOException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        InfoNoAccu2Service infoNoAccu2ServiceMap = new InfoNoAccu2Service();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean>  intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean  intfCommServiceListBean = new IntfCommServiceListBean();

        long accNumb  = body.getQueryValue();
        String billMonth = body.getQueryMonth();
        List<InfoNoAccu2Service> info3mExeFeeList = infoNoAccu2ServiceMapperDao.selectInfoNoAccu2Service(accNumb, billMonth);
        if (info3mExeFeeList.size() > 0) {
            infoNoAccu2ServiceMap = info3mExeFeeList.get(0);
            qryMonthHighFeeRes.setResult("0");
            intfCommServiceListBean.setRetCol1(infoNoAccu2ServiceMap.getStatMonth());
            intfCommServiceListBean.setRetCol2(infoNoAccu2ServiceMap.getMonthStream().toString());
            intfCommServiceListBean.setRetCol3(infoNoAccu2ServiceMap.getMonthCharge().toString());
            intfCommServiceListBean.setRetCol4(infoNoAccu2ServiceMap.getAlarmDate());
            intfCommServiceList.add(intfCommServiceListBean);
            intfCommServiceListTypeBean.setIntfCommServiceList(intfCommServiceList);
            qryMonthHighFeeRes.setIntfCommServiceListType(intfCommServiceListTypeBean);
            return qryMonthHighFeeRes;
        }else{
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setMsg("数据为空");
            return qryMonthHighFeeRes;
        }

    }
    //发送日志
    @Override
    public QryMonthHighFeeRes qrySendMsgUser(QryMonthHighFeeReq body, Map<String,String> headers)
            throws ClientProtocolException, IOException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        UmpSmsInfo umpSmsInfoMap = new UmpSmsInfo();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean>  intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean  intfCommServiceListBean = new IntfCommServiceListBean();

        long accNumb  = body.getQueryValue();
        String billMonth = body.getQueryMonth();
        String beginDate = body.getBeginDate();
        String endDate = body.getEndDate();
        List<UmpSmsInfo> info3mExeFeeList = umpSmsInfoMapperDao.selectUmpSmsInfo(accNumb, beginDate,endDate);
        if (info3mExeFeeList.size() > 0) {
            umpSmsInfoMap = info3mExeFeeList.get(0);
            qryMonthHighFeeRes.setResult("0");
            intfCommServiceListBean.setRetCol1(umpSmsInfoMap.getMsgId());
            intfCommServiceListBean.setRetCol2(umpSmsInfoMap.getMsg());
            intfCommServiceListBean.setRetCol3(umpSmsInfoMap.getGetDate());
            intfCommServiceListBean.setRetCol4(umpSmsInfoMap.getSendDate());
            intfCommServiceList.add(intfCommServiceListBean);
            intfCommServiceListTypeBean.setIntfCommServiceList(intfCommServiceList);
            qryMonthHighFeeRes.setIntfCommServiceListType(intfCommServiceListTypeBean);
            return qryMonthHighFeeRes;
        }else{
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setMsg("数据为空");
            return qryMonthHighFeeRes;
        }

    }
    //宽带到期提醒
    @Override
    public QryMonthHighFeeRes qryWlanRemain(QryMonthHighFeeReq body, Map<String,String> headers)
            throws ClientProtocolException, IOException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        RemindKdRemain remindKdRemainMap = new RemindKdRemain();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean>  intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean  intfCommServiceListBean = new IntfCommServiceListBean();

        long accNumb  = body.getQueryValue();
        String billMonth = body.getQueryMonth();
        String beginDate = body.getBeginDate();
        String endDate = body.getEndDate();
        List<RemindKdRemain> info3mExeFeeList = remindKdRemainMapperDao.selectRemindKdRemain(accNumb, beginDate,endDate);
        if (info3mExeFeeList.size() > 0) {
            remindKdRemainMap = info3mExeFeeList.get(0);
            qryMonthHighFeeRes.setResult("0");
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
            return qryMonthHighFeeRes;
        }else{
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setMsg("数据为空");
            return qryMonthHighFeeRes;
        }

    }
    //累积量超出量查询
    @Override
    public QryMonthHighFeeRes qryOverAccuFee(QryMonthHighFeeReq body, Map<String,String> headers)
            throws ClientProtocolException, IOException {
        QryMonthHighFeeRes qryMonthHighFeeRes = new QryMonthHighFeeRes();
        Info3mExeFee info3mExeFeeMap = new Info3mExeFee();
        IntfCommServiceListTypeBean intfCommServiceListTypeBean = new IntfCommServiceListTypeBean();
        List<IntfCommServiceListBean>  intfCommServiceList = new ArrayList<>();
        IntfCommServiceListBean  intfCommServiceListBean = new IntfCommServiceListBean();

        long accNumb  = body.getQueryValue();
        String billMonth = body.getQueryMonth();
        Map map = new HashMap();
        resultInfo = orclCommonDao.overAccuData(accNumb, billMonth,map);
        if ("0".equals(resultInfo.getCode())) {
            qryMonthHighFeeRes.setResult("0");
            intfCommServiceListBean.setRetCol1(map.get("overCharge").toString());
            intfCommServiceListBean.setRetCol2(map.get("OverData").toString());
            intfCommServiceList.add(intfCommServiceListBean);
            intfCommServiceListTypeBean.setIntfCommServiceList(intfCommServiceList);
            qryMonthHighFeeRes.setIntfCommServiceListType(intfCommServiceListTypeBean);
            return qryMonthHighFeeRes;
        }else if("1".equals(resultInfo.getCode())){
            qryMonthHighFeeRes.setResult("1");
            qryMonthHighFeeRes.setMsg(resultInfo.getMessage());
            return qryMonthHighFeeRes;
        }else {
            qryMonthHighFeeRes.setResult("1");

           // qryMonthHighFeeRes.setMsg(resultInfo.getM);
            return qryMonthHighFeeRes;
        }
    }
    //详单禁查
    @Override
 public  UserMeterOrderRes userMeterOrderService(UserMeterOrderReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException {
        UserMeterOrderRes userMeterOrderRes = new UserMeterOrderRes();
        StdCcaQueryServ stdCcaQueryServ = new StdCcaQueryServ();
        String accNumb  = body.getQueryValue();
        String action = body.getAction();
        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(accNumb, "", "", "",headers);
        Map map = new HashMap();
        String servId = stdCcaQueryServ.getServId();
        String areaCode = stdCcaQueryServ.getHomeAreaCode();
        //访问数据库
        resultInfo = orclCommonDao.userMeterOrder(servId, action,areaCode);
        if ("0".equals(resultInfo.getCode())) {
            userMeterOrderRes.setResult("0");
            userMeterOrderRes.setCode("0");
            userMeterOrderRes.setMsg(resultInfo.getMessage());
            return userMeterOrderRes;
        }else if("1".equals(resultInfo.getCode())){
            userMeterOrderRes.setResult("1");
            userMeterOrderRes.setMsg(resultInfo.getMessage());
            return userMeterOrderRes;
        }else {
            userMeterOrderRes.setResult("1");

            // qryMonthHighFeeRes.setMsg(resultInfo.getM);
            return userMeterOrderRes;
        }
    }

}
