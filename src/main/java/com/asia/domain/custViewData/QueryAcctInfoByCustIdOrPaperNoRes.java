package com.asia.domain.custViewData;

import com.asia.common.baseObj.BaseBonResDomain;

/**
 * @author WangBaoQiang
 * @ClassName: MeterPrintActionRes
 * @description: 详单打印记录
 * @date 2019/8/1219:09
 * @Version 1.0
 */
public class QueryAcctInfoByCustIdOrPaperNoRes extends BaseBonResDomain {

    /**
     * code :
     * msg :
     * result : 0
     * returnKey :
     */

    private String code;
    private String message;
    private Account account;

    public static class Account{
        private String acctId;
        private String acctCd;
        private String acctName;
        private String effTime;
        private String expTime;
        private String statusCd;

        public String getAcctId() {
            return acctId;
        }

        public void setAcctId(String acctId) {
            this.acctId = acctId;
        }

        public String getAcctCd() {
            return acctCd;
        }

        public void setAcctCd(String acctCd) {
            this.acctCd = acctCd;
        }

        public String getAcctName() {
            return acctName;
        }

        public void setAcctName(String acctName) {
            this.acctName = acctName;
        }

        public String getEffTime() {
            return effTime;
        }

        public void setEffTime(String effTime) {
            this.effTime = effTime;
        }

        public String getExpTime() {
            return expTime;
        }

        public void setExpTime(String expTime) {
            this.expTime = expTime;
        }

        public String getStatusCd() {
            return statusCd;
        }

        public void setStatusCd(String statusCd) {
            this.statusCd = statusCd;
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
