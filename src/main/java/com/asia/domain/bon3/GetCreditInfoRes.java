package com.asia.domain.bon3;

import com.asia.common.baseObj.BaseBonResDomain;

import java.util.List;

/**
 * @author Chenjian
 * @ClassName: GetCreditInfoRes
 * @description: TODO
 * @date 2019/9/24
 * @Version 1.0
 */
public class GetCreditInfoRes extends BaseBonResDomain {
    private StdCcaQueryCredit stdCcaQueryCredit;
    public static class StdCcaQueryCredit{
        private CreditInfo creditInfo;
        public static class CreditInfo{
            private String accNbr;
            private String destinationAttr;
            private String unitTypeId;
            private String creditAvailable;
            private List<CreditItemDetail> creditItemDetail;
            public static class CreditItemDetail{
                private String creditValueType;
                private String creditAmount;
                private String creditScore;
                private String endTime;
                private String creditGrade;
                private String startTime;

                public String getCreditValueType() {
                    return creditValueType;
                }

                public void setCreditValueType(String creditValueType) {
                    this.creditValueType = creditValueType;
                }

                public String getCreditAmount() {
                    return creditAmount;
                }

                public void setCreditAmount(String creditAmount) {
                    this.creditAmount = creditAmount;
                }

                public String getCreditScore() {
                    return creditScore;
                }

                public void setCreditScore(String creditScore) {
                    this.creditScore = creditScore;
                }

                public String getEndTime() {
                    return endTime;
                }

                public void setEndTime(String endTime) {
                    this.endTime = endTime;
                }

                public String getCreditGrade() {
                    return creditGrade;
                }

                public void setCreditGrade(String creditGrade) {
                    this.creditGrade = creditGrade;
                }

                public String getStartTime() {
                    return startTime;
                }

                public void setStartTime(String startTime) {
                    this.startTime = startTime;
                }
            }

            public String getAccNbr() {
                return accNbr;
            }

            public void setAccNbr(String accNbr) {
                this.accNbr = accNbr;
            }

            public String getDestinationAttr() {
                return destinationAttr;
            }

            public void setDestinationAttr(String destinationAttr) {
                this.destinationAttr = destinationAttr;
            }

            public String getUnitTypeId() {
                return unitTypeId;
            }

            public void setUnitTypeId(String unitTypeId) {
                this.unitTypeId = unitTypeId;
            }

            public String getCreditAvailable() {
                return creditAvailable;
            }

            public void setCreditAvailable(String creditAvailable) {
                this.creditAvailable = creditAvailable;
            }

            public List<CreditItemDetail> getCreditItemDetail() {
                return creditItemDetail;
            }

            public void setCreditItemDetail(List<CreditItemDetail> creditItemDetail) {
                this.creditItemDetail = creditItemDetail;
            }
        }

        public CreditInfo getCreditInfo() {
            return creditInfo;
        }

        public void setCreditInfo(CreditInfo creditInfo) {
            this.creditInfo = creditInfo;
        }
    }

    public StdCcaQueryCredit getStdCcaQueryCredit() {
        return stdCcaQueryCredit;
    }

    public void setStdCcaQueryCredit(StdCcaQueryCredit stdCcaQueryCredit) {
        this.stdCcaQueryCredit = stdCcaQueryCredit;
    }
}
