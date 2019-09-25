package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseBonResDomain;
import com.asia.domain.localApi.child.IntfCommServiceListTypeBean;

/**
 * @author WangBaoQiang
 * @ClassName: QryMonthHighFeeRes
 * @description: TODO
 * @date 2019/8/611:14
 * @Version 1.0
 */
public class QryMonthHighFeeRes   {


    /**
     * code :
     * intfCommServiceListType : {"intfCommServiceList":[{"accNbr":"18043208987","acctId":"323007478860","custId":"3200097120","custName":"陈忠生","retCol1":"211","retCol2":"1","retCol3":"20190131021235","servId":"323047891323"}]}
     * msg :
     * result : 0
     */

    private String code;
    private IntfCommServiceListTypeBean intfCommServiceListType;
    private String msg;
    private String result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public IntfCommServiceListTypeBean getIntfCommServiceListType() {
        return intfCommServiceListType;
    }

    public void setIntfCommServiceListType(IntfCommServiceListTypeBean intfCommServiceListType) {
        this.intfCommServiceListType = intfCommServiceListType;
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
