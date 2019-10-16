package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author WangBaoQiang
 * @ClassName: UserByPhoneQueryServiceReq
 * @description: TODO
 * @date 2019/10/1520:07
 * @Version 1.0
 */
public class UserByPhoneQueryServiceReq extends BaseDomain {
    /**
     * accNumType :查询号码的类型 1手机号码、2 固话号码 3	宽带账号、4账号
     * accNum;接入号码或宽带账号
     * accNumAreaCode;区号（查询固话与宽带时，必填）
     * systemId :
     */
    private String accNumType;
    private String accNum;
    private String accNumAreaCode;
    private String systemId;
    private String staffId;

    public String getAccNumType() {
        return accNumType;
    }

    public void setAccNumType(String accNumType) {
        this.accNumType = accNumType;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getAccNumAreaCode() {
        return accNumAreaCode;
    }

    public void setAccNumAreaCode(String accNumAreaCode) {
        this.accNumAreaCode = accNumAreaCode;
    }
}
