package generator;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * IF_USER_METER
 * @author 
 */
public class IfUserMeter implements Serializable {
    private BigDecimal servId;

    private BigDecimal regionCode;

    private BigDecimal forbidStatus;

    private static final long serialVersionUID = 1L;

    public BigDecimal getServId() {
        return servId;
    }

    public void setServId(BigDecimal servId) {
        this.servId = servId;
    }

    public BigDecimal getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(BigDecimal regionCode) {
        this.regionCode = regionCode;
    }

    public BigDecimal getForbidStatus() {
        return forbidStatus;
    }

    public void setForbidStatus(BigDecimal forbidStatus) {
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