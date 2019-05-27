package com.asia.domain.openApi;

import java.util.ArrayList;
import java.util.List;

import com.asia.common.baseObj.BaseApiResDomain;
import com.asia.common.baseObj.BaseDomain;
/**
 * ClassName: QryCustBillRes <br/>
 * date: 2019年4月29日 下午2:36:26 <br/>
 * @author yinyanzhen
 */
public class QryCustBillRes extends BaseApiResDomain{
	private static final long serialVersionUID = 2552856688146324853L;
	//帐务周期 
	private Integer billingCycleId;
	//帐户名称 
	private String acctName;
	//总费用 
	private Integer sumCharge;
	//本期已付费用 
	private Integer chargePayed;
	//本期应付费用 
	private Integer chargeShouldPayed;
	//帐单赠费抵扣金额 
	private Integer chargeFreeDiscount;
	//帐单本金抵扣金额 
	private Integer chargeCorpusDiscount;
	//号码信息 
	private String accNbrDetail;
	//套餐信息组 
	private List<ItemInformation> itemInformationList =new ArrayList<>();
	/**
	 * ClassName: ItemInformation <br/>
	 * date: 2019年4月29日 下午2:37:48 <br/>
	 * @author yinyanzhen
	 */
	public static class ItemInformation extends BaseDomain{
		private static final long serialVersionUID = 8104149146136711998L;
		//帐目层级 
		private String showLevel;
		//本节点id 
		private Integer classId;
		//父节点id 
		private Integer parentClassId;
		//套餐名称
		private String productOffName;
		//号码信息 
		private String accNbrDetail;
		//费用名称(项目名称) 
		private String chargeTypeName;
		//费用金额 
		private Integer charge;

		public String getShowLevel() {
			return showLevel;
		}

		public void setShowLevel(String showLevel) {
			this.showLevel = showLevel;
		}

		public Integer getClassId() {
			return classId;
		}

		public void setClassId(Integer classId) {
			this.classId = classId;
		}

		public Integer getParentClassId() {
			return parentClassId;
		}

		public void setParentClassId(Integer parentClassId) {
			this.parentClassId = parentClassId;
		}

		public String getProductOffName() {
			return productOffName;
		}

		public void setProductOffName(String productOffName) {
			this.productOffName = productOffName;
		}

		public String getAccNbrDetail() {
			return accNbrDetail;
		}

		public void setAccNbrDetail(String accNbrDetail) {
			this.accNbrDetail = accNbrDetail;
		}

		public String getChargeTypeName() {
			return chargeTypeName;
		}

		public void setChargeTypeName(String chargeTypeName) {
			this.chargeTypeName = chargeTypeName;
		}

		public Integer getCharge() {
			return charge;
		}

		public void setCharge(Integer charge) {
			this.charge = charge;
		}
	}

	public Integer getBillingCycleId() {
		return billingCycleId;
	}

	public void setBillingCycleId(Integer billingCycleId) {
		this.billingCycleId = billingCycleId;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public Integer getSumCharge() {
		return sumCharge;
	}

	public void setSumCharge(Integer sumCharge) {
		this.sumCharge = sumCharge;
	}

	public Integer getChargePayed() {
		return chargePayed;
	}

	public void setChargePayed(Integer chargePayed) {
		this.chargePayed = chargePayed;
	}

	public Integer getChargeShouldPayed() {
		return chargeShouldPayed;
	}

	public void setChargeShouldPayed(Integer chargeShouldPayed) {
		this.chargeShouldPayed = chargeShouldPayed;
	}

	public Integer getChargeFreeDiscount() {
		return chargeFreeDiscount;
	}

	public void setChargeFreeDiscount(Integer chargeFreeDiscount) {
		this.chargeFreeDiscount = chargeFreeDiscount;
	}

	public Integer getChargeCorpusDiscount() {
		return chargeCorpusDiscount;
	}

	public void setChargeCorpusDiscount(Integer chargeCorpusDiscount) {
		this.chargeCorpusDiscount = chargeCorpusDiscount;
	}

	public String getAccNbrDetail() {
		return accNbrDetail;
	}

	public void setAccNbrDetail(String accNbrDetail) {
		this.accNbrDetail = accNbrDetail;
	}

	public List<ItemInformation> getItemInformationList() {
		return itemInformationList;
	}

	public void setItemInformationList(List<ItemInformation> itemInformationList) {
		this.itemInformationList = itemInformationList;
	}
	
}
