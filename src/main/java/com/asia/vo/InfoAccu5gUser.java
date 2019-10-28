package com.asia.vo;

import com.asia.common.baseObj.BaseDomain;

import java.math.BigDecimal;

/**
 * INFO_ACCU_5G_USER
 * @author 
 */
public class InfoAccu5gUser extends BaseDomain {
    private Long servId;

    private String accNbr;

    private BigDecimal dayStream;

    private String execDay;

    private BigDecimal totalStream;

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

    public BigDecimal getDayStream() {
        return dayStream;
    }

    public void setDayStream(BigDecimal dayStream) {
        this.dayStream = dayStream;
    }

    public String getExecDay() {
        return execDay;
    }

    public void setExecDay(String execDay) {
        this.execDay = execDay;
    }

    public BigDecimal getTotalStream() {
        return totalStream;
    }

    public void setTotalStream(BigDecimal totalStream) {
        this.totalStream = totalStream;
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
        InfoAccu5gUser other = (InfoAccu5gUser) that;
        return (this.getServId() == null ? other.getServId() == null : this.getServId().equals(other.getServId()))
            && (this.getAccNbr() == null ? other.getAccNbr() == null : this.getAccNbr().equals(other.getAccNbr()))
            && (this.getDayStream() == null ? other.getDayStream() == null : this.getDayStream().equals(other.getDayStream()))
            && (this.getExecDay() == null ? other.getExecDay() == null : this.getExecDay().equals(other.getExecDay()))
            && (this.getTotalStream() == null ? other.getTotalStream() == null : this.getTotalStream().equals(other.getTotalStream()))
            && (this.getAlarmDate() == null ? other.getAlarmDate() == null : this.getAlarmDate().equals(other.getAlarmDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServId() == null) ? 0 : getServId().hashCode());
        result = prime * result + ((getAccNbr() == null) ? 0 : getAccNbr().hashCode());
        result = prime * result + ((getDayStream() == null) ? 0 : getDayStream().hashCode());
        result = prime * result + ((getExecDay() == null) ? 0 : getExecDay().hashCode());
        result = prime * result + ((getTotalStream() == null) ? 0 : getTotalStream().hashCode());
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
        sb.append(", dayStream=").append(dayStream);
        sb.append(", execDay=").append(execDay);
        sb.append(", totalStream=").append(totalStream);
        sb.append(", alarmDate=").append(alarmDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}