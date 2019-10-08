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
	private Integer startDate;
	private Integer endDate;
	private String provinceCode;
	private Integer page;
	private Integer row;
	private Integer totalFee;
	private Integer totalVolume;

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
		//费用
		private Integer totalCharge;
		//漫游类型
		private String roamTypeId;
		//被叫区号
		private String calledAreaCode;
		//计费方拜访地
        private String billingVisitAreaCode;


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
		public Integer getTotalCharge() {
			return totalCharge;
		}
		public void setTotalCharge(Integer totalCharge) {
			this.totalCharge = totalCharge;
		}

		public String getRoamTypeId() {
			return roamTypeId;
		}

		public void setRoamTypeId(String roamTypeId) {
			this.roamTypeId = roamTypeId;
		}

		public String getCalledAreaCode() {
			return calledAreaCode;
		}

		public void setCalledAreaCode(String calledAreaCode) {
			this.calledAreaCode = calledAreaCode;
		}

        public String getBillingVisitAreaCode() {
            return billingVisitAreaCode;
        }

        public void setBillingVisitAreaCode(String billingVisitAreaCode) {
            this.billingVisitAreaCode = billingVisitAreaCode;
        }
    }
	/**
	 * 数据清单
	 */
	public static class DataBillItem extends BaseDomain{
		private static final long serialVersionUID = -5479952929349473872L;
		//漫游类型
		private String roamTypeId;
		//NAI
		private String nai;
		//开始时间
		private String startTime;
		//使用时长
		private Integer duration;
		//上行流量
		private Integer sendAmount;
		//下行流量
		private Integer recvAmount;
		//合计流量
		private Integer volume;
		//上网地市
		private String callingArea;
		//业务类型
		private String businessType;
		//费用
		private Integer fee;
        //网络类型
        private String listType;
        //计费号码
        private String billingNbr;
        //上网类型
        private String volumeType;

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
		public Integer getVolume() {
			return volume;
		}
		public void setVolume(Integer volume) {
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

        public Integer getSendAmount() {
            return sendAmount;
        }

        public void setSendAmount(Integer sendAmount) {
            this.sendAmount = sendAmount;
        }

        public Integer getRecvAmount() {
            return recvAmount;
        }

        public void setRecvAmount(Integer recvAmount) {
            this.recvAmount = recvAmount;
        }

        public String getListType() {
            return listType;
        }

        public void setListType(String listType) {
            this.listType = listType;
        }

        public String getBillingNbr() {
            return billingNbr;
        }

        public void setBillingNbr(String billingNbr) {
            this.billingNbr = billingNbr;
        }

        public String getVolumeType() {
            return volumeType;
        }

        public void setVolumeType(String volumeType) {
            this.volumeType = volumeType;
        }

        public String getRoamTypeId() {
            return roamTypeId;
        }

        public void setRoamTypeId(String roamTypeId) {
            this.roamTypeId = roamTypeId;
        }
    }
	/**
	 * 短信清单
	 */
	public static class SmsBillItem extends BaseDomain{
		private static final long serialVersionUID = 4464441519085874836L;
		//用户号码
		private String billingNbr;
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

		public String getCalledNo() {
			return calledNo;
		}
		public void setCalledNo(String calledNo) {
			this.calledNo = calledNo;
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

        public String getBillingNbr() {
            return billingNbr;
        }

        public void setBillingNbr(String billingNbr) {
            this.billingNbr = billingNbr;
        }

        public String getSmsType() {
            return smsType;
        }

        public void setSmsType(String smsType) {
            this.smsType = smsType;
        }
    }
	/**
	 * 增值清单
	 */
	public static class IncrBillItem extends BaseDomain{
		private static final long serialVersionUID = 7337972630562641395L;
		//扣费时间
		private String startTime;
		//提供商编码
		private String spCode;
		//业务内容
		private String businessInfo;
		//业务名称
		private String businessType;
		//收费类型
		private String feeType;
		//费用
		private Integer fee;
		public String getSpCode() {
			return spCode;
		}
		public void setSpCode(String spCode) {
			this.spCode = spCode;
		}

		public String getStartTime() {
			return startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getBusinessInfo() {
			return businessInfo;
		}

		public void setBusinessInfo(String businessInfo) {
			this.businessInfo = businessInfo;
		}

		public String getBusinessType() {
			return businessType;
		}

		public void setBusinessType(String businessType) {
			this.businessType = businessType;
		}

		public String getFeeType() {
			return feeType;
		}

		public void setFeeType(String feeType) {
			this.feeType = feeType;
		}

		public Integer getFee() {
			return fee;
		}

		public void setFee(Integer fee) {
			this.fee = fee;
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

	public Integer getStartDate() {
		return startDate;
	}

	public void setStartDate(Integer startDate) {
		this.startDate = startDate;
	}

	public Integer getEndDate() {
		return endDate;
	}

	public void setEndDate(Integer endDate) {
		this.endDate = endDate;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Integer totalFee) {
		this.totalFee = totalFee;
	}

	public Integer getTotalVolume() {
		return totalVolume;
	}

	public void setTotalVolume(Integer totalVolume) {
		this.totalVolume = totalVolume;
	}

}
