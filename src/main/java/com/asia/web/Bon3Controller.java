package com.asia.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.AcctApiUrl;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.LogUtil;
import com.asia.domain.bon3.StdCcrQueryServReq;
import com.asia.service.impl.Bon3ServiceImpl;
import com.asiainfo.account.model.domain.*;
import com.asiainfo.account.model.request.*;
import com.asiainfo.account.model.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Map;

/**
 * 场景三服务暴漏
 * ClassName: Bon3Controller <br/>
 * date: 2019年4月23日 下午8:33:27 <br/>
 * @author yinyanzhen
 */
@RequestMapping( value="/bon3",produces="application/json;charset=UTF-8")
@RestController
public class Bon3Controller{
	@Autowired
	private Bon3ServiceImpl bon3ServiceImpl;

	/**
	 * searchServInfo:(用户信息查询). <br/>
	 * @author yinyanzhen
	 * @param stdCcrQueryServ
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/searchServInfo")
	public String searchServInfo(@RequestBody StdCcrQueryServReq stdCcrQueryServ,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/bon3/searchServInfo","body>>"+JSON.toJSONString(stdCcrQueryServ,SerializerFeature.WriteMapNullValue)
			+" header>>"+JSON.toJSONString(headers), this.getClass());
		StdCcaQueryServResponse info=new StdCcaQueryServResponse();
        StdCcrQueryServRequest queryServReq = new StdCcrQueryServRequest();
		StdCcrQueryServ queryServ = new StdCcrQueryServ();
		queryServReq.setStdCcrQueryServ(stdCcrQueryServ.getStdCcrQueryServ());
		//根据系统落日志表
		String systemId = stdCcrQueryServ.getSystemId();
		try {
			info.setStdCcaQueryServ(new StdCcaQueryServ());
			info.getStdCcaQueryServ().setCustName("客户名称");
			info.getStdCcaQueryServ().setServId("11123123");
			info.getStdCcaQueryServ().setProductId("1121212");
			info.getStdCcaQueryServ().setProductName("产品名称");
			info.getStdCcaQueryServ().setGroupUser("1");
			info.getStdCcaQueryServ().setServState("0");
			info.getStdCcaQueryServ().setStateDate("20180903120101");
			info.getStdCcaQueryServ().setPaymentFlag("1");
			info.getStdCcaQueryServ().setHomeAreaCode("0531");
			info = bon3ServiceImpl.searchServInfo(queryServReq, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/bon3/searchServInfo服务调用失败", e, this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
		}
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * searchServInfo:(流量卡充值记录查询). <br/>
	 * @author yinyanzhen
	 * @param getFcDeposit
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/getFcDeposit")
	public String getFcDeposit(@RequestBody StdCcrFlowCardRecQryRequest stdCcrFlowCardRecQry,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/bon3/getFcDeposit", "body>>"+stdCcrFlowCardRecQry.toString()+" header>>"+JSON.toJSONString(headers), this.getClass());
		StdCcaFlowCardRecQryResponse info=new StdCcaFlowCardRecQryResponse();
		try {
			info.setStdCcaFlowCardRecQry(new StdCcaFlowCardRecQry());
			info.getStdCcaFlowCardRecQry().setFlowCardRecInfo(new ArrayList<>());
			
			StdFlowCardRecInfo flowCardRecInfo = new StdFlowCardRecInfo();
			flowCardRecInfo.setRemindLevel("1");
			flowCardRecInfo.setAccNbr("15310002000");
			flowCardRecInfo.setDestinationType("1");
			flowCardRecInfo.setPayAmount("100");
			flowCardRecInfo.setUnitTypeId("3");
			flowCardRecInfo.setEffDate("20190501000000");
			flowCardRecInfo.setExpDate("20190601000000");
			flowCardRecInfo.setPaidTime("20190510153535");
			info.getStdCcaFlowCardRecQry().getFlowCardRecInfo().add(flowCardRecInfo);
//			info = bon3ServiceImpl.getFcDeposit(stdCcrFlowCardRecQry, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/bon3/getFcDeposit服务调用失败", e, this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
		}
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * flowGetRate:(流量卡使用量查询). <br/>
	 * @author yinyanzhen
	 * @param stdCcrFlowCardUsageQuery
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/flowGetRate")
	public String flowGetRate(@RequestBody StdCcrFlowCardUsageQueryRequest stdCcrFlowCardUsageQuery,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/bon3/flowGetRate", "body>>"+stdCcrFlowCardUsageQuery.toString()+" header>>"+JSON.toJSONString(headers), this.getClass());
		StdCcaFlowCardUsageQueryResponse info=new StdCcaFlowCardUsageQueryResponse();
		try {
			info.setStdCcaFlowCardUsageQuery(new StdCcaFlowCardUsageQuery());
			info.getStdCcaFlowCardUsageQuery().setFlowCardUsageInfo(new ArrayList<>());
			
			StdFlowCardUsageInfo flowCardUsageInfo = new StdFlowCardUsageInfo();
			flowCardUsageInfo.setRemindLevel("2");
			flowCardUsageInfo.setAccNbr("15339991999");
			flowCardUsageInfo.setDestinationType("1");
			flowCardUsageInfo.setUnitTypeId("3");
			flowCardUsageInfo.setRatableAmount("500");
			flowCardUsageInfo.setBalanceAmount("300");
			flowCardUsageInfo.setUsageAmount("200");
			flowCardUsageInfo.setEffDate("20190501000000");
			flowCardUsageInfo.setExpDate("20190601000000");
			info.getStdCcaFlowCardUsageQuery().getFlowCardUsageInfo().add(flowCardUsageInfo);
//			info = bon3ServiceImpl.flowGetRate(stdCcrFlowCardUsageQuery, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/bon3/flowGetRate服务调用失败", e, this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
		}
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * qryBalance:(余额查询). <br/>
	 * @author yinyanzhen
	 * @param stdCcrQueryBalance
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/qryBalance") 
	public String qryBalance(@RequestBody StdCcrQueryBalanceRequest stdCcrQueryBalance,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/bon3/qryBalance", "body>>"+stdCcrQueryBalance.toString()+" header>>"+JSON.toJSONString(headers), this.getClass());
		StdCcaQueryBalanceResponse info=new StdCcaQueryBalanceResponse();
		try {
			info.setStdCcaQueryBalance(new StdCcaQueryBalance());
			info.getStdCcaQueryBalance().setTotalBalanceAvailable("200");
			info.getStdCcaQueryBalance().setBalanceItemDetail(new ArrayList<>());
			
			StdBalanceItemDetail balanceItemDetail = new StdBalanceItemDetail();
			balanceItemDetail.setBalanceItemTypeDetail("赠款账本");
			balanceItemDetail.setBalanceAmount("20000");
			balanceItemDetail.setBalanceAvailable("10000");
			balanceItemDetail.setBalanceUsed("5000");
			balanceItemDetail.setBalanceReserved("10000");
			balanceItemDetail.setEffDate("20190501000000");
			balanceItemDetail.setExpDate("20190601000000");
			info.getStdCcaQueryBalance().getBalanceItemDetail().add(balanceItemDetail);
//			info = bon3ServiceImpl.qryBalance(stdCcrQueryBalance, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/bon3/qryBalance服务调用失败", e, this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
		}
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}
	/**
	 * getUnitedBalance:(余额查询). <br/>
	 * @author yinyanzhen
	 * @param stdCcrQueryUnitedBalance
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/getUnitedBalance") 
	public String getUnitedBalance(@RequestBody StdCcrQueryBalanceBalanceRequest stdCcrQueryUnitedBalance,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/bon3/getUnitedBalance", "body>>"+stdCcrQueryUnitedBalance.toString()+" header>>"+JSON.toJSONString(headers), this.getClass());
		StdCcaQueryBalanceBalanceResponse info=new StdCcaQueryBalanceBalanceResponse();
		try {
			info.setStdCcaQueryBalanceBalance(new StdCcaQueryBalanceBalance());
			info.getStdCcaQueryBalanceBalance().setPaymentFlag("1");
			info.getStdCcaQueryBalanceBalance().setTotalBalanceAvailable("10000");
			info.getStdCcaQueryBalanceBalance().setBalanceInformation(new ArrayList<>());
			
			StdBalanceInformation temp = new StdBalanceInformation();
			temp.setBalanceAvailable("10000");
			temp.setBalanceTypeFlag("0");
			info.getStdCcaQueryBalanceBalance().getBalanceInformation().add(temp);
//			info = bon3ServiceImpl.getUnitedBalance(stdCcrQueryUnitedBalance, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/bon3/getUnitedBalance服务调用失败", e, this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
		}
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * getUnitedAccu:(使用量查询). <br/>
	 * @author yinyanzhen
	 * @param stdCcrUserResourceQuery
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/getUnitedAccu") 
	public String getUnitedAccu(@RequestBody StdCcrUserResourceQueryRequest stdCcrUserResourceQuery,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/bon3/getUnitedBalance", "body>>"+stdCcrUserResourceQuery.toString()+" header>>"+JSON.toJSONString(headers), this.getClass());
		StdCcaUserResourceQueryResponse info=new StdCcaUserResourceQueryResponse();
		try {
			info.setStdCcaUserResourceQuery(new StdCcaUserResourceQuery());
			info.getStdCcaUserResourceQuery().setProductOffInfo(new ArrayList<>());
			
			StdProductOffInfo temp = new StdProductOffInfo();
			temp.setProductOfferId("1");
			temp.setProdOfferInstanceId("1");
			temp.setOfferType("22");
			temp.setProductOffName("99元套餐");
			temp.setRespondRatableQuery(new ArrayList<>());
			temp.setServGroupQuery(new ArrayList<>());
			StdServGroupQuery serv =new StdServGroupQuery();
			temp.getServGroupQuery().add(serv);
			StdRespondRatableQuery ratable = new StdRespondRatableQuery();
			temp.getRespondRatableQuery().add(ratable);
			info.getStdCcaUserResourceQuery().getProductOffInfo().add(temp);
//			info = bon3ServiceImpl.getUnitedAccu(stdCcrUserResourceQuery, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/bon3/getUnitedBalance服务调用失败", e, this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
		}
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * getUnitedAccuDetail:(使用量明细查询). <br/>
	 * @author yinyanzhen
	 * @param stdCcrUserResourceQueryDetail
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/getUnitedAccuDetail") 
	public String getUnitedAccuDetail(@RequestBody StdCcrUserResourceQueryDetailRequest stdCcrUserResourceQueryDetail,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/bon3/getUnitedAccuDetail", "body>>"+stdCcrUserResourceQueryDetail.toString()+" header>>"+JSON.toJSONString(headers), this.getClass());
		StdCcaUserResourceQueryDetailResponse info=new StdCcaUserResourceQueryDetailResponse();
		try {
			info.setStdCcaUserResourceQueryDetail(new StdCcaUserResourceQueryDetail());
			info.getStdCcaUserResourceQueryDetail().setProductOffInfo(new ArrayList());
			StdProductOffInfo pro= new StdProductOffInfo();
			pro.setRespondRatableQuery(new ArrayList<>());
			pro.getRespondRatableQuery().add(new StdRespondRatableQuery());
			pro.setServGroupQuery(new ArrayList<>());
			pro.getServGroupQuery().add(new StdServGroupQuery());
			info.getStdCcaUserResourceQueryDetail().getProductOffInfo().add(pro);
//			info = bon3ServiceImpl.getUnitedAccuDetail(stdCcrUserResourceQueryDetail, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/bon3/getUnitedAccuDetail服务调用失败", e, this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
		}
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}
	
	
}