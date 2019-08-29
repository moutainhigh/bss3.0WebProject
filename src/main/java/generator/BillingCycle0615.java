package generator;

import java.io.Serializable;
import java.util.Date;

/**
 * BILLING_CYCLE_0615
 * @author 
 */
public class BillingCycle0615 implements Serializable {
    private Integer billingCycleId;

    private Integer billingCycleTypeId;

    private Date cycleBeginDate;

    private Date cycleEndDate;

    private Date dueDate;

    private Date blockDate;

    private Integer lastBillingCycleId;

    private String state;

    private Date stateDate;

    private static final long serialVersionUID = 1L;

    public Integer getBillingCycleId() {
        return billingCycleId;
    }

    public void setBillingCycleId(Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    public Integer getBillingCycleTypeId() {
        return billingCycleTypeId;
    }

    public void setBillingCycleTypeId(Integer billingCycleTypeId) {
        this.billingCycleTypeId = billingCycleTypeId;
    }

    public Date getCycleBeginDate() {
        return cycleBeginDate;
    }

    public void setCycleBeginDate(Date cycleBeginDate) {
        this.cycleBeginDate = cycleBeginDate;
    }

    public Date getCycleEndDate() {
        return cycleEndDate;
    }

    public void setCycleEndDate(Date cycleEndDate) {
        this.cycleEndDate = cycleEndDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getBlockDate() {
        return blockDate;
    }

    public void setBlockDate(Date blockDate) {
        this.blockDate = blockDate;
    }

    public Integer getLastBillingCycleId() {
        return lastBillingCycleId;
    }

    public void setLastBillingCycleId(Integer lastBillingCycleId) {
        this.lastBillingCycleId = lastBillingCycleId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getStateDate() {
        return stateDate;
    }

    public void setStateDate(Date stateDate) {
        this.stateDate = stateDate;
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
        BillingCycle0615 other = (BillingCycle0615) that;
        return (this.getBillingCycleId() == null ? other.getBillingCycleId() == null : this.getBillingCycleId().equals(other.getBillingCycleId()))
            && (this.getBillingCycleTypeId() == null ? other.getBillingCycleTypeId() == null : this.getBillingCycleTypeId().equals(other.getBillingCycleTypeId()))
            && (this.getCycleBeginDate() == null ? other.getCycleBeginDate() == null : this.getCycleBeginDate().equals(other.getCycleBeginDate()))
            && (this.getCycleEndDate() == null ? other.getCycleEndDate() == null : this.getCycleEndDate().equals(other.getCycleEndDate()))
            && (this.getDueDate() == null ? other.getDueDate() == null : this.getDueDate().equals(other.getDueDate()))
            && (this.getBlockDate() == null ? other.getBlockDate() == null : this.getBlockDate().equals(other.getBlockDate()))
            && (this.getLastBillingCycleId() == null ? other.getLastBillingCycleId() == null : this.getLastBillingCycleId().equals(other.getLastBillingCycleId()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getStateDate() == null ? other.getStateDate() == null : this.getStateDate().equals(other.getStateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBillingCycleId() == null) ? 0 : getBillingCycleId().hashCode());
        result = prime * result + ((getBillingCycleTypeId() == null) ? 0 : getBillingCycleTypeId().hashCode());
        result = prime * result + ((getCycleBeginDate() == null) ? 0 : getCycleBeginDate().hashCode());
        result = prime * result + ((getCycleEndDate() == null) ? 0 : getCycleEndDate().hashCode());
        result = prime * result + ((getDueDate() == null) ? 0 : getDueDate().hashCode());
        result = prime * result + ((getBlockDate() == null) ? 0 : getBlockDate().hashCode());
        result = prime * result + ((getLastBillingCycleId() == null) ? 0 : getLastBillingCycleId().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getStateDate() == null) ? 0 : getStateDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", billingCycleId=").append(billingCycleId);
        sb.append(", billingCycleTypeId=").append(billingCycleTypeId);
        sb.append(", cycleBeginDate=").append(cycleBeginDate);
        sb.append(", cycleEndDate=").append(cycleEndDate);
        sb.append(", dueDate=").append(dueDate);
        sb.append(", blockDate=").append(blockDate);
        sb.append(", lastBillingCycleId=").append(lastBillingCycleId);
        sb.append(", state=").append(state);
        sb.append(", stateDate=").append(stateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}