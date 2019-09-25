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
public class GetOweListRes extends BaseBonResDomain {
    private StdCcaCustomizeBillQueryBill stdCcaCustomizeBillQueryBill;
    public static class StdCcaCustomizeBillQueryBill{
        private String sumCharge;
        private String acctName;
        private List<ItemInformation> itemInformation;
        public static class ItemInformation{
            private String showlevel;
            private String classId;
            private String parentClassId;
            private String charge;
            private String accNbrDetail;
            private String chargeTypeName;
            private String productOffName;

            public String getShowlevel() {
                return showlevel;
            }

            public void setShowlevel(String showlevel) {
                this.showlevel = showlevel;
            }

            public String getClassId() {
                return classId;
            }

            public void setClassId(String classId) {
                this.classId = classId;
            }

            public String getParentClassId() {
                return parentClassId;
            }

            public void setParentClassId(String parentClassId) {
                this.parentClassId = parentClassId;
            }

            public String getCharge() {
                return charge;
            }

            public void setCharge(String charge) {
                this.charge = charge;
            }

            public String getAccNbrDetail() {
                return accNbrDetail;
            }

            public void setAccNbrDetail(String accNbrDetail) {
                this.accNbrDetail = accNbrDetail;
            }

            public String getChargeTypeName() {
                return chargeTypeName;
            }

            public void setChargeTypeName(String chargeTypeName) {
                this.chargeTypeName = chargeTypeName;
            }

            public String getProductOffName() {
                return productOffName;
            }

            public void setProductOffName(String productOffName) {
                this.productOffName = productOffName;
            }
        }

        public String getSumCharge() {
            return sumCharge;
        }

        public void setSumCharge(String sumCharge) {
            this.sumCharge = sumCharge;
        }

        public String getAcctName() {
            return acctName;
        }

        public void setAcctName(String acctName) {
            this.acctName = acctName;
        }

        public List<ItemInformation> getItemInformation() {
            return itemInformation;
        }

        public void setItemInformation(List<ItemInformation> itemInformation) {
            this.itemInformation = itemInformation;
        }
    }

    public StdCcaCustomizeBillQueryBill getStdCcaCustomizeBillQueryBill() {
        return stdCcaCustomizeBillQueryBill;
    }

    public void setStdCcaCustomizeBillQueryBill(StdCcaCustomizeBillQueryBill stdCcaCustomizeBillQueryBill) {
        this.stdCcaCustomizeBillQueryBill = stdCcaCustomizeBillQueryBill;
    }
}
