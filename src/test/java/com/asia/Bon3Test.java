package com.asia;

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
		/*String str=JSON.toJSONString(a,SerializerFeature.WriteMapNullValue);
		System.out.println(str);*/
		/*System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		Calendar calendar = Calendar.getInstance();
		//calendar.setTime(new Date());
		calendar.add(Calendar.MONTH, 1);//增加一个月
		System.out.println("增加月份后的日期："+calendar.getTime());*/

		//language=JSON
		String jsonString = "{\"errorCode\": \"0\",\n" +
				"  \"errorMsg\": \"SUCCESS\",\n" +
				"  \"stdCcaCustomizeBillQueryBill\": {\n" +
				"    \"acctName\": \"刘广亮\",\n" +
				"    \"itemInformation\": [\n" +
				"      {\n" +
				"        \"accNbrDetail\": null,\n" +
				"        \"charge\": \"0\",\n" +
				"        \"chargeTypeName\": \"月基本费\",\n" +
				"        \"classId\": \"2001\",\n" +
				"        \"parentClassId\": \"2400\",\n" +
				"        \"productOffName\": null,\n" +
				"        \"showlevel\": \"2\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"accNbrDetail\": null,\n" +
				"        \"charge\": \"300\",\n" +
				"        \"chargeTypeName\": \"套餐及叠加包超出费用\",\n" +
				"        \"classId\": \"2401\",\n" +
				"        \"parentClassId\": \"0\",\n" +
				"        \"productOffName\": null,\n" +
				"        \"showlevel\": \"1\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"accNbrDetail\": null,\n" +
				"        \"charge\": \"300\",\n" +
				"        \"chargeTypeName\": \"天气预报信息费\",\n" +
				"        \"classId\": \"2163\",\n" +
				"        \"parentClassId\": \"2006\",\n" +
				"        \"productOffName\": null,\n" +
				"        \"showlevel\": \"3\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"accNbrDetail\": null,\n" +
				"        \"charge\": \"300\",\n" +
				"        \"chargeTypeName\": \"代收费\",\n" +
				"        \"classId\": \"2006\",\n" +
				"        \"parentClassId\": \"2401\",\n" +
				"        \"productOffName\": null,\n" +
				"        \"showlevel\": \"2\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"accNbrDetail\": null,\n" +
				"        \"charge\": \"0\",\n" +
				"        \"chargeTypeName\": \"包月费\",\n" +
				"        \"classId\": \"2012\",\n" +
				"        \"parentClassId\": \"2001\",\n" +
				"        \"productOffName\": null,\n" +
				"        \"showlevel\": \"3\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"accNbrDetail\": null,\n" +
				"        \"charge\": \"0\",\n" +
				"        \"chargeTypeName\": \"套餐及叠加包月基本费\",\n" +
				"        \"classId\": \"2400\",\n" +
				"        \"parentClassId\": \"0\",\n" +
				"        \"productOffName\": null,\n" +
				"        \"showlevel\": \"1\"\n" +
				"      }\n" +
				"    ],\n" +
				"    \"sumCharge\": \"300\"\n" +
				"  }\n" +
				"}";


	}
}