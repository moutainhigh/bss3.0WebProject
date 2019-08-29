package generator;

import java.io.Serializable;
import java.util.Date;

/**
 * E_CHANNL_METER_PRINT_LOG
 * @author 
 */
public class EChannlMeterPrintLog implements Serializable {
    private String keyId;

    private String phoneId;

    private String systemId;

    private String actionType;

    private String actionRemark;

    private Date actionDate;

    private String regionCode;

    private String printMonth;

    private Date validDate;

    private Date expirDate;

    private String terminalId;

    private String opId;

    private String serialId;

    private static final long serialVersionUID = 1L;

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionRemark() {
        return actionRemark;
    }

    public void setActionRemark(String actionRemark) {
        this.actionRemark = actionRemark;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getPrintMonth() {
        return printMonth;
    }

    public void setPrintMonth(String printMonth) {
        this.printMonth = printMonth;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Date getExpirDate() {
        return expirDate;
    }

    public void setExpirDate(Date expirDate) {
        this.expirDate = expirDate;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
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
        EChannlMeterPrintLog other = (EChannlMeterPrintLog) that;
        return (this.getKeyId() == null ? other.getKeyId() == null : this.getKeyId().equals(other.getKeyId()))
            && (this.getPhoneId() == null ? other.getPhoneId() == null : this.getPhoneId().equals(other.getPhoneId()))
            && (this.getSystemId() == null ? other.getSystemId() == null : this.getSystemId().equals(other.getSystemId()))
            && (this.getActionType() == null ? other.getActionType() == null : this.getActionType().equals(other.getActionType()))
            && (this.getActionRemark() == null ? other.getActionRemark() == null : this.getActionRemark().equals(other.getActionRemark()))
            && (this.getActionDate() == null ? other.getActionDate() == null : this.getActionDate().equals(other.getActionDate()))
            && (this.getRegionCode() == null ? other.getRegionCode() == null : this.getRegionCode().equals(other.getRegionCode()))
            && (this.getPrintMonth() == null ? other.getPrintMonth() == null : this.getPrintMonth().equals(other.getPrintMonth()))
            && (this.getValidDate() == null ? other.getValidDate() == null : this.getValidDate().equals(other.getValidDate()))
            && (this.getExpirDate() == null ? other.getExpirDate() == null : this.getExpirDate().equals(other.getExpirDate()))
            && (this.getTerminalId() == null ? other.getTerminalId() == null : this.getTerminalId().equals(other.getTerminalId()))
            && (this.getOpId() == null ? other.getOpId() == null : this.getOpId().equals(other.getOpId()))
            && (this.getSerialId() == null ? other.getSerialId() == null : this.getSerialId().equals(other.getSerialId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        result = prime * result + ((getPhoneId() == null) ? 0 : getPhoneId().hashCode());
        result = prime * result + ((getSystemId() == null) ? 0 : getSystemId().hashCode());
        result = prime * result + ((getActionType() == null) ? 0 : getActionType().hashCode());
        result = prime * result + ((getActionRemark() == null) ? 0 : getActionRemark().hashCode());
        result = prime * result + ((getActionDate() == null) ? 0 : getActionDate().hashCode());
        result = prime * result + ((getRegionCode() == null) ? 0 : getRegionCode().hashCode());
        result = prime * result + ((getPrintMonth() == null) ? 0 : getPrintMonth().hashCode());
        result = prime * result + ((getValidDate() == null) ? 0 : getValidDate().hashCode());
        result = prime * result + ((getExpirDate() == null) ? 0 : getExpirDate().hashCode());
        result = prime * result + ((getTerminalId() == null) ? 0 : getTerminalId().hashCode());
        result = prime * result + ((getOpId() == null) ? 0 : getOpId().hashCode());
        result = prime * result + ((getSerialId() == null) ? 0 : getSerialId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", keyId=").append(keyId);
        sb.append(", phoneId=").append(phoneId);
        sb.append(", systemId=").append(systemId);
        sb.append(", actionType=").append(actionType);
        sb.append(", actionRemark=").append(actionRemark);
        sb.append(", actionDate=").append(actionDate);
        sb.append(", regionCode=").append(regionCode);
        sb.append(", printMonth=").append(printMonth);
        sb.append(", validDate=").append(validDate);
        sb.append(", expirDate=").append(expirDate);
        sb.append(", terminalId=").append(terminalId);
        sb.append(", opId=").append(opId);
        sb.append(", serialId=").append(serialId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}