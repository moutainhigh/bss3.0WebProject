package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseApiResDomain;
import com.asia.common.baseObj.BaseDomain;

import java.util.ArrayList;
import java.util.List;

/**
 * 积分查询
 * ClassName: PointInfoQryFroBillApiRes <br/>
 * date: 2019年4月29日 上午11:10:52 <br/>
 * @author yinyanzhen
 */
public class PointInfoQryFroBillApiRes extends BaseApiResDomain{
	private static final long serialVersionUID = 6801923426014361413L;
	private ContractRootClass ContractRoot;
	public static class ContractRootClass{
			private TcpContClass TcpCont;
			private ResponseMess responseMess;
			public static class TcpContClass{
				private String EventType= "SYNC";
				private String BusCode="BUS";
				private String ServiceCode="QRY1001";
				private String TransactionId;
				private String	AreaCode= "0431";
				private String  ChannelId="1003";
				private String	StaffCode= "4";
				private String	ReqTime;
				private String	EncryptStr="N";

				public String getEventType() {
					return EventType;
				}

				public void setEventType(String eventType) {
					EventType = eventType;
				}

				public String getBusCode() {
					return BusCode;
				}

				public void setBusCode(String busCode) {
					BusCode = busCode;
				}

				public String getServiceCode() {
					return ServiceCode;
				}

				public void setServiceCode(String serviceCode) {
					ServiceCode = serviceCode;
				}

				public String getTransactionId() {
					return TransactionId;
				}

				public void setTransactionId(String transactionId) {
					TransactionId = transactionId;
				}

				public String getAreaCode() {
					return AreaCode;
				}

				public void setAreaCode(String areaCode) {
					AreaCode = areaCode;
				}

				public String getChannelId() {
					return ChannelId;
				}

				public void setChannelId(String channelId) {
					ChannelId = channelId;
				}

				public String getStaffCode() {
					return StaffCode;
				}

				public void setStaffCode(String staffCode) {
					StaffCode = staffCode;
				}

				public String getReqTime() {
					return ReqTime;
				}

				public void setReqTime(String reqTime) {
					ReqTime = reqTime;
				}

				public String getEncryptStr() {
					return EncryptStr;
				}

				public void setEncryptStr(String encryptStr) {
					EncryptStr = encryptStr;
				}
			}
			public static class ResponseMess{
				private String result;
				private String resCode;
				private String resultMsg;
				private String partyId;
				private String qryPointMonth;
				private String lastMonthPoint;
				private String giftPointValue;
				private String addPointValue;
				private String uesdPointValue;
				private String expirePointValue;

				public String getResult() {
					return result;
				}

				public void setResult(String result) {
					this.result = result;
				}

				public String getResCode() {
					return resCode;
				}

				public void setResCode(String resCode) {
					this.resCode = resCode;
				}

				public String getResultMsg() {
					return resultMsg;
				}

				public void setResultMsg(String resultMsg) {
					this.resultMsg = resultMsg;
				}

				public String getPartyId() {
					return partyId;
				}

				public void setPartyId(String partyId) {
					this.partyId = partyId;
				}

				public String getQryPointMonth() {
					return qryPointMonth;
				}

				public void setQryPointMonth(String qryPointMonth) {
					this.qryPointMonth = qryPointMonth;
				}

				public String getLastMonthPoint() {
					return lastMonthPoint;
				}

				public void setLastMonthPoint(String lastMonthPoint) {
					this.lastMonthPoint = lastMonthPoint;
				}

				public String getGiftPointValue() {
					return giftPointValue;
				}

				public void setGiftPointValue(String giftPointValue) {
					this.giftPointValue = giftPointValue;
				}

				public String getAddPointValue() {
					return addPointValue;
				}

				public void setAddPointValue(String addPointValue) {
					this.addPointValue = addPointValue;
				}

				public String getUesdPointValue() {
					return uesdPointValue;
				}

				public void setUesdPointValue(String uesdPointValue) {
					this.uesdPointValue = uesdPointValue;
				}

				public String getExpirePointValue() {
					return expirePointValue;
				}

				public void setExpirePointValue(String expirePointValue) {
					this.expirePointValue = expirePointValue;
				}
			}

			public TcpContClass getTcpCont() {
				return TcpCont;
			}

			public void setTcpCont(TcpContClass tcpCont) {
				TcpCont = tcpCont;
			}

		public ResponseMess getResponseMess() {
			return responseMess;
		}

		public void setResponseMess(ResponseMess responseMess) {
			this.responseMess = responseMess;
		}
	}
		public ContractRootClass getContractRoot() {
			return ContractRoot;
		}

		public void setContractRoot(ContractRootClass contractRoot) {
		ContractRoot = contractRoot;
	}

}
