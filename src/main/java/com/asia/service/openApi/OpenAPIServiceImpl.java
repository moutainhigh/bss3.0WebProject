package com.asia.service.openApi;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.HttpUtil;
import com.asia.common.utils.HttpUtil.HttpResult;
import com.asia.domain.openApi.QryBalanceRecordDetailReq;
import com.asia.domain.openApi.QryBalanceRecordDetailRes;
import com.asia.domain.openApi.QryBillReq;
import com.asia.domain.openApi.QryBillRes;
import com.asia.domain.openApi.QryCustBillReq;
import com.asia.domain.openApi.QryCustBillRes;
import com.asia.domain.openApi.QryInstantFeeListReq;
import com.asia.domain.openApi.QryInstantFeeListRes;
import com.asia.domain.openApi.QryInstantFeeReq;
import com.asia.domain.openApi.QryInstantFeeRes;
import com.asia.domain.openApi.QryPaymentReq;
import com.asia.domain.openApi.QryPaymentRes;
import com.asia.domain.openApi.QueryBalanceReq;
import com.asia.domain.openApi.QueryBalanceRes;
import com.asia.domain.openApi.RechargeBalanceReq;
import com.asia.domain.openApi.RechargeBalanceRes;
import com.asia.domain.openApi.RtBillItemReq;
import com.asia.domain.openApi.RtBillItemRes;
import com.asia.domain.openApi.child.BillingCycle;

/**
 * 服务调用层,但本处不涉及事务
 * ClassName: OpenAPIServiceImpl <br/>
 * date: 2019年4月23日 下午8:29:42 <br/>
 * @author yinyanzhen
 */
@Service
public class OpenAPIServiceImpl{
	
	/**
	 * qryInstantFee:(实时话费查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public QryInstantFeeRes qryInstantFee(QryInstantFeeReq qryInstantFeeReq,Map<String,String> headers) 
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.OpenApi.qryInstantFee, qryInstantFeeReq.toString(), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), QryInstantFeeRes.class) ;
		}else{
			return new QryInstantFeeRes();
		}
	}
	
	/**
	 * qryInstantFeeList:(实时话费明细查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public QryInstantFeeListRes qryInstantFeeList(QryInstantFeeListReq body,Map<String,String> headers) 
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.OpenApi.qryInstantFeeList, body.toString(), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), QryInstantFeeListRes.class) ;
		}else{
			return new QryInstantFeeListRes();
		}
	}
	
	/**
	 * qryPayment:(缴费销帐记录查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public QryPaymentRes qryPayment(QryPaymentReq body,Map<String,String> headers) 
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.OpenApi.qryPayment, body.toString(), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), QryPaymentRes.class) ;
		}else{
			return new QryPaymentRes();
		}
	}
	
	/**
	 * qryInstantFeeList:(账单查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public QryCustBillRes qryCustBill(QryCustBillReq body,Map<String,String> headers) 
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.OpenApi.qryCustBill, body.toString(), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), QryCustBillRes.class) ;
		}else{
			return new QryCustBillRes();
		}
	}
	
	/**
	 * qryBill:(欠费查询). <br/>
	 * @author yinyanzhen
	 * @param body.to
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public QryBillRes qryBill(QryBillReq body,Map<String,String> headers) 
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.OpenApi.qryBill, body.toString(), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), QryBillRes.class) ;
		}else{
			return new QryBillRes();
		}
	}
	
	/**
	 * queryBalance:(余额查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public QueryBalanceRes queryBalance(QueryBalanceReq body,Map<String,String> headers) 
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.OpenApi.queryBalance, body.toString(), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), QueryBalanceRes.class) ;
		}else{
			return new QueryBalanceRes();
		}
	}
	
	/**
	 * qryBalanceRecordDetail:(余额变动明细查询). <br/>
	 * @author yinyanzhen
	 * @param body()
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public QryBalanceRecordDetailRes qryBalanceRecordDetail(QryBalanceRecordDetailReq body,Map<String,String> headers) 
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.OpenApi.qryBalanceRecordDetail, body.toString(), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), QryBalanceRecordDetailRes.class) ;
		}else{
			return new QryBalanceRecordDetailRes();
		}
	}
	
	/**
	 * billingCycle:(查询账务周期). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @return
	 * @since V1.0.0
	 */
	public List<BillingCycle> billingCycle(BillingCycle body,Map<String,String> headers) 
			throws ClientProtocolException, URISyntaxException, IOException{
		@SuppressWarnings("unchecked")
		Map<String,String> bodyMap=JSON.parseObject(JSON.toJSONString(body), Map.class);
		HttpResult result = HttpUtil.doGet(Constant.OpenApi.billingCycle, bodyMap, headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseArray(result.getData(), BillingCycle.class);
		}else{
			return new ArrayList<>();
		}
	}
	
	/**
	 * rechargeBalance:(余额充值服务(非卡充)). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public RechargeBalanceRes rechargeBalance(RechargeBalanceReq body,Map<String,String> headers) 
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.OpenApi.rechargeBalance, body.toString(), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), RechargeBalanceRes.class) ;
		}else{
			return new RechargeBalanceRes();
		}
	}
	
	/**
	 * rtBillItem:(详单查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public RtBillItemRes rtBillItem(RtBillItemReq body,Map<String,String> headers) 
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(Constant.OpenApi.rtBillItem, body.toString(), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), RtBillItemRes.class) ;
		}else{
			return new RtBillItemRes();
		}
	}
}