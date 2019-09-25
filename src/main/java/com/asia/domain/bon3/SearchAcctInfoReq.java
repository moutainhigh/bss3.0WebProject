package com.asia.domain.bon3;

import com.asia.common.baseObj.BaseDomain;

/**
 * @author Chenjian
 * @ClassName: SearchAcctInfoReq
 * @description: TODO
 * @date 2019/9/24
 * @Version 1.0
 */
public class SearchAcctInfoReq extends BaseDomain {
    private String systemId;
    private StdCcrQueryAcct stdCcrQueryAcct;

    public static class StdCcrQueryAcct {
        private String areaCode;
        private String valueType;
        private String value;
        private String queryType;

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getValueType() {
            return valueType;
        }

        public void setValueType(String valueType) {
            this.valueType = valueType;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getQueryType() {
            return queryType;
        }

        public void setQueryType(String queryType) {
            this.queryType = queryType;
        }
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public StdCcrQueryAcct getStdCcrQueryAcct() {
        return stdCcrQueryAcct;
    }

    public void setStdCcrQueryAcct(StdCcrQueryAcct stdCcrQueryAcct) {
        this.stdCcrQueryAcct = stdCcrQueryAcct;
    }
}
