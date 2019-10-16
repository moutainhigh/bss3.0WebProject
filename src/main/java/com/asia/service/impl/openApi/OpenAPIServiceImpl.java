package com.asia.service.impl.openApi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.AcctApiUrl;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.HttpUtil;
import com.asia.common.utils.HttpUtil.HttpResult;
import com.asia.common.utils.LogUtil;
import com.asia.dao.OrclCommonDao;
import com.asia.domain.bon3.StdCcrQueryServRes.StdCcaQueryServResBean.StdCcaQueryServListBean;
import com.asia.domain.openApi.*;
import com.asia.domain.openApi.child.BillingCycle;
import com.asia.domain.openApi.child.SvcObjectStruct;
import com.asia.domain.plcaApi.OtherRemindReq;
import com.asia.domain.plcaApi.OtherRemindReq.MsgInfoBean;
import com.asia.domain.plcaApi.OtherRemindRes;
import com.asia.internal.common.BillException;
import com.asia.internal.common.CommonUserInfo;
import com.asia.internal.common.ResultInfo;
import com.asia.internal.errcode.ErrorCodeCompEnum;
import com.asia.internal.errcode.ErrorCodePublicEnum;
import com.asia.mapper.orclmapper.IfUserMeterMapper;
import com.asia.mapper.ordmapper.IntfServCustChangeContrastMapper;
import com.asia.service.impl.Bon3ServiceImpl;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.*;

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
	CommonUserInfo commonUserInfo;
	@Autowired
	IfUserMeterMapper ifUserMeterMapperDao;
	@Autowired
	AcctApiUrl acctApiUrl;
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
			throws ClientProtocolException, IOException, BillException {
		LogUtil.info("[开始调用远程服务 缴费记录查询]"+ acctApiUrl.getQryPayment(),null, this.getClass());
		LogUtil.info("输入参数[qryPaymentReq]="+body.toString(),null, this.getClass());
		HttpResult result = null;
		try {
			result = HttpUtil.doPostJson(acctApiUrl.getQryPayment(), body.toString(), headers);
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
			return JSON.parseObject(result.getData(), QryPaymentRes.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getQryPayment(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
	}
	
	/**
	 * qryCustBill:(账单查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public QryCustBillRes qryCustBill(QryCustBillReq body,Map<String,String> headers)
			throws ClientProtocolException, IOException, BillException {
		LogUtil.info("[开始调用远程服务 客户化账单查询]"+ acctApiUrl.getQryCustBill(),null, this.getClass());
		LogUtil.info("输入参数[qryCustBillRes]="+body.toString(),null, this.getClass());
		HttpResult result = null;
		try {
			result = HttpUtil.doPostJson(acctApiUrl.getQryCustBill(), body.toString(), headers);
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
			return JSON.parseObject(result.getData(), QryCustBillRes.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getQryCustBill(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
	}
	
	/**
	 * qryBill:(欠费查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public QryBillRes qryBill(QryBillReq body,Map<String,String> headers)
			throws ClientProtocolException, IOException, BillException {
		HttpResult result = null;
		LogUtil.info("[开始调用远程服务 欠费查询]"+ acctApiUrl.getQryBill(),null, this.getClass());
		LogUtil.info("输入参数[qryBillResReq]="+body.toString(),null, this.getClass());
		try {
			result = HttpUtil.doPostJson(acctApiUrl.getQryBill(), body.toString(), headers);
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
			return JSON.parseObject(result.getData(), QryBillRes.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getQryBill(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
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
			throws ClientProtocolException, IOException, BillException {
		HttpResult result = null;
		LogUtil.info("[开始调用远程服务 余额查询]"+ acctApiUrl.getQueryBalance(),null, this.getClass());
		LogUtil.info("输入参数[queryBalanceReq]="+body.toString(),null, this.getClass());
		try {
			result = HttpUtil.doPostJson(acctApiUrl.getQueryBalance(), body.toString(), headers);
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
			return JSON.parseObject(result.getData(), QueryBalanceRes.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getQueryBalance(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
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
			throws ClientProtocolException, IOException, BillException {
		HttpResult result = null;
		LogUtil.info("[开始调用远程服务 余额变动明细查询]"+ acctApiUrl.getQryBalanceRecordDetail(),null, this.getClass());
		LogUtil.info("输入参数[qryBalanceRecordDetailReq]="+body.toString(),null, this.getClass());
		try {
			result = HttpUtil.doPostJson(acctApiUrl.getQryBalanceRecordDetail(), body.toString(), headers);
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
			return JSON.parseObject(result.getData(), QryBalanceRecordDetailRes.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getQryBalanceRecordDetail(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
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
			throws ClientProtocolException, IOException,BillException{
		// TODO: 2019/9/3 判断计费流水是否重复
		ResultInfo resultInfo = new ResultInfo();
		resultInfo = orclCommonDao.checkSerialnumberExist(body);
		RechargeBalanceRes rechargeBalanceRes = new RechargeBalanceRes();
		if (!"0".equals(resultInfo.getCode())) {
			throw new BillException(ErrorCodePublicEnum.PAY_SERIALNUMBER_IS_EXIST);
		}//end

        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
		SvcObjectStruct svcObjectStruct=body.getSvcObjectStruct();
		//调账务服务查询用户信息
		stdCcaQueryServ = commonUserInfo.getUserInfo(svcObjectStruct.getObjValue(), "0431", "2",
				"1",headers);
		//用户校验
		checkServExist(stdCcaQueryServ);
		String localNet=stdCcaQueryServ.getHomeAreaCode();

		//特殊业务组的跨地市缴费限制
		if("3003".equals(body.getSystemId()))
		{
			if (!"433".equals(localNet))
			{
				throw new BillException(ErrorCodeCompEnum.ACROSS_CITIES_ERR);
			}
		}
		LogUtil.info("[开始调用远程服务 余额充值]"+ acctApiUrl.getRechargeBalance(),null, this.getClass());
		LogUtil.info("输入参数[RechargeBalanceReq]="+body.toString(),null, this.getClass());
		HttpResult result = null;
		try {
			result = HttpUtil.doPostJson(acctApiUrl.getRechargeBalance(), JSON.toJSONString(body, SerializerFeature.WriteMapNullValue), headers);
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
			//插入充值记录
            rechargeBalanceRes = JSON.parseObject(result.getData(), RechargeBalanceRes.class);
            long paymentId = rechargeBalanceRes.getPaymentId();
            if ("0".equals(rechargeBalanceRes.getResultCode())) {
				resultInfo = orclCommonDao.insertSerialnumber(body,paymentId,localNet);
				if (!"0".equals(resultInfo.getCode())) {
					throw new BillException(ErrorCodeCompEnum.INSERT_CHARGE_BALANCE_ERR);
				}
            }
			return JSON.parseObject(result.getData(), RechargeBalanceRes.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getRechargeBalance(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
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
	public RtBillItemRes rtBillItem(RtBillItemReq body,Map<String,String> headers,boolean isSms)
			throws BillException, IOException {
		// TODO: 2019/7/30 过户增加判断
		String accNbr = body.getSvcObjectStruct().getObjValue();
		String objAttr = body.getSvcObjectStruct().getObjAttr();
		String objType = body.getSvcObjectStruct().getObjType();
		Map map = new HashMap();
		//调用用户信息查询接口 begin
        StdCcaQueryServListBean stdCcaQueryServ = new StdCcaQueryServListBean();
		stdCcaQueryServ = commonUserInfo.getUserInfo(String.valueOf(accNbr), "", objType, objAttr,headers);
		//用户校验
		checkServExist(stdCcaQueryServ);
		String servId = stdCcaQueryServ.getServId();
		//增加详单禁查功能
		long iCount = ifUserMeterMapperDao.selectcountUserMeter(servId);
		if (iCount > 0) {
            String errorMsg = "用户" + accNbr + "已开通详单禁查功能";
            LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException("2004","用户" + accNbr + "已开通详单禁查功能");
		}

		map.put("servId", servId);
		//读取过户表,取过户时间为开始时间
        LogUtil.info("[读取用户的过户信息]",null, this.getClass());
		List<Map<String, Object>> owenCustList = intfServCustChangeContrastDao.selectIntfServCustChangeContrast(map);
		if (owenCustList.size() > 1) {
			Map owenCustMap = owenCustList.get(0);
			Integer effDate = Integer.parseInt(owenCustMap.get("changeDate").toString());
			body.setStartDate(effDate);
		}
        LogUtil.info("[用户的过户信息]" + owenCustList.toString(), null, this.getClass());
		LogUtil.info("[开始调用远程服务 详单信息查询]"+ acctApiUrl.getSearchServInfo(),null, this.getClass());
		LogUtil.info("输入参数[RtBillItemReq]="+body.toString(),null, this.getClass());
		HttpResult result = null;
		HttpResult resultSms = null;
		try {
			result = HttpUtil.doPostJson(acctApiUrl.getRtBillItem(), body.toString(), headers);
		} catch (ClientProtocolException e) {
			LogUtil.error("连接错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		} catch (IOException e) {
			LogUtil.error("IO流错误", e, this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			// TODO: 2019/9/14 插入短信通知表
			if (isSms) {
				if (doSendRemindMsg(body, headers, accNbr) < 0) {
					LogUtil.error("短信推送到plca失败", null, this.getClass());
				}
				LogUtil.info("短信推送到plca成功",null,this.getClass());
			}
			headers.clear();
			headers.putAll(result.getHeaders());
			return JSON.parseObject(result.getData(), RtBillItemRes.class) ;
		}else{
            String errorMsg=getHttpErrorInfo(acctApiUrl.getSearchServInfo(),result);
            LogUtil.error(errorMsg,null,this.getClass());
            throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
	}
/**
 * @Author WangBaoQiang
 * @Description //短信推送方法
 * @Date 15:22 2019/10/6
 * @Param [body, headers, accNbr]
 * @return void
*/
	private int doSendRemindMsg(RtBillItemReq body, Map<String, String> headers, String accNbr) throws IOException, BillException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		HttpResult resultSms = null;
		OtherRemindReq otherRemindReq = new OtherRemindReq();
		OtherRemindRes otherRemindRes = new OtherRemindRes();
		MsgInfoBean msgInfoBean = new MsgInfoBean();
		List<MsgInfoBean> msgInfoBeanList = new ArrayList<>();
		try {
			String system = "";
			if ("1002".equals(body.getSystemId())) {
				system = "10000号";
			} else if ("1003".equals(body.getSystemId())) {
				system = "网上营业厅";
			} else if ("1014".equals(body.getSystemId())) {
				system = "自助终端";
			} else if ("3001".equals(body.getSystemId())) {
				system = "触摸屏";
			}
			String busiType = "";
			if (body.getQryType() == 1) {
				busiType = "语音通话";
			} else if (body.getQryType() ==2) {
				busiType = "数据通信";
			} else if (body.getQryType() == 3) {
				busiType = "短信通信";
			} else if (body.getQryType() ==4) {
				busiType = "增值服务";
			}
			String time = sdf.format(new Date());
			String sendTime = time.substring(0, 4) + "年"
					+ time.substring(4, 6) + "月" + time.substring(6, 8)
					+ "日" + time.substring(8, 10) + "时"
					+ time.substring(10, 12) + "分";
			String billingCycleId = String.valueOf(body.getBillingCycleId());
			String sendMsgInfo = "中国电信提醒您：您于" + sendTime + "在电信" + system +
					"查询了" + billingCycleId.substring(0,4) + "年" + billingCycleId.substring(4)
					+ "月的" + busiType + "业务的详单";
			msgInfoBean.setAccNbr(accNbr);
			msgInfoBean.setBusinessId("456");
			msgInfoBean.setRemindType("123");
			msgInfoBean.setRemindCreateTime(time);
			msgInfoBean.setRemindCode("123");
			msgInfoBean.setChannelId(body.getSystemId());
			msgInfoBean.setRemindText(sendMsgInfo);
			msgInfoBeanList.add(msgInfoBean);
			otherRemindReq.setMsgInfo(msgInfoBeanList);
			LogUtil.info("[开始调用远程服务 短信发送提醒]"+ acctApiUrl.getOtheRemind(),null, this.getClass());
			LogUtil.info("输入参数[OtherRemindReq]="+ JSON.toJSONString(otherRemindReq),null, this.getClass());
			try {
				resultSms = HttpUtil.doPostJson(acctApiUrl.getOtheRemind(), JSON.toJSONString(otherRemindReq, SerializerFeature.WriteMapNullValue), headers);
				otherRemindRes = JSON.parseObject(resultSms.getData(), OtherRemindRes.class);
				LogUtil.info("输出参数[OtherRemindRes]="+ JSON.toJSONString(otherRemindRes),null, this.getClass());
			} catch (IOException e) {
				LogUtil.error("输入参数[OtherRemindReq]="+ JSON.toJSONString(otherRemindReq),null, this.getClass());
				LogUtil.error("IO流错误", e, this.getClass());
				return -1;
			}
			if (resultSms.getCode() != HttpStatus.SC_OK) {
				String errMsg= "调用远程服务："+acctApiUrl.getOtheRemind()+"异常，HTTP状态码："+resultSms.getCode()+"，响应内容："+resultSms.getData();
				LogUtil.error("输入参数[OtherRemindReq]="+ JSON.toJSONString(otherRemindReq),null, this.getClass());
				LogUtil.error(errMsg,null,this.getClass());
				return -1;
			}
		} catch (Exception e) {
			LogUtil.error("输入参数[OtherRemindReq]="+ JSON.toJSONString(otherRemindReq),e, this.getClass());
			return -1;
		}
		return 1;
	}

	/**
	 * 充值回退（冲正）
	 *
	 * */
	public RollRechargeBalanceRes rollRechargeBalnce(RollRechargeBalanceReq body,
													 Map<String,String> headers) throws IOException,BillException {
		RollRechargeBalanceRes rechargeBalanceRes=new RollRechargeBalanceRes();
        HttpResult result = null;
		LogUtil.info("[开始调用远程服务 余额冲正]"+ acctApiUrl.getRollRechargeBalance(),null, this.getClass());
		LogUtil.info("输入参数[RollRechargeBalanceReq]="+body.toString(),null, this.getClass());
        try {
            result = HttpUtil.doPostJson(acctApiUrl.getRollRechargeBalance(), body.toString(), headers);
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
			rechargeBalanceRes=JSON.parseObject(result.getData(), RollRechargeBalanceRes.class);
			ResultInfo resultInfo = null;
			System.out.println(body.getOperAttrStruct().getOperOrgId());
			//VC更新缴费历史表记录
			if ("4102".equals(body.getOperAttrStruct().getOperOrgId())) {
				String reqServiceId=rechargeBalanceRes.getReqServiceId();
				resultInfo = orclCommonDao.updateSerialnumber(body,0,reqServiceId);
				if (!"0".equals(resultInfo.getCode())) {
					String errorMsg = "更新缴费记录表，记录冲正信息异常";
					LogUtil.error(errorMsg,null,this.getClass());
					throw new BillException(ErrorCodeCompEnum.INSERT_ROLL_CHARGE_BALANCE_ERR);
				}
			}
			return JSON.parseObject(result.getData(), RollRechargeBalanceRes.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getRollRechargeBalance(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}
	}

    /**
     * 话费返还记录查询
     *
     * */
	public QryReturnBalanceDetailRes qryReturnBalanceDetail(QryReturnBalanceDetailReq body,
                                                             Map<String,String> headers) throws IOException, BillException {
		LogUtil.info("[开始调用远程服务 话费返还记录查询]"+ acctApiUrl.getQryReturnBalanceDetail(),null, this.getClass());
		LogUtil.info("输入参数[qryReturnBalanceDetailReq]="+body.toString(),null, this.getClass());
		HttpResult result = null;
		try {
			result = HttpUtil.doPostJson(acctApiUrl.getQryReturnBalanceDetail(), body.toString(), headers);
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
			return JSON.parseObject(result.getData(), QryReturnBalanceDetailRes.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getQryReturnBalanceDetail(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}

    }


    /**
     * 余额变动汇总查询
     *
     * */
    public QryBalanceRecordRes qryBalanceRecord(QryBalanceRecordReq body,
                                                            Map<String,String> headers) throws IOException, BillException {
		LogUtil.info("[开始调用远程服务 余额变动汇总查询]"+ acctApiUrl.getQryBalanceRecord(),null, this.getClass());
		LogUtil.info("输入参数[qryBalanceRecordReq]="+body.toString(),null, this.getClass());
		HttpResult result = null;
		try {
			result = HttpUtil.doPostJson(acctApiUrl.getQryBalanceRecord(), body.toString(), headers);
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
			return JSON.parseObject(result.getData(), QryBalanceRecordRes.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getQryBalanceRecord(),result);
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.RREMOTE_ACCESS_FAILE_EXCEPTION);
		}

    }


	/**
	 * 话费返还记录明细查询
	 *
	 * */
	public QryReturnBalanceDetailInfoRes qryReturnBalanceInfoDetail(QryReturnBalanceDetailInfoReq body,
															Map<String,String> headers) throws IOException, BillException {
		LogUtil.info("[开始调用远程服务 话费返还记录明细查询]"+ acctApiUrl.getQryReturnBalanceInfoDetail(),null, this.getClass());
		LogUtil.info("输入参数[qryReturnBalanceDetailInfoReq]="+body.toString(),null, this.getClass());
		HttpResult result = null;
		try {
			result = HttpUtil.doPostJson(acctApiUrl.getQryReturnBalanceInfoDetail(), body.toString(), headers);
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
			return JSON.parseObject(result.getData(), QryReturnBalanceDetailInfoRes.class) ;
		}else{
			String errorMsg=getHttpErrorInfo(acctApiUrl.getQryReturnBalanceInfoDetail(),result);
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
	 * @Description //查询用户是否存在
	 * @Date 19:42 2019/9/29
	 * @Param [stdCcaQueryServ]
	 * @return void
	 */
	private void checkServExist(StdCcaQueryServListBean stdCcaQueryServ) throws BillException {
		if (stdCcaQueryServ != null) {
			String state = stdCcaQueryServ.getServState();
			if ("2HN".equals(state) || "2HX".equals(state) || "2HF".equals(state)) {
				String errorMsg = "找不到用户或帐户档案";
				LogUtil.error(errorMsg,null,this.getClass());
				throw new BillException(ErrorCodeCompEnum.HSS_SEARCH_SERV_INFO_NOT_EXIST);
			}
		} else {
			String errorMsg = "找不到用户或帐户档案";
			LogUtil.error(errorMsg,null,this.getClass());
			throw new BillException(ErrorCodeCompEnum.HSS_SEARCH_SERV_INFO_NOT_EXIST);
		}
	}
}