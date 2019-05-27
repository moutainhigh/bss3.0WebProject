package com.asia.domain.bon3_drop;

import com.asia.common.baseObj.BaseDomain;

@Deprecated
public class StdCcrUserResourceQueryDetail extends BaseDomain{
	private static final long serialVersionUID = 8188882079193151025L;
	private ResourceInformation resourceInformation = new ResourceInformation();
	
	public ResourceInformation getResourceInformation() {
		return resourceInformation;
	}

	public void setResourceInformation(ResourceInformation resourceInformation) {
		this.resourceInformation = resourceInformation;
	}
	
	/**
	 * 内部类
	 * ClassName: ResourceInformation <br/>
	 * date: 2019年4月24日 上午11:30:43 <br/>
	 * @author yinyanzhen
	 */
	public static class ResourceInformation extends BaseDomain{
		private static final long serialVersionUID = -6627386477320909108L;
		
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