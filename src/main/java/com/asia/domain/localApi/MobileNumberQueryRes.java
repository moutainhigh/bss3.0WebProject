package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseBonResDomain;
import com.asia.domain.localApi.child.MobileNumberQueryServiceListTypeBean;

/**
 * @author WangBaoQiang
 * @ClassName: MeterPrintActionRes
 * @description: 详单打印记录
 * @date 2019/8/1219:09
 * @Version 1.0
 */
public class MobileNumberQueryRes extends BaseBonResDomain {

    /**
     * code :
     * msg :
     * result : 0
     * returnKey :
     */

    private String code;
    private String msg;
    private String result;
    private MobileNumberQueryServiceListTypeBean dataInfoSet;

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

    public MobileNumberQueryServiceListTypeBean getDataInfoSet() {
        return dataInfoSet;
    }

    public void setDataInfoSet(MobileNumberQueryServiceListTypeBean dataInfoSet) {
        this.dataInfoSet = dataInfoSet;
    }
}
