package com.asia.domain.openApi.child;

public class BalanceTypeFlagQuery {

    private String balanceTypeFlag;/*0：通用余额 1：专用余额 2：用户级
                                     3：用户账目组级 4：账户账目组级*/
    private Integer balanceBegin;//上期末余额
    private Integer balanceIn;//本期入账
    private Integer balanceOut;//本期支出
    private Integer balanceEnd;//本期末余额

    public String getBalanceTypeFlag() {
        return balanceTypeFlag;
    }

    public void setBalanceTypeFlag(String balanceTypeFlag) {
        this.balanceTypeFlag = balanceTypeFlag;
    }

    public Integer getBalanceBegin() {
        return balanceBegin;
    }

    public void setBalanceBegin(Integer balanceBegin) {
        this.balanceBegin = balanceBegin;
    }

    public Integer getBalanceIn() {
        return balanceIn;
    }

    public void setBalanceIn(Integer balanceIn) {
        this.balanceIn = balanceIn;
    }

    public Integer getBalanceOut() {
        return balanceOut;
    }

    public void setBalanceOut(Integer balanceOut) {
        this.balanceOut = balanceOut;
    }

    public Integer getBalanceEnd() {
        return balanceEnd;
    }

    public void setBalanceEnd(Integer balanceEnd) {
        this.balanceEnd = balanceEnd;
    }
}
