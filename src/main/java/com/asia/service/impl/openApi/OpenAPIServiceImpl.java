package com.asia.service.impl.openApi;
import com.asia.mapper.billmapper.IntfServCustChangeContrastMapper;
import com.asia.mapper.ordmapper.ProdInstRouteMapper;
import com.asia.service.impl.Bon3ServiceImpl;
import com.alibaba.fastjson.JSON;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.HttpUtil;
import com.asia.common.utils.HttpUtil.HttpResult;
import com.asia.dao.OrclCommonDao;
import com.asia.domain.openApi.*;
import com.asia.domain.openApi.child.BillingCycle;
import com.asia.internal.common.ResultInfo;
import com.asia.service.impl.Bon3ServiceImpl;
import com.asiainfo.account.model.domain.StdCcaQueryServ;
import com.asiainfo.account.model.domain.StdCcrQueryServ;
import com.asiainfo.account.model.request.StdCcrQueryServRequest;
import com.asiainfo.account.model.response.StdCcaQueryServResponse;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	@Autowired
	OrclCommonDao orclCommonDao;
	@Autowired
	private Bon3ServiceImpl bon3Service;
	@Autowired
	private IntfServCustChangeContrastMapper intfServCustChangeContrastDao;
	@Autowired
	private ProdInstRouteMapper prodInstRouteMapperDao;

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
		// TODO: 2019/9/3 判断计费流水是否重复
		ResultInfo resultInfo = new ResultInfo();
		resultInfo = orclCommonDao.checkSerialnumberExist(body);
		RechargeBalanceRes rechargeBalanceRes = new RechargeBalanceRes();
		if (!"0".equals(resultInfo.getCode())) {
			rechargeBalanceRes.setResultCode(resultInfo.getCode());
			rechargeBalanceRes.setResultMsg(resultInfo.getMessage());
			return  JSON.parseObject(rechargeBalanceRes.toString(),RechargeBalanceRes.class) ;
		}//end
		HttpResult result = HttpUtil.doPostJson(Constant.OpenApi.rechargeBalance, body.toString(), headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			//插入充值记录
            rechargeBalanceRes = JSON.parseObject(result.getData(), RechargeBalanceRes.class);
            long paymentId = 0;
            if ("0".equals(rechargeBalanceRes.getResultCode())) {
				resultInfo = orclCommonDao.insertSerialnumber(body,paymentId);
				if (!"0".equals(resultInfo.getCode())) {
					rechargeBalanceRes.setResultCode(resultInfo.getCode());
					rechargeBalanceRes.setResultMsg(resultInfo.getMessage());
					return  JSON.parseObject(rechargeBalanceRes.toString(),RechargeBalanceRes.class) ;
				}
            }
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
		RtBillItemRes returnInfo=new RtBillItemRes();
		// TODO: 2019/7/30 过户增加判断
		String acctNumb = body.getSvcObjectStruct().getObjValue();
		Map map = new HashMap();
		//调用用户信息查询接口 begin
		StdCcaQueryServResponse info=new StdCcaQueryServResponse();
		StdCcrQueryServRequest stdCcrQueryServRequest = new StdCcrQueryServRequest();
		StdCcaQueryServ stdCcaQueryServ = new StdCcaQueryServ();
		StdCcrQueryServ stdCcrQueryServ = new StdCcrQueryServ();
		stdCcrQueryServ.setAreaCode("0431");
		stdCcrQueryServ.setQueryType("1");
		stdCcrQueryServ.setValue("17390026401");
		stdCcrQueryServ.setValueType("1");
		stdCcrQueryServRequest.setStdCcrQueryServ(stdCcrQueryServ);

		//info = bon3Service.searchServInfo(stdCcrQueryServRequest,headers);
		stdCcaQueryServ = info.getStdCcaQueryServ();
		String servId = "310000012365";//stdCcaQueryServ.getServId();
		map.put("servId", servId);
		List<Map<String, Object>> owenCustList = intfServCustChangeContrastDao.selectIntfServCustChangeContrast(map);
		if (owenCustList.size() > 1) {
			Map owenCustMap = owenCustList.get(0);

		}
		long prodInstId = 123;
		List<Map<String, Object>> prodInstRouteList = new ArrayList<Map<String, Object>>();
		prodInstRouteList = prodInstRouteMapperDao.selectProdInstRouteId(prodInstId);
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