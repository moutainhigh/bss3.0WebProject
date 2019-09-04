package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseDomain;
import com.asia.domain.localApi.child.QueryAddValueFeeBean;

/**
 * @author ChenJian
 * @ClassName: QueryAddValueFeeReq
 * @description: TODO
 * @date 2019/9/3
 * @Version 1.0
 */
public class QueryAddValueFeeReq extends BaseDomain {

    private QueryAddValueFeeBean stdCcrCustomizeBillQueryBill;

    public QueryAddValueFeeBean getStdCcrCustomizeBillQueryBill() {
        return stdCcrCustomizeBillQueryBill;
    }

    public void setStdCcrCustomizeBillQueryBill(QueryAddValueFeeBean stdCcrCustomizeBillQueryBill) {
        this.stdCcrCustomizeBillQueryBill = stdCcrCustomizeBillQueryBill;
    }
}
