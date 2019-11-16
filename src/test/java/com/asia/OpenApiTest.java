package com.asia;

import com.asia.domain.openApi.QryJTBillInfoRes;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OpenApiTest{
	public static void main(String[] args) throws ParseException {
		Date date1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");// 格式化为年月
		System.out.println(sdf.parse(sdf.format(date1)));
		DecimalFormat df1=new DecimalFormat("#.#");
		QryJTBillInfoRes.DataBean.ArrearsBean arrearsBean = new QryJTBillInfoRes.DataBean.ArrearsBean();
		String billedFee =df1.format(Double.parseDouble(arrearsBean.getBilledFee())*100);
		System.out.println(billedFee);
		/*String before_six = String.valueOf(calendar.get(Calendar.YEAR)) + calendar.get(Calendar.MONTH);//六个月前
		ArrayList<String> resultMonth = new ArrayList<String>();
		Calendar min = Calendar.getInstance();
		Calendar max = Calendar.getInstance();
		min.setTime(sdf.parse(before_six));
		min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);
		max.setTime(sdf.parse(sdf.format(new Date())));
		max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);
		Calendar curr = min;
		while (curr.before(max)) {
			resultMonth.add(sdf.format(curr.getTime()));
			curr.add(Calendar.MONTH, 1);
		}*/
	}
}