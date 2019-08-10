package com.asia.vo;

import java.io.Serializable;

/**
 * IF_USER_METER
 * @author 
 */
public class IfUserMeter implements Serializable {
    private String servId;

    private String regionCode;

    private String forbidStatus;

    private static final long serialVersionUID = 1L;

    public String getServId() {
        return servId;
    }

    public void setServId(String servId) {
        this.servId = servId;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getForbidStatus() {
        return forbidStatus;
    }

    public void setForbidStatus(String forbidStatus) {
        this.forbidStatus = forbidStatus;
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
        IfUserMeter other = (IfUserMeter) that;
        return (this.getServId() == null ? other.getServId() == null : this.getServId().equals(other.getServId()))
            && (this.getRegionCode() == null ? other.getRegionCode() == null : this.getRegionCode().equals(other.getRegionCode()))
            && (this.getForbidStatus() == null ? other.getForbidStatus() == null : this.getForbidStatus().equals(other.getForbidStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServId() == null) ? 0 : getServId().hashCode());
        result = prime * result + ((getRegionCode() == null) ? 0 : getRegionCode().hashCode());
        result = prime * result + ((getForbidStatus() == null) ? 0 : getForbidStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", servId=").append(servId);
        sb.append(", regionCode=").append(regionCode);
        sb.append(", forbidStatus=").append(forbidStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}