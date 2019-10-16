package com.asia.service;

import com.asia.domain.localApi.*;
import com.asia.internal.common.BillException;
import com.asiainfo.account.model.request.StdCcrRealTimeBillQueryRequest;
import com.asiainfo.account.model.response.StdCcaRealTimeBillQueryResponse;
import org.apache.http.client.ClientProtocolException;

import java.io.IOException;
import java.util.Map;

/**
 * @author WangBaoQiang
 * @ClassName: IlocalService
 * @description: TODO
 * @date 2019/8/618:29
 * @Version 1.0
 */
public interface IlocalService {
    /**
     * @Author WangBaoQiang
     * @Description 月账话费高额
     * @Date 20:46 2019/10/15
     * @Param [body, headers]
     * @return com.asia.domain.localApi.QryMonthHighFeeRes
    */
    QryMonthHighFeeRes qryMonthHighFee(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    /**
     * @Author WangBaoQiang
     * @Description 实时话费高额
     * @Date 20:47 2019/10/15
     * @Param [body, headers]
     * @return com.asia.domain.localApi.QryMonthHighFeeRes
    */
    QryMonthHighFeeRes qryRealHighFee(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    /**
     * @Author WangBaoQiang
     * @Description 日流量高额告警
     * @Date 20:47 2019/10/15
     * @Param [body, headers]
     * @return com.asia.domain.localApi.QryMonthHighFeeRes
    */
    QryMonthHighFeeRes qryDataHighFlow(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    /**
     * @Author WangBaoQiang
     * @Description 累积量超出提醒
     * @Date 20:48 2019/10/15
     * @Param [body, headers]
     * @return com.asia.domain.localApi.QryMonthHighFeeRes
    */
    QryMonthHighFeeRes qryAccuOverFlow(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    /**
     * @Author WangBaoQiang
     * @Description 流量标资费且有流量费用户
     * @Date 20:48 2019/10/15
     * @Param [body, headers]
     * @return com.asia.domain.localApi.QryMonthHighFeeRes
    */
    QryMonthHighFeeRes qryUserFlowFee(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    /**
     * @Author WangBaoQiang
     * @Description 计费侧发送短信日志
     * @Date 20:49 2019/10/15
     * @Param [body, headers]
     * @return com.asia.domain.localApi.QryMonthHighFeeRes
    */
    QryMonthHighFeeRes qrySendMsgUser(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    /**
     * @Author WangBaoQiang
     * @Description 宽带到期提醒
     * @Date 20:49 2019/10/15
     * @Param [body, headers]
     * @return com.asia.domain.localApi.QryMonthHighFeeRes
    */
    QryMonthHighFeeRes qryWlanRemain(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    /**
     * @Author WangBaoQiang
     * @Description 累积量超出查询
     * @Date 20:49 2019/10/15
     * @Param [body, headers]
     * @return com.asia.domain.localApi.UserMeterOrderRes
     */
    QryMonthHighFeeRes qryOverAccuFee(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    /**
     * @Author WangBaoQiang
     * @Description 详单打印记录
     * @Date 20:49 2019/10/15
     * @Param [body, headers]
     * @return com.asia.domain.localApi.UserMeterOrderRes
    */
    UserMeterOrderRes  userMeterOrderService(UserMeterOrderReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    /**
     * @Author WangBaoQiang
     * @Description 详单打印记录
     * @Date 20:49 2019/10/15
     * @Param [body, headers]
     * @return com.asia.domain.localApi.UserMeterOrderRes
     */
    MeterPrintActionRes printRecordService(MeterPrintActionReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    /**
     * @Author WangBaoQiang
     * @Description 协议消费金额查询
     * @Date 20:50 2019/10/15
     * @Param [body, headers]
     * @return com.asia.domain.localApi.QueryAgreementConsumptionRes
    */
    QueryAgreementConsumptionRes queryAgreementConsumption(QueryAgreementConsumptionReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    /**
     * @Author WangBaoQiang
     * @Description 判断本网异网
     * @Date 20:46 2019/10/15
     * @Param [body, headers]
     * @return com.asia.domain.localApi.UserByPhoneQueryServiceRes
    */
    UserByPhoneQueryServiceRes userByPhoneQueryService(UserByPhoneQueryServiceReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;

    StdCcaRealTimeBillQueryResponse queryAddValueList(StdCcrRealTimeBillQueryRequest body, Map<String, String> headers) throws ClientProtocolException, IOException;


}
