package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseBonResDomain;
import com.asia.domain.localApi.child.AgreementConsumeSetTypeBean;

/**
 * @author WangBaoQiang
 * @ClassName: QueryAgreementConsumptionRes
 * @description: TODO
 * @date 2019/8/1310:08
 * @Version 1.0
 */
public class QueryAgreementConsumptionRes extends BaseBonResDomain {

    /**
     * agreementConsumeSet : {"agreementConsumeSetType":{"offerInstId":"315267669893","prodInstId":"313047020873","rentMonth":"24","totalFee":"360000","usedFee":"300752"}}
     * code :
     * msg :
     * result :
     */

    private AgreementConsumeSetTypeBean agreementConsumeSet;
    private String code;
    private String msg;
    private String result;

    public AgreementConsumeSetTypeBean getAgreementConsumeSet() {
        return agreementConsumeSet;
    }

    public void setAgreementConsumeSet(AgreementConsumeSetTypeBean agreementConsumeSet) {
        this.agreementConsumeSet = agreementConsumeSet;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


}
