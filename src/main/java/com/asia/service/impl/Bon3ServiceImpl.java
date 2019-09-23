package com.asia.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.AcctApiUrl;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.HttpUtil;
import com.asia.common.utils.HttpUtil.HttpResult;
import com.asia.domain.bon3.StdCcrQueryServRes;
import com.asiainfo.account.model.request.*;
import com.asiainfo.account.model.response.*;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

/**
 * 服务调用层,但本处不涉及事务
 * ClassName: Bon3ServiceImpl <br/>
 * date: 2019年4月23日 下午8:30:15 <br/>
 * @author yinyanzhen
 */
@Service
public class Bon3ServiceImpl {
	
	/**
	 * searchServInfo:(用户信息查询). <br/>
	 * @author yinyanzhen
	 * @param stdCcrQueryServ
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	@Autowired
	private AcctApiUrl acctApiUrl;

	public StdCcrQueryServRes searchServInfo(StdCcrQueryServRequest stdCcrQueryServ, Map<String,String> headers)
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(acctApiUrl.getSearchServInfo(),
				JSON.toJSONString(stdCcrQueryServ,SerializerFeature.WriteMapNullValue), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), StdCcrQueryServRes.class) ;
		}else{
			return new StdCcrQueryServRes();
		}
	}
	
	/**
	 * getFcDeposit:(流量卡充值记录查询). <br/>
	 * @author yinyanzhen
	 * @param stdCcrFlowCardRecQry
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public StdCcaFlowCardRecQryResponse getFcDeposit(StdCcrFlowCardRecQryRequest stdCcrFlowCardRecQry,Map<String,String> headers) 
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.Bon3.getFcDeposit, 
				JSON.toJSONString(stdCcrFlowCardRecQry,SerializerFeature.WriteMapNullValue), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), StdCcaFlowCardRecQryResponse.class) ;
		}else{
			return new StdCcaFlowCardRecQryResponse();
		}
	}
	
	/**
	 * flowGetRate:(流量卡使用量查询). <br/>
	 * @author yinyanzhen
	 * @param stdCcrFlowCardUsageQuery
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public StdCcaFlowCardUsageQueryResponse flowGetRate(StdCcrFlowCardUsageQueryRequest stdCcrFlowCardUsageQuery,Map<String,String> headers) 
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.Bon3.flowGetRate, 
				JSON.toJSONString(stdCcrFlowCardUsageQuery,SerializerFeature.WriteMapNullValue), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), StdCcaFlowCardUsageQueryResponse.class) ;
		}else{
			return new StdCcaFlowCardUsageQueryResponse();
		}
	}
	
	/**
	 * qryBalance:(余额查询). <br/>
	 * @author yinyanzhen
	 * @param stdCcrQueryBalance
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public StdCcaQueryBalanceResponse qryBalance(StdCcrQueryBalanceRequest stdCcrQueryBalance,Map<String,String> headers) 
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.Bon3.qryBalance, 
				JSON.toJSONString(stdCcrQueryBalance,SerializerFeature.WriteMapNullValue), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), StdCcaQueryBalanceResponse.class) ;
		}else{
			return new StdCcaQueryBalanceResponse();
		}
	}
	
	/**
	 * getUnitedBalance:(余额查询). <br/>
	 * @author yinyanzhen
	 * @param stdCcrQueryUnitedBalance
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public StdCcaQueryBalanceBalanceResponse getUnitedBalance(StdCcrQueryBalanceBalanceRequest stdCcrQueryUnitedBalance,Map<String,String> headers) 
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.Bon3.getUnitedBalance, 
				JSON.toJSONString(stdCcrQueryUnitedBalance,SerializerFeature.WriteMapNullValue), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), StdCcaQueryBalanceBalanceResponse.class) ;
		}else{
			return new StdCcaQueryBalanceBalanceResponse();
		}
	}
	
	/**
	 * getUnitedAccu:(使用量查询). <br/>
	 * @author yinyanzhen
	 * @param stdCcrUserResourceQuery
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public StdCcaUserResourceQueryResponse getUnitedAccu(StdCcrUserResourceQueryRequest stdCcrUserResourceQuery,Map<String,String> headers) 
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.Bon3.getUnitedAccu, 
				JSON.toJSONString(stdCcrUserResourceQuery,SerializerFeature.WriteMapNullValue), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), StdCcaUserResourceQueryResponse.class) ;
		}else{
			return new StdCcaUserResourceQueryResponse();
		}
	}
	
	/**
	 * getUnitedAccuDetail:(使用量明细查询). <br/>
	 * @author yinyanzhen
	 * @param stdCcrUserResourceQueryDetail
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public StdCcaUserResourceQueryDetailResponse d(StdCcrUserResourceQueryDetailRequest stdCcrUserResourceQueryDetail,Map<String,String> headers)
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.Bon3.getUnitedAccuDetail, 
				JSON.toJSONString(stdCcrUserResourceQueryDetail,SerializerFeature.WriteMapNullValue), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), StdCcaUserResourceQueryDetailResponse.class) ;
		}else{
			return new StdCcaUserResourceQueryDetailResponse();
		}
	}
	/**
	 * @Author WangBaoQiang
	 * @Description 实时账单查询
	 * @Date 11:08 2019/8/29
	 * @Param [stdCcrRealTimeBillQueryRequest, headers]
	 * @return com.asiainfo.account.model.response.StdCcaRealTimeBillQueryResponse
	*/
	public StdCcaRealTimeBillQueryResponse getOweList(StdCcrRealTimeBillQueryRequest stdCcrRealTimeBillQueryRequest, Map<String,String> headers)
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.Bon3.getOweList,
				JSON.toJSONString(stdCcrRealTimeBillQueryRequest,SerializerFeature.WriteMapNullValue), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), StdCcaRealTimeBillQueryResponse.class) ;
		}else{
			return new StdCcaRealTimeBillQueryResponse();
		}
	}
}