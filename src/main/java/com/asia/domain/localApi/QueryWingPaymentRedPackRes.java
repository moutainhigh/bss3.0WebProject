package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseBonResDomain;
import com.asia.domain.localApi.child.MobileNumberQueryServiceListTypeBean;

import java.util.List;

/**
 * @author chenjian
 * @ClassName: QueryWingPaymentRedPackRes
 * @description: 翼支付红包返还
 * @date 2019/8/1219:09
 * @Version 1.0
 */
public class QueryWingPaymentRedPackRes  {

    /**
     * code :
     * msg :
     * result : 0
     * returnKey :
     */

    private String result;
    private String code;
    private String msg;
    private List<WingPaymentRedPackSetType> wingPaymentRedPackSet;

    public static class WingPaymentRedPackSetType{
        private String  eachrewardsAmt;
        private String  prodInstId;
        private String  reserved3;
        private String  returnCycleId;

        public String getEachrewardsAmt() {
            return eachrewardsAmt;
        }

        public void setEachrewardsAmt(String eachrewardsAmt) {
            this.eachrewardsAmt = eachrewardsAmt;
        }

        public String getProdInstId() {
            return prodInstId;
        }

        public void setProdInstId(String prodInstId) {
            this.prodInstId = prodInstId;
        }

        public String getReserved3() {
            return reserved3;
        }

        public void setReserved3(String reserved3) {
            this.reserved3 = reserved3;
        }

        public String getReturnCycleId() {
            return returnCycleId;
        }

        public void setReturnCycleId(String returnCycleId) {
            this.returnCycleId = returnCycleId;
        }
    }


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<WingPaymentRedPackSetType> getWingPaymentRedPackSet() {
        return wingPaymentRedPackSet;
    }

    public void setWingPaymentRedPackSet(List<WingPaymentRedPackSetType> wingPaymentRedPackSet) {
        this.wingPaymentRedPackSet = wingPaymentRedPackSet;
    }
}
