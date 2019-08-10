package com.asia.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * INFO_NO_ACCU_2_SERVICE
 * @author 
 */
public class InfoNoAccu2Service implements Serializable {
    private Long servId;

    private String accNbr;

    private String statMonth;

    private BigDecimal monthStream;

    private BigDecimal monthCharge;

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

    public String getStatMonth() {
        return statMonth;
    }

    public void setStatMonth(String statMonth) {
        this.statMonth = statMonth;
    }

    public BigDecimal getMonthStream() {
        return monthStream;
    }

    public void setMonthStream(BigDecimal monthStream) {
        this.monthStream = monthStream;
    }

    public BigDecimal getMonthCharge() {
        return monthCharge;
    }

    public void setMonthCharge(BigDecimal monthCharge) {
        this.monthCharge = monthCharge;
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
        InfoNoAccu2Service other = (InfoNoAccu2Service) that;
        return (this.getServId() == null ? other.getServId() == null : this.getServId().equals(other.getServId()))
            && (this.getAccNbr() == null ? other.getAccNbr() == null : this.getAccNbr().equals(other.getAccNbr()))
            && (this.getStatMonth() == null ? other.getStatMonth() == null : this.getStatMonth().equals(other.getStatMonth()))
            && (this.getMonthStream() == null ? other.getMonthStream() == null : this.getMonthStream().equals(other.getMonthStream()))
            && (this.getMonthCharge() == null ? other.getMonthCharge() == null : this.getMonthCharge().equals(other.getMonthCharge()))
            && (this.getAlarmDate() == null ? other.getAlarmDate() == null : this.getAlarmDate().equals(other.getAlarmDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServId() == null) ? 0 : getServId().hashCode());
        result = prime * result + ((getAccNbr() == null) ? 0 : getAccNbr().hashCode());
        result = prime * result + ((getStatMonth() == null) ? 0 : getStatMonth().hashCode());
        result = prime * result + ((getMonthStream() == null) ? 0 : getMonthStream().hashCode());
        result = prime * result + ((getMonthCharge() == null) ? 0 : getMonthCharge().hashCode());
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
        sb.append(", statMonth=").append(statMonth);
        sb.append(", monthStream=").append(monthStream);
        sb.append(", monthCharge=").append(monthCharge);
        sb.append(", alarmDate=").append(alarmDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}