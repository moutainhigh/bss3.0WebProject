package com.asia.vo;

import com.asia.common.baseObj.BaseDomain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * INFO_HD_USER_FEE
 * @author 
 */
public class InfoHdUserFee extends BaseDomain {
    private Long offerId;

    private Long prodId;

    private String offerType;

    private Date offerStartDate;

    private BigDecimal billTotalFee;

    private String crmTotalFee;

    private String endType;

    private Short rentMonth;

    private Long offerSpecId;

    private static final long serialVersionUID = 1L;

    public Long getOfferId() {
        return offerId;
    }

    public void setOfferId(Long offerId) {
        this.offerId = offerId;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public Date getOfferStartDate() {
        return offerStartDate;
    }

    public void setOfferStartDate(Date offerStartDate) {
        this.offerStartDate = offerStartDate;
    }

    public BigDecimal getBillTotalFee() {
        return billTotalFee;
    }

    public void setBillTotalFee(BigDecimal billTotalFee) {
        this.billTotalFee = billTotalFee;
    }

    public String getCrmTotalFee() {
        return crmTotalFee;
    }

    public void setCrmTotalFee(String crmTotalFee) {
        this.crmTotalFee = crmTotalFee;
    }

    public String getEndType() {
        return endType;
    }

    public void setEndType(String endType) {
        this.endType = endType;
    }

    public Short getRentMonth() {
        return rentMonth;
    }

    public void setRentMonth(Short rentMonth) {
        this.rentMonth = rentMonth;
    }

    public Long getOfferSpecId() {
        return offerSpecId;
    }

    public void setOfferSpecId(Long offerSpecId) {
        this.offerSpecId = offerSpecId;
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
        InfoHdUserFee other = (InfoHdUserFee) that;
        return (this.getOfferId() == null ? other.getOfferId() == null : this.getOfferId().equals(other.getOfferId()))
            && (this.getProdId() == null ? other.getProdId() == null : this.getProdId().equals(other.getProdId()))
            && (this.getOfferType() == null ? other.getOfferType() == null : this.getOfferType().equals(other.getOfferType()))
            && (this.getOfferStartDate() == null ? other.getOfferStartDate() == null : this.getOfferStartDate().equals(other.getOfferStartDate()))
            && (this.getBillTotalFee() == null ? other.getBillTotalFee() == null : this.getBillTotalFee().equals(other.getBillTotalFee()))
            && (this.getCrmTotalFee() == null ? other.getCrmTotalFee() == null : this.getCrmTotalFee().equals(other.getCrmTotalFee()))
            && (this.getEndType() == null ? other.getEndType() == null : this.getEndType().equals(other.getEndType()))
            && (this.getRentMonth() == null ? other.getRentMonth() == null : this.getRentMonth().equals(other.getRentMonth()))
            && (this.getOfferSpecId() == null ? other.getOfferSpecId() == null : this.getOfferSpecId().equals(other.getOfferSpecId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOfferId() == null) ? 0 : getOfferId().hashCode());
        result = prime * result + ((getProdId() == null) ? 0 : getProdId().hashCode());
        result = prime * result + ((getOfferType() == null) ? 0 : getOfferType().hashCode());
        result = prime * result + ((getOfferStartDate() == null) ? 0 : getOfferStartDate().hashCode());
        result = prime * result + ((getBillTotalFee() == null) ? 0 : getBillTotalFee().hashCode());
        result = prime * result + ((getCrmTotalFee() == null) ? 0 : getCrmTotalFee().hashCode());
        result = prime * result + ((getEndType() == null) ? 0 : getEndType().hashCode());
        result = prime * result + ((getRentMonth() == null) ? 0 : getRentMonth().hashCode());
        result = prime * result + ((getOfferSpecId() == null) ? 0 : getOfferSpecId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", offerId=").append(offerId);
        sb.append(", prodId=").append(prodId);
        sb.append(", offerType=").append(offerType);
        sb.append(", offerStartDate=").append(offerStartDate);
        sb.append(", billTotalFee=").append(billTotalFee);
        sb.append(", crmTotalFee=").append(crmTotalFee);
        sb.append(", endType=").append(endType);
        sb.append(", rentMonth=").append(rentMonth);
        sb.append(", offerSpecId=").append(offerSpecId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}