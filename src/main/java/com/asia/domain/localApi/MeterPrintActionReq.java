package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author WangBaoQiang
 * @ClassName: MeterPrintActionReq
 * @description: TODO
 * @date 2019/8/1219:07
 * @Version 1.0
 */
public class MeterPrintActionReq extends BaseDomain {

    /**
     * accNbr :
     * actionType :
     * areaCode :
     * expirDate :
     * printDate :
     * printMonth :
     * serialId :
     * staffId :
     * systemId :
     * terminalId :
     * validDate :
     */

    private String accNbr;
    private String actionType;
    private String areaCode;
    private String expirDate;
    private String printDate;
    private String printMonth;
    private String serialId;
    private String staffId;
    private String systemId;
    private String terminalId;
    private String validDate;

    public String getAccNbr() {
        return accNbr;
    }

    public void setAccNbr(String accNbr) {
        this.accNbr = accNbr;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getExpirDate() {
        return expirDate;
    }

    public void setExpirDate(String expirDate) {
        this.expirDate = expirDate;
    }

    public String getPrintDate() {
        return printDate;
    }

    public void setPrintDate(String printDate) {
        this.printDate = printDate;
    }

    public String getPrintMonth() {
        return printMonth;
    }

    public void setPrintMonth(String printMonth) {
        this.printMonth = printMonth;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }
}
