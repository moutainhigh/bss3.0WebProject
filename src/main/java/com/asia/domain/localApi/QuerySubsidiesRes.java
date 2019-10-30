package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseBonResDomain;
import com.asia.domain.localApi.child.QueryAddValueFeeResBean;

/**
 * @author WangBaoQiang
 * @ClassName: QueryAddValueFeeRes
 * @description:
 * @date 2019/9/3
 * @Version 1.0
 */
public class QuerySubsidiesRes {

    /**
     * code :
     * msg :
     * result : 0
     * returnKey :
     */

    private SubsidiesInfo subsidiesInfo;

    private String resultCode;
    private String resultMsg;
    public static class SubsidiesInfo{
        private String realPerformMonth;
        private String subsidiesAvg;
        private String totalSubsidies;
        private String oneTimeSubsidies;
        private String totalConsumed;

        public String getRealPerformMonth() {
            return realPerformMonth;
        }

        public void setRealPerformMonth(String realPerformMonth) {
            this.realPerformMonth = realPerformMonth;
        }

        public String getSubsidiesAvg() {
            return subsidiesAvg;
        }

        public void setSubsidiesAvg(String subsidiesAvg) {
            this.subsidiesAvg = subsidiesAvg;
        }

        public String getTotalSubsidies() {
            return totalSubsidies;
        }

        public void setTotalSubsidies(String totalSubsidies) {
            this.totalSubsidies = totalSubsidies;
        }

        public String getOneTimeSubsidies() {
            return oneTimeSubsidies;
        }

        public void setOneTimeSubsidies(String oneTimeSubsidies) {
            this.oneTimeSubsidies = oneTimeSubsidies;
        }

        public String getTotalConsumed() {
            return totalConsumed;
        }

        public void setTotalConsumed(String totalConsumed) {
            this.totalConsumed = totalConsumed;
        }
    }

    public SubsidiesInfo getSubsidiesInfo() {
        return subsidiesInfo;
    }

    public void setSubsidiesInfo(SubsidiesInfo subsidiesInfo) {
        this.subsidiesInfo = subsidiesInfo;
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
}
