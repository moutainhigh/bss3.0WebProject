package com.asia.internal.common;

import com.asia.service.impl.Bon3ServiceImpl;
import com.asiainfo.account.model.domain.StdCcaQueryServ;
import com.asiainfo.account.model.domain.StdCcrQueryServ;
import com.asiainfo.account.model.request.StdCcrQueryServRequest;
import com.asiainfo.account.model.response.StdCcaQueryServResponse;
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

    public StdCcaQueryServ getUserInfo(String accNum, String areaCode, String QueryType, String valueType, Map<String, String> headers)
            throws IOException {
        //调用用户信息查询接口 begin
        StdCcaQueryServResponse info = new StdCcaQueryServResponse();
        StdCcrQueryServRequest stdCcrQueryServRequest = new StdCcrQueryServRequest();
        StdCcaQueryServ stdCcaQueryServ = new StdCcaQueryServ();
        StdCcrQueryServ stdCcrQueryServ = new StdCcrQueryServ();
        stdCcrQueryServ.setAreaCode("0431");
        stdCcrQueryServ.setQueryType("2");
        stdCcrQueryServ.setValue(accNum);
        stdCcrQueryServ.setValueType("1");
        stdCcrQueryServRequest.setStdCcrQueryServ(stdCcrQueryServ);
        //http调用账务查询用户信息服务
        info = bon3Service.searchServInfo(stdCcrQueryServRequest, headers);
        stdCcaQueryServ = info.getStdCcaQueryServ();
        return stdCcaQueryServ;
    }

}
