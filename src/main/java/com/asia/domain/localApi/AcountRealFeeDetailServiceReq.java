package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author WangBaoQiang
 * @ClassName: AcountRealFeeDetailServiceReq
 * @description: TODO
 * @date 2019/10/1920:28
 * @Version 1.0
 */
public class AcountRealFeeDetailServiceReq extends BaseDomain {

    /**
     * exactlyRtQry : {"queryFlag":2,"queryValue":"3202626561","staffID":1,"routeRuleInfo":{"routeFlag":3,"routeValue":3202626561}}
     */
    private String systemId;
    private ExactlyRtQryBean exactlyRtQry;

    public ExactlyRtQryBean getExactlyRtQry() {
        return exactlyRtQry;
    }

    public void setExactlyRtQry(ExactlyRtQryBean exactlyRtQry) {
        this.exactlyRtQry = exactlyRtQry;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public static class ExactlyRtQryBean {
        /**
         * queryFlag : 2
         * queryValue : 3202626561
         * staffID : 1
         * routeRuleInfo : {"routeFlag":3,"routeValue":3202626561}
         */

        private int queryFlag;
        private String queryValue;
        private String valueType;
        private int staffID;
        private String areaCode;
        private RouteRuleInfoBean routeRuleInfo;

        public int getQueryFlag() {
            return queryFlag;
        }

        public void setQueryFlag(int queryFlag) {
            this.queryFlag = queryFlag;
        }

        public String getQueryValue() {
            return queryValue;
        }

        public void setQueryValue(String queryValue) {
            this.queryValue = queryValue;
        }

        public int getStaffID() {
            return staffID;
        }

        public void setStaffID(int staffID) {
            this.staffID = staffID;
        }

        public RouteRuleInfoBean getRouteRuleInfo() {
            return routeRuleInfo;
        }

        public void setRouteRuleInfo(RouteRuleInfoBean routeRuleInfo) {
            this.routeRuleInfo = routeRuleInfo;
        }

        public String getValueType() {
            return valueType;
        }

        public void setValueType(String valueType) {
            this.valueType = valueType;
        }

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public static class RouteRuleInfoBean {
            /**
             * routeFlag : 3
             * routeValue : 3202626561
             */

            private int routeFlag;
            private long routeValue;

            public int getRouteFlag() {
                return routeFlag;
            }

            public void setRouteFlag(int routeFlag) {
                this.routeFlag = routeFlag;
            }

            public long getRouteValue() {
                return routeValue;
            }

            public void setRouteValue(long routeValue) {
                this.routeValue = routeValue;
            }
        }
    }
}
