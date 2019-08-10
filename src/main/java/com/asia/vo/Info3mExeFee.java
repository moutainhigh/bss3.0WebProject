package com.asia.vo;

import java.io.Serializable;

/**
 * INFO_3M_EXE_FEE
 * @author 
 */
public class Info3mExeFee implements Serializable {
    private Long servId;

    private String accNbr;

    private Long curCharge;

    private Long threeMonAvgCharge;

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

    public Long getCurCharge() {
        return curCharge;
    }

    public void setCurCharge(Long curCharge) {
        this.curCharge = curCharge;
    }

    public Long getThreeMonAvgCharge() {
        return threeMonAvgCharge;
    }

    public void setThreeMonAvgCharge(Long threeMonAvgCharge) {
        this.threeMonAvgCharge = threeMonAvgCharge;
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
        Info3mExeFee other = (Info3mExeFee) that;
        return (this.getServId() == null ? other.getServId() == null : this.getServId().equals(other.getServId()))
            && (this.getAccNbr() == null ? other.getAccNbr() == null : this.getAccNbr().equals(other.getAccNbr()))
            && (this.getCurCharge() == null ? other.getCurCharge() == null : this.getCurCharge().equals(other.getCurCharge()))
            && (this.getThreeMonAvgCharge() == null ? other.getThreeMonAvgCharge() == null : this.getThreeMonAvgCharge().equals(other.getThreeMonAvgCharge()))
            && (this.getAlarmDate() == null ? other.getAlarmDate() == null : this.getAlarmDate().equals(other.getAlarmDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServId() == null) ? 0 : getServId().hashCode());
        result = prime * result + ((getAccNbr() == null) ? 0 : getAccNbr().hashCode());
        result = prime * result + ((getCurCharge() == null) ? 0 : getCurCharge().hashCode());
        result = prime * result + ((getThreeMonAvgCharge() == null) ? 0 : getThreeMonAvgCharge().hashCode());
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
        sb.append(", curCharge=").append(curCharge);
        sb.append(", threeMonAvgCharge=").append(threeMonAvgCharge);
        sb.append(", alarmDate=").append(alarmDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}