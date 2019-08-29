package com.asia.domain.bon3;

import com.asia.common.baseObj.BaseDomain;
import com.asiainfo.account.model.domain.StdCcrQueryServ;

/**
 * @author WangBaoQiang
 * @ClassName: StdCcrQueryServReq
 * @description: TODO
 * @date 2019/8/2919:54
 * @Version 1.0
 */
public class StdCcrQueryServReq extends BaseDomain {


    /**
     * systemId : 100001
     * stdCcrQueryServ : {"areaCode":"","valueType":"","value":"","queryType":""}
     */
    private String systemId;
    private StdCcrQueryServ stdCcrQueryServ;

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }


    public StdCcrQueryServ getStdCcrQueryServ() {
        return stdCcrQueryServ;
    }

    public void setStdCcrQueryServ(StdCcrQueryServ stdCcrQueryServ) {
        this.stdCcrQueryServ = stdCcrQueryServ;
    }
}
