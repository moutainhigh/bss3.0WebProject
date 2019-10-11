package com.asia.domain.plcaApi;

import java.util.List;

/**
 * @author WangBaoQiang
 * @ClassName: otherRemindReq
 * @description: TODO
 * @date 2019/10/614:24
 * @Version 1.0
 */
public class OtherRemindReq {

    private List<MsgInfoBean> msgInfo;

    public List<MsgInfoBean> getMsgInfo() {
        return msgInfo;
    }

    public void setMsgInfo(List<MsgInfoBean> msgInfo) {
        this.msgInfo = msgInfo;
    }

    public static class MsgInfoBean {
        /**
         * accNbr : 1
         * remindType : 1
         * remindCode : 1
         * remindCreateTime : 20180101010101
         * remindText : 测试
         * channelId : 1002
         * businessId :
         */

        private String accNbr;
        private String remindType;
        private String remindCode;
        private String remindCreateTime;
        private String remindText;
        private String channelId;
        private String businessId;

        public String getAccNbr() {
            return accNbr;
        }

        public void setAccNbr(String accNbr) {
            this.accNbr = accNbr;
        }

        public String getRemindType() {
            return remindType;
        }

        public void setRemindType(String remindType) {
            this.remindType = remindType;
        }

        public String getRemindCode() {
            return remindCode;
        }

        public void setRemindCode(String remindCode) {
            this.remindCode = remindCode;
        }

        public String getRemindCreateTime() {
            return remindCreateTime;
        }

        public void setRemindCreateTime(String remindCreateTime) {
            this.remindCreateTime = remindCreateTime;
        }

        public String getRemindText() {
            return remindText;
        }

        public void setRemindText(String remindText) {
            this.remindText = remindText;
        }

        public String getChannelId() {
            return channelId;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public String getBusinessId() {
            return businessId;
        }

        public void setBusinessId(String businessId) {
            this.businessId = businessId;
        }
    }
}
