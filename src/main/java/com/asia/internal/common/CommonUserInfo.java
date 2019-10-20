package com.asia.internal.common;

import com.asia.common.AcctApiUrl;
import com.asia.common.utils.StringUtil;
import com.asia.domain.bon3.StdCcrQueryServReq;
import com.asia.domain.bon3.StdCcrQueryServRes;
import com.asia.domain.bon3.StdCcrQueryServRes.StdCcaQueryServResBean;
import com.asia.domain.bon3.StdCcrQueryServRes.StdCcaQueryServResBean.StdCcaQueryServListBean;
import com.asia.internal.errcode.ErrorCodeCompEnum;
import com.asia.service.impl.Bon3ServiceImpl;
import com.asiainfo.account.model.domain.StdCcrQueryServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
    @Autowired
    private AcctApiUrl acctApiUrl;
    public StdCcaQueryServListBean getUserInfo(String accNum, String areaCode, String QueryType, String valueType, Map<String, String> headers)
            throws IOException, BillException {
        //调用用户信息查询接口 begin
        StdCcrQueryServRes info = new StdCcrQueryServRes();
        StdCcrQueryServReq stdCcrQueryServRequest = new StdCcrQueryServReq();
        StdCcaQueryServResBean stdCcaQueryServResBean = new StdCcaQueryServResBean();
        List<StdCcaQueryServListBean> stdCcaQueryServList = new ArrayList<>();
        StdCcaQueryServListBean stdCcaQueryServListBean = new StdCcaQueryServListBean();
        StdCcrQueryServ stdCcrQueryServ = new StdCcrQueryServ();
        stdCcrQueryServ.setAreaCode(areaCode);
        stdCcrQueryServ.setQueryType(QueryType);
        stdCcrQueryServ.setValue(accNum);
        stdCcrQueryServ.setValueType(valueType);
        stdCcrQueryServRequest.setStdCcrQueryServ(stdCcrQueryServ);
        //http调用账务查询用户信息服务
        info = bon3Service.commSearchServInfo(stdCcrQueryServRequest, headers);
        stdCcaQueryServResBean = info.getStdCcaQueryServRes();
        if (StringUtil.isEmpty(stdCcaQueryServResBean)) {
            throw new BillException(ErrorCodeCompEnum.HSS_SEARCH_SERV_INFO_NOT_EXIST);
        }
        stdCcaQueryServList = stdCcaQueryServResBean.getStdCcaQueryServList();
        if (StringUtil.isEmpty(stdCcaQueryServList)) {
            throw new BillException(ErrorCodeCompEnum.HSS_SEARCH_SERV_INFO_NOT_EXIST);
        }

        stdCcaQueryServListBean = stdCcaQueryServList.get(0);
        return stdCcaQueryServListBean;
    }

}
