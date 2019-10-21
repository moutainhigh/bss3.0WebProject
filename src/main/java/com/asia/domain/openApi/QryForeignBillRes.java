package com.asia.domain.openApi;

import java.util.List;

/**
 * @author WangBaoQiang
 * @ClassName: QryForeignBillRes
 * @description: TODO
 * @date 2019/10/1620:26
 * @Version 1.0
 */
public class QryForeignBillRes {

    /**
     * data : {"arrears":{"billedFee":0,"cashDeduct":0,"consumeAmount":99.6,"corpusDeduct":0,"curDeposit":0,"needPay":99.6,"returnBalance":0,"returnBalancePayed":0},"bills":[{"acctId":"313019150712","billFormatId":"998","billItems":[{"billItemName":"套餐及叠加包月基本费","billItemTypeId":"2400","billItems":[{"billItemName":"月基本费","billItemTypeId":"2001","billItems":[{"amount":99,"billItemName":"包月费","billItemTypeId":"2012","billItems":[],"offerId":"87001187","parentId":"2001","printOrder":"2012","servId":"5002972168","typeId":"2012"}],"parentId":"2400","printOrder":"2001","typeId":"2001"}],"printOrder":"2400","typeId":"2400"},{"billItemName":"套餐及叠加包超出费用","billItemTypeId":"2401","billItems":[{"billItemName":"短信彩信费","billItemTypeId":"2004","billItems":[{"amount":0.4,"billItemName":"短信费","billItemTypeId":"2065","billItems":[],"offerId":"610000","parentId":"2004","printOrder":"2065","servId":"5002972168","typeId":"2065"},{"amount":0.2,"billItemName":"SP短信信息费","billItemTypeId":"2136","billItems":[],"offerId":"610000","parentId":"2004","printOrder":"2136","servId":"5002972168","typeId":"2136"}],"parentId":"2401","printOrder":"2004","typeId":"2004"}],"printOrder":"2401","typeId":"2401"}],"name":"基本商品","offerConsumerInfos":[{"details":[{"iAccuType":60000400,"iBillingCycleID":11909,"iOrgID":1,"lCustID":313019150712,"lCycleBeginTime":20190901000000,"lCycleEndTime":20191001000000,"lCycleTypeID":1,"lInstMemberID":0,"lOfferID":40304770,"lOfferInstID":270455016,"lServID":0,"lastMonAmount":0,"offerAmount":1024,"ratableResourceId":"331100","realUsedAmount":320,"sAccuName":"(共享)国内流量","sOfferName":"[40304770]0元包1G国内手机上网流量包","sOfferType":"11","sUnitName":"M","servTypeId":2,"shareFlag":1},{"iAccuType":60010060,"iBillingCycleID":11909,"iOrgID":1,"lCustID":313019150712,"lCycleBeginTime":20190901000000,"lCycleEndTime":20191001000000,"lCycleTypeID":1,"lInstMemberID":0,"lOfferID":87001187,"lOfferInstID":315376820325,"lServID":0,"lastMonAmount":0,"offerAmount":300,"ratableResourceId":"131100","realUsedAmount":149,"sAccuName":"(共享)国内通话时长","sOfferName":"[87001187]天翼畅享20GB（99元）套餐201802","sOfferType":"11","sUnitName":"分钟","servTypeId":2,"shareFlag":1},{"iAccuType":94444444,"iBillingCycleID":11909,"iOrgID":1,"lCustID":313019150712,"lCycleBeginTime":20190901000000,"lCycleEndTime":20191001000000,"lCycleTypeID":1,"lInstMemberID":0,"lOfferID":87001187,"lOfferInstID":315376820325,"lServID":0,"lastMonAmount":0,"offerAmount":20480,"ratableResourceId":"331101","realUsedAmount":0,"sAccuName":"(共享)畅享国内流量","sOfferName":"[87001187]天翼畅享20GB（99元）套餐201802","sOfferType":"11","sUnitName":"M","servTypeId":2,"shareFlag":1}],"prodName":"CDMA：18946593727"}],"preferTypeId":"\\N","prodInstId":"CDMA：18946593727","total":99.6}],"echartsData":{"201904":47.5,"201905":53.4,"201906":56.55,"201907":78.65,"201908":99.6,"201909":99.6},"pieData":{"月基本费":99,"超出费用":0.6},"userInfo":{"billingCycle":"2019-09-01 ~ 2019-09-30","cityName":"吉林","custName":"朱春梅","needPay":99.6,"printTime":"2019-10-18 14:13:19"}}
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
         * arrears : {"billedFee":0,"cashDeduct":0,"consumeAmount":99.6,"corpusDeduct":0,"curDeposit":0,"needPay":99.6,"returnBalance":0,"returnBalancePayed":0}
         * bills : [{"acctId":"313019150712","billFormatId":"998","billItems":[{"billItemName":"套餐及叠加包月基本费","billItemTypeId":"2400","billItems":[{"billItemName":"月基本费","billItemTypeId":"2001","billItems":[{"amount":99,"billItemName":"包月费","billItemTypeId":"2012","billItems":[],"offerId":"87001187","parentId":"2001","printOrder":"2012","servId":"5002972168","typeId":"2012"}],"parentId":"2400","printOrder":"2001","typeId":"2001"}],"printOrder":"2400","typeId":"2400"},{"billItemName":"套餐及叠加包超出费用","billItemTypeId":"2401","billItems":[{"billItemName":"短信彩信费","billItemTypeId":"2004","billItems":[{"amount":0.4,"billItemName":"短信费","billItemTypeId":"2065","billItems":[],"offerId":"610000","parentId":"2004","printOrder":"2065","servId":"5002972168","typeId":"2065"},{"amount":0.2,"billItemName":"SP短信信息费","billItemTypeId":"2136","billItems":[],"offerId":"610000","parentId":"2004","printOrder":"2136","servId":"5002972168","typeId":"2136"}],"parentId":"2401","printOrder":"2004","typeId":"2004"}],"printOrder":"2401","typeId":"2401"}],"name":"基本商品","offerConsumerInfos":[{"details":[{"iAccuType":60000400,"iBillingCycleID":11909,"iOrgID":1,"lCustID":313019150712,"lCycleBeginTime":20190901000000,"lCycleEndTime":20191001000000,"lCycleTypeID":1,"lInstMemberID":0,"lOfferID":40304770,"lOfferInstID":270455016,"lServID":0,"lastMonAmount":0,"offerAmount":1024,"ratableResourceId":"331100","realUsedAmount":320,"sAccuName":"(共享)国内流量","sOfferName":"[40304770]0元包1G国内手机上网流量包","sOfferType":"11","sUnitName":"M","servTypeId":2,"shareFlag":1},{"iAccuType":60010060,"iBillingCycleID":11909,"iOrgID":1,"lCustID":313019150712,"lCycleBeginTime":20190901000000,"lCycleEndTime":20191001000000,"lCycleTypeID":1,"lInstMemberID":0,"lOfferID":87001187,"lOfferInstID":315376820325,"lServID":0,"lastMonAmount":0,"offerAmount":300,"ratableResourceId":"131100","realUsedAmount":149,"sAccuName":"(共享)国内通话时长","sOfferName":"[87001187]天翼畅享20GB（99元）套餐201802","sOfferType":"11","sUnitName":"分钟","servTypeId":2,"shareFlag":1},{"iAccuType":94444444,"iBillingCycleID":11909,"iOrgID":1,"lCustID":313019150712,"lCycleBeginTime":20190901000000,"lCycleEndTime":20191001000000,"lCycleTypeID":1,"lInstMemberID":0,"lOfferID":87001187,"lOfferInstID":315376820325,"lServID":0,"lastMonAmount":0,"offerAmount":20480,"ratableResourceId":"331101","realUsedAmount":0,"sAccuName":"(共享)畅享国内流量","sOfferName":"[87001187]天翼畅享20GB（99元）套餐201802","sOfferType":"11","sUnitName":"M","servTypeId":2,"shareFlag":1}],"prodName":"CDMA：18946593727"}],"preferTypeId":"\\N","prodInstId":"CDMA：18946593727","total":99.6}]
         * echartsData : {"201904":47.5,"201905":53.4,"201906":56.55,"201907":78.65,"201908":99.6,"201909":99.6}
         * pieData : {"月基本费":99,"超出费用":0.6}
         * userInfo : {"billingCycle":"2019-09-01 ~ 2019-09-30","cityName":"吉林","custName":"朱春梅","needPay":99.6,"printTime":"2019-10-18 14:13:19"}
         */

        private Arrears arrears;
        private BillConsumeInfo billConsumeInfo;
        private UserInfoBean userInfo;
        private OfferConsumerInfosBean offerConsumerInfos;
        private List<BillsBean> bills;
        private BillCionInfo billCionInfo;
        public Arrears getArrears() {
            return arrears;
        }

        public void setArrears(Arrears arrears) {
            this.arrears = arrears;
        }

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }

        public List<BillsBean> getBills() {
            return bills;
        }

        public void setBills(List<BillsBean> bills) {
            this.bills = bills;
        }

        public BillConsumeInfo getBillConsumeInfo() {
            return billConsumeInfo;
        }

        public void setBillConsumeInfo(BillConsumeInfo billConsumeInfo) {
            this.billConsumeInfo = billConsumeInfo;
        }

        public OfferConsumerInfosBean getOfferConsumerInfos() {
            return offerConsumerInfos;
        }

        public void setOfferConsumerInfos(OfferConsumerInfosBean offerConsumerInfos) {
            this.offerConsumerInfos = offerConsumerInfos;
        }

        public BillCionInfo getBillCionInfo() {
            return billCionInfo;
        }

        public void setBillCionInfo(BillCionInfo billCionInfo) {
            this.billCionInfo = billCionInfo;
        }

        public static class Arrears {

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
        public static class BillCionInfo{
            private long currentCoin;
            private long lastCoin;
            private long thisAddCoin;
            private long thisUserCoin;
            private long yearUnvalidCoin;

            public long getCurrentCoin() {
                return currentCoin;
            }

            public void setCurrentCoin(long currentCoin) {
                this.currentCoin = currentCoin;
            }

            public long getLastCoin() {
                return lastCoin;
            }

            public void setLastCoin(long lastCoin) {
                this.lastCoin = lastCoin;
            }

            public long getThisAddCoin() {
                return thisAddCoin;
            }

            public void setThisAddCoin(long thisAddCoin) {
                this.thisAddCoin = thisAddCoin;
            }

            public long getThisUserCoin() {
                return thisUserCoin;
            }

            public void setThisUserCoin(long thisUserCoin) {
                this.thisUserCoin = thisUserCoin;
            }

            public long getYearUnvalidCoin() {
                return yearUnvalidCoin;
            }

            public void setYearUnvalidCoin(long yearUnvalidCoin) {
                this.yearUnvalidCoin = yearUnvalidCoin;
            }
        }
        public static class BillConsumeInfo {


            private List<EchartsDataBeanBean> EchartsDataBean;

            public List<EchartsDataBeanBean> getEchartsDataBean() {
                return EchartsDataBean;
            }

            public void setEchartsDataBean(List<EchartsDataBeanBean> EchartsDataBean) {
                this.EchartsDataBean = EchartsDataBean;
            }

            public static class EchartsDataBeanBean {
                /**
                 * billFee : 300
                 * billMonth : 201908
                 */

                private String billFee;
                private String billMonth;

                public String getBillFee() {
                    return billFee;
                }

                public void setBillFee(String billFee) {
                    this.billFee = billFee;
                }

                public String getBillMonth() {
                    return billMonth;
                }

                public void setBillMonth(String billMonth) {
                    this.billMonth = billMonth;
                }
            }
        }
        public static class OfferConsumerInfosBean {
            private List<ProductOffInfoBean> productOffInfo;

            public List<ProductOffInfoBean> getProductOffInfo() {
                return productOffInfo;
            }

            public void setProductOffInfo(List<ProductOffInfoBean> productOffInfo) {
                this.productOffInfo = productOffInfo;
            }

            public static class ProductOffInfoBean {
                /**
                 * offerType : 11
                 * prodOfferInstanceId : 315301246561
                 * productOffName : [87001182]天翼畅享40GB（199元）套餐201802
                 * productOfferId : 87001182
                 * respondRatableQuery : [{"balanceAmount":"948","beginTime":"20190901000000","endTime":"20191001000000","ownerID":"10","ownerType":"10","ratableAmount":"1000","ratableResourceID":"131100","ratableResourceName":"国内通话时长","unitTypeId":"1","usageAmount":"52"},{"balanceAmount":"39151616","beginTime":"20190901000000","endTime":"20191001000000","ownerID":"10","ownerType":"10","ratableAmount":"41943040","ratableResourceID":"331101","ratableResourceName":"畅享国内流量","unitTypeId":"3","usageAmount":"2791424"}]
                 */

                private String offerType;
                private String prodOfferInstanceId;
                private String productOffName;
                private String productOfferId;
                private List<RespondRatableQueryBean> respondRatableQuery;

                public String getOfferType() {
                    return offerType;
                }

                public void setOfferType(String offerType) {
                    this.offerType = offerType;
                }

                public String getProdOfferInstanceId() {
                    return prodOfferInstanceId;
                }

                public void setProdOfferInstanceId(String prodOfferInstanceId) {
                    this.prodOfferInstanceId = prodOfferInstanceId;
                }

                public String getProductOffName() {
                    return productOffName;
                }

                public void setProductOffName(String productOffName) {
                    this.productOffName = productOffName;
                }

                public String getProductOfferId() {
                    return productOfferId;
                }

                public void setProductOfferId(String productOfferId) {
                    this.productOfferId = productOfferId;
                }

                public List<RespondRatableQueryBean> getRespondRatableQuery() {
                    return respondRatableQuery;
                }

                public void setRespondRatableQuery(List<RespondRatableQueryBean> respondRatableQuery) {
                    this.respondRatableQuery = respondRatableQuery;
                }

                public static class RespondRatableQueryBean {
                    /**
                     * balanceAmount : 948
                     * beginTime : 20190901000000
                     * endTime : 20191001000000
                     * ownerID : 10
                     * ownerType : 10
                     * ratableAmount : 1000
                     * ratableResourceID : 131100
                     * ratableResourceName : 国内通话时长
                     * unitTypeId : 1
                     * usageAmount : 52
                     */

                    private String balanceAmount;
                    private String beginTime;
                    private String endTime;
                    private String ownerID;
                    private String ownerType;
                    private String ratableAmount;
                    private String ratableResourceID;
                    private String ratableResourceName;
                    private String unitTypeId;
                    private String usageAmount;

                    public String getBalanceAmount() {
                        return balanceAmount;
                    }

                    public void setBalanceAmount(String balanceAmount) {
                        this.balanceAmount = balanceAmount;
                    }

                    public String getBeginTime() {
                        return beginTime;
                    }

                    public void setBeginTime(String beginTime) {
                        this.beginTime = beginTime;
                    }

                    public String getEndTime() {
                        return endTime;
                    }

                    public void setEndTime(String endTime) {
                        this.endTime = endTime;
                    }

                    public String getOwnerID() {
                        return ownerID;
                    }

                    public void setOwnerID(String ownerID) {
                        this.ownerID = ownerID;
                    }

                    public String getOwnerType() {
                        return ownerType;
                    }

                    public void setOwnerType(String ownerType) {
                        this.ownerType = ownerType;
                    }

                    public String getRatableAmount() {
                        return ratableAmount;
                    }

                    public void setRatableAmount(String ratableAmount) {
                        this.ratableAmount = ratableAmount;
                    }

                    public String getRatableResourceID() {
                        return ratableResourceID;
                    }

                    public void setRatableResourceID(String ratableResourceID) {
                        this.ratableResourceID = ratableResourceID;
                    }

                    public String getRatableResourceName() {
                        return ratableResourceName;
                    }

                    public void setRatableResourceName(String ratableResourceName) {
                        this.ratableResourceName = ratableResourceName;
                    }

                    public String getUnitTypeId() {
                        return unitTypeId;
                    }

                    public void setUnitTypeId(String unitTypeId) {
                        this.unitTypeId = unitTypeId;
                    }

                    public String getUsageAmount() {
                        return usageAmount;
                    }

                    public void setUsageAmount(String usageAmount) {
                        this.usageAmount = usageAmount;
                    }
                }
            }
        }
        public static class UserInfoBean {
            /**
             * billingCycle : 2019-09-01 ~ 2019-09-30
             * cityName : 吉林
             * custName : 朱春梅
             * needPay : 99.6
             * printTime : 2019-10-18 14:13:19
             */

            private String billingCycle;
            private String custName;
            private String servId;
            private String productName;

            public String getBillingCycle() {
                return billingCycle;
            }

            public void setBillingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
            }

            public String getCustName() {
                return custName;
            }

            public void setCustName(String custName) {
                this.custName = custName;
            }

            public String getServId() {
                return servId;
            }

            public void setServId(String servId) {
                this.servId = servId;
            }

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }
        }

        public static class BillsBean {
            /**
             * acctId : 313019150712
             * billFormatId : 998
             * billItems : [{"billItemName":"套餐及叠加包月基本费","billItemTypeId":"2400","billItems":[{"billItemName":"月基本费","billItemTypeId":"2001","billItems":[{"amount":99,"billItemName":"包月费","billItemTypeId":"2012","billItems":[],"offerId":"87001187","parentId":"2001","printOrder":"2012","servId":"5002972168","typeId":"2012"}],"parentId":"2400","printOrder":"2001","typeId":"2001"}],"printOrder":"2400","typeId":"2400"},{"billItemName":"套餐及叠加包超出费用","billItemTypeId":"2401","billItems":[{"billItemName":"短信彩信费","billItemTypeId":"2004","billItems":[{"amount":0.4,"billItemName":"短信费","billItemTypeId":"2065","billItems":[],"offerId":"610000","parentId":"2004","printOrder":"2065","servId":"5002972168","typeId":"2065"},{"amount":0.2,"billItemName":"SP短信信息费","billItemTypeId":"2136","billItems":[],"offerId":"610000","parentId":"2004","printOrder":"2136","servId":"5002972168","typeId":"2136"}],"parentId":"2401","printOrder":"2004","typeId":"2004"}],"printOrder":"2401","typeId":"2401"}]
             * name : 基本商品
             * offerConsumerInfos : [{"details":[{"iAccuType":60000400,"iBillingCycleID":11909,"iOrgID":1,"lCustID":313019150712,"lCycleBeginTime":20190901000000,"lCycleEndTime":20191001000000,"lCycleTypeID":1,"lInstMemberID":0,"lOfferID":40304770,"lOfferInstID":270455016,"lServID":0,"lastMonAmount":0,"offerAmount":1024,"ratableResourceId":"331100","realUsedAmount":320,"sAccuName":"(共享)国内流量","sOfferName":"[40304770]0元包1G国内手机上网流量包","sOfferType":"11","sUnitName":"M","servTypeId":2,"shareFlag":1},{"iAccuType":60010060,"iBillingCycleID":11909,"iOrgID":1,"lCustID":313019150712,"lCycleBeginTime":20190901000000,"lCycleEndTime":20191001000000,"lCycleTypeID":1,"lInstMemberID":0,"lOfferID":87001187,"lOfferInstID":315376820325,"lServID":0,"lastMonAmount":0,"offerAmount":300,"ratableResourceId":"131100","realUsedAmount":149,"sAccuName":"(共享)国内通话时长","sOfferName":"[87001187]天翼畅享20GB（99元）套餐201802","sOfferType":"11","sUnitName":"分钟","servTypeId":2,"shareFlag":1},{"iAccuType":94444444,"iBillingCycleID":11909,"iOrgID":1,"lCustID":313019150712,"lCycleBeginTime":20190901000000,"lCycleEndTime":20191001000000,"lCycleTypeID":1,"lInstMemberID":0,"lOfferID":87001187,"lOfferInstID":315376820325,"lServID":0,"lastMonAmount":0,"offerAmount":20480,"ratableResourceId":"331101","realUsedAmount":0,"sAccuName":"(共享)畅享国内流量","sOfferName":"[87001187]天翼畅享20GB（99元）套餐201802","sOfferType":"11","sUnitName":"M","servTypeId":2,"shareFlag":1}],"prodName":"CDMA：18946593727"}]
             * preferTypeId : \N
             * prodInstId : CDMA：18946593727
             * total : 99.6
             */

            private List<BillItemsBeanXX> billItems;

            public List<BillItemsBeanXX> getBillItems() {
                return billItems;
            }

            public void setBillItems(List<BillItemsBeanXX> billItems) {
                this.billItems = billItems;
            }


            public static class BillItemsBeanXX {
                /**
                 * billItemName : 套餐及叠加包月基本费
                 * billItemTypeId : 2400
                 * billItems : [{"billItemName":"月基本费","billItemTypeId":"2001","billItems":[{"amount":99,"billItemName":"包月费","billItemTypeId":"2012","billItems":[],"offerId":"87001187","parentId":"2001","printOrder":"2012","servId":"5002972168","typeId":"2012"}],"parentId":"2400","printOrder":"2001","typeId":"2001"}]
                 * printOrder : 2400
                 * typeId : 2400
                 */
                private String amount;
                private String billItemName;
                private String billItemTypeId;
                private List<BillItemsBeanX> billItems;

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

                public List<BillItemsBeanX> getBillItems() {
                    return billItems;
                }

                public void setBillItems(List<BillItemsBeanX> billItems) {
                    this.billItems = billItems;
                }

                public String getAmount() {
                    return amount;
                }

                public void setAmount(String amount) {
                    this.amount = amount;
                }

                public static class BillItemsBeanX {
                    /**
                     * billItemName : 月基本费
                     * billItemTypeId : 2001
                     * billItems : [{"amount":99,"billItemName":"包月费","billItemTypeId":"2012","billItems":[],"offerId":"87001187","parentId":"2001","printOrder":"2012","servId":"5002972168","typeId":"2012"}]
                     * parentId : 2400
                     * printOrder : 2001
                     * typeId : 2001
                     */

                    private String billItemName;
                    private String billItemTypeId;
                    private String amount;
                    private List<BillItemsBean> billItems;

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

                    public List<BillItemsBean> getBillItems() {
                        return billItems;
                    }

                    public void setBillItems(List<BillItemsBean> billItems) {
                        this.billItems = billItems;
                    }

                    public String getAmount() {
                        return amount;
                    }

                    public void setAmount(String amount) {
                        this.amount = amount;
                    }

                    public static class BillItemsBean {
                        /**
                         * amount : 99
                         * billItemName : 包月费
                         * billItemTypeId : 2012
                         * billItems : []
                         * offerId : 87001187
                         * parentId : 2001
                         * printOrder : 2012
                         * servId : 5002972168
                         * typeId : 2012
                         */

                        private int amount;
                        private String billItemName;
                        private String billItemTypeId;
                        private String offerId;
                        private String parentId;
                        private String printOrder;
                        private String servId;
                        private String typeId;
                        private List<?> billItems;

                        public int getAmount() {
                            return amount;
                        }

                        public void setAmount(int amount) {
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
