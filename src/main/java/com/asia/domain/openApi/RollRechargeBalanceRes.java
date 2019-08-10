package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseApiResDomain;

/**
 * @author WangBaoQiang
 * @ClassName: RollRechargeBalanceRes
 * @description: TODO
 * @date 2019/7/2916:47
 * @Version 1.0
 */
public class RollRechargeBalanceRes extends BaseApiResDomain {


    /**
     * resultCode :
     * resultMsg :
     * reqServiceId :
     */

    private String resultCode;
    private String resultMsg;
    private String reqServiceId;

    @Override
    public String getResultCode() {
        return resultCode;
    }

    @Override
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @Override
    public String getResultMsg() {
        return resultMsg;
    }
    @Override
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getReqServiceId() {
        return reqServiceId;
    }

    public void setReqServiceId(String reqServiceId) {
        this.reqServiceId = reqServiceId;
    }
}
