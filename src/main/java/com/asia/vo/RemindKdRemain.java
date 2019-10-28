package com.asia.vo;

import com.asia.common.baseObj.BaseDomain;

import java.math.BigDecimal;

/**
 * REMIND_KD_REMAIN
 * @author 
 */
public class RemindKdRemain extends BaseDomain {
    private Long servId;

    private Long acctId;

    private String accNbr;

    private Integer offerId;

    private String offerName;

    private BigDecimal offerInstId;

    private Long dayRent;

    private Long curMonRent;

    private Long curBalance;

    private String expDate;

    private BigDecimal lastDays;

    private String stateDate;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getServId() {
        return servId;
    }

    public void setServId(Long servId) {
        this.servId = servId;
    }

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public String getAccNbr() {
        return accNbr;
    }

    public void setAccNbr(String accNbr) {
        this.accNbr = accNbr;
    }

    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public BigDecimal getOfferInstId() {
        return offerInstId;
    }

    public void setOfferInstId(BigDecimal offerInstId) {
        this.offerInstId = offerInstId;
    }

    public Long getDayRent() {
        return dayRent;
    }

    public void setDayRent(Long dayRent) {
        this.dayRent = dayRent;
    }

    public Long getCurMonRent() {
        return curMonRent;
    }

    public void setCurMonRent(Long curMonRent) {
        this.curMonRent = curMonRent;
    }

    public Long getCurBalance() {
        return curBalance;
    }

    public void setCurBalance(Long curBalance) {
        this.curBalance = curBalance;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public BigDecimal getLastDays() {
        return lastDays;
    }

    public void setLastDays(BigDecimal lastDays) {
        this.lastDays = lastDays;
    }

    public String getStateDate() {
        return stateDate;
    }

    public void setStateDate(String stateDate) {
        this.stateDate = stateDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        RemindKdRemain other = (RemindKdRemain) that;
        return (this.getServId() == null ? other.getServId() == null : this.getServId().equals(other.getServId()))
            && (this.getAcctId() == null ? other.getAcctId() == null : this.getAcctId().equals(other.getAcctId()))
            && (this.getAccNbr() == null ? other.getAccNbr() == null : this.getAccNbr().equals(other.getAccNbr()))
            && (this.getOfferId() == null ? other.getOfferId() == null : this.getOfferId().equals(other.getOfferId()))
            && (this.getOfferName() == null ? other.getOfferName() == null : this.getOfferName().equals(other.getOfferName()))
            && (this.getOfferInstId() == null ? other.getOfferInstId() == null : this.getOfferInstId().equals(other.getOfferInstId()))
            && (this.getDayRent() == null ? other.getDayRent() == null : this.getDayRent().equals(other.getDayRent()))
            && (this.getCurMonRent() == null ? other.getCurMonRent() == null : this.getCurMonRent().equals(other.getCurMonRent()))
            && (this.getCurBalance() == null ? other.getCurBalance() == null : this.getCurBalance().equals(other.getCurBalance()))
            && (this.getExpDate() == null ? other.getExpDate() == null : this.getExpDate().equals(other.getExpDate()))
            && (this.getLastDays() == null ? other.getLastDays() == null : this.getLastDays().equals(other.getLastDays()))
            && (this.getStateDate() == null ? other.getStateDate() == null : this.getStateDate().equals(other.getStateDate()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServId() == null) ? 0 : getServId().hashCode());
        result = prime * result + ((getAcctId() == null) ? 0 : getAcctId().hashCode());
        result = prime * result + ((getAccNbr() == null) ? 0 : getAccNbr().hashCode());
        result = prime * result + ((getOfferId() == null) ? 0 : getOfferId().hashCode());
        result = prime * result + ((getOfferName() == null) ? 0 : getOfferName().hashCode());
        result = prime * result + ((getOfferInstId() == null) ? 0 : getOfferInstId().hashCode());
        result = prime * result + ((getDayRent() == null) ? 0 : getDayRent().hashCode());
        result = prime * result + ((getCurMonRent() == null) ? 0 : getCurMonRent().hashCode());
        result = prime * result + ((getCurBalance() == null) ? 0 : getCurBalance().hashCode());
        result = prime * result + ((getExpDate() == null) ? 0 : getExpDate().hashCode());
        result = prime * result + ((getLastDays() == null) ? 0 : getLastDays().hashCode());
        result = prime * result + ((getStateDate() == null) ? 0 : getStateDate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", servId=").append(servId);
        sb.append(", acctId=").append(acctId);
        sb.append(", accNbr=").append(accNbr);
        sb.append(", offerId=").append(offerId);
        sb.append(", offerName=").append(offerName);
        sb.append(", offerInstId=").append(offerInstId);
        sb.append(", dayRent=").append(dayRent);
        sb.append(", curMonRent=").append(curMonRent);
        sb.append(", curBalance=").append(curBalance);
        sb.append(", expDate=").append(expDate);
        sb.append(", lastDays=").append(lastDays);
        sb.append(", stateDate=").append(stateDate);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}