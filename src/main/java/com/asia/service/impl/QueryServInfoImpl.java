package com.asia.service.impl;

import com.alibaba.fastjson.JSON;
import com.asia.common.AcctApiUrl;
import com.asia.common.utils.HttpUtil;
import com.asia.common.utils.HttpUtil.HttpResult;
import com.asia.common.utils.LogUtil;
import com.asia.domain.openApi.QryBillReq;
import com.asia.domain.openApi.QryBillRes;
import com.asia.domain.openApi.QryBillRes.FeeBillingCycle;
import com.asia.domain.openApi.QryBillRes.FeeBillingCycle.AcctItemGroup;
import com.asia.domain.openApi.child.OperAttrStruct;
import com.asia.mapper.orclmapper.CustomerMapper;
import com.asia.service.impl.openApi.OpenAPIServiceImpl;
import com.prd.asiainfo.abm.provider.facade.dto.QueryServInfoReq;
import com.prd.asiainfo.abm.provider.facade.dto.QueryServInfoResp;
import com.prd.asiainfo.abm.provider.facade.dto.center.QueryAcctInfoByCustIdOrPaperNoResp;
import com.prd.asiainfo.abm.provider.facade.dto.center.base.Account;
import com.prd.asiainfo.abm.provider.facade.dto.center.base.BaseParams;
import com.prd.asiainfo.abm.provider.facade.service.AccountingService;
import com.prd.asiainfo.abm.provider.facade.service.QueryCenterService;
import org.apache.commons.httpclient.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class QueryServInfoImpl {
    @Autowired
    AccountingService accountingService;
    @Autowired
    AcctApiUrl acctApiUrl;
    @Autowired
    OpenAPIServiceImpl openAPIService;
    @Autowired
    CustomerMapper customerDao;

    public String queryServInfo(String phoneNum) throws IOException {
        String result="";
        QueryServInfoResp queryServInfoResp=new QueryServInfoResp();
        QueryServInfoReq queryServInfoReq=new QueryServInfoReq();
        queryServInfoReq.setQueryType(1);
        queryServInfoReq.setQueryCode(phoneNum);
        queryServInfoReq.setUserState("100000");
        queryServInfoReq.setStopType("100000");
        LogUtil.info("[开始调用dubbo【queryServInfo】远程服务 获取用户信息]" , null, this.getClass());
        LogUtil.info("输入参数[queryServInfoReq]=" + JSON.toJSONString(queryServInfoReq), null, this.getClass());
        queryServInfoResp=accountingService.queryServInfo(queryServInfoReq);


        return  result;
    }


}
