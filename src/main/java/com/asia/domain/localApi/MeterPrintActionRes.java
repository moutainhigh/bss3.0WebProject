package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseBonResDomain;

/**
 * @author WangBaoQiang
 * @ClassName: MeterPrintActionRes
 * @description: 详单打印记录
 * @date 2019/8/1219:09
 * @Version 1.0
 */
public class MeterPrintActionRes extends BaseBonResDomain {

    /**
     * code :
     * msg :
     * result : 0
     * returnKey :
     */

    private String code;
    private String msg;
    private String result;
    private String returnKey;

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

    public String getReturnKey() {
        return returnKey;
    }

    public void setReturnKey(String returnKey) {
        this.returnKey = returnKey;
    }
}
