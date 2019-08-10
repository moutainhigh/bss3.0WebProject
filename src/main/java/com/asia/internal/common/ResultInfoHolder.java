package com.asia.internal.common;

import com.asia.internal.errcode.ErrorCodePublicEnum;
import com.asia.internal.errcode.IErrorCodeEnum;

public class ResultInfoHolder {
    /**
     *  结果编码
     */
    private String code;
    /**
     *  结果描述
     */
    private String message;

    ResultInfoHolder() {
        code = ErrorCodePublicEnum.SUCCESS.getCode();
        message = ErrorCodePublicEnum.SUCCESS.getMessage();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setResultInfo(IErrorCodeEnum t) {
        this.code = t.getCode();
        this.message = t.getMessage();
    }

    public void setResultInfo(BillException t) {
        this.code = t.getErrCode();
        this.message = t.getMessage();

    }
}
