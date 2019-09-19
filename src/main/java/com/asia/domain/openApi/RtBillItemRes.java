package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseApiResDomain;
import com.asia.common.baseObj.BaseDomain;
import com.asia.domain.openApi.child.OperAttrStruct;
import com.asia.domain.openApi.child.SvcObjectStruct;

import java.util.List;
/**
 * ClassName: RtBillItemRes <br/>
 * date: 2019年4月29日 下午3:24:44 <br/>
 * @author yinyanzhen
 */
public class RtBillItemRes  extends BaseApiResDomain{
	private static final long serialVersionUID = 3635612640417432719L;
	private  OperAttrStruct operAttrStruct;
	private SvcObjectStruct svcObjectStruct;
	//话单类型
	private String cdrType;
	//总记录数
	private Integer totalRecord;
	//语音详单
	private List<VoiceBillItem> voiceBillItems;
	//数据详单
	private List<DataBillItem> dataBillItems;
	//短信详单
	private List<SmsBillItem> smsBillItems;
	//增值详单
	private List<IncrBillItem> incrBillItems;

	public OperAttrStruct getOperAttrStruct() {
		return operAttrStruct;
	}

	public void setOperAttrStruct(OperAttrStruct operAttrStruct) {
		this.operAttrStruct = operAttrStruct;
	}

	public SvcObjectStruct getSvcObjectStruct() {
		return svcObjectStruct;
	}

	public void setSvcObjectStruct(SvcObjectStruct svcObjectStruct) {
		this.svcObjectStruct = svcObjectStruct;
	}

	/**
	 * 语音清单
	 */
	public static class VoiceBillItem extends BaseDomain{
		private static final long serialVersionUID = -2905410829089174117L;
		//用户号码
		private String chargeNo;
		//呼叫类型
		private String callType;
		//通话类型
		private String callingType;
		//通话地点
		private String callingArea;
		//对方号码
		private String calledNo;
		//通话开始时间
		private String beginTime;
		//通话时长
		private Integer duration;
		//基本通话费
		private Integer basicCharge;
		//长途通话费
		private Integer longCharge;
		//费用
		private Integer totalCharge;
		//计费方拜访地
		private String billingAreaCode;
		//漫游类型
		private String roamTypeId;
		
		public String getChargeNo() {
			return chargeNo;
		}
		public void setChargeNo(String chargeNo) {
			this.chargeNo = chargeNo;
		}
		public String getCallType() {
			return callType;
		}
		public void setCallType(String callType) {
			this.callType = callType;
		}
		public String getCallingType() {
			return callingType;
		}
		public void setCallingType(String callingType) {
			this.callingType = callingType;
		}
		public String getCallingArea() {
			return callingArea;
		}
		public void setCallingArea(String callingArea) {
			this.callingArea = callingArea;
		}
		public String getCalledNo() {
			return calledNo;
		}
		public void setCalledNo(String calledNo) {
			this.calledNo = calledNo;
		}
		public String getBeginTime() {
			return beginTime;
		}
		public void setBeginTime(String beginTime) {
			this.beginTime = beginTime;
		}
		public Integer getDuration() {
			return duration;
		}
		public void setDuration(Integer duration) {
			this.duration = duration;
		}
		public Integer getBasicCharge() {
			return basicCharge;
		}
		public void setBasicCharge(Integer basicCharge) {
			this.basicCharge = basicCharge;
		}
		public Integer getLongCharge() {
			return longCharge;
		}
		public void setLongCharge(Integer longCharge) {
			this.longCharge = longCharge;
		}
		public Integer getTotalCharge() {
			return totalCharge;
		}
		public void setTotalCharge(Integer totalCharge) {
			this.totalCharge = totalCharge;
		}

		public String getBillingAreaCode() {
			return billingAreaCode;
		}

		public void setBillingAreaCode(String billingAreaCode) {
			this.billingAreaCode = billingAreaCode;
		}

		public String getRoamTypeId() {
			return roamTypeId;
		}

		public void setRoamTypeId(String roamTypeId) {
			this.roamTypeId = roamTypeId;
		}
	}
	/**
	 * 数据清单
	 */
	public static class DataBillItem extends BaseDomain{
		private static final long serialVersionUID = -5479952929349473872L;
		//用户号码/宽带帐号
		private String chargeNo;
		//漫游类型
		private Integer roamType;
		//NAI
		private String nai;
		//开始时间
		private String startTime;
		//使用时长
		private Integer duration;
		//上行流量
		private long sendAmount;
		//下行流量
		private long recvAmount;
		//合计流量
		private long volume;
		//上网地市
		private String callingArea;
		//业务类型
		private String businessType;
		//费用
		private Integer fee;
		
		
		public String getChargeNo() {
			return chargeNo;
		}
		public void setChargeNo(String chargeNo) {
			this.chargeNo = chargeNo;
		}
		public Integer getRoamType() {
			return roamType;
		}
		public void setRoamType(Integer roamType) {
			this.roamType = roamType;
		}
		public String getNai() {
			return nai;
		}
		public void setNai(String nai) {
			this.nai = nai;
		}
		public String getStartTime() {
			return startTime;
		}
		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
		public Integer getDuration() {
			return duration;
		}
		public void setDuration(Integer duration) {
			this.duration = duration;
		}
		public long getVolume() {
			return volume;
		}
		public void setVolume(long volume) {
			this.volume = volume;
		}
		public String getCallingArea() {
			return callingArea;
		}
		public void setCallingArea(String callingArea) {
			this.callingArea = callingArea;
		}
		public String getBusinessType() {
			return businessType;
		}
		public void setBusinessType(String businessType) {
			this.businessType = businessType;
		}
		public Integer getFee() {
			return fee;
		}
		public void setFee(Integer fee) {
			this.fee = fee;
		}

		public long getSendAmount() {
			return sendAmount;
		}

		public void setSendAmount(long sendAmount) {
			this.sendAmount = sendAmount;
		}

		public long getRecvAmount() {
			return recvAmount;
		}

		public void setRecvAmount(long recvAmount) {
			this.recvAmount = recvAmount;
		}
	}
	/**
	 * 短信清单
	 */
	public static class SmsBillItem extends BaseDomain{
		private static final long serialVersionUID = 4464441519085874836L;
		//用户号码
		private String chargeNo;
		//对方号码
		private String calledNo;
		//发送时间
		private String startTime;
		//通信费
		private Integer fee;
		//短信类型
		private String smsType;
		//收发类型
		private String callType;
		
		public String getChargeNo() {
			return chargeNo;
		}
		public void setChargeNo(String chargeNo) {
			this.chargeNo = chargeNo;
		}
		public String getCalledNo() {
			return calledNo;
		}
		public void setCalledNo(String calledNo) {
			this.calledNo = calledNo;
		}
		public String getSmsType() {
			return smsType;
		}
		public void setSmsType(String smsType) {
			this.callType = smsType;
		}

		public Integer getFee() {
			return fee;
		}

		public void setFee(Integer fee) {
			this.fee = fee;
		}

		public String getCallType() {
			return callType;
		}

		public void setCallType(String callType) {
			this.callType = callType;
		}

		public String getStartTime() {
			return startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
	}
	/**
	 * 增值清单
	 */
	public static class IncrBillItem extends BaseDomain{
		private static final long serialVersionUID = 7337972630562641395L;
		//用户号码
		private String chargeNo;
		//开始时间
		private String startTime;
		//提供商编码
		private String spCode;
		//提供商名称
		private String spName;
		//业务名称
		private String businessType;
		//信息服务费
		private Integer fee;
		//收费类型
		private String feeType;

		public String getChargeNo() {
			return chargeNo;
		}
		public void setChargeNo(String chargeNo) {
			this.chargeNo = chargeNo;
		}
		public String getSpCode() {
			return spCode;
		}
		public void setSpCode(String spCode) {
			this.spCode = spCode;
		}
		public String getSpName() {
			return spName;
		}
		public void setSpName(String spName) {
			this.spName = spName;
		}
		public String getStartTime() {
			return startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getBusinessType() {
			return businessType;
		}

		public void setBusinessType(String businessType) {
			this.businessType = businessType;
		}

		public Integer getFee() {
			return fee;
		}

		public void setFee(Integer fee) {
			this.fee = fee;
		}

		public String getFeeType() {
			return feeType;
		}

		public void setFeeType(String feeType) {
			this.feeType = feeType;
		}
	}
	public String getCdrType() {
		return cdrType;
	}
	public void setCdrType(String cdrType) {
		this.cdrType = cdrType;
	}
	public Integer getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}
	public List<VoiceBillItem> getVoiceBillItems() {
		return voiceBillItems;
	}
	public void setVoiceBillItems(List<VoiceBillItem> voiceBillItems) {
		this.voiceBillItems = voiceBillItems;
	}
	public List<DataBillItem> getDataBillItems() {
		return dataBillItems;
	}
	public void setDataBillItems(List<DataBillItem> dataBillItems) {
		this.dataBillItems = dataBillItems;
	}
	public List<SmsBillItem> getSmsBillItems() {
		return smsBillItems;
	}
	public void setSmsBillItems(List<SmsBillItem> smsBillItems) {
		this.smsBillItems = smsBillItems;
	}
	public List<IncrBillItem> getIncrBillItems() {
		return incrBillItems;
	}
	public void setIncrBillItems(List<IncrBillItem> incrBillItems) {
		this.incrBillItems = incrBillItems;
	}
}
