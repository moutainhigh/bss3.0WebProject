package com.asia.domain.openApi;

import com.asia.common.baseObj.BaseDomain;
import com.asia.domain.openApi.child.OperAttrStruct;

/**
 * @author WangBaoQiang
 * @ClassName: RollRechargeBalanceReq
 * @description: TODO
 * @date 2019/7/2916:35
 * @Version 1.0
 */
public class RollRechargeBalanceReq extends BaseDomain {

    //操作人属性
    private OperAttrStruct operAttrStruct;
    //原充值请求流水号
    private String srcServiceId  ;
    //请求流水号
    private String reqServiceId ;
    //被充值用户标识
    private Integer destinationAccount ;
    //被充值用户的属性
    private Integer destinationAttr ;
    //系统ID
    private Integer systemId ;

    public OperAttrStruct getOperAttrStruct() {
        return operAttrStruct;
    }

    public void setOperAttrStruct(OperAttrStruct operAttrStruct) {
        this.operAttrStruct = operAttrStruct;
    }

    public String getSrcServiceId() {
        return srcServiceId;
    }

    public void setSrcServiceId(String srcServiceId) {
        this.srcServiceId = srcServiceId;
    }

    public String getReqServiceId() {
        return reqServiceId;
    }

    public void setReqServiceId(String reqServiceId) {
        this.reqServiceId = reqServiceId;
    }

    public Integer getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(Integer destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public Integer getDestinationAttr() {
        return destinationAttr;
    }

    public void setDestinationAttr(Integer destinationAttr) {
        this.destinationAttr = destinationAttr;
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }
}
