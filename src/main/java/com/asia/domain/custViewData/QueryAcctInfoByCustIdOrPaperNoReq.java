package com.asia.domain.custViewData;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.baseObj.BaseBonResDomain;

/**
 * @author ChenJian
 * @ClassName: queryAcctInfoByCustIdOrPaperNoRes
 * @description: 调bubbo服务根据身份证号或CUSTID获取账户列表
 * @date 2019/11/18 19:09
 * @Version 1.0
 */
public class QueryAcctInfoByCustIdOrPaperNoReq {

    private String queryType;
    private String queryCode;
    private String billPeriods;
    private String type;
    private String prodId;

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getQueryCode() {
        return queryCode;
    }

    public void setQueryCode(String queryCode) {
        this.queryCode = queryCode;
    }

    public String getBillPeriods() {
        return billPeriods;
    }

    public void setBillPeriods(String billPeriods) {
        this.billPeriods = billPeriods;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }


}
