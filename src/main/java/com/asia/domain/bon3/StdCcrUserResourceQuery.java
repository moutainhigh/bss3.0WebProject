package com.asia.domain.bon3;

import com.asia.common.baseObj.BaseDomain;

/**
 *
 * ClassName: StdCcrUserResourceQuery <br/>
 * date: 2019年4月24日 上午11:10:23 <br/>
 * @author yinyanzhen
 */
public class StdCcrUserResourceQuery extends BaseDomain{
	private static final long serialVersionUID = 2524188627867183081L;

    /**
     * stdCcrUserResourceQuery : {"systemId":"","resourceInformation":{"accNbr":"","billingCycle":"","destinationAttr":"","prodOfferInstanceId":"","productOfferId":"","queryFlag":""}}
     */
    private String systemId;
    private StdCcrUserResourceQueryBean stdCcrUserResourceQuery;

    public StdCcrUserResourceQueryBean getStdCcrUserResourceQuery() {
        return stdCcrUserResourceQuery;
    }

    public void setStdCcrUserResourceQuery(StdCcrUserResourceQueryBean stdCcrUserResourceQuery) {
        this.stdCcrUserResourceQuery = stdCcrUserResourceQuery;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public static class StdCcrUserResourceQueryBean {
        /**
         * systemId :
         * resourceInformation : {"accNbr":"","billingCycle":"","destinationAttr":"","prodOfferInstanceId":"","productOfferId":"","queryFlag":""}
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
             * accNbr :
             * billingCycle :
             * destinationAttr :
             * prodOfferInstanceId :
             * productOfferId :
             * queryFlag :
             */

            private String accNbr;
            private String billingCycle;
            private String destinationAttr;
            private String prodOfferInstanceId;
            private String productOfferId;
            private String queryFlag;

            public String getAccNbr() {
                return accNbr;
            }

            public void setAccNbr(String accNbr) {
                this.accNbr = accNbr;
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

            public String getQueryFlag() {
                return queryFlag;
            }

            public void setQueryFlag(String queryFlag) {
                this.queryFlag = queryFlag;
            }
        }
    }
}