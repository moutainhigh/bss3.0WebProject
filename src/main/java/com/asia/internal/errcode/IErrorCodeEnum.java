package com.asia.internal.errcode;

/**
 * 状态码
 *
 * @author manco
 * @since 2019/03/11 15:08
 */
public interface IErrorCodeEnum {
    /**
     * 获取状态码
     * @return 状态码
     */
    public String getCode();
    /**
     * 获取提示信息
     * @return 提示信息
     */
    public String getMessage();
}
