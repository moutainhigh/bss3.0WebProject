package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseBonResDomain;

import java.util.List;

/**
 * @author WangBaoQiang
 * @ClassName: AcountRealFeeDetailServiceRes
 * @description: TODO
 * @date 2019/10/1920:29
 * @Version 1.0
 */
public class AcountRealFeeDetailServiceRes extends BaseBonResDomain {


    private List<FeeBillBean> feeBill;

    public List<FeeBillBean> getFeeBill() {
        return feeBill;
    }

    public void setFeeBill(List<FeeBillBean> feeBill) {
        this.feeBill = feeBill;
    }

    public static class FeeBillBean {
        /**
         * accNbr : 17390026401
         * acctID : 313014336138
         * acctItemTypeID : 80103011
         * acctItemTypeName : 80103011
         * billItemName : SP短信信息费
         * billItemTypeID : 2136
         * billingCycle : [{"beginDate":"20190901000000","billingCycleID":11909,"endDate":"20191001000000"}]
         * charge : 30
         * due : 0
         * itemSourceID : 11
         * offerID : 610000
         * servID : 313040326592
         * state : 1
         */

        private String accNbr;
        private long acctID;
        private long acctItemTypeID;
        private String acctItemTypeName;
        private String billItemName;
        private long billItemTypeID;
        private long charge;
        private int due;
        private long itemSourceID;
        private long offerID;
        private long servID;
        private String state;
        private String productName;
        private List<BillingCycleBean> billingCycle;

        public String getAccNbr() {
            return accNbr;
        }

        public void setAccNbr(String accNbr) {
            this.accNbr = accNbr;
        }

        public long getAcctID() {
            return acctID;
        }

        public void setAcctID(long acctID) {
            this.acctID = acctID;
        }

        public long getAcctItemTypeID() {
            return acctItemTypeID;
        }

        public void setAcctItemTypeID(long acctItemTypeID) {
            this.acctItemTypeID = acctItemTypeID;
        }

        public String getAcctItemTypeName() {
            return acctItemTypeName;
        }

        public void setAcctItemTypeName(String acctItemTypeName) {
            this.acctItemTypeName = acctItemTypeName;
        }

        public String getBillItemName() {
            return billItemName;
        }

        public void setBillItemName(String billItemName) {
            this.billItemName = billItemName;
        }

        public long getBillItemTypeID() {
            return billItemTypeID;
        }

        public void setBillItemTypeID(long billItemTypeID) {
            this.billItemTypeID = billItemTypeID;
        }

        public long getCharge() {
            return charge;
        }

        public void setCharge(long charge) {
            this.charge = charge;
        }

        public int getDue() {
            return due;
        }

        public void setDue(int due) {
            this.due = due;
        }

        public long getItemSourceID() {
            return itemSourceID;
        }

        public void setItemSourceID(long itemSourceID) {
            this.itemSourceID = itemSourceID;
        }

        public long getOfferID() {
            return offerID;
        }

        public void setOfferID(long offerID) {
            this.offerID = offerID;
        }

        public long getServID() {
            return servID;
        }

        public void setServID(long servID) {
            this.servID = servID;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public List<BillingCycleBean> getBillingCycle() {
            return billingCycle;
        }

        public void setBillingCycle(List<BillingCycleBean> billingCycle) {
            this.billingCycle = billingCycle;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public static class BillingCycleBean {
            /**
             * beginDate : 20190901000000
             * billingCycleID : 11909
             * endDate : 20191001000000
             */

            private String beginDate;
            private long billingCycleID;
            private String endDate;

            public String getBeginDate() {
                return beginDate;
            }

            public void setBeginDate(String beginDate) {
                this.beginDate = beginDate;
            }

            public long getBillingCycleID() {
                return billingCycleID;
            }

            public void setBillingCycleID(long billingCycleID) {
                this.billingCycleID = billingCycleID;
            }

            public String getEndDate() {
                return endDate;
            }

            public void setEndDate(String endDate) {
                this.endDate = endDate;
            }
        }
    }
}
