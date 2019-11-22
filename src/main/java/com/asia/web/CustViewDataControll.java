package com.asia.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.service.impl.CustViewDataImpl;
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
    @GetMapping("/custViewData")
    private String test(@RequestParam(value = "custId") String custId,
                      @RequestParam(value = "viewItemCat") String viewItemCat) throws IOException {
        String info="";
        if(custId.equals("")||viewItemCat.equals("")){
          info="custId或viewItemCat为空！";
        }else {
             info = custViewData.queryAcctInfoByCustIdOrPaperNo(custId, viewItemCat);
        }
        return info;

    }
}
