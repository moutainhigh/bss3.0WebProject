package com.asia.domain.localApi.child;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author WangBaoQiang
 * @ClassName: AgreementConsumeSetBean
 * @description: TODO
 * @date 2019/8/1310:11
 * @Version 1.0
 */
public class AgreementConsumeSetBean extends BaseDomain {

    /**
     * offerInstId : 315267669893
     * prodInstId : 313047020873
     * rentMonth : 24
     * totalFee : 360000
     * usedFee : 300752
     */

    private String offerInstId;
    private String prodInstId;
    private String rentMonth;
    private String totalFee;
    private String usedFee;

    public String getOfferInstId() {
        return offerInstId;
    }

    public void setOfferInstId(String offerInstId) {
        this.offerInstId = offerInstId;
    }

    public String getProdInstId() {
        return prodInstId;
    }

    public void setProdInstId(String prodInstId) {
        this.prodInstId = prodInstId;
    }

    public String getRentMonth() {
        return rentMonth;
    }

    public void setRentMonth(String rentMonth) {
        this.rentMonth = rentMonth;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getUsedFee() {
        return usedFee;
    }

    public void setUsedFee(String usedFee) {
        this.usedFee = usedFee;
    }


}
