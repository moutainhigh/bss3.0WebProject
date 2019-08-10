package com.asia.vo;

import java.io.Serializable;

/**
 * INFO_HIGH_FEE_QUE
 * @author 
 */
public class InfoHighFeeQue implements Serializable {
    private Long servId;

    private String accNbr;

    private Short itemGroupId;

    private Long charge;

    private String alarmDate;

    private static final long serialVersionUID = 1L;

    public Long getServId() {
        return servId;
    }

    public void setServId(Long servId) {
        this.servId = servId;
    }

    public String getAccNbr() {
        return accNbr;
    }

    public void setAccNbr(String accNbr) {
        this.accNbr = accNbr;
    }

    public Short getItemGroupId() {
        return itemGroupId;
    }

    public void setItemGroupId(Short itemGroupId) {
        this.itemGroupId = itemGroupId;
    }

    public Long getCharge() {
        return charge;
    }

    public void setCharge(Long charge) {
        this.charge = charge;
    }

    public String getAlarmDate() {
        return alarmDate;
    }

    public void setAlarmDate(String alarmDate) {
        this.alarmDate = alarmDate;
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
        InfoHighFeeQue other = (InfoHighFeeQue) that;
        return (this.getServId() == null ? other.getServId() == null : this.getServId().equals(other.getServId()))
            && (this.getAccNbr() == null ? other.getAccNbr() == null : this.getAccNbr().equals(other.getAccNbr()))
            && (this.getItemGroupId() == null ? other.getItemGroupId() == null : this.getItemGroupId().equals(other.getItemGroupId()))
            && (this.getCharge() == null ? other.getCharge() == null : this.getCharge().equals(other.getCharge()))
            && (this.getAlarmDate() == null ? other.getAlarmDate() == null : this.getAlarmDate().equals(other.getAlarmDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServId() == null) ? 0 : getServId().hashCode());
        result = prime * result + ((getAccNbr() == null) ? 0 : getAccNbr().hashCode());
        result = prime * result + ((getItemGroupId() == null) ? 0 : getItemGroupId().hashCode());
        result = prime * result + ((getCharge() == null) ? 0 : getCharge().hashCode());
        result = prime * result + ((getAlarmDate() == null) ? 0 : getAlarmDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", servId=").append(servId);
        sb.append(", accNbr=").append(accNbr);
        sb.append(", itemGroupId=").append(itemGroupId);
        sb.append(", charge=").append(charge);
        sb.append(", alarmDate=").append(alarmDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}