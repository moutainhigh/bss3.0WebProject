package com.asia.domain.plcaApi;

/**
 * @author WangBaoQiang
 * @ClassName: OtherRemindRes
 * @description: TODO
 * @date 2019/10/614:24
 * @Version 1.0
 */
public class OtherRemindRes {
    /**
     * resultMsg : 入表成功！
     * stateDate : 20191006141221
     * state : 1
     * resultCode : 1
     */

    private String resultMsg;
    private String stateDate;
    private int state;
    private int resultCode;

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getStateDate() {
        return stateDate;
    }

    public void setStateDate(String stateDate) {
        this.stateDate = stateDate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }
}
