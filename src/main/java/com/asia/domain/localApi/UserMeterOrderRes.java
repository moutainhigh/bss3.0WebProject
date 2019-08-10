package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseBonResDomain;

/**
 * @author WangBaoQiang
 * @ClassName: UserMeterOrderRes
 * @description: TODO
 * @date 2019/8/1013:44
 * @Version 1.0
 */
public class UserMeterOrderRes extends BaseBonResDomain {

    /**
     * code :
     * msg :
     * result : 0
     */

    private String code;
    private String msg;
    private String result;

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
