package com.asia.domain.localApi.child;

import java.util.List;

/**
 * @author WangBaoQiang
 * @ClassName: AgreementConsumeSetTypeBean
 * @description: TODO
 * @date 2019/8/1310:41
 * @Version 1.0
 */
public class AgreementConsumeSetTypeBean {
    private List<AgreementConsumeSetBean> agreementConsumeSetType;


    public List<AgreementConsumeSetBean> getAgreementConsumeSetType() {
        return agreementConsumeSetType;
    }

    public void setAgreementConsumeSetType(List<AgreementConsumeSetBean> agreementConsumeSetType) {
        this.agreementConsumeSetType = agreementConsumeSetType;
    }
}
