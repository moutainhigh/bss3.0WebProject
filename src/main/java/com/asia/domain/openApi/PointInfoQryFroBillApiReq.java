package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;

/**
 * 积分查询 请求体
 * ClassName: PointInfoQryFroBillApiReq <br/>
 * date: 2019年4月29日 上午10:53:34 <br/>
 * @author yinyanzhen
 */
public class PointInfoQryFroBillApiReq extends BaseDomain {

	private ContractRootClass ContractRoot;
	public static class ContractRootClass{
		private TcpContClass TcpCont;
		private RequestMess requestMess;
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
		public static class RequestMess{
			private String nbrType="1";
			private String qryNbr;
			private String pointMonth;

			public String getNbrType() {
				return nbrType;
			}

			public void setNbrType(String nbrType) {
				this.nbrType = nbrType;
			}

			public String getQryNbr() {
				return qryNbr;
			}

			public void setQryNbr(String qryNbr) {
				this.qryNbr = qryNbr;
			}

			public String getPointMonth() {
				return pointMonth;
			}

			public void setPointMonth(String pointMonth) {
				this.pointMonth = pointMonth;
			}
		}

		public TcpContClass getTcpCont() {
			return TcpCont;
		}

		public void setTcpCont(TcpContClass tcpCont) {
			TcpCont = tcpCont;
		}

		public RequestMess getRequestMess() {
			return requestMess;
		}

		public void setRequestMess(RequestMess requestMess) {
			this.requestMess = requestMess;
		}
	}

	public ContractRootClass getContractRoot() {
		return ContractRoot;
	}

	public void setContractRoot(ContractRootClass contractRoot) {
		ContractRoot = contractRoot;
	}
}
