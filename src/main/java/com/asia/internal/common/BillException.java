package com.asia.internal.common;

import com.asia.internal.errcode.IErrorCodeEnum;

/**
 * 异常
 *
 * @author manco
 * @since 2019/03/13 10:08
 */
public class BillException extends Exception {

    private static final long serialVersionUID = -6877633364576501597L;

    private String errCode;
    private String errMsg;

    public BillException() {
        super();
    }


    public BillException(String message, Throwable cause) {
        super(message, cause);
    }

    public BillException(String message) {
        super(message);
    }

    public BillException(Throwable cause) {
        super(cause);
    }

    public BillException(String errCode, String errMsg) {
        super(errCode + ":" + errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public BillException(ResultInfo resultInfo) {
        super(resultInfo.getCode() + ":" + resultInfo.getMessage());
        this.errCode = resultInfo.getCode();
        this.errMsg = resultInfo.getMessage();
    }

    public BillException(IErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getCode() + ":" + errorCodeEnum.getMessage());
        this.errCode = errorCodeEnum.getCode();
        this.errMsg = errorCodeEnum.getMessage();
    }

    public String getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }
}
