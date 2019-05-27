package com.asia.domain.bon3_drop;

import com.asia.common.baseObj.BaseDomain;

/**
 * 
 * ClassName: StdCcrUserResourceQuery <br/>
 * date: 2019年4月24日 上午11:10:23 <br/>
 * @author yinyanzhen
 */
@Deprecated
public class StdCcrUserResourceQuery extends BaseDomain{
	private static final long serialVersionUID = 2524188627867183081L;
	
	private ResourceInformation resourceInformation =new ResourceInformation();
	
	public ResourceInformation getResourceInformation() {
		return resourceInformation;
	}

	public void setResourceInformation(ResourceInformation resourceInformation) {
		this.resourceInformation = resourceInformation;
	}

	/**
	 * 内部类
	 * ClassName: ResourceInformation <br/>
	 * date: 2019年4月24日 上午11:13:36 <br/>
	 * @author yinyanzhen
	 */
	public static class ResourceInformation extends BaseDomain{
		private static final long serialVersionUID = -4813129883626226034L;
		
		private String queryFlag;
		
		private String billingCycle;
		
		private String destinationAttr;
		
		private String accNbr;
		
		private String prodOfferInstanceId;
		
		private String productOfferId;

		public String getQueryFlag() {
			return queryFlag;
		}

		public void setQueryFlag(String queryFlag) {
			this.queryFlag = queryFlag;
		}

		public String getBillingCycle() {
			return billingCycle;
		}

		public void setBillingCycle(String billingCycle) {
			this.billingCycle = billingCycle;
		}

		public String getDestinationAttr() {
			return destinationAttr;
		}

		public void setDestinationAttr(String destinationAttr) {
			this.destinationAttr = destinationAttr;
		}

		public String getAccNbr() {
			return accNbr;
		}

		public void setAccNbr(String accNbr) {
			this.accNbr = accNbr;
		}

		public String getProdOfferInstanceId() {
			return prodOfferInstanceId;
		}

		public void setProdOfferInstanceId(String prodOfferInstanceId) {
			this.prodOfferInstanceId = prodOfferInstanceId;
		}

		public String getProductOfferId() {
			return productOfferId;
		}

		public void setProductOfferId(String productOfferId) {
			this.productOfferId = productOfferId;
		}
	}
}