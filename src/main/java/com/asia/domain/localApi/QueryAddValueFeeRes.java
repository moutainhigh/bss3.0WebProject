package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseBonResDomain;
import com.asia.domain.localApi.child.MobileNumberQueryServiceListTypeBean;
import com.asia.domain.localApi.child.QueryAddValueFeeResBean;

/**
 * @author WangBaoQiang
 * @ClassName: QueryAddValueFeeRes
 * @description:
 * @date 2019/9/3
 * @Version 1.0
 */
public class QueryAddValueFeeRes extends BaseBonResDomain {

    /**
     * code :
     * msg :
     * result : 0
     * returnKey :
     */

    private QueryAddValueFeeResBean stdCcaCustomizeBillQueryBill;

    public QueryAddValueFeeResBean getStdCcaCustomizeBillQueryBill() {
        return stdCcaCustomizeBillQueryBill;
    }

    public void setStdCcaCustomizeBillQueryBill(QueryAddValueFeeResBean stdCcaCustomizeBillQueryBill) {
        this.stdCcaCustomizeBillQueryBill = stdCcaCustomizeBillQueryBill;
    }


}
