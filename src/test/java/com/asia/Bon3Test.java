package com.asia;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.domain.bon3.StdCcrQueryServ;

public class Bon3Test{
	/**
	 * main:(测试返回消息类). <br/>
	 * @author yinyanzhen
	 * @param args
	 * @since V1.0.0
	 */
	public static void main(String[] args) {
		StdCcrQueryServ a =new StdCcrQueryServ();
		String str=JSON.toJSONString(a,SerializerFeature.WriteMapNullValue);
		System.out.println(str);
	}
}