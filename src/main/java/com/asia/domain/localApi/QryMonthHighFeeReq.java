package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author WangBaoQiang
 * @ClassName: QryMonthHighFeeReq
 * @description: 智慧万号通用查询
 * @date 2019/8/611:13
 * @Version 1.0
 */
public class QryMonthHighFeeReq extends BaseDomain {


    /**
     * beginDate : 20190301
     * endDate : 20190421
     * queryClass : 4
     * queryMonth : 201903
     * queryTimeType : 2
     * queryType : 1
     * queryValue : 18943640855
     * queryValueType : 1
     * userType : 1
     */

    private String beginDate;
    private String endDate;
    private String queryClass;
    private String queryMonth;
    private String queryTimeType;
    private String queryType;
    private long queryValue;
    private String queryValueType;
    private String userType;

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getQueryClass() {
        return queryClass;
    }

    public void setQueryClass(String queryClass) {
        this.queryClass = queryClass;
    }

    public String getQueryMonth() {
        return queryMonth;
    }

    public void setQueryMonth(String queryMonth) {
        this.queryMonth = queryMonth;
    }

    public String getQueryTimeType() {
        return queryTimeType;
    }

    public void setQueryTimeType(String queryTimeType) {
        this.queryTimeType = queryTimeType;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public long getQueryValue() {
        return queryValue;
    }

    public void setQueryValue(long queryValue) {
        this.queryValue = queryValue;
    }

    public String getQueryValueType() {
        return queryValueType;
    }

    public void setQueryValueType(String queryValueType) {
        this.queryValueType = queryValueType;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}