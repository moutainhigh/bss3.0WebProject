package com.asia;

import java.util.List;

/**
 * @author WangBaoQiang
 * @ClassName: testJson
 * @description: TODO
 * @date 2019/10/1516:23
 * @Version 1.0
 */
public class testJson {

    /**
     * errorCode : 0
     * errorMsg : SUCCESS
     * businessCode : null
     * stdCcaQueryBalanceBalance : {"balanceInformation":[{"balanceAvailable":"0","balanceTypeFlag":"0"},{"balanceAvailable":"570","balanceTypeFlag":"1"},{"balanceAvailable":"0","balanceTypeFlag":"2"},{"balanceAvailable":"0","balanceTypeFlag":"3"},{"balanceAvailable":"570","balanceTypeFlag":"4"}],"paymentFlag":"1","totalBalanceAvailable":"570"}
     */

    private Object businessCode;
    private StdCcaQueryBalanceBalanceBean stdCcaQueryBalanceBalance;


    public Object getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(Object businessCode) {
        this.businessCode = businessCode;
    }

    public StdCcaQueryBalanceBalanceBean getStdCcaQueryBalanceBalance() {
        return stdCcaQueryBalanceBalance;
    }

    public void setStdCcaQueryBalanceBalance(StdCcaQueryBalanceBalanceBean stdCcaQueryBalanceBalance) {
        this.stdCcaQueryBalanceBalance = stdCcaQueryBalanceBalance;
    }

    public static class StdCcaQueryBalanceBalanceBean {
        /**
         * balanceInformation : [{"balanceAvailable":"0","balanceTypeFlag":"0"},{"balanceAvailable":"570","balanceTypeFlag":"1"},{"balanceAvailable":"0","balanceTypeFlag":"2"},{"balanceAvailable":"0","balanceTypeFlag":"3"},{"balanceAvailable":"570","balanceTypeFlag":"4"}]
         * paymentFlag : 1
         * totalBalanceAvailable : 570
         */

        private String paymentFlag;
        private String totalBalanceAvailable;
        private List<BalanceInformationBean> balanceInformation;

        public String getPaymentFlag() {
            return paymentFlag;
        }

        public void setPaymentFlag(String paymentFlag) {
            this.paymentFlag = paymentFlag;
        }

        public String getTotalBalanceAvailable() {
            return totalBalanceAvailable;
        }

        public void setTotalBalanceAvailable(String totalBalanceAvailable) {
            this.totalBalanceAvailable = totalBalanceAvailable;
        }

        public List<BalanceInformationBean> getBalanceInformation() {
            return balanceInformation;
        }

        public void setBalanceInformation(List<BalanceInformationBean> balanceInformation) {
            this.balanceInformation = balanceInformation;
        }

        public static class BalanceInformationBean {
            /**
             * balanceAvailable : 0
             * balanceTypeFlag : 0
             */

            private String balanceAvailable;
            private String balanceTypeFlag;

            public String getBalanceAvailable() {
                return balanceAvailable;
            }

            public void setBalanceAvailable(String balanceAvailable) {
                this.balanceAvailable = balanceAvailable;
            }

            public String getBalanceTypeFlag() {
                return balanceTypeFlag;
            }

            public void setBalanceTypeFlag(String balanceTypeFlag) {
                this.balanceTypeFlag = balanceTypeFlag;
            }
        }
    }
}
