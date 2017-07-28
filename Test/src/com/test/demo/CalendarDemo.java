package com.test.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建calendar对象
		Calendar c = Calendar.getInstance();
		// 获取年月日等信息
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("当前时间：" + year + "-" + month + "-" + day + "  " + hour + ":" + minute + ":" + second);
		// 将calendar对象转换为Date对象
		Date date = c.getTime();
		// 获取当前毫秒
		long time = c.getTimeInMillis();
		// 创建SimpleDateFormat对象，指定目标格式
		SimpleDateFormat sdf = new SimpleDateFormat();
		// 将日期转换成指定格式的字符串
		String now = sdf.format(date);
		System.out.println(now);
		System.out.println("当前毫秒：" + time);
	}

}
