package com.asia.domain.bon3;

import com.asia.common.baseObj.BaseDomain;
import com.asiainfo.account.model.domain.StdCcrQueryServ;

/**
 * @author Chenjian
 * @ClassName: GetCreditInfoReq
 * @description: TODO
 * @date 2019/9/24
 * @Version 1.0
 */
public class GetCreditInfoReq extends BaseDomain {
    private String systemId;
    private StdCcrQueryCredit stdCcrQueryCredit;

    public static class StdCcrQueryCredit{
        private String queryFlag;
        private String destinationId;
        private String destinationAttr;
        private String billingCycle;

        public String getQueryFlag() {
            return queryFlag;
        }

        public void setQueryFlag(String queryFlag) {
            this.queryFlag = queryFlag;
        }

        public String getDestinationId() {
            return destinationId;
        }

        public void setDestinationId(String destinationId) {
            this.destinationId = destinationId;
        }

        public String getDestinationAttr() {
            return destinationAttr;
        }

        public void setDestinationAttr(String destinationAttr) {
            this.destinationAttr = destinationAttr;
        }

        public String getBillingCycle() {
            return billingCycle;
        }

        public void setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
        }
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public StdCcrQueryCredit getStdCcrQueryCredit() {
        return stdCcrQueryCredit;
    }

    public void setStdCcrQueryCredit(StdCcrQueryCredit stdCcrQueryCredit) {
        this.stdCcrQueryCredit = stdCcrQueryCredit;
    }
}
