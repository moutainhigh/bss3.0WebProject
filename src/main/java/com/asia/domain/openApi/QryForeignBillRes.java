package com.asia.domain.openApi;

import com.google.gson.annotations.SerializedName;

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

        private ArrearsBean arrears;
        private EchartsDataBean echartsData;
        private PieDataBean pieData;
        private UserInfoBean userInfo;
        private List<BillsBean> bills;

        public ArrearsBean getArrears() {
            return arrears;
        }

        public void setArrears(ArrearsBean arrears) {
            this.arrears = arrears;
        }

        public EchartsDataBean getEchartsData() {
            return echartsData;
        }

        public void setEchartsData(EchartsDataBean echartsData) {
            this.echartsData = echartsData;
        }

        public PieDataBean getPieData() {
            return pieData;
        }

        public void setPieData(PieDataBean pieData) {
            this.pieData = pieData;
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

        public static class ArrearsBean {
            /**
             * billedFee : 0
             * cashDeduct : 0
             * consumeAmount : 99.6
             * corpusDeduct : 0
             * curDeposit : 0
             * needPay : 99.6
             * returnBalance : 0
             * returnBalancePayed : 0
             */

            private int billedFee;
            private int cashDeduct;
            private double consumeAmount;
            private int corpusDeduct;
            private int curDeposit;
            private double needPay;
            private int returnBalance;
            private int returnBalancePayed;

            public int getBilledFee() {
                return billedFee;
            }

            public void setBilledFee(int billedFee) {
                this.billedFee = billedFee;
            }

            public int getCashDeduct() {
                return cashDeduct;
            }

            public void setCashDeduct(int cashDeduct) {
                this.cashDeduct = cashDeduct;
            }

            public double getConsumeAmount() {
                return consumeAmount;
            }

            public void setConsumeAmount(double consumeAmount) {
                this.consumeAmount = consumeAmount;
            }

            public int getCorpusDeduct() {
                return corpusDeduct;
            }

            public void setCorpusDeduct(int corpusDeduct) {
                this.corpusDeduct = corpusDeduct;
            }

            public int getCurDeposit() {
                return curDeposit;
            }

            public void setCurDeposit(int curDeposit) {
                this.curDeposit = curDeposit;
            }

            public double getNeedPay() {
                return needPay;
            }

            public void setNeedPay(double needPay) {
                this.needPay = needPay;
            }

            public int getReturnBalance() {
                return returnBalance;
            }

            public void setReturnBalance(int returnBalance) {
                this.returnBalance = returnBalance;
            }

            public int getReturnBalancePayed() {
                return returnBalancePayed;
            }

            public void setReturnBalancePayed(int returnBalancePayed) {
                this.returnBalancePayed = returnBalancePayed;
            }
        }

        public static class EchartsDataBean {
            /**
             * 201904 : 47.5
             * 201905 : 53.4
             * 201906 : 56.55
             * 201907 : 78.65
             * 201908 : 99.6
             * 201909 : 99.6
             */

            @SerializedName("201904")
            private double _$201904;
            @SerializedName("201905")
            private double _$201905;
            @SerializedName("201906")
            private double _$201906;
            @SerializedName("201907")
            private double _$201907;
            @SerializedName("201908")
            private double _$201908;
            @SerializedName("201909")
            private double _$201909;

            public double get_$201904() {
                return _$201904;
            }

            public void set_$201904(double _$201904) {
                this._$201904 = _$201904;
            }

            public double get_$201905() {
                return _$201905;
            }

            public void set_$201905(double _$201905) {
                this._$201905 = _$201905;
            }

            public double get_$201906() {
                return _$201906;
            }

            public void set_$201906(double _$201906) {
                this._$201906 = _$201906;
            }

            public double get_$201907() {
                return _$201907;
            }

            public void set_$201907(double _$201907) {
                this._$201907 = _$201907;
            }

            public double get_$201908() {
                return _$201908;
            }

            public void set_$201908(double _$201908) {
                this._$201908 = _$201908;
            }

            public double get_$201909() {
                return _$201909;
            }

            public void set_$201909(double _$201909) {
                this._$201909 = _$201909;
            }
        }

        public static class PieDataBean {
            /**
             * 月基本费 : 99
             * 超出费用 : 0.6
             */

            private int 月基本费;
            private double 超出费用;

            public int get月基本费() {
                return 月基本费;
            }

            public void set月基本费(int 月基本费) {
                this.月基本费 = 月基本费;
            }

            public double get超出费用() {
                return 超出费用;
            }

            public void set超出费用(double 超出费用) {
                this.超出费用 = 超出费用;
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
            private String cityName;
            private String custName;
            private double needPay;
            private String printTime;

            public String getBillingCycle() {
                return billingCycle;
            }

            public void setBillingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
            }

            public String getCityName() {
                return cityName;
            }

            public void setCityName(String cityName) {
                this.cityName = cityName;
            }

            public String getCustName() {
                return custName;
            }

            public void setCustName(String custName) {
                this.custName = custName;
            }

            public double getNeedPay() {
                return needPay;
            }

            public void setNeedPay(double needPay) {
                this.needPay = needPay;
            }

            public String getPrintTime() {
                return printTime;
            }

            public void setPrintTime(String printTime) {
                this.printTime = printTime;
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

            private String acctId;
            private String billFormatId;
            private String name;
            private String preferTypeId;
            private String prodInstId;
            private double total;
            private List<BillItemsBeanXX> billItems;
            private List<OfferConsumerInfosBean> offerConsumerInfos;

            public String getAcctId() {
                return acctId;
            }

            public void setAcctId(String acctId) {
                this.acctId = acctId;
            }

            public String getBillFormatId() {
                return billFormatId;
            }

            public void setBillFormatId(String billFormatId) {
                this.billFormatId = billFormatId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPreferTypeId() {
                return preferTypeId;
            }

            public void setPreferTypeId(String preferTypeId) {
                this.preferTypeId = preferTypeId;
            }

            public String getProdInstId() {
                return prodInstId;
            }

            public void setProdInstId(String prodInstId) {
                this.prodInstId = prodInstId;
            }

            public double getTotal() {
                return total;
            }

            public void setTotal(double total) {
                this.total = total;
            }

            public List<BillItemsBeanXX> getBillItems() {
                return billItems;
            }

            public void setBillItems(List<BillItemsBeanXX> billItems) {
                this.billItems = billItems;
            }

            public List<OfferConsumerInfosBean> getOfferConsumerInfos() {
                return offerConsumerInfos;
            }

            public void setOfferConsumerInfos(List<OfferConsumerInfosBean> offerConsumerInfos) {
                this.offerConsumerInfos = offerConsumerInfos;
            }

            public static class BillItemsBeanXX {
                /**
                 * billItemName : 套餐及叠加包月基本费
                 * billItemTypeId : 2400
                 * billItems : [{"billItemName":"月基本费","billItemTypeId":"2001","billItems":[{"amount":99,"billItemName":"包月费","billItemTypeId":"2012","billItems":[],"offerId":"87001187","parentId":"2001","printOrder":"2012","servId":"5002972168","typeId":"2012"}],"parentId":"2400","printOrder":"2001","typeId":"2001"}]
                 * printOrder : 2400
                 * typeId : 2400
                 */

                private String billItemName;
                private String billItemTypeId;
                private String printOrder;
                private String typeId;
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
                     * billItemName : 月基本费
                     * billItemTypeId : 2001
                     * billItems : [{"amount":99,"billItemName":"包月费","billItemTypeId":"2012","billItems":[],"offerId":"87001187","parentId":"2001","printOrder":"2012","servId":"5002972168","typeId":"2012"}]
                     * parentId : 2400
                     * printOrder : 2001
                     * typeId : 2001
                     */

                    private String billItemName;
                    private String billItemTypeId;
                    private String parentId;
                    private String printOrder;
                    private String typeId;
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

            public static class OfferConsumerInfosBean {
                /**
                 * details : [{"iAccuType":60000400,"iBillingCycleID":11909,"iOrgID":1,"lCustID":313019150712,"lCycleBeginTime":20190901000000,"lCycleEndTime":20191001000000,"lCycleTypeID":1,"lInstMemberID":0,"lOfferID":40304770,"lOfferInstID":270455016,"lServID":0,"lastMonAmount":0,"offerAmount":1024,"ratableResourceId":"331100","realUsedAmount":320,"sAccuName":"(共享)国内流量","sOfferName":"[40304770]0元包1G国内手机上网流量包","sOfferType":"11","sUnitName":"M","servTypeId":2,"shareFlag":1},{"iAccuType":60010060,"iBillingCycleID":11909,"iOrgID":1,"lCustID":313019150712,"lCycleBeginTime":20190901000000,"lCycleEndTime":20191001000000,"lCycleTypeID":1,"lInstMemberID":0,"lOfferID":87001187,"lOfferInstID":315376820325,"lServID":0,"lastMonAmount":0,"offerAmount":300,"ratableResourceId":"131100","realUsedAmount":149,"sAccuName":"(共享)国内通话时长","sOfferName":"[87001187]天翼畅享20GB（99元）套餐201802","sOfferType":"11","sUnitName":"分钟","servTypeId":2,"shareFlag":1},{"iAccuType":94444444,"iBillingCycleID":11909,"iOrgID":1,"lCustID":313019150712,"lCycleBeginTime":20190901000000,"lCycleEndTime":20191001000000,"lCycleTypeID":1,"lInstMemberID":0,"lOfferID":87001187,"lOfferInstID":315376820325,"lServID":0,"lastMonAmount":0,"offerAmount":20480,"ratableResourceId":"331101","realUsedAmount":0,"sAccuName":"(共享)畅享国内流量","sOfferName":"[87001187]天翼畅享20GB（99元）套餐201802","sOfferType":"11","sUnitName":"M","servTypeId":2,"shareFlag":1}]
                 * prodName : CDMA：18946593727
                 */

                private String prodName;
                private List<DetailsBean> details;

                public String getProdName() {
                    return prodName;
                }

                public void setProdName(String prodName) {
                    this.prodName = prodName;
                }

                public List<DetailsBean> getDetails() {
                    return details;
                }

                public void setDetails(List<DetailsBean> details) {
                    this.details = details;
                }

                public static class DetailsBean {
                    /**
                     * iAccuType : 60000400
                     * iBillingCycleID : 11909
                     * iOrgID : 1
                     * lCustID : 313019150712
                     * lCycleBeginTime : 20190901000000
                     * lCycleEndTime : 20191001000000
                     * lCycleTypeID : 1
                     * lInstMemberID : 0
                     * lOfferID : 40304770
                     * lOfferInstID : 270455016
                     * lServID : 0
                     * lastMonAmount : 0
                     * offerAmount : 1024
                     * ratableResourceId : 331100
                     * realUsedAmount : 320
                     * sAccuName : (共享)国内流量
                     * sOfferName : [40304770]0元包1G国内手机上网流量包
                     * sOfferType : 11
                     * sUnitName : M
                     * servTypeId : 2
                     * shareFlag : 1
                     */

                    private int iAccuType;
                    private int iBillingCycleID;
                    private int iOrgID;
                    private long lCustID;
                    private long lCycleBeginTime;
                    private long lCycleEndTime;
                    private int lCycleTypeID;
                    private int lInstMemberID;
                    private int lOfferID;
                    private int lOfferInstID;
                    private int lServID;
                    private int lastMonAmount;
                    private int offerAmount;
                    private String ratableResourceId;
                    private int realUsedAmount;
                    private String sAccuName;
                    private String sOfferName;
                    private String sOfferType;
                    private String sUnitName;
                    private int servTypeId;
                    private int shareFlag;

                    public int getIAccuType() {
                        return iAccuType;
                    }

                    public void setIAccuType(int iAccuType) {
                        this.iAccuType = iAccuType;
                    }

                    public int getIBillingCycleID() {
                        return iBillingCycleID;
                    }

                    public void setIBillingCycleID(int iBillingCycleID) {
                        this.iBillingCycleID = iBillingCycleID;
                    }

                    public int getIOrgID() {
                        return iOrgID;
                    }

                    public void setIOrgID(int iOrgID) {
                        this.iOrgID = iOrgID;
                    }

                    public long getLCustID() {
                        return lCustID;
                    }

                    public void setLCustID(long lCustID) {
                        this.lCustID = lCustID;
                    }

                    public long getLCycleBeginTime() {
                        return lCycleBeginTime;
                    }

                    public void setLCycleBeginTime(long lCycleBeginTime) {
                        this.lCycleBeginTime = lCycleBeginTime;
                    }

                    public long getLCycleEndTime() {
                        return lCycleEndTime;
                    }

                    public void setLCycleEndTime(long lCycleEndTime) {
                        this.lCycleEndTime = lCycleEndTime;
                    }

                    public int getLCycleTypeID() {
                        return lCycleTypeID;
                    }

                    public void setLCycleTypeID(int lCycleTypeID) {
                        this.lCycleTypeID = lCycleTypeID;
                    }

                    public int getLInstMemberID() {
                        return lInstMemberID;
                    }

                    public void setLInstMemberID(int lInstMemberID) {
                        this.lInstMemberID = lInstMemberID;
                    }

                    public int getLOfferID() {
                        return lOfferID;
                    }

                    public void setLOfferID(int lOfferID) {
                        this.lOfferID = lOfferID;
                    }

                    public int getLOfferInstID() {
                        return lOfferInstID;
                    }

                    public void setLOfferInstID(int lOfferInstID) {
                        this.lOfferInstID = lOfferInstID;
                    }

                    public int getLServID() {
                        return lServID;
                    }

                    public void setLServID(int lServID) {
                        this.lServID = lServID;
                    }

                    public int getLastMonAmount() {
                        return lastMonAmount;
                    }

                    public void setLastMonAmount(int lastMonAmount) {
                        this.lastMonAmount = lastMonAmount;
                    }

                    public int getOfferAmount() {
                        return offerAmount;
                    }

                    public void setOfferAmount(int offerAmount) {
                        this.offerAmount = offerAmount;
                    }

                    public String getRatableResourceId() {
                        return ratableResourceId;
                    }

                    public void setRatableResourceId(String ratableResourceId) {
                        this.ratableResourceId = ratableResourceId;
                    }

                    public int getRealUsedAmount() {
                        return realUsedAmount;
                    }

                    public void setRealUsedAmount(int realUsedAmount) {
                        this.realUsedAmount = realUsedAmount;
                    }

                    public String getSAccuName() {
                        return sAccuName;
                    }

                    public void setSAccuName(String sAccuName) {
                        this.sAccuName = sAccuName;
                    }

                    public String getSOfferName() {
                        return sOfferName;
                    }

                    public void setSOfferName(String sOfferName) {
                        this.sOfferName = sOfferName;
                    }

                    public String getSOfferType() {
                        return sOfferType;
                    }

                    public void setSOfferType(String sOfferType) {
                        this.sOfferType = sOfferType;
                    }

                    public String getSUnitName() {
                        return sUnitName;
                    }

                    public void setSUnitName(String sUnitName) {
                        this.sUnitName = sUnitName;
                    }

                    public int getServTypeId() {
                        return servTypeId;
                    }

                    public void setServTypeId(int servTypeId) {
                        this.servTypeId = servTypeId;
                    }

                    public int getShareFlag() {
                        return shareFlag;
                    }

                    public void setShareFlag(int shareFlag) {
                        this.shareFlag = shareFlag;
                    }
                }
            }
        }
    }
}
