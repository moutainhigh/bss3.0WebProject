package com.asia.domain.localApi.child;

import com.asia.common.baseObj.BaseDomain;

import java.util.List;

/**
 * @author ChenJian
 * @ClassName: QueryAddValueFeeBean
 * @description: TODO
 * @date 2019/9/3
 * @Version 1.0
 */
public class QueryAddValueFeeResBean {


    private String sumCharge;
    private String acctName;
    private List<QueryAddValueFeeResListBean> itemInformation;

    public String getSumCharge() {
        return sumCharge;
    }

    public void setSumCharge(String sumCharge) {
        this.sumCharge = sumCharge;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public List<QueryAddValueFeeResListBean> getItemInformation() {
        return itemInformation;
    }

    public void setItemInformation(List<QueryAddValueFeeResListBean> itemInformation) {
        this.itemInformation = itemInformation;
    }
}

