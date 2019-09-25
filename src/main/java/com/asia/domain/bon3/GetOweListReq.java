package com.asia.domain.bon3;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author Chenjian
 * @ClassName: GetOweListReq
 * @description: TODO
 * @date 2019/9/24
 * @Version 1.0
 */
public class GetOweListReq extends BaseDomain {
    private StdCcrCustomizeBillQueryBill stdCcrCustomizeBillQueryBill;
    public static class StdCcrCustomizeBillQueryBill{
        private String queryFlag;
        private String billingCycle;
        private String destinationAttr;
        private String accNbr;

        public String getQueryFlag() {
            return queryFlag;
        }

        public void setQueryFlag(String queryFlag) {
            this.queryFlag = queryFlag;
        }

        public String getBillingCycle() {
            return billingCycle;
        }

        public void setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
        }

        public String getDestinationAttr() {
            return destinationAttr;
        }

        public void setDestinationAttr(String destinationAttr) {
            this.destinationAttr = destinationAttr;
        }

        public String getAccNbr() {
            return accNbr;
        }

        public void setAccNbr(String accNbr) {
            this.accNbr = accNbr;
        }
    }

    public StdCcrCustomizeBillQueryBill getStdCcrCustomizeBillQueryBill() {
        return stdCcrCustomizeBillQueryBill;
    }

    public void setStdCcrCustomizeBillQueryBill(StdCcrCustomizeBillQueryBill stdCcrCustomizeBillQueryBill) {
        this.stdCcrCustomizeBillQueryBill = stdCcrCustomizeBillQueryBill;
    }
}
