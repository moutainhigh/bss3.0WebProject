package com.asia.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * VC_CHARGE_RECORD
 * @author 
 */
public class VcChargeRecord implements Serializable {
    private long paymentId;

    private String otherPaymentId;

    private String cardnumber;

    private BigDecimal rechargeflag;

    private String accNbr;

    private Integer userType;

    private Integer billType;

    private Date createdDate;

    private Date paymentDate;

    private BigDecimal amount;

    private String soRegionCode;

    private String isRegionCode;

    private String staffId;

    private String busiCode;

    private Short state;

    private String stsDate;

    private String unpayPaymentId;

    private String unpayOtherPaymentId;

    private String destinationattr;

    private String objtype;

    private String msg;

    private String rem1;

    private String rem2;

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

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public BigDecimal getRechargeflag() {
        return rechargeflag;
    }

    public void setRechargeflag(BigDecimal rechargeflag) {
        this.rechargeflag = rechargeflag;
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

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getStsDate() {
        return stsDate;
    }

    public void setStsDate(String stsDate) {
        this.stsDate = stsDate;
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

    public String getDestinationattr() {
        return destinationattr;
    }

    public void setDestinationattr(String destinationattr) {
        this.destinationattr = destinationattr;
    }

    public String getObjtype() {
        return objtype;
    }

    public void setObjtype(String objtype) {
        this.objtype = objtype;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRem1() {
        return rem1;
    }

    public void setRem1(String rem1) {
        this.rem1 = rem1;
    }

    public String getRem2() {
        return rem2;
    }

    public void setRem2(String rem2) {
        this.rem2 = rem2;
    }

}