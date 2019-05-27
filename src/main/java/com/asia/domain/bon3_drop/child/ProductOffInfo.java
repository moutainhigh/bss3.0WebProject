package com.asia.domain.bon3_drop.child;
import java.util.ArrayList;
import java.util.List;

import com.asia.common.baseObj.BaseDomain;

/**
 * ClassName: ProductOffInfo <br/>
 * date: 2019年4月24日 上午11:22:33 <br/>
 * @author yinyanzhen
 */
@Deprecated
public class ProductOffInfo extends BaseDomain {
	private static final long serialVersionUID = 1L;
	private String productOfferId;
	private String prodOfferInstanceId;
	private String offerType;
	private String productOffName;
	private List<ServGroupQuery> servGroupQuery = new ArrayList<>();
	private List<RespondRatableQuery> respondRatableQuery = new ArrayList<>();

	public String getProductOfferId() {
		return productOfferId;
	}

	public void setProductOfferId(String productOfferId) {
		this.productOfferId = productOfferId;
	}

	public String getProdOfferInstanceId() {
		return prodOfferInstanceId;
	}

	public void setProdOfferInstanceId(String prodOfferInstanceId) {
		this.prodOfferInstanceId = prodOfferInstanceId;
	}

	public String getOfferType() {
		return offerType;
	}

	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	public String getProductOffName() {
		return productOffName;
	}

	public void setProductOffName(String productOffName) {
		this.productOffName = productOffName;
	}

	public List<ServGroupQuery> getServGroupQuery() {
		return servGroupQuery;
	}

	public void setServGroupQuery(List<ServGroupQuery> servGroupQuery) {
		this.servGroupQuery = servGroupQuery;
	}

	public List<RespondRatableQuery> getRespondRatableQuery() {
		return respondRatableQuery;
	}

	public void setRespondRatableQuery(List<RespondRatableQuery> respondRatableQuery) {
		this.respondRatableQuery = respondRatableQuery;
	}

	/**
	 * 内部类 ClassName: ServGroupQuery <br/>
	 * date: 2019年4月24日 上午11:22:08 <br/>
	 * 
	 * @author yinyanzhen
	 */
	public class ServGroupQuery extends BaseDomain {
		private static final long serialVersionUID = 1L;
		private String accNbr;
		private String ratableResourceID;
		private String unitTypeId;
		private String destinationAttr;
		private String usageAmount;
		private String servTypeId;

		public String getAccNbr() {
			return accNbr;
		}

		public void setAccNbr(String accNbr) {
			this.accNbr = accNbr;
		}

		public String getRatableResourceID() {
			return ratableResourceID;
		}

		public void setRatableResourceID(String ratableResourceID) {
			this.ratableResourceID = ratableResourceID;
		}

		public String getUnitTypeId() {
			return unitTypeId;
		}

		public void setUnitTypeId(String unitTypeId) {
			this.unitTypeId = unitTypeId;
		}

		public String getDestinationAttr() {
			return destinationAttr;
		}

		public void setDestinationAttr(String destinationAttr) {
			this.destinationAttr = destinationAttr;
		}

		public String getUsageAmount() {
			return usageAmount;
		}

		public void setUsageAmount(String usageAmount) {
			this.usageAmount = usageAmount;
		}

		public String getServTypeId() {
			return servTypeId;
		}

		public void setServTypeId(String servTypeId) {
			this.servTypeId = servTypeId;
		}
	}

	/**
	 * 内部类 ClassName: RespondRatableQuery <br/>
	 * date: 2019年4月24日 上午11:22:18 <br/>
	 * 
	 * @author yinyanzhen
	 */
	public class RespondRatableQuery extends BaseDomain {
		private static final long serialVersionUID = 1L;
		private String ownerType;
		private String ownerID;
		private String ratableResourceID;
		private String ratableResourceName;
		private String unitTypeId;
		private String endTime;
		private String ratableAmount;
		private String balanceAmount;
		private String usageAmount;
		private String beginTime;

		public String getOwnerType() {
			return ownerType;
		}

		public void setOwnerType(String ownerType) {
			this.ownerType = ownerType;
		}

		public String getOwnerID() {
			return ownerID;
		}

		public void setOwnerID(String ownerID) {
			this.ownerID = ownerID;
		}

		public String getRatableResourceID() {
			return ratableResourceID;
		}

		public void setRatableResourceID(String ratableResourceID) {
			this.ratableResourceID = ratableResourceID;
		}

		public String getRatableResourceName() {
			return ratableResourceName;
		}

		public void setRatableResourceName(String ratableResourceName) {
			this.ratableResourceName = ratableResourceName;
		}

		public String getUnitTypeId() {
			return unitTypeId;
		}

		public void setUnitTypeId(String unitTypeId) {
			this.unitTypeId = unitTypeId;
		}

		public String getEndTime() {
			return endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getRatableAmount() {
			return ratableAmount;
		}

		public void setRatableAmount(String ratableAmount) {
			this.ratableAmount = ratableAmount;
		}

		public String getBalanceAmount() {
			return balanceAmount;
		}

		public void setBalanceAmount(String balanceAmount) {
			this.balanceAmount = balanceAmount;
		}

		public String getUsageAmount() {
			return usageAmount;
		}

		public void setUsageAmount(String usageAmount) {
			this.usageAmount = usageAmount;
		}

		public String getBeginTime() {
			return beginTime;
		}

		public void setBeginTime(String beginTime) {
			this.beginTime = beginTime;
		}
	}
}