package com.asia;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.domain.localApi.MobileNumberQueryReq;
import com.asia.domain.openApi.child.OperAttrStruct;
import com.asia.domain.openApi.child.SvcObjectStruct;
import com.asia.web.LocalController;

public class OpenApiTest{
	public static void main(String[] args) {
		Map map=new HashMap();

		OperAttrStruct oper= new OperAttrStruct();
		oper.setLanId(11);
		oper.setOperOrgId(1);
		oper.setOperPost(11);
		oper.setOperServiceId("111");
		oper.setOperTime("sksk");
		oper.setStaffId(11);
		SvcObjectStruct svc =new SvcObjectStruct();
		svc.setDataArea("0531");
		svc.setObjAttr("sksk");
		svc.setObjType("type");
		svc.setObjValue("val");
		map.put("operAttrStruct", oper);
		map.put("svcObjectStruct", svc);
		map.put("billingCycleId", 201803);
		Map<String,String> m=JSON.parseObject(JSON.toJSONString(oper), Map.class);

		System.out.println(JSON.toJSONString(map,SerializerFeature.WriteMapNullValue));

	}
}