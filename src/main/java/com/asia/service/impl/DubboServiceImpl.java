package com.asia.service.impl;

import com.alibaba.fastjson.JSON;
import com.asia.common.utils.LogUtil;
import com.asia.common.utils.StringUtil;
import com.asia.domain.bon3.SearchAcctInfoReq;
import com.asia.domain.bon3.SearchAcctInfoRes;
import com.asia.domain.bon3.SearchAcctInfoRes.StdCcaQueryAcct.QueryAcctInfo;
import com.asia.domain.localApi.AcountRealFeeDetailServiceReq;
import com.asia.domain.localApi.AcountRealFeeDetailServiceRes;
import com.asia.domain.localApi.AcountRealFeeDetailServiceRes.FeeBillBean;
import com.asia.domain.localApi.AcountRealFeeDetailServiceRes.FeeBillBean.BillingCycleBean;
import com.asia.internal.common.BillException;
import com.asia.internal.errcode.ErrorCodeCompEnum;
import com.asiainfo.account.api.RtQueryService;
import com.asiainfo.account.api.ServInfoService;
import com.asiainfo.account.model.domain.*;
import com.asiainfo.account.model.request.ExactlyRtQryRequest;
import com.asiainfo.account.model.request.ServInfoQueryRequest;
import com.asiainfo.account.model.response.ExactlyRtQryResponse;
import com.asiainfo.account.model.response.ServInfoQueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import com.asia.domain.localApi.AcountRealFeeDetailServiceRes.RealRtFeeDetailBean;

/**
 * 服务调用层,但本处不涉及事务
 * ClassName: DubboServiceImpl <br/>
 * date: 2019年4月23日 下午8:30:30 <br/>
 * @author yinyanzhen
 */
@Service
public class DubboServiceImpl {
	@Autowired
    private RtQueryService rtQueryService;
    @Autowired
    Bon3ServiceImpl bon3Service;
    @Autowired
    ServInfoService servInfoService;
    /**
     * @Author WangBaoQiang
     * @Description //账户级实时账单查询
     * @Date 11:27 2019/10/20
     * @Param [body, headers]
     * @return com.asia.domain.localApi.AcountRealFeeDetailServiceRes
    */
	public AcountRealFeeDetailServiceRes   rtQueryService(AcountRealFeeDetailServiceReq body, Map<String, String> headers) throws IOException, BillException {
	    //调用账户信息查询api
        AcountRealFeeDetailServiceRes acountRealFeeDetailServiceRes = new AcountRealFeeDetailServiceRes();
        //RealRtFeeDetailBean realRtFeeDetailBean = new RealRtFeeDetailBean();
        SearchAcctInfoReq searchAcctInfoReq = new SearchAcctInfoReq();
		SearchAcctInfoReq.StdCcrQueryAcct stdCcrQueryAcct = new SearchAcctInfoReq.StdCcrQueryAcct();
        SearchAcctInfoRes searchAcctInfoRes = new SearchAcctInfoRes();
        SearchAcctInfoRes.StdCcaQueryAcct stdCcaQueryAcct = new SearchAcctInfoRes.StdCcaQueryAcct();
        List<QueryAcctInfo> queryAcctInfoList = new ArrayList<>();
        QueryAcctInfo queryAcctInfo = new QueryAcctInfo();
		stdCcrQueryAcct.setQueryType(String.valueOf(body.getExactlyRtQry().getQueryFlag()));
        stdCcrQueryAcct.setValue(body.getExactlyRtQry().getQueryValue());
        stdCcrQueryAcct.setValueType(body.getExactlyRtQry().getValueType());
        stdCcrQueryAcct.setAreaCode(body.getExactlyRtQry().getAreaCode());
        searchAcctInfoReq.setStdCcrQueryAcct(stdCcrQueryAcct);
        searchAcctInfoRes =  bon3Service.searchAcctInfo(searchAcctInfoReq, headers);
        stdCcaQueryAcct = searchAcctInfoRes.getStdCcaQueryAcct();
        if (StringUtil.isEmpty(stdCcaQueryAcct)) {
            throw new BillException(ErrorCodeCompEnum.HSS_SEARCH_SERV_INFO_NOT_EXIST);
        }
        queryAcctInfoList = stdCcaQueryAcct.getQueryAcctInfo();
        if (StringUtil.isEmpty(queryAcctInfoList)) {
            throw new BillException(ErrorCodeCompEnum.HSS_SEARCH_SERV_INFO_NOT_EXIST);
        }
        queryAcctInfo = queryAcctInfoList.get(0);
        String acctId = queryAcctInfo.getAcctId();

        //组装账务dubbo服务
        ExactlyRtQryRequest exactlyRtQryRequest =new ExactlyRtQryRequest();
		ExactlyRtQryResponse exactlyRtQryResponse = new ExactlyRtQryResponse();
		ExactlyRtQry exactlyRtQry = new ExactlyRtQry();
		RouteRuleInfo routeRuleInfo = new RouteRuleInfo();
		//exactlyRtQry.setQueryFlag(2L);
        exactlyRtQry.setQueryFlag2(Long.parseLong(acctId));
		//exactlyRtQry.setQueryValue("313019150712");
		exactlyRtQry.setStaffID(1L);
		routeRuleInfo.setRouteFlag(3L);
		routeRuleInfo.setRouteValue(acctId);
		exactlyRtQry.setRouteRuleInfo(routeRuleInfo);
		exactlyRtQryRequest.setExactlyRtQry(exactlyRtQry);
        LogUtil.info("[开始调用dubbo【exactlyRtQuery】远程服务 实时账单查询]" + "\n" ,null, this.getClass());
        LogUtil.info("输入参数[exactlyRtQryRequest]="+JSON.toJSONString(exactlyRtQryRequest),null, this.getClass());
		exactlyRtQryResponse = rtQueryService.exactlyRtQuery(exactlyRtQryRequest);
        LogUtil.info("[调用dubbo【exactlyRtQuery】远程服务 实时账单查询]"+"\n输出结果[result]="
                + JSON.toJSONString(exactlyRtQryResponse),null,this.getClass());
		if("0".equals(exactlyRtQryResponse.getErrorCode())){
            List<FeeBill> realFeeBill = new ArrayList<>();
            List<FeeBillBean> feeBillBeanList = new ArrayList<>();
            realFeeBill = exactlyRtQryResponse.getExactlyRtQry().getRealTimeFeeBill();
            for (FeeBill feeBill : realFeeBill) {
                List<BillingCycleBean> billingCycleBeanList = new ArrayList<>();
                BillingCycleBean billingCycleBean = new BillingCycleBean();
                FeeBillBean feeBillBean = new FeeBillBean();
                String productName = "";
                feeBillBean.setAccNbr(feeBill.getAccNbr());
                feeBillBean.setAcctID(feeBill.getAcctID());
                feeBillBean.setAcctItemTypeID(feeBill.getAcctItemTypeID());
                feeBillBean.setAcctItemTypeName(feeBill.getAcctItemTypeName());
                feeBillBean.setBillItemName(feeBill.getBillItemName());
                feeBillBean.setBillItemTypeID(feeBill.getBillItemTypeID());
                billingCycleBean.setBeginDate(feeBill.getBillingCycle().get(0).getBeginDate());
                billingCycleBean.setEndDate(feeBill.getBillingCycle().get(0).getEndDate());
                billingCycleBean.setBillingCycleID(feeBill.getBillingCycle().get(0).getBillingCycleID());
                billingCycleBeanList.add(billingCycleBean);
                feeBillBean.setBillingCycle(billingCycleBeanList);
                feeBillBean.setCharge(feeBill.getCharge());
                feeBillBean.setItemSourceID(feeBill.getItemSourceID());
                feeBillBean.setOfferID(feeBill.getOfferID());
                feeBillBean.setServID(feeBill.getServID());
                feeBillBean.setState(feeBill.getState());
                productName = doProductNameCheck(String.valueOf(feeBill.getServID()),String.valueOf(feeBill.getAcctID()));
                feeBillBean.setProductName(productName);
                feeBillBeanList.add(feeBillBean);
            }
            acountRealFeeDetailServiceRes.setFeeBill(feeBillBeanList);
        }
        acountRealFeeDetailServiceRes.setErrorCode(exactlyRtQryResponse.getErrorCode());
        acountRealFeeDetailServiceRes.setErrorCode(exactlyRtQryResponse.getErrorMsg());
        return acountRealFeeDetailServiceRes;

	}
/**
 * @Author WangBaoQiang
 * @Description //根据用户实例查询用户信息
 * @Date 13:47 2019/10/20
 * @Param [prodInstId, acctId]
 * @return java.lang.String
*/
    public String doProductNameCheck(String prodInstId, String acctId) {
        ServInfoQuery servInfoQuery = new ServInfoQuery();
        ServInfoQueryRequest servInfoQueryRequest = new ServInfoQueryRequest();
        ServInfoQueryResponse servInfoQueryResponse = new ServInfoQueryResponse();
        ServInfo servInfo = new ServInfo();
        servInfoQuery.setQueryValue1(prodInstId);
        servInfoQuery.setQueryFlag(6L);
        servInfoQuery.setQueryValue4(acctId);
        servInfoQueryRequest.setServInfoQuery(servInfoQuery);
        LogUtil.debug("[开始调用dubbo【getServInfo】远程服务 用户信息查询]" + "\n" ,null, this.getClass());
        LogUtil.debug("输入参数[servInfoQueryRequest]="+JSON.toJSONString(servInfoQueryRequest),null, this.getClass());
        servInfoQueryResponse = servInfoService.getServInfo(servInfoQueryRequest);
        LogUtil.debug("[调用dubbo【getServInfo】远程服务 用户信息查询]"+"\n输出结果[result]="
                + JSON.toJSONString(servInfoQueryResponse),null,this.getClass());
        String prodName = "";
        if (!StringUtil.isEmpty(servInfoQueryResponse.getServInfoQuery().getServInfo())) {
            servInfo =  servInfoQueryResponse.getServInfoQuery().getServInfo().get(0);
            prodName = servInfo.getProductName();
        }
        return prodName;

    }
}