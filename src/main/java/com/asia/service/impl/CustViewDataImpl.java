package com.asia.service.impl;

import com.alibaba.fastjson.JSON;
import com.asia.common.AcctApiUrl;
import com.asia.common.utils.HttpUtil;
import com.asia.common.utils.LogUtil;
import com.asia.domain.openApi.QryBillReq;
import com.asia.domain.openApi.QryBillRes;
import com.asia.domain.openApi.QryBillRes.FeeBillingCycle;
import com.asia.domain.openApi.QryBillRes.FeeBillingCycle.AcctItemGroup;
import com.asia.domain.openApi.child.OperAttrStruct;
import com.asia.mapper.orclmapper.CustomerMapper;
import com.asia.service.impl.openApi.OpenAPIServiceImpl;
import com.prd.asiainfo.abm.provider.facade.dto.center.QueryAllOrder;
import com.prd.asiainfo.abm.provider.facade.dto.center.base.Account;
import com.prd.asiainfo.abm.provider.facade.dto.center.base.BaseParams;
import com.prd.asiainfo.abm.provider.facade.dto.center.QueryAcctInfoByCustIdOrPaperNoResp;
import com.prd.asiainfo.abm.provider.facade.service.QueryCenterService;
import org.apache.commons.httpclient.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asia.common.utils.HttpUtil.HttpResult;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class CustViewDataImpl {
    @Autowired
    QueryCenterService queryCenterService;
    @Autowired
    AcctApiUrl acctApiUrl;
    @Autowired
    OpenAPIServiceImpl openAPIService;
    @Autowired
    CustomerMapper customerDao;

    public String queryAcctInfoByCustIdOrPaperNo(String custId,String viewItemCat) throws IOException {
        String result="";
        BaseParams baseParams=new BaseParams();
        QueryAcctInfoByCustIdOrPaperNoResp queryAcctInfoByCustIdOrPaperNoResp=new QueryAcctInfoByCustIdOrPaperNoResp();
        baseParams.setQueryCode(custId);
        baseParams.setQueryType(5);
        baseParams.setBillPeriods("201911");
        baseParams.setType("");
        baseParams.setProdId("");
        LogUtil.info("[开始调用dubbo【queryAcctInfoByCustIdOrPaperNo】远程服务 获取账户信息]" , null, this.getClass());
        LogUtil.info("输入参数[queryAcctInfoByCustIdOrPaperNoReq]=" + JSON.toJSONString(baseParams), null, this.getClass());
        queryAcctInfoByCustIdOrPaperNoResp=queryCenterService.queryAcctInfoByCustIdOrPaperNo(baseParams);
        List<Account> accountList=queryAcctInfoByCustIdOrPaperNoResp.getAccount();
        if(accountList==null||accountList.size()==0){
            result="该客户下没账户信息！";
        }else{
            //result="成功！";
            if(viewItemCat.equals("A050101")){
                result=queryCustViewDataOne(accountList,custId);

            }else if(viewItemCat.equals("A050201")){

            }else if(viewItemCat.equals("A050301")){

            }else if(viewItemCat.equals("A050401")){

            }

        }


        return  result;
    }

    public String queryCustViewDataOne(List<Account> accountList,String custId) throws IOException {
        String result="";
        HttpResult returnResult = null;
        List<Map<String,Object>> list=new ArrayList<>();
        List<List<AcctItemGroup>> acctItemGroupList=new ArrayList<>();
        String accountId="";
        String accountName="";
        Date now=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String reqTime=dateFormat.format(now);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        c.add(Calendar.MONTH, -1);
        Date m = c.getTime();
        String lastDate=sdf.format(m);//上个月时间
        for(int i=0;i<accountList.size();i++){
            Account account=accountList.get(i);
            accountId=account.getAcctId();
            accountName=account.getAcctName();
            Map<String, String> headers=new HashMap<>();
            QryBillReq qryBillReq=new QryBillReq();


            OperAttrStruct operAttrStruct=new OperAttrStruct();
            operAttrStruct.setOperOrgId(1002);
            operAttrStruct.setStaffId("1002");
            operAttrStruct.setOperTime(reqTime);
            operAttrStruct.setLanId(0);
            operAttrStruct.setOperPost(0);
            operAttrStruct.setOperServiceId("1");
            qryBillReq.setOperAttrStruct(operAttrStruct);

            qryBillReq.setBillQueryType(0);
            qryBillReq.setDestinationAccount(accountId);
            qryBillReq.setFeeQueryFlag(0);
            qryBillReq.setSystemId("1002");
            qryBillReq.setQueryFlag(0);
            qryBillReq.setDestinationAttr(99);



            LogUtil.info("[开始调用远程服务 欠费查询]" + acctApiUrl.getQryBill(), null, this.getClass());
            LogUtil.info("输入参数[qryBillResReq]=" + qryBillReq.toString(), null, this.getClass());
            try {
                returnResult = HttpUtil.doPostJson(acctApiUrl.getQryBill(), qryBillReq.toString(), headers);
            }catch (IOException e){
                result="欠费查询，IO流错误";
                return result;
            }
            LogUtil.info("返回的结果为[qryBillResRes]=" + returnResult.getData(), null, this.getClass());
            if (returnResult.getCode() == HttpStatus.SC_OK) {
                QryBillRes qryBillRes=new QryBillRes();
                headers.clear();
                headers.putAll(returnResult.getHeaders());
                qryBillRes=JSON.parseObject(returnResult.getData(), QryBillRes.class);
                List<QryBillRes.FeeBillingCycle> feeBillingCycles=qryBillRes.getFeeBillingCycle();
                if(feeBillingCycles.size()!=0){
                    for(int x=0;x<feeBillingCycles.size();x++){
                        FeeBillingCycle feeBillingCycle=feeBillingCycles.get(x);
                        String cycleId=String.valueOf(feeBillingCycle.getBillingCycleId());
                        String cycleDetail=cycleId.substring(0,cycleId.length()-2);
                        if(cycleDetail.equals(lastDate)){
                            acctItemGroupList.add(feeBillingCycle.getAcctItemGroupList());
                        }

                    }
                }

            }else{
                result="欠费查询错误！";
                return result;
            }
        }
        int sum=0;
        if(acctItemGroupList.size()!=0){
            for(int i=0;i<acctItemGroupList.size();i++)
            {
                List<AcctItemGroup> acctItemGroups=acctItemGroupList.get(i);
                for(int y=0;y<acctItemGroups.size();y++){
                    AcctItemGroup acctItemGroup=acctItemGroups.get(y);
                    List<AcctItemGroup.AcctItemType> acctItemTypes=acctItemGroup.getAcctItemType();
                    for(int x=0;x<acctItemTypes.size();x++){
                        AcctItemGroup.AcctItemType acctItemType=acctItemTypes.get(x);
                        sum+=acctItemType.getAcctItemCharge();
                    }
                }
               // List<AcctItemGroup.AcctItemType>
            }

        }

        String custName=customerDao.queryCustNameByCustId(custId);//汇聚网查询客户名称
        result="{" +
                "\"viewItemCat\": \"A050101\"," +
                "\"PROV_CODE\":\"43101\"," +                    //省编码
                "\"BELONG_LAN_ID\":\"431\"," +               //归属本地网
                "\"OWEFEELIST\":[{" +
                "\"CUST_ID\":\""+custId+"\"," +           //客户id
                "\"CUST_NAME\":\""+custName+"\"," +                   //客户名称
                "\"FEE_CYCLE_ID\":\""+lastDate+"\"," +    //欠费月份
                "\"AMOUNT\":\""+sum+"\"," +               //欠费金额
                "\"ACCT_ITEM_TYPE_ID\":\"\"," +          //账目类型ID
                "\"NAME\":\"\"" +                        //账目类型名称
                "}]}";
        return result;
    }

    /**
     *根据号码获取这个号码的所有订购
     *
     * */
    public String queryAllOrder(String servId,int queryType,String cicleId){
        String result="";
        BaseParams baseParams=new BaseParams();
        baseParams.setQueryCode(servId);
        baseParams.setQueryType(queryType);
        baseParams.setBillPeriods(cicleId);
        baseParams.setType("");
        baseParams.setProdId("379");
        QueryAllOrder queryAllOrder= queryCenterService.queryAllOrder(baseParams);
        return  result;
    }
}
