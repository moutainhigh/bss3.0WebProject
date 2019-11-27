package com.asia.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.service.impl.CustViewDataImpl;
import com.asia.service.impl.QueryServInfoImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RequestMapping( value="/test")
@RestController
public class CustViewDataControll {

    @Autowired
    CustViewDataImpl custViewData;
    @Autowired
    QueryServInfoImpl queryServInfo;
    @GetMapping("/custViewData")
    private String custViewData(@RequestParam(value = "custId") String custId,
                      @RequestParam(value = "viewItemCat") String viewItemCat) throws IOException {
        String info="";
        if(custId.equals("")||viewItemCat.equals("")){
          info="custId或viewItemCat为空！";
        }else {
             info = custViewData.queryAcctInfoByCustIdOrPaperNo(custId, viewItemCat);
        }
        return info;

    }

    @GetMapping("/queryServInfo")
    private String queryServInfo(@RequestParam(value = "phoneNum") String phoneNum)
            throws IOException {

        String info = queryServInfo.queryServInfo(phoneNum);
        return info;

    }

    /**
     *根据号码获取这个号码的所有订购
     *
     * */
    @GetMapping("/queryAllOrder")
    private String queryAllOrder(@RequestParam(value = "servId") String servId,
                                 @RequestParam(value = "queryType") int queryType,
                                 @RequestParam(value = "cicleId") String cicleId)
            throws IOException {

        String info = custViewData.queryAllOrder(servId,queryType,cicleId);
        return info;

    }

}
