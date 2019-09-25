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
     *
     * qryMonthHighFee 月账话费高额
     * qryRealHighFee  实时话费高额
     * qryDataHighFlow 日流量高额告警
     * qryAccuOverFlow 累积量超出提醒
     * qryUserFlowFee 流量标资费且有流量费用户
     * qrySendMsgUser 计费侧发送短信日志
     * qryWlanRemain  宽带到期提醒
     * qryOverAccuFee 累积量超出查询
     * userMeterOrderService  详单禁查
     * printRecordService 详单打印记录
     */
    QryMonthHighFeeRes qryMonthHighFee(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    QryMonthHighFeeRes qryRealHighFee(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    QryMonthHighFeeRes qryDataHighFlow(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    QryMonthHighFeeRes qryAccuOverFlow(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    QryMonthHighFeeRes qryUserFlowFee(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    QryMonthHighFeeRes qrySendMsgUser(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    QryMonthHighFeeRes qryWlanRemain(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    QryMonthHighFeeRes qryOverAccuFee(QryMonthHighFeeReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    UserMeterOrderRes  userMeterOrderService(UserMeterOrderReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    MeterPrintActionRes printRecordService(MeterPrintActionReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    QueryAgreementConsumptionRes queryAgreementConsumption(QueryAgreementConsumptionReq body, Map<String, String> headers) throws ClientProtocolException, IOException, BillException;
    StdCcaRealTimeBillQueryResponse queryAddValueList(StdCcrRealTimeBillQueryRequest body, Map<String, String> headers) throws ClientProtocolException, IOException;

}
