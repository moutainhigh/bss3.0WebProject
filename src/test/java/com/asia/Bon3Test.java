package com.asia;

import com.asia.domain.bon3.StdCcrQueryServ;

import java.util.Calendar;

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
		System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		Calendar calendar = Calendar.getInstance();
		//calendar.setTime(new Date());
		calendar.add(Calendar.MONTH, 1);//增加一个月
		System.out.println("增加月份后的日期："+calendar.getTime());

	}
}