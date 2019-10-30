package com.asia.domain.localApi;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author ChenJian
 * @ClassName: AccountBalanceCpcpQueryReq
 * @description: TODO
 * @date 2019/8/31 14:19
 * @Version 1.0
 */
public class QuerySubsidiesReq extends BaseDomain {

    /**
     * accNumType :查询号码的类型9	手机号码、固话号码 11	宽带账号、IPTV账号
     * accNum;接入号码或宽带账号
     * accNumAreaCode;区号（查询固话与宽带时，必填）
     * systemId :
     */

    private SearchInfo searchInfo;


    public  static class SearchInfo{
        private String systemId;
        private String accNbr;
        private String returnRoleId;

        public String getSystemId() {
            return systemId;
        }

        public void setSystemId(String systemId) {
            this.systemId = systemId;
        }

        public String getAccNbr() {
            return accNbr;
        }

        public void setAccNbr(String accNbr) {
            this.accNbr = accNbr;
        }

        public String getReturnRoleId() {
            return returnRoleId;
        }

        public void setReturnRoleId(String returnRoleId) {
            this.returnRoleId = returnRoleId;
        }
    }

    public SearchInfo getSearchInfo() {
        return searchInfo;
    }

    public void setSearchInfo(SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
    }
}
