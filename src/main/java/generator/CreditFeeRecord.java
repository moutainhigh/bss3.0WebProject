package generator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * CREDIT_FEE_RECORD
 * @author 
 */
public class CreditFeeRecord implements Serializable {
    private BigDecimal paymentId;

    private String otherPaymentId;

    private String acctId;

    private String accNbr;

    private Date createdDate;

    private Date paymentDate;

    private BigDecimal amount;

    private Short state;

    private String staffId;

    private String busiCode;

    private String msg;

    private String rem1;

    private String rem2;

    private String rem3;

    private String rem4;

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

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getAccNbr() {
        return accNbr;
    }

    public void setAccNbr(String accNbr) {
        this.accNbr = accNbr;
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
        CreditFeeRecord other = (CreditFeeRecord) that;
        return (this.getPaymentId() == null ? other.getPaymentId() == null : this.getPaymentId().equals(other.getPaymentId()))
            && (this.getOtherPaymentId() == null ? other.getOtherPaymentId() == null : this.getOtherPaymentId().equals(other.getOtherPaymentId()))
            && (this.getAcctId() == null ? other.getAcctId() == null : this.getAcctId().equals(other.getAcctId()))
            && (this.getAccNbr() == null ? other.getAccNbr() == null : this.getAccNbr().equals(other.getAccNbr()))
            && (this.getCreatedDate() == null ? other.getCreatedDate() == null : this.getCreatedDate().equals(other.getCreatedDate()))
            && (this.getPaymentDate() == null ? other.getPaymentDate() == null : this.getPaymentDate().equals(other.getPaymentDate()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getStaffId() == null ? other.getStaffId() == null : this.getStaffId().equals(other.getStaffId()))
            && (this.getBusiCode() == null ? other.getBusiCode() == null : this.getBusiCode().equals(other.getBusiCode()))
            && (this.getMsg() == null ? other.getMsg() == null : this.getMsg().equals(other.getMsg()))
            && (this.getRem1() == null ? other.getRem1() == null : this.getRem1().equals(other.getRem1()))
            && (this.getRem2() == null ? other.getRem2() == null : this.getRem2().equals(other.getRem2()))
            && (this.getRem3() == null ? other.getRem3() == null : this.getRem3().equals(other.getRem3()))
            && (this.getRem4() == null ? other.getRem4() == null : this.getRem4().equals(other.getRem4()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPaymentId() == null) ? 0 : getPaymentId().hashCode());
        result = prime * result + ((getOtherPaymentId() == null) ? 0 : getOtherPaymentId().hashCode());
        result = prime * result + ((getAcctId() == null) ? 0 : getAcctId().hashCode());
        result = prime * result + ((getAccNbr() == null) ? 0 : getAccNbr().hashCode());
        result = prime * result + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        result = prime * result + ((getPaymentDate() == null) ? 0 : getPaymentDate().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getStaffId() == null) ? 0 : getStaffId().hashCode());
        result = prime * result + ((getBusiCode() == null) ? 0 : getBusiCode().hashCode());
        result = prime * result + ((getMsg() == null) ? 0 : getMsg().hashCode());
        result = prime * result + ((getRem1() == null) ? 0 : getRem1().hashCode());
        result = prime * result + ((getRem2() == null) ? 0 : getRem2().hashCode());
        result = prime * result + ((getRem3() == null) ? 0 : getRem3().hashCode());
        result = prime * result + ((getRem4() == null) ? 0 : getRem4().hashCode());
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
        sb.append(", acctId=").append(acctId);
        sb.append(", accNbr=").append(accNbr);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", paymentDate=").append(paymentDate);
        sb.append(", amount=").append(amount);
        sb.append(", state=").append(state);
        sb.append(", staffId=").append(staffId);
        sb.append(", busiCode=").append(busiCode);
        sb.append(", msg=").append(msg);
        sb.append(", rem1=").append(rem1);
        sb.append(", rem2=").append(rem2);
        sb.append(", rem3=").append(rem3);
        sb.append(", rem4=").append(rem4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}