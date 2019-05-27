package com.asia.domain.openApi;

import java.util.ArrayList;
import java.util.List;

import com.asia.common.baseObj.BaseApiResDomain;
import com.asia.common.baseObj.BaseDomain;
/**
 * ClassName: QryInstantFeeListRes <br/>
 * date: 2019年4月29日 下午2:53:17 <br/>
 * @author yinyanzhen
 */
public class QryInstantFeeListRes extends BaseApiResDomain{
	private static final long serialVersionUID = -6812824759794653218L;
	//总费用
	private Integer sumCharge;
	//帐单帐目项信息 
	private List<ItemInformation> itemInformatinList =new ArrayList<>();
	
	/**
	 * 帐单帐目项
	 * ClassName: ItemInformation <br/>
	 * date: 2019年4月29日 上午10:11:58 <br/>
	 * @author yinyanzhen
	 */
	public static class ItemInformation extends BaseDomain{
		private static final long serialVersionUID = -5957408311296786856L;
		//帐户名称 
		private String acctName;
		//帐目层级 
		private String showlevel;
		//本节点id 
		private Integer classId;
		//父节点id 
		private Integer parentClassId;
		//费用名称 
		private String chargeTypeName;
		//费用金额 
		private Integer charge;

		public String getAcctName() {
			return acctName;
		}

		public void setAcctName(String acctName) {
			this.acctName = acctName;
		}

		public String getShowlevel() {
			return showlevel;
		}

		public void setShowlevel(String showlevel) {
			this.showlevel = showlevel;
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

	public Integer getSumCharge() {
		return sumCharge;
	}

	public void setSumCharge(Integer sumCharge) {
		this.sumCharge = sumCharge;
	}

	public List<ItemInformation> getItemInformatinList() {
		return itemInformatinList;
	}

	public void setItemInformatinList(List<ItemInformation> itemInformatinList) {
		this.itemInformatinList = itemInformatinList;
	}
}
