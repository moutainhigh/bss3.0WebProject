package com.asia.domain.openApi;

import java.util.List;

import com.asia.common.baseObj.BaseApiResDomain;
import com.asia.common.baseObj.BaseDomain;
/**
 * ClassName: RtBillItemRes <br/>
 * date: 2019年4月29日 下午3:24:44 <br/>
 * @author yinyanzhen
 */
public class RtBillItemRes  extends BaseApiResDomain{
	private static final long serialVersionUID = 3635612640417432719L;
	//总记录数
	private Integer totalRecord;
	private Integer startDate;//查询开始日期
	private Integer endDate;//查询结束日期
    private String provinceCode;//归属省
    private String cdrType;//话单类型
    private Integer page;//页码
    private Integer row;//行数
    private Integer totalFee;//总费用
    private Integer totalVolume;//总流量

    //操作人属性
	private OperAttrStruct operAttrStruct;
	//服务对象
	private SvcObjectStruct svcObjectStruct;
	//语音详单
	private List<VoiceBillItem> voiceBillItems;
	//数据详单
	private List<DataBillItem> dataBillItems;
	//短信详单
	private List<SmsBillItem> smsBillItems;
	//增值详单
	private List<IncrBillItem> incrBillItems;

    /**
     * 服务对象
     * (范围不少于2-用户标识3-用户号码)
     * */
    private static class SvcObjectStruct {
        private String  objType;//对象类型 1-帐户标识2-用户标识3-用户号码4-客户标识5-销售品实例
        private String objValue;//对象值 如果是用户号码且用户号码属性为固话、宽带时，此值要求带区号，含0
        private String objAttr;//用户号码属性
        private String dataArea;//数据范围

        public String getObjType() {
            return objType;
        }

        public void setObjType(String objType) {
            this.objType = objType;
        }

        public String getObjValue() {
            return objValue;
        }

        public void setObjValue(String objValue) {
            this.objValue = objValue;
        }

        public String getObjAttr() {
            return objAttr;
        }

        public void setObjAttr(String objAttr) {
            this.objAttr = objAttr;
        }

        public String getDataArea() {
            return dataArea;
        }

        public void setDataArea(String dataArea) {
            this.dataArea = dataArea;
        }
    }
	/**
     * 操作人属性
     * */
	private static class OperAttrStruct {
	    private Integer staffId;//操作工号标识
	    private Integer operOrgId;//操作组织标识
	    private String  operTime;//操作时间
        private Integer operPost;//操作岗位
        private String  operServiceI;//业务流水标识
        private Integer lanId;//本地网标识

        public Integer getStaffId() {
            return staffId;
        }

        public void setStaffId(Integer staffId) {
            this.staffId = staffId;
        }

        public Integer getOperOrgId() {
            return operOrgId;
        }

        public void setOperOrgId(Integer operOrgId) {
            this.operOrgId = operOrgId;
        }

        public String getOperTime() {
            return operTime;
        }

        public void setOperTime(String operTime) {
            this.operTime = operTime;
        }

        public Integer getOperPost() {
            return operPost;
        }

        public void setOperPost(Integer operPost) {
            this.operPost = operPost;
        }

        public String getOperServiceI() {
            return operServiceI;
        }

        public void setOperServiceI(String operServiceI) {
            this.operServiceI = operServiceI;
        }

        public Integer getLanId() {
            return lanId;
        }

        public void setLanId(Integer lanId) {
            this.lanId = lanId;
        }
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
	}
	/**
	 * 数据清单
	 */
	public static class DataBillItem extends BaseDomain{
		private static final long serialVersionUID = -5479952929349473872L;
		//用户号码/宽带帐号
		private String chargeNo;
		//漫游类型
		private String listType;
		//NAI
		private String nai;
		//开始时间
		private String startTime;
		//使用时长
		private Integer duration;
		//上行流量
		private Integer upLume;
		//下行流量
		private Integer downLume;
		//合计流量
		private Integer volume;
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

		public String getListType() {
			return listType;
		}

		public void setListType(String listType) {
			this.listType = listType;
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
		public Integer getUpLume() {
			return upLume;
		}
		public void setUpLume(Integer upLume) {
			this.upLume = upLume;
		}
		public Integer getDownLume() {
			return downLume;
		}
		public void setDownLume(Integer downLume) {
			this.downLume = downLume;
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
		private String callType;
		//收发类型
		private String sendType;
		
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
		/*public String getSendTime() {
			return startTime;
		}
		public void setSendTime(String startTime) {
			this.startTime = startTime;
		}*/

		public String getStartTime() {
			return startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
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

		public String getSendType() {
			return sendType;
		}
		public void setSendType(String sendType) {
			this.sendType = sendType;
		}
	}
	/**
	 * 增值清单
	 */
	public static class IncrBillItem extends BaseDomain{
		private static final long serialVersionUID = 7337972630562641395L;
		//用户号码
		private String chargeNo;
		//扣费时间
		private String startTime;
		//提供商编码
		private String spCode;
		//提供商名称
		private String spName;
		//业务名称
		private String businessType;
		//业务名称
		private String productName;
		//费用
		private Integer Fee;
		//收费类型
		private String feeType;
		//业务内容
		private String businessInfo;

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

		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
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
			return Fee;
		}

		public void setFee(Integer fee) {
			Fee = fee;
		}

		public String getFeeType() {
			return feeType;
		}

		public void setFeeType(String feeType) {
			this.feeType = feeType;
		}

		public String getBusinessInfo() {
			return businessInfo;
		}

		public void setBusinessInfo(String businessInfo) {
			this.businessInfo = businessInfo;
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
