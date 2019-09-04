package com.asia.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.asia.common.utils.HttpUtil;
import com.asia.common.utils.HttpUtil.HttpResult;
import com.asia.dao.OrclCommonDao;
import com.asia.domain.localApi.*;
import com.asia.domain.localApi.child.*;
import com.asia.internal.common.CommonUserInfo;
import com.asia.internal.common.ResultInfo;
import com.asia.mapper.orclmapper.*;
import com.asia.service.IlocalService;
import com.asia.vo.*;
import com.asiainfo.account.model.domain.StdCcaQueryServ;
import com.asiainfo.account.model.request.StdCcrRealTimeBillQueryRequest;
import com.asiainfo.account.model.response.StdCcaRealTimeBillQueryResponse;
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
    @Autowired
    InfoHdUserFeeMapper infoHdUserFeeMapperDao;
    @Autowired
    Bon3ServiceImpl bon3Service;
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
    //详单打印记录
    @Override
 public MeterPrintActionRes printRecordService(MeterPrintActionReq body, Map<String, String> headers)
            throws ClientProtocolException, IOException {
        MeterPrintActionRes meterPrintActionRes = new MeterPrintActionRes();
        StdCcaQueryServ stdCcaQueryServ = new StdCcaQueryServ();
        //访问数据库
        resultInfo = orclCommonDao.preserveMeterPrintLog(body);
        if ("0".equals(resultInfo.getCode())) {
            meterPrintActionRes.setResult("0");
            meterPrintActionRes.setCode("0");
            meterPrintActionRes.setMsg(resultInfo.getMessage());
            return meterPrintActionRes;
        }else if("1".equals(resultInfo.getCode())){
            meterPrintActionRes.setResult("1");
            meterPrintActionRes.setMsg(resultInfo.getMessage());
            return meterPrintActionRes;
        }else {
            meterPrintActionRes.setResult("2");
            meterPrintActionRes.setMsg(resultInfo.getMessage());
            return meterPrintActionRes;
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
    @Override
   public QueryAgreementConsumptionRes queryAgreementConsumption(QueryAgreementConsumptionReq body, Map<String, String> headers) throws ClientProtocolException, IOException {
        QueryAgreementConsumptionRes queryAgreementConsumptionRes = new QueryAgreementConsumptionRes();
        StdCcaQueryServ stdCcaQueryServ = new StdCcaQueryServ();
        List<AgreementConsumeSetBean> agreementConsumeSetBeanList = new ArrayList<>();
        AgreementConsumeSetBean agreementConsumeSetBean = new AgreementConsumeSetBean();
        AgreementConsumeSetTypeBean agreementConsumeSetTypeBean = new AgreementConsumeSetTypeBean();
        String accNumb  = body.getValue();
        String userType = body.getUserType();
        String valueType = body.getValueType();
        //调账务服务查询用户信息
        stdCcaQueryServ = commonUserInfo.getUserInfo(accNumb, "", "", "",headers);
        String servId = stdCcaQueryServ.getServId();
        queryAgreementConsumptionRes.setResult("0");
        List<InfoHdUserFee>  infoHdUserFeeList=  infoHdUserFeeMapperDao.selectInfoHdUserFee(servId);
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
            queryAgreementConsumptionRes.setMsg("数据为空");
        }
        return  queryAgreementConsumptionRes;
    }
    @Override
   public StdCcaRealTimeBillQueryResponse queryAddValueList(StdCcrRealTimeBillQueryRequest body, Map<String, String> headers) throws ClientProtocolException, IOException {
        StdCcaRealTimeBillQueryResponse stdCcaRealTimeBillQueryResponse = new StdCcaRealTimeBillQueryResponse();

        return new StdCcaRealTimeBillQueryResponse();
    }

    //是否为电信号段（查号头表）
    public MobileNumberQueryRes moBileNumberQuery(MobileNumberQueryReq mobileNumberQueryReq,Map<String, String> headers){
        return orclCommonDao.moBileNumberQuery(mobileNumberQueryReq,headers);
    }

    //查询余额信息，返回违约金、专用账目组、专用账目组
    public AccountBalanceCpcpQueryRes accountBalanceCpcpQuery(AccountBalanceCpcpQueryReq accountBalanceCpcpQueryReq,Map<String, String> headers) throws IOException {
        AccountBalanceCpcpQueryRes result=new AccountBalanceCpcpQueryRes();
        HashMap<String, Object> operAttrStructMap = new HashMap<String, Object>();//操作人属性
        String staffId=accountBalanceCpcpQueryReq.getStaffId();
        String systemId=accountBalanceCpcpQueryReq.getSystemId();
        String accNum=accountBalanceCpcpQueryReq.getAccNum();
        String accNumType=accountBalanceCpcpQueryReq.getAccNumType();
        String areaId=accountBalanceCpcpQueryReq.getAccNumAreaCode();
        String operOrgId="0";
        if(systemId=="1"){//随便写的业务逻辑
            operOrgId="2";
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
        String query = obj.toString();

        Map<String, String> object = new HashMap<String, String>();
        object.put("appID", "1111111");

        HttpResult result2 = HttpUtil.doPostJson("http://136.160.153.42:8026/billsrv/openApi/QueryBalance", query, object);
        if(result2.getData()==null){
            result.setIsSucess("0");
            result.setMsg("查询余额失败");
            return result;
        }
      /*  String array="{\"areaCode\":null," +
                "\"balanceQuery\":[{" +
                "\"accNbr\":null," +
                "\"acctBalanceId\":null," +
                "\"acctId\":null," +
                "\"available\":null," +
                "\"balance\":null," +
                "\"balanceTypeFlag\":null," +
                "\"cycleType\":null," +
                "\"cycleUpper\":null," +
                "\"desc\":null," +
                "\"effDate\":null," +
                "\"expDate\":null," +
                "\"prodInstId\":null," +
                "\"reserveBalance\":null," +
                "\"shareRuleFlag\":null," +
                "\"state\":null,\"used\":null" +
                "}]," +
                "\"paymentFlag\":null," +
                "\"queryFlag\":null," +
                "\"queryItemType\":null," +
                "\"realBalance\":null," +
                "\"resultCode\":null," +
                "\"resultMsg\":null";*/

            JSONObject json = JSON.parseObject(result2.getData());
            List<Map<String,Object>> list=(List<Map<String, Object>>) json.get("balanceQuery");
            String realBalance = json.get("realBalance").toString();
            List<BalanceInfosListBean> infosList=new ArrayList<BalanceInfosListBean>();
            List<BalanceItemsListBean> itemsList=new ArrayList<BalanceItemsListBean>();
            int num1=0;
            int num2=0;
            int num3=0;
            int num4=0;
            int num5=0;
            for (int i=0;i<list.size();i++){

                String balance=list.get(i).get("balance").toString();
                String balanceTypeFlag=list.get(i).get("balanceTypeFlag").toString();
                String available=list.get(i).get("available").toString();
                String desc=list.get(i).get("desc").toString();
                String effDate=list.get(i).get("effDate").toString();
                String expDate=list.get(i).get("expDate").toString();
                if(balanceTypeFlag.equals("0")){
                    num1+=Integer.parseInt(balance);
                }else if(balanceTypeFlag.equals("1")){
                    num2+=Integer.parseInt(balance);
                }else if(balanceTypeFlag.equals("2")){
                    num3+=Integer.parseInt(balance);
                }else if(balanceTypeFlag.equals("3")){
                    num4+=Integer.parseInt(balance);
                }else if(balanceTypeFlag.equals("4")){
                    num5+=Integer.parseInt(balance);
                }



                BalanceItemsListBean balanceItemsListBean=new BalanceItemsListBean();
                balanceItemsListBean.setAcctNbr(accNum);
                balanceItemsListBean.setBalance(available);
                balanceItemsListBean.setBalanceType(desc);
                balanceItemsListBean.setEffDate(effDate);
                balanceItemsListBean.setExpDate(expDate);
                balanceItemsListBean.setItem_group_name("");
                balanceItemsListBean.setLevel("帐户级别");


                itemsList.add(balanceItemsListBean);
            }
            BalanceInfosListBean balanceInfosListBean=new BalanceInfosListBean();
            balanceInfosListBean.setAocBalance(String.valueOf(num1));
            balanceInfosListBean.setAocUnitName("通用余额");
            infosList.add(balanceInfosListBean);
            balanceInfosListBean.setAocBalance(String.valueOf(num2));
            balanceInfosListBean.setAocUnitName("专用余额");
            infosList.add(balanceInfosListBean);
            balanceInfosListBean.setAocBalance(String.valueOf(num3));
            balanceInfosListBean.setAocUnitName("用户级");
            infosList.add(balanceInfosListBean);
            balanceInfosListBean.setAocBalance(String.valueOf(num4));
            balanceInfosListBean.setAocUnitName("用户账目组级");
            infosList.add(balanceInfosListBean);
            balanceInfosListBean.setAocBalance(String.valueOf(num5));
            balanceInfosListBean.setAocUnitName("账户账目组级");
            infosList.add(balanceInfosListBean);

            result.setBalanceInfos(infosList);
            result.setBalanceItems(itemsList);
            //判断是否欠费
            if(Integer.parseInt(realBalance)>0){
                result.setBalanceAvl(realBalance);
                result.setDueCharge("0");
            }else{
                JSONObject obj2 = new JSONObject();
                obj.put("billQueryType", "2");
                obj.put("destinationAccount", accNumType+accNum);
                obj.put("destinationAttr", accNumType);
                obj.put("queryFla", "1");
                obj.put("feeQueryFlag", "0");
                obj.put("operAttrStruct", operAttrStructMap);
                String query2 = obj2.toString();

                Map<String, String> object2 = new HashMap<String, String>();
                object2.put("appID", "1111111");
                HttpResult result3 = HttpUtil.doPostJson("http://136.160.153.42:8026/billsrv/openApi/QryBill", query2, object2);
                if(result3.getData()==null){
                    result.setIsSucess("0");
                    result.setMsg("查询欠费失败");
                    return result;
                }
                JSONObject json2 = JSON.parseObject(result3.getData());
                result.setBalanceAvl("0");
                result.setDueCharge(json2.get("due").toString());
            }
            result.setIsBalanceInfoSucess("1");
            result.setIsBalanceItemSucess("1");
            result.setIsOweInfoSucess("1");
            result.setIsSucess("1");
            result.setMsg("成功");
            result.setOweCharge("0");
            result.setOweInfoMsg("成功");


        return result;
    }

    //查询用户的增值账单，（三级账单递归展示）
    public QueryAddValueFeeRes queryAddValueFee(QueryAddValueFeeReq queryAddValueFeeReq,
                                                Map<String,String> heads) throws IOException {
        QueryAddValueFeeRes result=new QueryAddValueFeeRes();
        QueryAddValueFeeResBean queryAddValueFeeResBean=new QueryAddValueFeeResBean();
        QueryAddValueFeeResListBean bean=new QueryAddValueFeeResListBean();
        String query=queryAddValueFeeReq.toString();
        List<QueryAddValueFeeResListBean> list=new ArrayList<QueryAddValueFeeResListBean>();

        Map<String, String> object = new HashMap<String, String>();
        object.put("appID", "1111111");
        HttpResult result2 = HttpUtil.doPostJson("http://136.160.153.42:8026/billing/acct/std/getOweList", query, object);
        JSONObject json = JSON.parseObject(result2.getData());
        Map<String,Object> map=(Map)json.get("stdCcaCustomizeBillQueryBill");
        String acctName=map.get("acctName").toString();
        List<Map<String,Object>> itemList=(List)map.get("itemInformation");
        int sumCharge=0;
        for(int i=0;i<itemList.size();i++){
            String showlevel=itemList.get(i).get("showlevel").toString();
            String classId=itemList.get(i).get("classId").toString();
            String parentClassId=itemList.get(i).get("parentClassId").toString();
            String charge=itemList.get(i).get("charge").toString();
            String accNbrDetail=itemList.get(i).get("accNbrDetail").toString();
            String chargeTypeName=itemList.get(i).get("chargeTypeName").toString();
            String productOffName=itemList.get(i).get("productOffName").toString();
            if(classId.equals("2005")||classId.equals("2006")){
                sumCharge +=Integer.parseInt(charge);
                bean.setShowlevel(showlevel);
                bean.setClassId(classId);
                bean.setParentClassId(parentClassId);
                bean.setCharge(charge);
                bean.setAccNbrDetail(accNbrDetail);
                bean.setChargeTypeName(chargeTypeName);
                bean.setProductOffName(productOffName);
                list.add(bean);
                for(int m=0;m<itemList.size();m++){
                    String showlevel2=itemList.get(m).get("showlevel").toString();
                    String classId2=itemList.get(m).get("classId").toString();
                    String parentClassId2=itemList.get(m).get("parentClassId").toString();
                    String charge2=itemList.get(m).get("charge").toString();
                    String accNbrDetail2=itemList.get(m).get("accNbrDetail").toString();
                    String chargeTypeName2=itemList.get(m).get("chargeTypeName").toString();
                    String productOffName2=itemList.get(m).get("productOffName").toString();
                    if(classId2.equals(parentClassId)&&classId.equals("2005")){//2005与2006 同一个父类，取一个
                        bean.setShowlevel(showlevel2);
                        bean.setClassId(classId2);
                        bean.setParentClassId(parentClassId2);
                        bean.setCharge(charge2);
                        bean.setAccNbrDetail(accNbrDetail2);
                        bean.setChargeTypeName(chargeTypeName2);
                        bean.setProductOffName(productOffName2);
                        list.add(bean);
                    }
                    if(parentClassId2.equals(classId)){//取其子类
                        bean.setShowlevel(showlevel2);
                        bean.setClassId(classId2);
                        bean.setParentClassId(parentClassId2);
                        bean.setCharge(charge2);
                        bean.setAccNbrDetail(accNbrDetail2);
                        bean.setChargeTypeName(chargeTypeName2);
                        bean.setProductOffName(productOffName2);
                        list.add(bean);
                    }

                }

            }

        }
        queryAddValueFeeResBean.setItemInformation(list);
        queryAddValueFeeResBean.setSumCharge(String.valueOf(sumCharge));
        queryAddValueFeeResBean.setAcctName(acctName);
        result.setStdCcaCustomizeBillQueryBill(queryAddValueFeeResBean);
        return  result;

    }

}
