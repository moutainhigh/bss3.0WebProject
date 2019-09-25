package com.asia.domain.bon3;

import com.asia.common.baseObj.BaseBonResDomain;

import java.util.List;

/**
 * @author Chenjian
 * @ClassName: SearchAcctInfoRes
 * @description: TODO
 * @date 2019/9/24
 * @Version 1.0
 */
public class SearchAcctInfoRes extends BaseBonResDomain {
    private StdCcaQueryAcct stdCcaQueryAcct;
    public static class StdCcaQueryAcct{
        private List<QueryAcctInfo> queryAcctInfo;
        public static class QueryAcctInfo{
            private String[] accNbr;
            private String custId;
            private String custName;
            private String acctId;
            private String telAcctName;
            private String state;
            private String stateDate;
            private String paymentMethod;
            private String acctType;

            public String[] getAccNbr() {
                return accNbr;
            }

            public void setAccNbr(String[] accNbr) {
                this.accNbr = accNbr;
            }

            public String getCustId() {
                return custId;
            }

            public void setCustId(String custId) {
                this.custId = custId;
            }

            public String getCustName() {
                return custName;
            }

            public void setCustName(String custName) {
                this.custName = custName;
            }

            public String getAcctId() {
                return acctId;
            }

            public void setAcctId(String acctId) {
                this.acctId = acctId;
            }

            public String getTelAcctName() {
                return telAcctName;
            }

            public void setTelAcctName(String telAcctName) {
                this.telAcctName = telAcctName;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getStateDate() {
                return stateDate;
            }

            public void setStateDate(String stateDate) {
                this.stateDate = stateDate;
            }

            public String getPaymentMethod() {
                return paymentMethod;
            }

            public void setPaymentMethod(String paymentMethod) {
                this.paymentMethod = paymentMethod;
            }

            public String getAcctType() {
                return acctType;
            }

            public void setAcctType(String acctType) {
                this.acctType = acctType;
            }
        }

        public List<QueryAcctInfo> getQueryAcctInfo() {
            return queryAcctInfo;
        }

        public void setQueryAcctInfo(List<QueryAcctInfo> queryAcctInfo) {
            this.queryAcctInfo = queryAcctInfo;
        }
    }

    public StdCcaQueryAcct getStdCcaQueryAcct() {
        return stdCcaQueryAcct;
    }

    public void setStdCcaQueryAcct(StdCcaQueryAcct stdCcaQueryAcct) {
        this.stdCcaQueryAcct = stdCcaQueryAcct;
    }
}
