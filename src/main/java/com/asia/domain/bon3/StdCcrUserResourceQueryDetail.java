package com.asia.domain.bon3;

import com.asia.common.baseObj.BaseDomain;

public class StdCcrUserResourceQueryDetail extends BaseDomain{
	private static final long serialVersionUID = 8188882079193151025L;

	/**
	 * stdCcrUserResourceQueryDetail : {"systemId":"","resourceInformation":{"queryFlag":"","billingCycle":"","destinationAttr":"","accNbr":"","prodOfferInstanceId":"","productOfferId":""}}
	 */
	private String systemId;
	private StdCcrUserResourceQueryDetailBean stdCcrUserResourceQueryDetail;

	public StdCcrUserResourceQueryDetailBean getStdCcrUserResourceQueryDetail() {
		return stdCcrUserResourceQueryDetail;
	}

	public void setStdCcrUserResourceQueryDetail(StdCcrUserResourceQueryDetailBean stdCcrUserResourceQueryDetail) {
		this.stdCcrUserResourceQueryDetail = stdCcrUserResourceQueryDetail;
	}

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	public static class StdCcrUserResourceQueryDetailBean {
		/**
		 * systemId :
		 * resourceInformation : {"queryFlag":"","billingCycle":"","destinationAttr":"","accNbr":"","prodOfferInstanceId":"","productOfferId":""}
		 */


		private ResourceInformationBean resourceInformation;

		public ResourceInformationBean getResourceInformation() {
			return resourceInformation;
		}

		public void setResourceInformation(ResourceInformationBean resourceInformation) {
			this.resourceInformation = resourceInformation;
		}

		public static class ResourceInformationBean {
			/**
			 * queryFlag :
			 * billingCycle :
			 * destinationAttr :
			 * accNbr :
			 * prodOfferInstanceId :
			 * productOfferId :
			 */

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
}