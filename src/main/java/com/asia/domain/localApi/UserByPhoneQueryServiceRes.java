package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseBonResDomain;

/**
 * @author WangBaoQiang
 * @ClassName: UserByPhoneQueryServiceRes
 * @description: TODO
 * @date 2019/10/1520:07
 * @Version 1.0
 */
public class UserByPhoneQueryServiceRes extends BaseBonResDomain {

    /**
     * code :
     * msg :
     * result : 0
     * UserByPhoneQueryServiceRes : {"userInfoList":{"areaCode":"0431","netType":"0","phoneId":"17390026401","userType":"1"}}
     */

    private String code;
    private String msg;
    private String result;
    private UserByPhoneQueryServiceResBean userByPhoneQueryServiceRes;

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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public UserByPhoneQueryServiceResBean getUserByPhoneQueryServiceRes() {
        return userByPhoneQueryServiceRes;
    }

    public void setUserByPhoneQueryServiceRes(UserByPhoneQueryServiceResBean userByPhoneQueryServiceRes) {
        this.userByPhoneQueryServiceRes = userByPhoneQueryServiceRes;
    }

    public static class UserByPhoneQueryServiceResBean {
        /**
         * userInfoList : {"areaCode":"0431","netType":"0","phoneId":"17390026401","userType":"1"}
         */

        private UserInfoListBean userInfoList;

        public UserInfoListBean getUserInfoList() {
            return userInfoList;
        }

        public void setUserInfoList(UserInfoListBean userInfoList) {
            this.userInfoList = userInfoList;
        }

        public static class UserInfoListBean {
            /**
             * areaCode : 0431
             * netType : 0
             * phoneId : 17390026401
             * userType : 1
             */

            private String areaCode;
            private String netType;
            private String phoneId;
            private String userType;

            public String getAreaCode() {
                return areaCode;
            }

            public void setAreaCode(String areaCode) {
                this.areaCode = areaCode;
            }

            public String getNetType() {
                return netType;
            }

            public void setNetType(String netType) {
                this.netType = netType;
            }

            public String getPhoneId() {
                return phoneId;
            }

            public void setPhoneId(String phoneId) {
                this.phoneId = phoneId;
            }

            public String getUserType() {
                return userType;
            }

            public void setUserType(String userType) {
                this.userType = userType;
            }
        }
    }
}
