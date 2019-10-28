package com.asia.vo;

import com.asia.common.baseObj.BaseDomain;

import java.math.BigDecimal;

/**
 * INFO_ACCU_2_SERVICE
 * @author 
 */
public class InfoAccu2Service extends BaseDomain {
    private Long servId;

    private String accNbr;

    private BigDecimal totalStream;

    private BigDecimal curStream;

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

    public BigDecimal getTotalStream() {
        return totalStream;
    }

    public void setTotalStream(BigDecimal totalStream) {
        this.totalStream = totalStream;
    }

    public BigDecimal getCurStream() {
        return curStream;
    }

    public void setCurStream(BigDecimal curStream) {
        this.curStream = curStream;
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
        InfoAccu2Service other = (InfoAccu2Service) that;
        return (this.getServId() == null ? other.getServId() == null : this.getServId().equals(other.getServId()))
            && (this.getAccNbr() == null ? other.getAccNbr() == null : this.getAccNbr().equals(other.getAccNbr()))
            && (this.getTotalStream() == null ? other.getTotalStream() == null : this.getTotalStream().equals(other.getTotalStream()))
            && (this.getCurStream() == null ? other.getCurStream() == null : this.getCurStream().equals(other.getCurStream()))
            && (this.getAlarmDate() == null ? other.getAlarmDate() == null : this.getAlarmDate().equals(other.getAlarmDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServId() == null) ? 0 : getServId().hashCode());
        result = prime * result + ((getAccNbr() == null) ? 0 : getAccNbr().hashCode());
        result = prime * result + ((getTotalStream() == null) ? 0 : getTotalStream().hashCode());
        result = prime * result + ((getCurStream() == null) ? 0 : getCurStream().hashCode());
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
        sb.append(", totalStream=").append(totalStream);
        sb.append(", curStream=").append(curStream);
        sb.append(", alarmDate=").append(alarmDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}