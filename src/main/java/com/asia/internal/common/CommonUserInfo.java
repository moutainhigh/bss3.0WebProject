package com.asia.internal.common;

import com.asia.domain.bon3.StdCcrQueryServRes;
import com.asia.domain.bon3.StdCcrQueryServRes.StdCcaQueryServResBean;
import com.asia.domain.bon3.StdCcrQueryServRes.StdCcaQueryServResBean.StdCcaQueryServListBean;
import com.asia.service.impl.Bon3ServiceImpl;
import com.asiainfo.account.model.domain.StdCcrQueryServ;
import com.asiainfo.account.model.request.StdCcrQueryServRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

/**
 * @author WangBaoQiang
 * @ClassName: CommonUserInfo
 * @description: TODO
 * @date 2019/8/1014:48
 * @Version 1.0
 */
@Service
public class CommonUserInfo {
    @Autowired
    private Bon3ServiceImpl bon3Service;

    public StdCcaQueryServListBean getUserInfo(String accNum, String areaCode, String QueryType, String valueType, Map<String, String> headers)
            throws IOException {
        //调用用户信息查询接口 begin
        StdCcrQueryServRes info = new StdCcrQueryServRes();
        StdCcrQueryServRequest stdCcrQueryServRequest = new StdCcrQueryServRequest();
        StdCcaQueryServResBean stdCcaQueryServResBean = new StdCcaQueryServResBean();
        StdCcaQueryServListBean stdCcaQueryServListBean = new StdCcaQueryServListBean();
        StdCcrQueryServ stdCcrQueryServ = new StdCcrQueryServ();
        stdCcrQueryServ.setAreaCode(accNum);
        stdCcrQueryServ.setQueryType(QueryType);
        stdCcrQueryServ.setValue(accNum);
        stdCcrQueryServ.setValueType(valueType);
        stdCcrQueryServRequest.setStdCcrQueryServ(stdCcrQueryServ);
        //http调用账务查询用户信息服务
        info = bon3Service.searchServInfo(stdCcrQueryServRequest, headers);
        stdCcaQueryServResBean = info.getStdCcaQueryServRes();
        stdCcaQueryServListBean = stdCcaQueryServResBean.getStdCcaQueryServList().get(0);
        return stdCcaQueryServListBean;
    }

}
