package com.asia.vo;

import com.asia.common.baseObj.BaseDomain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * TERMINAL_CHARGE_RECORD
 * @author 
 */
public class TerminalChargeRecord extends BaseDomain {
    private long paymentId;

    private String otherPaymentId;

    private String accNbr;

    private Integer userType;

    private Integer billType;

    private Date createdDate;

    private Date paymentDate;

    private BigDecimal amount;

    private Short state;

    private String soRegionCode;

    private String isRegionCode;

    private String staffId;

    private String busiCode;

    private String msg;

    private String unpayPaymentId;

    private String unpayOtherPaymentId;

    private String stsDate;

    private String terminalId;

    private String rem2;

    private String rem3;

    private String rem4;

    private static final long serialVersionUID = 1L;

    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public String getOtherPaymentId() {
        return otherPaymentId;
    }

    public void setOtherPaymentId(String otherPaymentId) {
        this.otherPaymentId = otherPaymentId;
    }

    public String getAccNbr() {
        return accNbr;
    }

    public void setAccNbr(String accNbr) {
        this.accNbr = accNbr;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getSoRegionCode() {
        return soRegionCode;
    }

    public void setSoRegionCode(String soRegionCode) {
        this.soRegionCode = soRegionCode;
    }

    public String getIsRegionCode() {
        return isRegionCode;
    }

    public void setIsRegionCode(String isRegionCode) {
        this.isRegionCode = isRegionCode;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getBusiCode() {
        return busiCode;
    }

    public void setBusiCode(String busiCode) {
        this.busiCode = busiCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUnpayPaymentId() {
        return unpayPaymentId;
    }

    public void setUnpayPaymentId(String unpayPaymentId) {
        this.unpayPaymentId = unpayPaymentId;
    }

    public String getUnpayOtherPaymentId() {
        return unpayOtherPaymentId;
    }

    public void setUnpayOtherPaymentId(String unpayOtherPaymentId) {
        this.unpayOtherPaymentId = unpayOtherPaymentId;
    }

    public String getStsDate() {
        return stsDate;
    }

    public void setStsDate(String stsDate) {
        this.stsDate = stsDate;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getRem2() {
        return rem2;
    }

    public void setRem2(String rem2) {
        this.rem2 = rem2;
    }

    public String getRem3() {
        return rem3;
    }

    public void setRem3(String rem3) {
        this.rem3 = rem3;
    }

    public String getRem4() {
        return rem4;
    }

    public void setRem4(String rem4) {
        this.rem4 = rem4;
    }

}