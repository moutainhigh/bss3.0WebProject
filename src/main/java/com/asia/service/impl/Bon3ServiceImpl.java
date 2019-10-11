package com.asia.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.AcctApiUrl;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.HttpUtil;
import com.asia.common.utils.HttpUtil.HttpResult;
import com.asia.common.utils.LogUtil;
import com.asia.domain.bon3.*;
import com.asia.internal.common.BillException;
import com.asia.internal.errcode.ErrorCodeCompEnum;
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

	public StdCcrQueryServRes searchServInfo(StdCcrQueryServReq stdCcrQueryServ, Map<String,String> headers)
			throws ClientProtocolException, IOException, BillException {
		HttpResult result = null;
		LogUtil.debug("[开始调用远程服务 ABM查询用户信息]"+ acctApiUrl.getSearchServInfo()+ "\n",null, this.getClass());
		LogUtil.debug("输入参数[stdCcrQueryServ]="+stdCcrQueryServ.toString(),null, this.getClass());
		try {
			result = HttpUtil.doPostJson(acctApiUrl.getSearchServInfo(),
					JSON.toJSONString(stdCcrQueryServ, SerializerFeature.WriteMapNullValue), headers);
            LogUtil.debug("[调用远程服务 ABM查询用户信息]"+acctApiUrl.getSearchServInfo()+"\n输出结果[result]="
                    +JSON.toJSONString(result.toString(),SerializerFeature.WriteMapNullValue),null,this.getClass());
		} catch (ClientProtocolException e) {
			LogUtil.error("连接错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		} catch (IOException e) {
			LogUtil.error("IO流错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), StdCcrQueryServRes.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getSearchServInfo(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
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
	public StdCcaFlowCardRecQryResponse getFcDeposit(StdCcrFlowCardRecQryRequest stdCcrFlowCardRecQry, Map<String,String> headers)
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
	public StdCcaFlowCardUsageQueryResponse flowGetRate(StdCcrFlowCardUsageQueryRequest stdCcrFlowCardUsageQuery, Map<String,String> headers)
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
	public StdCcaQueryBalanceResponse qryBalance(StdCcrQueryBalanceRequest stdCcrQueryBalance, Map<String,String> headers)
			throws ClientProtocolException, IOException{
		HttpResult result = HttpUtil.doPostJson(acctApiUrl.getQryBalance(),
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
	public StdCcaQueryBalanceBalanceResponse getUnitedBalance(StdCcrQueryBalanceBalanceRequest stdCcrQueryUnitedBalance, Map<String,String> headers)
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
	public StdCcaUserResourceQueryResponse getUnitedAccu(StdCcrUserResourceQuery stdCcrUserResourceQuery, Map<String,String> headers)
			throws ClientProtocolException, IOException, BillException {
        HttpResult result = null;
        LogUtil.debug("[开始调用远程服务 免费资源使用量查询]"+ acctApiUrl.getGetUnitedAccu()+ "\n",null, this.getClass());
        LogUtil.debug("输入参数[stdCcrUserResourceQuery]="+stdCcrUserResourceQuery.toString(),null, this.getClass());
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getGetUnitedAccu(),
                    JSON.toJSONString(stdCcrUserResourceQuery, SerializerFeature.WriteMapNullValue), headers);
            LogUtil.debug("[调用远程服务 免费资源使用量查询]"+acctApiUrl.getGetUnitedAccu()+"\n输出结果[result]="
                    +JSON.toJSONString(result,SerializerFeature.WriteMapNullValue),null,this.getClass());
        } catch (ClientProtocolException e) {
			LogUtil.error("连接错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		} catch (IOException e) {
			LogUtil.error("IO流错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
        //状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), StdCcaUserResourceQueryResponse.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getGetUnitedAccu(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
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
	public StdCcaUserResourceQueryDetailResponse getUnitedAccuDetail(StdCcrUserResourceQueryDetail stdCcrUserResourceQueryDetail,Map<String,String> headers)
			throws ClientProtocolException, IOException, BillException {
        HttpResult result = null;
        LogUtil.debug("[开始调用远程服务 查询使用量明细信息查询]"+ acctApiUrl.getGetUnitedAccuDetail() + "\n" ,null, this.getClass());
        LogUtil.debug("输入参数[stdCcrUserResourceQueryDetail]="+stdCcrUserResourceQueryDetail.toString(),null, this.getClass());
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getGetUnitedAccuDetail(),
                    JSON.toJSONString(stdCcrUserResourceQueryDetail, SerializerFeature.WriteMapNullValue), headers);
            LogUtil.debug("[调用远程服务 查询使用量明细信息查询]"+acctApiUrl.getGetUnitedAccuDetail()+"\n输出结果[result]="
                    +JSON.toJSONString(result,SerializerFeature.WriteMapNullValue),null,this.getClass());
        } catch (ClientProtocolException e) {
			LogUtil.error("连接错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		} catch (IOException e) {
			LogUtil.error("IO流错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
        //状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), StdCcaUserResourceQueryDetailResponse.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getGetUnitedAccuDetail(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
	}
	/**
	 * @Author WangBaoQiang
	 * @Description 实时账单查询
	 * @Date 11:08 2019/8/29
	 * @Param [stdCcrRealTimeBillQueryRequest, headers]
	 * @return com.asiainfo.account.model.response.StdCcaRealTimeBillQueryResponse
	*/
	public StdCcaRealTimeBillQueryResponse getOweList(GetOweListReq stdCcrRealTimeBillQueryRequest, Map<String,String> headers)
			throws ClientProtocolException, IOException, BillException {
        HttpResult result = null;
        LogUtil.debug("[开始调用远程服务 实时账单查询]"+ acctApiUrl.getGetOweList(),null, this.getClass());
        LogUtil.debug("输入参数[stdCcrRealTimeBillQueryRequest]="+stdCcrRealTimeBillQueryRequest.toString(),null, this.getClass());
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getGetOweList(),
                    JSON.toJSONString(stdCcrRealTimeBillQueryRequest, SerializerFeature.WriteMapNullValue), headers);
            LogUtil.debug("[调用远程服务 实时账单查询]"+acctApiUrl.getGetOweList()+"输出结果[result]="
                    +JSON.toJSONString(result,SerializerFeature.WriteMapNullValue),null,this.getClass());
        } catch (ClientProtocolException e) {
			LogUtil.error("连接错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		} catch (IOException e) {
			LogUtil.error("IO流错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
        //状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), StdCcaRealTimeBillQueryResponse.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getGetUnitedAccuDetail(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
	}


	/**
	 * @Author Chenjian
	 * @Description 用户信用查询
	 * @Date 11:08 2019/9/24
	 * @Param [GetCreditInfoReq, headers]
	 */
	public GetCreditInfoRes getCreditInfo(GetCreditInfoReq creditInfoReq, Map<String,String> headers)
			throws ClientProtocolException, IOException, BillException {
        HttpResult result = null;
        LogUtil.debug("[开始调用远程服务 用户信用度查询]"+ acctApiUrl.getCreditInfo() + "\n",null, this.getClass());
        LogUtil.debug("输入参数[creditInfoReq]="+creditInfoReq.toString(),null, this.getClass());
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getCreditInfo(),
                    JSON.toJSONString(creditInfoReq, SerializerFeature.WriteMapNullValue), headers);
            LogUtil.debug("[调用远程服务 用户信用度查询]"+acctApiUrl.getCreditInfo()+"\n输出结果[result]="
                    +result.toString(),null,this.getClass());
        } catch (ClientProtocolException e) {
			LogUtil.error("连接错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		} catch (IOException e) {
			LogUtil.error("IO流错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
        //状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), GetCreditInfoRes.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getCreditInfo(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
	}

	/**
	 * @Author Chenjian
	 * @Description 实时账单查询
	 * @Date 11:08 2019/9/24
	 * @Param [GetOweListReq, headers]
	 * @return com.asiainfo.account.model.response.StdCcaRealTimeBillQueryResponse
	 */
	public GetOweListRes getBon3OweListBy(GetOweListReq getOweListReq, Map<String,String> headers)
			throws ClientProtocolException, IOException, BillException {
        HttpResult result = null;
        LogUtil.debug("[开始调用远程服务 实时账单查询]"+ acctApiUrl.getGetOweList() + "\n",null, this.getClass());
        LogUtil.debug("输入参数[getOweListReq]="+getOweListReq.toString(),null, this.getClass());
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getGetOweList(),
                    JSON.toJSONString(getOweListReq, SerializerFeature.WriteMapNullValue), headers);
            LogUtil.debug("[调用远程服务 实时账单查询]"+acctApiUrl.getGetOweList()+ "\n输出结果[result]="
                    +JSON.toJSONString(result,SerializerFeature.WriteMapNullValue),null,this.getClass());
        } catch (ClientProtocolException e) {
			LogUtil.error("连接错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		} catch (IOException e) {
			LogUtil.error("IO流错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
        //状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), GetOweListRes.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getGetOweList(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
	}


	/**
	 * @Author Chenjian
	 * @Description 实时费用查询
	 * @Date 11:08 2019/9/24
	 * @Param [GetRealTimeBillReq, headers]
	 * @return com.asiainfo.account.model.response.StdCcaRealTimeBillQueryResponse
	 */
	public GetRealTimeBillRes getRealTimeBill(GetRealTimeBillReq getRealTimeBillReq, Map<String,String> headers)
			throws ClientProtocolException, IOException, BillException {
        HttpResult result = null;
        LogUtil.debug("[开始调用远程服务 实时费用查询]"+ acctApiUrl.getRealTimeBill() + "\n",null, this.getClass());
        LogUtil.debug("输入参数[getRealTimeBillReq]="+getRealTimeBillReq.toString(),null, this.getClass());
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getRealTimeBill(),
                    JSON.toJSONString(getRealTimeBillReq, SerializerFeature.WriteMapNullValue), headers);
            LogUtil.debug("[调用远程服务 实时费用查询]"+acctApiUrl.getRealTimeBill()+"\n输出结果[result]="
                    +JSON.toJSONString(result,SerializerFeature.WriteMapNullValue),null,this.getClass());
        } catch (ClientProtocolException e) {
			LogUtil.error("连接错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		} catch (IOException e) {
			LogUtil.error("IO流错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
        //状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), GetRealTimeBillRes.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getRealTimeBill(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
	}


	/**
	 * @Author Chenjian
	 * @Description 帐户信息查询
	 * @Date 11:08 2019/9/24
	 * @Param [SearchAcctInfoReq, headers]
	 * @return com.asiainfo.account.model.response.StdCcaRealTimeBillQueryResponse
	 */
	public SearchAcctInfoRes searchAcctInfo(SearchAcctInfoReq searchAcctInfoReq, Map<String,String> headers)
            throws ClientProtocolException, IOException, BillException {
        HttpResult result = null;
        LogUtil.debug("[开始调用远程服务 账户信息查询]"+ acctApiUrl.searchAcctInfo(),null, this.getClass());
        LogUtil.debug("输入参数[searchAcctInfoReq]="+searchAcctInfoReq.toString(),null, this.getClass());
        try {
            result = HttpUtil.doPostJson(acctApiUrl.searchAcctInfo(),
                    JSON.toJSONString(searchAcctInfoReq, SerializerFeature.WriteMapNullValue), headers);
            LogUtil.debug("[调用远程服务 账户信息查询]"+acctApiUrl.searchAcctInfo()+"输出结果[result]="
                    +JSON.toJSONString(result,SerializerFeature.WriteMapNullValue),null,this.getClass());
        } catch (ClientProtocolException e) {
			LogUtil.error("连接错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		} catch (IOException e) {
			LogUtil.error("IO流错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
        //状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), SearchAcctInfoRes.class) ;
		}else{
            String errorMsg=getHttpErrorInfo(acctApiUrl.searchAcctInfo(),result);
            LogUtil.error(errorMsg,null,this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
	}
	/**
	 * 获取调用远程HTTP接口状态码不为200时的错误信息
	 * @param url
	 * @param result
	 * @return
	 */
	private String getHttpErrorInfo(String url,HttpResult result) throws BillException {
		String errMsg="";
		try{
			errMsg= "调用远程服务："+url+"异常，HTTP状态码："+result.getCode()+"，响应内容："+result.getData();
		}catch(NullPointerException e){
			LogUtil.error("远程服务无响应",e,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
		return errMsg;
	}
/**
 * @Author WangBaoQiang
 * @Description //资料查询调用通用方法
 * @Date 16:35 2019/10/6
 * @Param [stdCcrQueryServ, headers]
 * @return com.asia.domain.bon3.StdCcrQueryServRes
*/
    public StdCcrQueryServRes commSearchServInfo(StdCcrQueryServReq stdCcrQueryServ, Map<String,String> headers)
            throws ClientProtocolException, IOException, BillException {
        HttpResult result = null;
        LogUtil.debug("[开始调用远程服务 ABM查询用户信息]"+ acctApiUrl.getSearchServInfo() + "\n" ,null, this.getClass());
        LogUtil.debug("输入参数[stdCcrQueryServ]="+stdCcrQueryServ.toString(),null, this.getClass());
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getSearchServInfo(),
                    JSON.toJSONString(stdCcrQueryServ, SerializerFeature.WriteMapNullValue), headers);
            LogUtil.debug("[调用远程服务 ABM查询用户信息]"+acctApiUrl.getSearchServInfo()+"\n输出结果[result]="
                    +JSON.parseObject(result.getData(), StdCcrQueryServRes.class),null,this.getClass());
        } catch (ClientProtocolException e) {
			LogUtil.error("连接错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		} catch (IOException e) {
			LogUtil.error("IO流错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
        //状态码为请求成功
        if(result.getCode() == HttpStatus.SC_OK){
            return JSON.parseObject(result.getData(), StdCcrQueryServRes.class) ;
        }else{
            String errorMsg=getHttpErrorInfo(acctApiUrl.getSearchServInfo(),result);
            LogUtil.error(errorMsg,null,this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
        }
    }
}