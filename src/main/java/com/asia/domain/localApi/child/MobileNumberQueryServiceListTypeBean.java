package com.asia.domain.localApi.child;

import java.util.List;

/**
 * @author WangBaoQiang
 * @ClassName: IntfCommServiceListTypeBean
 * @description: TODO
 * @date 2019/8/619:05
 * @Version 1.0
 */
public class MobileNumberQueryServiceListTypeBean {

    private List<MobileNumberQueryServiceListBean> dataInfo;

    public List<MobileNumberQueryServiceListBean> getDataInfo() {
        return dataInfo;
    }

    public void setDataInfo(List<MobileNumberQueryServiceListBean> dataInfo) {
        this.dataInfo = dataInfo;
    }
}
