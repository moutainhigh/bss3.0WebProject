package com.asia.domain.bon3;

import com.asia.common.baseObj.BaseDomain;
/**
 * 
 * ClassName: StdCcrQueryUnitedBalance <br/>
 * date: 2019年4月24日 上午11:03:05 <br/>
 * @author yinyanzhen
 */
public class StdCcrQueryUnitedBalance extends BaseDomain{
    private static final long serialVersionUID = -225273870737946595L;

    /**
     * stdCcrQueryBalanceBalance : {"balanceQueryInformation":{"queryFlag":"1","queryItemType":"1","areaCode":"1","destinationIdType":"1","destinationAttr":"2","destinationId":"15354515388","returnPlanId":"1"}}
     */
    private String systemId;
    private StdCcrQueryBalanceBalanceBean stdCcrQueryBalanceBalance;

    public StdCcrQueryBalanceBalanceBean getStdCcrQueryBalanceBalance() {
        return stdCcrQueryBalanceBalance;
    }

    public void setStdCcrQueryBalanceBalance(StdCcrQueryBalanceBalanceBean stdCcrQueryBalanceBalance) {
        this.stdCcrQueryBalanceBalance = stdCcrQueryBalanceBalance;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public static class StdCcrQueryBalanceBalanceBean {
        /**
         * balanceQueryInformation : {"queryFlag":"1","queryItemType":"1","areaCode":"1","destinationIdType":"1","destinationAttr":"2","destinationId":"15354515388","returnPlanId":"1"}
         */

        private BalanceQueryInformationBean balanceQueryInformation;

        public BalanceQueryInformationBean getBalanceQueryInformation() {
            return balanceQueryInformation;
        }

        public void setBalanceQueryInformation(BalanceQueryInformationBean balanceQueryInformation) {
            this.balanceQueryInformation = balanceQueryInformation;
        }

        public static class BalanceQueryInformationBean {
            /**
             * queryFlag : 1
             * queryItemType : 1
             * areaCode : 1
             * destinationIdType : 1
             * destinationAttr : 2
             * destinationId : 15354515388
             * returnPlanId : 1
             */

            private String queryFlag;
            private String queryItemType;
            private String areaCode;
            private String destinationIdType;
            private String destinationAttr;
            private String destinationId;
            private String returnPlanId;

            public String getQueryFlag() {
                return queryFlag;
            }

            public void setQueryFlag(String queryFlag) {
                this.queryFlag = queryFlag;
            }

            public String getQueryItemType() {
                return queryItemType;
            }

            public void setQueryItemType(String queryItemType) {
                this.queryItemType = queryItemType;
            }

            public String getAreaCode() {
                return areaCode;
            }

            public void setAreaCode(String areaCode) {
                this.areaCode = areaCode;
            }

            public String getDestinationIdType() {
                return destinationIdType;
            }

            public void setDestinationIdType(String destinationIdType) {
                this.destinationIdType = destinationIdType;
            }

            public String getDestinationAttr() {
                return destinationAttr;
            }

            public void setDestinationAttr(String destinationAttr) {
                this.destinationAttr = destinationAttr;
            }

            public String getDestinationId() {
                return destinationId;
            }

            public void setDestinationId(String destinationId) {
                this.destinationId = destinationId;
            }

            public String getReturnPlanId() {
                return returnPlanId;
            }

            public void setReturnPlanId(String returnPlanId) {
                this.returnPlanId = returnPlanId;
            }
        }
    }
}