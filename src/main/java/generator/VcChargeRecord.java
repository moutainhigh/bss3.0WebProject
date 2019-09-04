package generator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * VC_CHARGE_RECORD
 * @author 
 */
public class VcChargeRecord implements Serializable {
    private BigDecimal paymentId;

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

    public BigDecimal getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(BigDecimal paymentId) {
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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        VcChargeRecord other = (VcChargeRecord) that;
        return (this.getPaymentId() == null ? other.getPaymentId() == null : this.getPaymentId().equals(other.getPaymentId()))
            && (this.getOtherPaymentId() == null ? other.getOtherPaymentId() == null : this.getOtherPaymentId().equals(other.getOtherPaymentId()))
            && (this.getCardnumber() == null ? other.getCardnumber() == null : this.getCardnumber().equals(other.getCardnumber()))
            && (this.getRechargeflag() == null ? other.getRechargeflag() == null : this.getRechargeflag().equals(other.getRechargeflag()))
            && (this.getAccNbr() == null ? other.getAccNbr() == null : this.getAccNbr().equals(other.getAccNbr()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getBillType() == null ? other.getBillType() == null : this.getBillType().equals(other.getBillType()))
            && (this.getCreatedDate() == null ? other.getCreatedDate() == null : this.getCreatedDate().equals(other.getCreatedDate()))
            && (this.getPaymentDate() == null ? other.getPaymentDate() == null : this.getPaymentDate().equals(other.getPaymentDate()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getSoRegionCode() == null ? other.getSoRegionCode() == null : this.getSoRegionCode().equals(other.getSoRegionCode()))
            && (this.getIsRegionCode() == null ? other.getIsRegionCode() == null : this.getIsRegionCode().equals(other.getIsRegionCode()))
            && (this.getStaffId() == null ? other.getStaffId() == null : this.getStaffId().equals(other.getStaffId()))
            && (this.getBusiCode() == null ? other.getBusiCode() == null : this.getBusiCode().equals(other.getBusiCode()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getStsDate() == null ? other.getStsDate() == null : this.getStsDate().equals(other.getStsDate()))
            && (this.getUnpayPaymentId() == null ? other.getUnpayPaymentId() == null : this.getUnpayPaymentId().equals(other.getUnpayPaymentId()))
            && (this.getUnpayOtherPaymentId() == null ? other.getUnpayOtherPaymentId() == null : this.getUnpayOtherPaymentId().equals(other.getUnpayOtherPaymentId()))
            && (this.getDestinationattr() == null ? other.getDestinationattr() == null : this.getDestinationattr().equals(other.getDestinationattr()))
            && (this.getObjtype() == null ? other.getObjtype() == null : this.getObjtype().equals(other.getObjtype()))
            && (this.getMsg() == null ? other.getMsg() == null : this.getMsg().equals(other.getMsg()))
            && (this.getRem1() == null ? other.getRem1() == null : this.getRem1().equals(other.getRem1()))
            && (this.getRem2() == null ? other.getRem2() == null : this.getRem2().equals(other.getRem2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPaymentId() == null) ? 0 : getPaymentId().hashCode());
        result = prime * result + ((getOtherPaymentId() == null) ? 0 : getOtherPaymentId().hashCode());
        result = prime * result + ((getCardnumber() == null) ? 0 : getCardnumber().hashCode());
        result = prime * result + ((getRechargeflag() == null) ? 0 : getRechargeflag().hashCode());
        result = prime * result + ((getAccNbr() == null) ? 0 : getAccNbr().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getBillType() == null) ? 0 : getBillType().hashCode());
        result = prime * result + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        result = prime * result + ((getPaymentDate() == null) ? 0 : getPaymentDate().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getSoRegionCode() == null) ? 0 : getSoRegionCode().hashCode());
        result = prime * result + ((getIsRegionCode() == null) ? 0 : getIsRegionCode().hashCode());
        result = prime * result + ((getStaffId() == null) ? 0 : getStaffId().hashCode());
        result = prime * result + ((getBusiCode() == null) ? 0 : getBusiCode().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getStsDate() == null) ? 0 : getStsDate().hashCode());
        result = prime * result + ((getUnpayPaymentId() == null) ? 0 : getUnpayPaymentId().hashCode());
        result = prime * result + ((getUnpayOtherPaymentId() == null) ? 0 : getUnpayOtherPaymentId().hashCode());
        result = prime * result + ((getDestinationattr() == null) ? 0 : getDestinationattr().hashCode());
        result = prime * result + ((getObjtype() == null) ? 0 : getObjtype().hashCode());
        result = prime * result + ((getMsg() == null) ? 0 : getMsg().hashCode());
        result = prime * result + ((getRem1() == null) ? 0 : getRem1().hashCode());
        result = prime * result + ((getRem2() == null) ? 0 : getRem2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paymentId=").append(paymentId);
        sb.append(", otherPaymentId=").append(otherPaymentId);
        sb.append(", cardnumber=").append(cardnumber);
        sb.append(", rechargeflag=").append(rechargeflag);
        sb.append(", accNbr=").append(accNbr);
        sb.append(", userType=").append(userType);
        sb.append(", billType=").append(billType);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", paymentDate=").append(paymentDate);
        sb.append(", amount=").append(amount);
        sb.append(", soRegionCode=").append(soRegionCode);
        sb.append(", isRegionCode=").append(isRegionCode);
        sb.append(", staffId=").append(staffId);
        sb.append(", busiCode=").append(busiCode);
        sb.append(", state=").append(state);
        sb.append(", stsDate=").append(stsDate);
        sb.append(", unpayPaymentId=").append(unpayPaymentId);
        sb.append(", unpayOtherPaymentId=").append(unpayOtherPaymentId);
        sb.append(", destinationattr=").append(destinationattr);
        sb.append(", objtype=").append(objtype);
        sb.append(", msg=").append(msg);
        sb.append(", rem1=").append(rem1);
        sb.append(", rem2=").append(rem2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}