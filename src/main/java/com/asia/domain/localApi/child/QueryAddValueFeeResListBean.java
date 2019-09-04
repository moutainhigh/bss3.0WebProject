package com.asia.domain.localApi.child;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author ChenJian
 * @ClassName: QueryAddValueFeeBean
 * @description: TODO
 * @date 2019/9/3
 * @Version 1.0
 */
public class QueryAddValueFeeResListBean extends BaseDomain {


    private String showlevel;
    private String classId;
    private String parentClassId;
    private String charge;
    private String accNbrDetail;
    private String chargeTypeName;
    private String productOffName;

    public String getShowlevel() {
        return showlevel;
    }

    public void setShowlevel(String showlevel) {
        this.showlevel = showlevel;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getParentClassId() {
        return parentClassId;
    }

    public void setParentClassId(String parentClassId) {
        this.parentClassId = parentClassId;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getAccNbrDetail() {
        return accNbrDetail;
    }

    public void setAccNbrDetail(String accNbrDetail) {
        this.accNbrDetail = accNbrDetail;
    }

    public String getChargeTypeName() {
        return chargeTypeName;
    }

    public void setChargeTypeName(String chargeTypeName) {
        this.chargeTypeName = chargeTypeName;
    }

    public String getProductOffName() {
        return productOffName;
    }

    public void setProductOffName(String productOffName) {
        this.productOffName = productOffName;
    }
}

