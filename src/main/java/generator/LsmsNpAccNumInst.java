package generator;

import java.io.Serializable;
import java.util.Date;

/**
 * lsms_np_acc_num_inst
 * @author 
 */
public class LsmsNpAccNumInst implements Serializable {
    private Long npAccNumInstId;

    private String accNum;

    private String inNetwork;

    private String outNetwork;

    private String ownNetnetwork;

    private Date effDate;

    private Date expDate;

    private Long createStaff;

    private Long updateStaff;

    private Date createDate;

    private Date updateDate;

    private Date statusDate;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getNpAccNumInstId() {
        return npAccNumInstId;
    }

    public void setNpAccNumInstId(Long npAccNumInstId) {
        this.npAccNumInstId = npAccNumInstId;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getInNetwork() {
        return inNetwork;
    }

    public void setInNetwork(String inNetwork) {
        this.inNetwork = inNetwork;
    }

    public String getOutNetwork() {
        return outNetwork;
    }

    public void setOutNetwork(String outNetwork) {
        this.outNetwork = outNetwork;
    }

    public String getOwnNetnetwork() {
        return ownNetnetwork;
    }

    public void setOwnNetnetwork(String ownNetnetwork) {
        this.ownNetnetwork = ownNetnetwork;
    }

    public Date getEffDate() {
        return effDate;
    }

    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Long getCreateStaff() {
        return createStaff;
    }

    public void setCreateStaff(Long createStaff) {
        this.createStaff = createStaff;
    }

    public Long getUpdateStaff() {
        return updateStaff;
    }

    public void setUpdateStaff(Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        LsmsNpAccNumInst other = (LsmsNpAccNumInst) that;
        return (this.getNpAccNumInstId() == null ? other.getNpAccNumInstId() == null : this.getNpAccNumInstId().equals(other.getNpAccNumInstId()))
            && (this.getAccNum() == null ? other.getAccNum() == null : this.getAccNum().equals(other.getAccNum()))
            && (this.getInNetwork() == null ? other.getInNetwork() == null : this.getInNetwork().equals(other.getInNetwork()))
            && (this.getOutNetwork() == null ? other.getOutNetwork() == null : this.getOutNetwork().equals(other.getOutNetwork()))
            && (this.getOwnNetnetwork() == null ? other.getOwnNetnetwork() == null : this.getOwnNetnetwork().equals(other.getOwnNetnetwork()))
            && (this.getEffDate() == null ? other.getEffDate() == null : this.getEffDate().equals(other.getEffDate()))
            && (this.getExpDate() == null ? other.getExpDate() == null : this.getExpDate().equals(other.getExpDate()))
            && (this.getCreateStaff() == null ? other.getCreateStaff() == null : this.getCreateStaff().equals(other.getCreateStaff()))
            && (this.getUpdateStaff() == null ? other.getUpdateStaff() == null : this.getUpdateStaff().equals(other.getUpdateStaff()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getStatusDate() == null ? other.getStatusDate() == null : this.getStatusDate().equals(other.getStatusDate()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNpAccNumInstId() == null) ? 0 : getNpAccNumInstId().hashCode());
        result = prime * result + ((getAccNum() == null) ? 0 : getAccNum().hashCode());
        result = prime * result + ((getInNetwork() == null) ? 0 : getInNetwork().hashCode());
        result = prime * result + ((getOutNetwork() == null) ? 0 : getOutNetwork().hashCode());
        result = prime * result + ((getOwnNetnetwork() == null) ? 0 : getOwnNetnetwork().hashCode());
        result = prime * result + ((getEffDate() == null) ? 0 : getEffDate().hashCode());
        result = prime * result + ((getExpDate() == null) ? 0 : getExpDate().hashCode());
        result = prime * result + ((getCreateStaff() == null) ? 0 : getCreateStaff().hashCode());
        result = prime * result + ((getUpdateStaff() == null) ? 0 : getUpdateStaff().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getStatusDate() == null) ? 0 : getStatusDate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", npAccNumInstId=").append(npAccNumInstId);
        sb.append(", accNum=").append(accNum);
        sb.append(", inNetwork=").append(inNetwork);
        sb.append(", outNetwork=").append(outNetwork);
        sb.append(", ownNetnetwork=").append(ownNetnetwork);
        sb.append(", effDate=").append(effDate);
        sb.append(", expDate=").append(expDate);
        sb.append(", createStaff=").append(createStaff);
        sb.append(", updateStaff=").append(updateStaff);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", statusDate=").append(statusDate);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}