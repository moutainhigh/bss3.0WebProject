package com.asia.domain.openApi;

import java.util.List;

/**
 * @author WangBaoQiang
 * @ClassName: QryJTBillInfoRes
 * @description: TODO
 * @date 2019/10/2015:32
 * @Version 1.0
 */
public class QryJTBillInfoRes {

    /**
     * data : {"arrears":{"billedFee":0,"cashDeduct":0,"consumeAmount":150.4,"corpusDeduct":0,"curDeposit":0,"needPay":150.4,"returnBalance":0,"returnBalancePayed":0},"billItems":[{"acctId":"313014336138","amount":0.1,"billItemName":"基本商品","billItemTypeId":"0","billItems":[{"amount":0.1,"billItemName":"CDMA：17390026402","billItemTypeId":"1","billItems":[{"amount":0.1,"billItemName":"套餐及叠加包超出费用","billItemTypeId":"2401","billItems":[{"amount":0.1,"billItemName":"短信彩信费","billItemTypeId":"2004","billItems":[{"amount":0.1,"billItemName":"短信费","billItemTypeId":"2065","billItems":[],"offerId":"610000","parentId":"2004","printOrder":"2065","servId":"313040326593","typeId":"2065"}],"parentId":"2401","printOrder":"2004","typeId":"2004"}],"parentId":"1","printOrder":"2401","typeId":"2401"}],"parentId":"0"}]},{"acctId":"313014336138","amount":150.3,"billItemName":"基本商品","billItemTypeId":"0","billItems":[{"amount":150.3,"billItemName":"CDMA：17390026401","billItemTypeId":"1","billItems":[{"amount":150,"billItemName":"套餐及叠加包月基本费","billItemTypeId":"2400","billItems":[{"amount":150,"billItemName":"月基本费","billItemTypeId":"2001","billItems":[{"amount":150,"billItemName":"包月费","billItemTypeId":"2012","billItems":[],"offerId":"87001182","parentId":"2001","printOrder":"2012","servId":"313040326592","typeId":"2012"}],"parentId":"2400","printOrder":"2001","typeId":"2001"}],"parentId":"1","printOrder":"2400","typeId":"2400"},{"amount":0.3,"billItemName":"套餐及叠加包超出费用","billItemTypeId":"2401","billItems":[{"amount":0.3,"billItemName":"短信彩信费","billItemTypeId":"2004","billItems":[{"amount":0.3,"billItemName":"SP短信信息费","billItemTypeId":"2136","billItems":[],"offerId":"610000","parentId":"2004","printOrder":"2136","servId":"313040326592","typeId":"2136"}],"parentId":"2401","printOrder":"2004","typeId":"2004"}],"parentId":"1","printOrder":"2401","typeId":"2401"}],"parentId":"0"}]}]}
     * resultCode : 200
     * resultMsg : Service Query Successful!
     */

    private DataBean data;
    private String resultCode;
    private String resultMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public static class DataBean {
        /**
         * arrears : {"billedFee":0,"cashDeduct":0,"consumeAmount":150.4,"corpusDeduct":0,"curDeposit":0,"needPay":150.4,"returnBalance":0,"returnBalancePayed":0}
         * billItems : [{"acctId":"313014336138","amount":0.1,"billItemName":"基本商品","billItemTypeId":"0","billItems":[{"amount":0.1,"billItemName":"CDMA：17390026402","billItemTypeId":"1","billItems":[{"amount":0.1,"billItemName":"套餐及叠加包超出费用","billItemTypeId":"2401","billItems":[{"amount":0.1,"billItemName":"短信彩信费","billItemTypeId":"2004","billItems":[{"amount":0.1,"billItemName":"短信费","billItemTypeId":"2065","billItems":[],"offerId":"610000","parentId":"2004","printOrder":"2065","servId":"313040326593","typeId":"2065"}],"parentId":"2401","printOrder":"2004","typeId":"2004"}],"parentId":"1","printOrder":"2401","typeId":"2401"}],"parentId":"0"}]},{"acctId":"313014336138","amount":150.3,"billItemName":"基本商品","billItemTypeId":"0","billItems":[{"amount":150.3,"billItemName":"CDMA：17390026401","billItemTypeId":"1","billItems":[{"amount":150,"billItemName":"套餐及叠加包月基本费","billItemTypeId":"2400","billItems":[{"amount":150,"billItemName":"月基本费","billItemTypeId":"2001","billItems":[{"amount":150,"billItemName":"包月费","billItemTypeId":"2012","billItems":[],"offerId":"87001182","parentId":"2001","printOrder":"2012","servId":"313040326592","typeId":"2012"}],"parentId":"2400","printOrder":"2001","typeId":"2001"}],"parentId":"1","printOrder":"2400","typeId":"2400"},{"amount":0.3,"billItemName":"套餐及叠加包超出费用","billItemTypeId":"2401","billItems":[{"amount":0.3,"billItemName":"短信彩信费","billItemTypeId":"2004","billItems":[{"amount":0.3,"billItemName":"SP短信信息费","billItemTypeId":"2136","billItems":[],"offerId":"610000","parentId":"2004","printOrder":"2136","servId":"313040326592","typeId":"2136"}],"parentId":"2401","printOrder":"2004","typeId":"2004"}],"parentId":"1","printOrder":"2401","typeId":"2401"}],"parentId":"0"}]}]
         */
        private String userName;
        private ArrearsBean arrears;
        private List<BillItemsBeanXXXX> billItems;

        public ArrearsBean getArrears() {
            return arrears;
        }

        public void setArrears(ArrearsBean arrears) {
            this.arrears = arrears;
        }

        public List<BillItemsBeanXXXX> getBillItems() {
            return billItems;
        }

        public void setBillItems(List<BillItemsBeanXXXX> billItems) {
            this.billItems = billItems;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public static class ArrearsBean {
            /**
             * billedFee : 0
             * cashDeduct : 0
             * consumeAmount : 150.4
             * corpusDeduct : 0
             * curDeposit : 0
             * needPay : 150.4
             * returnBalance : 0
             * returnBalancePayed : 0
             */

            private String billedFee;
            private String cashDeduct;
            private String consumeAmount;
            private String corpusDeduct;
            private String curDeposit;
            private String needPay;
            private String returnBalance;
            private String returnBalancePayed;

            public String getBilledFee() {
                return billedFee;
            }

            public void setBilledFee(String billedFee) {
                this.billedFee = billedFee;
            }

            public String getCashDeduct() {
                return cashDeduct;
            }

            public void setCashDeduct(String cashDeduct) {
                this.cashDeduct = cashDeduct;
            }

            public String getConsumeAmount() {
                return consumeAmount;
            }

            public void setConsumeAmount(String consumeAmount) {
                this.consumeAmount = consumeAmount;
            }

            public String getCorpusDeduct() {
                return corpusDeduct;
            }

            public void setCorpusDeduct(String corpusDeduct) {
                this.corpusDeduct = corpusDeduct;
            }

            public String getCurDeposit() {
                return curDeposit;
            }

            public void setCurDeposit(String curDeposit) {
                this.curDeposit = curDeposit;
            }

            public String getNeedPay() {
                return needPay;
            }

            public void setNeedPay(String needPay) {
                this.needPay = needPay;
            }

            public String getReturnBalance() {
                return returnBalance;
            }

            public void setReturnBalance(String returnBalance) {
                this.returnBalance = returnBalance;
            }

            public String getReturnBalancePayed() {
                return returnBalancePayed;
            }

            public void setReturnBalancePayed(String returnBalancePayed) {
                this.returnBalancePayed = returnBalancePayed;
            }
        }

        public static class BillItemsBeanXXXX {
            /**
             * acctId : 313014336138
             * amount : 0.1
             * billItemName : 基本商品
             * billItemTypeId : 0
             * billItems : [{"amount":0.1,"billItemName":"CDMA：17390026402","billItemTypeId":"1","billItems":[{"amount":0.1,"billItemName":"套餐及叠加包超出费用","billItemTypeId":"2401","billItems":[{"amount":0.1,"billItemName":"短信彩信费","billItemTypeId":"2004","billItems":[{"amount":0.1,"billItemName":"短信费","billItemTypeId":"2065","billItems":[],"offerId":"610000","parentId":"2004","printOrder":"2065","servId":"313040326593","typeId":"2065"}],"parentId":"2401","printOrder":"2004","typeId":"2004"}],"parentId":"1","printOrder":"2401","typeId":"2401"}],"parentId":"0"}]
             */

            private String acctId;
            private String amount;
            private String billItemName;
            private String billItemTypeId;
            private List<BillItemsBeanXXX> billItems;

            public String getAcctId() {
                return acctId;
            }

            public void setAcctId(String acctId) {
                this.acctId = acctId;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public String getBillItemName() {
                return billItemName;
            }

            public void setBillItemName(String billItemName) {
                this.billItemName = billItemName;
            }

            public String getBillItemTypeId() {
                return billItemTypeId;
            }

            public void setBillItemTypeId(String billItemTypeId) {
                this.billItemTypeId = billItemTypeId;
            }

            public List<BillItemsBeanXXX> getBillItems() {
                return billItems;
            }

            public void setBillItems(List<BillItemsBeanXXX> billItems) {
                this.billItems = billItems;
            }

            public static class BillItemsBeanXXX {
                /**
                 * amount : 0.1
                 * billItemName : CDMA：17390026402
                 * billItemTypeId : 1
                 * billItems : [{"amount":0.1,"billItemName":"套餐及叠加包超出费用","billItemTypeId":"2401","billItems":[{"amount":0.1,"billItemName":"短信彩信费","billItemTypeId":"2004","billItems":[{"amount":0.1,"billItemName":"短信费","billItemTypeId":"2065","billItems":[],"offerId":"610000","parentId":"2004","printOrder":"2065","servId":"313040326593","typeId":"2065"}],"parentId":"2401","printOrder":"2004","typeId":"2004"}],"parentId":"1","printOrder":"2401","typeId":"2401"}]
                 * parentId : 0
                 */

                private String amount;
                private String billItemName;
                private String billItemTypeId;
                private String parentId;
                private List<BillItemsBeanXX> billItems;

                public String getAmount() {
                    return amount;
                }

                public void setAmount(String amount) {
                    this.amount = amount;
                }

                public String getBillItemName() {
                    return billItemName;
                }

                public void setBillItemName(String billItemName) {
                    this.billItemName = billItemName;
                }

                public String getBillItemTypeId() {
                    return billItemTypeId;
                }

                public void setBillItemTypeId(String billItemTypeId) {
                    this.billItemTypeId = billItemTypeId;
                }

                public String getParentId() {
                    return parentId;
                }

                public void setParentId(String parentId) {
                    this.parentId = parentId;
                }

                public List<BillItemsBeanXX> getBillItems() {
                    return billItems;
                }

                public void setBillItems(List<BillItemsBeanXX> billItems) {
                    this.billItems = billItems;
                }

                public static class BillItemsBeanXX {
                    /**
                     * amount : 0.1
                     * billItemName : 套餐及叠加包超出费用
                     * billItemTypeId : 2401
                     * billItems : [{"amount":0.1,"billItemName":"短信彩信费","billItemTypeId":"2004","billItems":[{"amount":0.1,"billItemName":"短信费","billItemTypeId":"2065","billItems":[],"offerId":"610000","parentId":"2004","printOrder":"2065","servId":"313040326593","typeId":"2065"}],"parentId":"2401","printOrder":"2004","typeId":"2004"}]
                     * parentId : 1
                     * printOrder : 2401
                     * typeId : 2401
                     */

                    private String amount;
                    private String billItemName;
                    private String billItemTypeId;
                    private String parentId;
                    private String printOrder;
                    private String typeId;
                    private List<BillItemsBeanX> billItems;

                    public String getAmount() {
                        return amount;
                    }

                    public void setAmount(String amount) {
                        this.amount = amount;
                    }

                    public String getBillItemName() {
                        return billItemName;
                    }

                    public void setBillItemName(String billItemName) {
                        this.billItemName = billItemName;
                    }

                    public String getBillItemTypeId() {
                        return billItemTypeId;
                    }

                    public void setBillItemTypeId(String billItemTypeId) {
                        this.billItemTypeId = billItemTypeId;
                    }

                    public String getParentId() {
                        return parentId;
                    }

                    public void setParentId(String parentId) {
                        this.parentId = parentId;
                    }

                    public String getPrintOrder() {
                        return printOrder;
                    }

                    public void setPrintOrder(String printOrder) {
                        this.printOrder = printOrder;
                    }

                    public String getTypeId() {
                        return typeId;
                    }

                    public void setTypeId(String typeId) {
                        this.typeId = typeId;
                    }

                    public List<BillItemsBeanX> getBillItems() {
                        return billItems;
                    }

                    public void setBillItems(List<BillItemsBeanX> billItems) {
                        this.billItems = billItems;
                    }

                    public static class BillItemsBeanX {
                        /**
                         * amount : 0.1
                         * billItemName : 短信彩信费
                         * billItemTypeId : 2004
                         * billItems : [{"amount":0.1,"billItemName":"短信费","billItemTypeId":"2065","billItems":[],"offerId":"610000","parentId":"2004","printOrder":"2065","servId":"313040326593","typeId":"2065"}]
                         * parentId : 2401
                         * printOrder : 2004
                         * typeId : 2004
                         */

                        private String amount;
                        private String billItemName;
                        private String billItemTypeId;
                        private String parentId;
                        private String printOrder;
                        private String typeId;
                        private List<BillItemsBean> billItems;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getBillItemName() {
                            return billItemName;
                        }

                        public void setBillItemName(String billItemName) {
                            this.billItemName = billItemName;
                        }

                        public String getBillItemTypeId() {
                            return billItemTypeId;
                        }

                        public void setBillItemTypeId(String billItemTypeId) {
                            this.billItemTypeId = billItemTypeId;
                        }

                        public String getParentId() {
                            return parentId;
                        }

                        public void setParentId(String parentId) {
                            this.parentId = parentId;
                        }

                        public String getPrintOrder() {
                            return printOrder;
                        }

                        public void setPrintOrder(String printOrder) {
                            this.printOrder = printOrder;
                        }

                        public String getTypeId() {
                            return typeId;
                        }

                        public void setTypeId(String typeId) {
                            this.typeId = typeId;
                        }

                        public List<BillItemsBean> getBillItems() {
                            return billItems;
                        }

                        public void setBillItems(List<BillItemsBean> billItems) {
                            this.billItems = billItems;
                        }

                        public static class BillItemsBean {
                            /**
                             * amount : 0.1
                             * billItemName : 短信费
                             * billItemTypeId : 2065
                             * billItems : []
                             * offerId : 610000
                             * parentId : 2004
                             * printOrder : 2065
                             * servId : 313040326593
                             * typeId : 2065
                             */

                            private String amount;
                            private String billItemName;
                            private String billItemTypeId;
                            private String offerId;
                            private String parentId;
                            private String printOrder;
                            private String servId;
                            private String typeId;
                            private List<?> billItems;

                            public String getAmount() {
                                return amount;
                            }

                            public void setAmount(String amount) {
                                this.amount = amount;
                            }

                            public String getBillItemName() {
                                return billItemName;
                            }

                            public void setBillItemName(String billItemName) {
                                this.billItemName = billItemName;
                            }

                            public String getBillItemTypeId() {
                                return billItemTypeId;
                            }

                            public void setBillItemTypeId(String billItemTypeId) {
                                this.billItemTypeId = billItemTypeId;
                            }

                            public String getOfferId() {
                                return offerId;
                            }

                            public void setOfferId(String offerId) {
                                this.offerId = offerId;
                            }

                            public String getParentId() {
                                return parentId;
                            }

                            public void setParentId(String parentId) {
                                this.parentId = parentId;
                            }

                            public String getPrintOrder() {
                                return printOrder;
                            }

                            public void setPrintOrder(String printOrder) {
                                this.printOrder = printOrder;
                            }

                            public String getServId() {
                                return servId;
                            }

                            public void setServId(String servId) {
                                this.servId = servId;
                            }

                            public String getTypeId() {
                                return typeId;
                            }

                            public void setTypeId(String typeId) {
                                this.typeId = typeId;
                            }

                            public List<?> getBillItems() {
                                return billItems;
                            }

                            public void setBillItems(List<?> billItems) {
                                this.billItems = billItems;
                            }
                        }
                    }
                }
            }
        }
    }
}
