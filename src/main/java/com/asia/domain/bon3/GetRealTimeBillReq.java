package com.asia.domain.bon3;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author Chenjian
 * @ClassName: GetRealTimeBillReq
 * @description: TODO
 * @date 2019/9/24
 * @Version 1.0
 */
public class GetRealTimeBillReq extends BaseDomain {
    private String systemId;
    private StdCcrRealTimeBillQuery stdCcrRealTimeBillQuery;

    public static class StdCcrRealTimeBillQuery{
        private String queryFlag;
        private String destinationAttr;
        private String accNbr;

        public String getQueryFlag() {
            return queryFlag;
        }

        public void setQueryFlag(String queryFlag) {
            this.queryFlag = queryFlag;
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

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public StdCcrRealTimeBillQuery getStdCcrRealTimeBillQuery() {
        return stdCcrRealTimeBillQuery;
    }

    public void setStdCcrRealTimeBillQuery(StdCcrRealTimeBillQuery stdCcrRealTimeBillQuery) {
        this.stdCcrRealTimeBillQuery = stdCcrRealTimeBillQuery;
    }
}
