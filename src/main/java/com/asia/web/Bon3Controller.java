package com.asia.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.LogUtil;
import com.asia.common.utils.StringUtil;
import com.asia.domain.bon3.*;
import com.asia.internal.common.BillException;
import com.asia.internal.errcode.ErrorCodeCompEnum;
import com.asia.service.impl.Bon3ServiceImpl;
import com.asiainfo.account.model.domain.StdBalanceItemDetail;
import com.asiainfo.account.model.domain.StdCcaQueryBalance;
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
 * @author wangBaoQiang
 */
@RequestMapping( value="/bon3",produces="application/json;charset=UTF-8")
@RestController
public class Bon3Controller{
	@Autowired
	private Bon3ServiceImpl bon3ServiceImpl;

	/**
	 * searchServInfo:(用户信息查询). <br/>
	 * @author wangBaoQiang
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
        LogUtil.debug("START [searchServInfo] SERVICE...", null, this.getClass());
		LogUtil.debug("/bon3/searchServInfo"+ "body>>"+JSON.toJSONString(stdCcrQueryServ,SerializerFeature.WriteMapNullValue)
			+" header>>"+JSON.toJSONString(headers), null,this.getClass());
		StdCcrQueryServRes info=new StdCcrQueryServRes();
		try {
			//查询类型
			if (StringUtil.isEmpty(stdCcrQueryServ.getStdCcrQueryServ().getQueryType())) {
				throw new BillException(ErrorCodeCompEnum.QUERY_FLAG_IS_EMPTY);
			}
			//查询值类型
			if (StringUtil.isEmpty(stdCcrQueryServ.getStdCcrQueryServ().getValueType())) {
				throw new BillException(ErrorCodeCompEnum.QUERY_ATTR_IS_EMPTY);
			}
			//查询值
			if (StringUtil.isEmpty(stdCcrQueryServ.getStdCcrQueryServ().getValue())) {
				throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
			}
            String systemId = stdCcrQueryServ.getSystemId();
            if (StringUtil.isEmpty(systemId)) {
                throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
            }
			info = bon3ServiceImpl.searchServInfo(stdCcrQueryServ, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (BillException err) {
			LogUtil.error("/bon3/searchServInfo服务调用失败"+ "body>>"+JSON.toJSONString(stdCcrQueryServ,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			info.setErrorCode(err.getErrCode());
			info.setErrorMsg(err.getErrMsg());
			LogUtil.error("输出参数[stdCcrQueryServRes]=" + JSON.toJSONString(info, SerializerFeature.WriteMapNullValue), err, this.getClass());
			return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
		}catch (Exception e) {
			LogUtil.error("/bon3/searchServInfo服务调用失败", e, this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
			info.setErrorMsg(e.getMessage());
			LogUtil.error("输出参数[stdCcrQueryServRes]=" + JSON.toJSONString(info, SerializerFeature.WriteMapNullValue), e, this.getClass());
			return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
		}
		LogUtil.debug("输出参数[stdCcrQueryServRes]=" + JSON.toJSONString(info, SerializerFeature.WriteMapNullValue), null, this.getClass());
        LogUtil.debug("END [searchServInfo] SERVICE...", null, this.getClass());
        return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * getFcDeposit:(流量卡充值记录查询). <br/>
	 * @author wangBaoQiang
	 * @param stdCcrFlowCardRecQry
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
			/*info.setStdCcaFlowCardRecQry(new StdCcaFlowCardRecQry());
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
			info.getStdCcaFlowCardRecQry().getFlowCardRecInfo().add(flowCardRecInfo);*/
			info = bon3ServiceImpl.getFcDeposit(stdCcrFlowCardRecQry, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/bon3/getFcDeposit服务调用失败", e, this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
		}
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * flowGetRate:(流量卡使用量查询). <br/>
	 * @author wangBaoQiang
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
			/*info.setStdCcaFlowCardUsageQuery(new StdCcaFlowCardUsageQuery());
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
			info.getStdCcaFlowCardUsageQuery().getFlowCardUsageInfo().add(flowCardUsageInfo);*/
			info = bon3ServiceImpl.flowGetRate(stdCcrFlowCardUsageQuery, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/bon3/flowGetRate服务调用失败", e, this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
		}
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * qryBalance:(余额查询). <br/>
	 * @author wangBaoQiang
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
			/*balanceItemDetail.setBalanceItemTypeDetail("赠款账本");
			balanceItemDetail.setBalanceAmount("20000");
			balanceItemDetail.setBalanceAvailable("10000");
			balanceItemDetail.setBalanceUsed("5000");
			balanceItemDetail.setBalanceReserved("10000");
			balanceItemDetail.setEffDate("20190501000000");
			balanceItemDetail.setExpDate("20190601000000");
			info.getStdCcaQueryBalance().getBalanceItemDetail().add(balanceItemDetail);*/
			info = bon3ServiceImpl.qryBalance(stdCcrQueryBalance, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/bon3/qryBalance服务调用失败", e, this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
		}
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}
	/**
	 * getUnitedBalance:(余额查询). <br/>
	 * @author wangBaoQiang
	 * @param stdCcrQueryUnitedBalance
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/getUnitedBalance") 
	public String getUnitedBalance(@RequestBody StdCcrQueryUnitedBalance stdCcrQueryUnitedBalance,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
        LogUtil.debug("START [getUnitedAccu] SERVICE...", null, this.getClass());
		LogUtil.debug("/bon3/getUnitedBalance" +"body>>"+stdCcrQueryUnitedBalance.toString()+" header>>"+JSON.toJSONString(headers), null,this.getClass());
		StdCcaQueryUnitedBalance info=new StdCcaQueryUnitedBalance();
		try {
			//查询类型
			if (StringUtil.isEmpty(stdCcrQueryUnitedBalance.getStdCcrQueryBalanceBalance().getBalanceQueryInformation().getQueryFlag())) {
				throw new BillException(ErrorCodeCompEnum.QUERY_FLAG_IS_EMPTY);
			}
			//查询值类型
			if (StringUtil.isEmpty(stdCcrQueryUnitedBalance.getStdCcrQueryBalanceBalance().getBalanceQueryInformation().getDestinationAttr())) {
				throw new BillException(ErrorCodeCompEnum.QUERY_ATTR_IS_EMPTY);
			}
			//查询值
			if (StringUtil.isEmpty(stdCcrQueryUnitedBalance.getStdCcrQueryBalanceBalance().getBalanceQueryInformation().getDestinationId())) {
				throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
			}
			//校验用户区号
			if (StringUtil.isEmpty(stdCcrQueryUnitedBalance.getStdCcrQueryBalanceBalance().getBalanceQueryInformation().getAreaCode())) {
				throw new BillException(ErrorCodeCompEnum.AREA_CODE_IS_EMPTY);
			}
			//校验系统id
			String systemId = stdCcrQueryUnitedBalance.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}
			info = bon3ServiceImpl.getUnitedBalance(stdCcrQueryUnitedBalance, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (BillException err) {
			LogUtil.error("/bon3/getUnitedBalance服务调用失败"+ "body>>"+JSON.toJSONString(stdCcrQueryUnitedBalance,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			info.setErrorCode(err.getErrCode());
			info.setErrorMsg(err.getErrMsg());
			LogUtil.error("输出参数 getUnitedBalanceRes=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
		}
		catch (Exception e) {
            LogUtil.error("/bon3/getUnitedBalance服务调用失败"+ "body>>"+JSON.toJSONString(stdCcrQueryUnitedBalance,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
			info.setErrorMsg(e.getMessage());
			LogUtil.error("输出参数 getUnitedBalanceResponse=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
		}
		LogUtil.debug("输出参数 getUnitedBalanceResponse=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
		LogUtil.debug("END [getUnitedBalance] SERVICE...", null, this.getClass());
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * getUnitedAccu:(使用量查询). <br/>
	 * @author wangBaoQiang
	 * @param stdCcrUserResourceQuery
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/getUnitedAccu") 
	public String getUnitedAccu(@RequestBody StdCcrUserResourceQuery stdCcrUserResourceQuery,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.debug("START [getUnitedAccu] SERVICE...", null, this.getClass());
		LogUtil.debug("/bon3/getUnitedAccu"+ " body>>"+stdCcrUserResourceQuery.toString()+" header>>"+JSON.toJSONString(headers), null,this.getClass());
		StdCcaUserResourceQueryResponse info=new StdCcaUserResourceQueryResponse();
		try {
            //查询类型
            if (StringUtil.isEmpty(stdCcrUserResourceQuery.getStdCcrUserResourceQuery().getResourceInformation().getQueryFlag())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_FLAG_IS_EMPTY);
            }
            //查询值类型
            if (StringUtil.isEmpty(stdCcrUserResourceQuery.getStdCcrUserResourceQuery().getResourceInformation().getDestinationAttr())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_ATTR_IS_EMPTY);
            }
            //查询值
            if (StringUtil.isEmpty(stdCcrUserResourceQuery.getStdCcrUserResourceQuery().getResourceInformation().getAccNbr())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
            }
			//校验系统id
			String systemId = stdCcrUserResourceQuery.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}

			info = bon3ServiceImpl.getUnitedAccu(stdCcrUserResourceQuery, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		}catch (BillException err) {
			LogUtil.error("/bon3/getUnitedAccu服务调用失败"+ "body>>"+JSON.toJSONString(stdCcrUserResourceQuery,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			info.setErrorCode(err.getErrCode());
			info.setErrorMsg(err.getErrMsg());
            LogUtil.error("输出参数 getUnitedAccuResponse=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
		}
		catch (Exception e) {
            LogUtil.error("/bon3/getUnitedAccu服务调用失败"+ "body>>"+JSON.toJSONString(stdCcrUserResourceQuery,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
			info.setErrorMsg(e.getMessage());
            LogUtil.error("输出参数 getUnitedAccuResponse=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
		}
        LogUtil.debug("输出参数 getUnitedAccuResponse=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
        LogUtil.debug("END [getUnitedAccu] SERVICE...", null, this.getClass());
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * getUnitedAccuDetail:(使用量明细查询). <br/>
	 * @author wangBaoQiang
	 * @param stdCcrUserResourceQueryDetail
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/getUnitedAccuDetail")
	public String getUnitedAccuDetail(@RequestBody StdCcrUserResourceQueryDetail stdCcrUserResourceQueryDetail,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
        LogUtil.debug("START [getUnitedAccuDetail] SERVICE...", null, this.getClass());
		LogUtil.debug("/bon3/getUnitedAccuDetail"+ " body>>"+stdCcrUserResourceQueryDetail.toString()+" header>>"+JSON.toJSONString(headers), null,this.getClass());
		StdCcaUserResourceQueryDetailResponse info=new StdCcaUserResourceQueryDetailResponse();
		try {
		    //系统id
			String systemId = stdCcrUserResourceQueryDetail.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}
            //查询类型
            if (StringUtil.isEmpty(stdCcrUserResourceQueryDetail.getStdCcrUserResourceQueryDetail().getResourceInformation().getQueryFlag())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_FLAG_IS_EMPTY);
            }
            //查询值类型
            if (StringUtil.isEmpty(stdCcrUserResourceQueryDetail.getStdCcrUserResourceQueryDetail().getResourceInformation().getDestinationAttr())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_ATTR_IS_EMPTY);
            }
            //查询值
            if (StringUtil.isEmpty(stdCcrUserResourceQueryDetail.getStdCcrUserResourceQueryDetail().getResourceInformation().getAccNbr())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
            }
			info = bon3ServiceImpl.getUnitedAccuDetail(stdCcrUserResourceQueryDetail, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (BillException err) {
			LogUtil.error("/bon3/getUnitedAccuDetail服务调用失败"+ "body>>"+JSON.toJSONString(stdCcrUserResourceQueryDetail,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			info.setErrorCode(err.getErrCode());
			info.setErrorMsg(err.getErrMsg());
            LogUtil.error("输出参数 getUnitedAccuDetailResponse=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), err, this.getClass());
			return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
		}catch (Exception e) {
			LogUtil.error("/bon3/getUnitedAccuDetail服务调用失败"+ "body>>"+JSON.toJSONString(stdCcrUserResourceQueryDetail,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), e,this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
			info.setErrorMsg(e.getMessage());
            LogUtil.error("输出参数 getUnitedAccuDetailResponse=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
		}
        LogUtil.debug("输出参数 getUnitedAccuDetailResponse=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
        LogUtil.debug("END [getUnitedAccuDetail] SERVICE...", null, this.getClass());
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}


	/**
	 * getCreditInfo:(用户信用查询). <br/>
	 * @author Chenjian
	 * @param getCreditInfoReq
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/getCreditInfo")
	public String getCreditInfo(@RequestBody GetCreditInfoReq getCreditInfoReq,
									  @RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
        LogUtil.debug("START [getCreditInfo] SERVICE...", null, this.getClass());
		LogUtil.debug("/bon3/getCreditInfo"+ " body>>"+JSON.toJSONString(getCreditInfoReq,SerializerFeature.WriteMapNullValue)
				+" header>>"+JSON.toJSONString(headers), null,this.getClass());
		GetCreditInfoRes info=new GetCreditInfoRes();
		try {
			String systemId = getCreditInfoReq.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}
            //查询类型
            if (StringUtil.isEmpty(getCreditInfoReq.getStdCcrQueryCredit().getQueryFlag())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_FLAG_IS_EMPTY);
            }
            //账期
            if (StringUtil.isEmpty(getCreditInfoReq.getStdCcrQueryCredit().getBillingCycle())) {
                throw new BillException(ErrorCodeCompEnum.BILLING_CYCYLE_ERR);
            }
            //查询值类型
            if (StringUtil.isEmpty(getCreditInfoReq.getStdCcrQueryCredit().getDestinationAttr())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_ATTR_IS_EMPTY);
            }
            //查询值
            if (StringUtil.isEmpty(getCreditInfoReq.getStdCcrQueryCredit().getDestinationId())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
            }
			info = bon3ServiceImpl.getCreditInfo(getCreditInfoReq, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (BillException err) {
			LogUtil.error("/bon3/getCreditInfo服务调用失败"+ "body>>"+JSON.toJSONString(getCreditInfoReq,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			info.setErrorCode(err.getErrCode());
			info.setErrorMsg(err.getErrMsg());
            LogUtil.error("输出参数[getCreditInfoRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
		}catch (Exception e) {
            LogUtil.error("/bon3/getCreditInfo服务调用失败"+ "body>>"+JSON.toJSONString(getCreditInfoReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
			info.setErrorMsg(e.getMessage());
            LogUtil.error("输出参数[getCreditInfoRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
		}
        LogUtil.debug("输出参数[getCreditInfoRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
        LogUtil.debug("END [getCreditInfo] SERVICE...", null, this.getClass());
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}

	/**
	 * getOweList :((实时)帐单查询). <br/>
	 * @author Chenjian
	 * @param getOweListReq
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/getOweList")
	public String getOweList(@RequestBody GetOweListReq getOweListReq,
								@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
        LogUtil.debug("START [getOweList] SERVICE...", null, this.getClass());
		LogUtil.debug("/bon3/getOweList" + " body>>"+JSON.toJSONString(getOweListReq,SerializerFeature.WriteMapNullValue)
				+" header>>"+JSON.toJSONString(headers),null, this.getClass());
		GetOweListRes info=new GetOweListRes();
		try {
			if (getOweListReq == null) {
				throw new BillException(ErrorCodeCompEnum.REQUEST_BODY_IS_EMPTY);
			}
			//系统标示
			String systemId = getOweListReq.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}
			//查询类型
			if (StringUtil.isEmpty(getOweListReq.getStdCcrCustomizeBillQueryBill().getQueryFlag())) {
				throw new BillException(ErrorCodeCompEnum.QUERY_FLAG_IS_EMPTY);
			}
            //账期
            if (StringUtil.isEmpty(getOweListReq.getStdCcrCustomizeBillQueryBill().getBillingCycle())) {
                throw new BillException(ErrorCodeCompEnum.BILLING_CYCYLE_ERR);
            }
            //查询值类型
            if (StringUtil.isEmpty(getOweListReq.getStdCcrCustomizeBillQueryBill().getDestinationAttr())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_ATTR_IS_EMPTY);
            }
            //查询值
            if (StringUtil.isEmpty(getOweListReq.getStdCcrCustomizeBillQueryBill().getAccNbr())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
            }
			info = bon3ServiceImpl.getBon3OweListBy(getOweListReq, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (BillException err) {
			LogUtil.error("输入参数[getOweListReq]=" + JSON.toJSONString(getOweListReq,SerializerFeature.WriteMapNullValue),
                    err, this.getClass());
			info.setErrorCode(err.getErrCode());
			info.setErrorMsg(err.getErrMsg());
			LogUtil.error("输出参数[getOweListRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
		}catch (Exception e) {
			LogUtil.error("输入参数[getOweListReq]=" + JSON.toJSONString(getOweListReq,SerializerFeature.WriteMapNullValue),
                    e, this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
			info.setErrorMsg(e.getMessage());
			LogUtil.error("输出参数[getOweListRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
		}
		LogUtil.debug("输出参数 getOweListReq=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
        LogUtil.debug("END [getOweList] SERVICE...", null, this.getClass());
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}


	/**
	 * getRealTimeBill :(实时费用查询). <br/>
	 * @author Chenjian
	 * @param getRealTimeBillReq
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/getRealTimeBill")
	public String getRealTimeBill(@RequestBody GetRealTimeBillReq getRealTimeBillReq,
							 @RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
        LogUtil.debug("START [getRealTimeBill] SERVICE...", null, this.getClass());
		LogUtil.debug("/bon3/getRealTimeBill" + " body>>"+JSON.toJSONString(getRealTimeBillReq,SerializerFeature.WriteMapNullValue)
				+" header>>"+JSON.toJSONString(headers), null,this.getClass());
		GetRealTimeBillRes info=new GetRealTimeBillRes();
		try {
            if (getRealTimeBillReq == null) {
                throw new BillException(ErrorCodeCompEnum.REQUEST_BODY_IS_EMPTY);
            }
			//查询类型
			if (StringUtil.isEmpty(getRealTimeBillReq.getStdCcrRealTimeBillQuery().getQueryFlag())) {
				throw new BillException(ErrorCodeCompEnum.QUERY_FLAG_IS_EMPTY);
			}
			//查询值类型
			if (StringUtil.isEmpty(getRealTimeBillReq.getStdCcrRealTimeBillQuery().getDestinationAttr())) {
				throw new BillException(ErrorCodeCompEnum.QUERY_ATTR_IS_EMPTY);
			}
			//查询值
			if (StringUtil.isEmpty(getRealTimeBillReq.getStdCcrRealTimeBillQuery().getAccNbr())) {
				throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
			}
			//系统id
			String systemId = getRealTimeBillReq.getSystemId();
			if (StringUtil.isEmpty(systemId)) {
				throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
			}
			info = bon3ServiceImpl.getRealTimeBill(getRealTimeBillReq, headers);
			headers.forEach((key, val) -> {
				response.setHeader(key, val);
			});
		} catch (BillException err) {
			LogUtil.error("/bon3/getRealTimeBill服务调用失败" + " body>>"+JSON.toJSONString(getRealTimeBillReq,SerializerFeature.WriteMapNullValue)
					+" header>>"+JSON.toJSONString(headers), err,this.getClass());
			info.setErrorCode(err.getErrCode());
			info.setErrorMsg(err.getErrMsg());
            LogUtil.error("输出参数[GetRealTimeBillRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
		} catch (Exception e) {
            LogUtil.error("/bon3/getRealTimeBill服务调用失败" + " body>>"+JSON.toJSONString(getRealTimeBillReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
			info.setErrorMsg(e.getMessage());
            LogUtil.error("输出参数[GetRealTimeBillRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
			return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
		}
		LogUtil.debug("输出参数 getRealTimeBill=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
        LogUtil.debug("END [getRealTimeBill] SERVICE...", null, this.getClass());
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}


	/**
	 * searchAcctInfo :(帐户信息查询). <br/>
	 * @author Chenjian
	 * @param searchAcctInfoReq
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/searchAcctInfo")
	public String searchAcctInfo(@RequestBody SearchAcctInfoReq searchAcctInfoReq,
								  @RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
        LogUtil.debug("START [searchAcctInfo] SERVICE...", null, this.getClass());
		LogUtil.debug("/bon3/searchAcctInfo" + " body>>"+JSON.toJSONString(searchAcctInfoReq,SerializerFeature.WriteMapNullValue)
				+" header>>"+JSON.toJSONString(headers), null,this.getClass());
		SearchAcctInfoRes info=new SearchAcctInfoRes();
		try {
			info = bon3ServiceImpl.searchAcctInfo(searchAcctInfoReq, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/bon3/searchAcctInfo服务调用失败", e, this.getClass());
			info.setErrorCode(Constant.ResultCode.ERROR);
		}
        LogUtil.debug("END [searchAcctInfo] SERVICE...", null, this.getClass());
		return JSON.toJSONString(info,SerializerFeature.WriteMapNullValue);
	}



}