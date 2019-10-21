package com.asia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class OpenApiTest{
	public static void main(String[] args) throws ParseException {
		String month = "201908";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");// 格式化为年月
		Calendar calendar = Calendar.getInstance();
		Date date = null;
		date = sdf.parse(month);
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, -6);
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
		for (int i = 0; i < 6; i++) {
			calendar.add(Calendar.MONTH, 1);
			String date1 = sdf.format(calendar.getTime());

		}
	}
}