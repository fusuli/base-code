package com.test.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// 使用format()方法将日期转换为指定格式的文本
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 创建date对象，表示当前时间
		Date date = new Date();
		// 调用format()方法，将日期转换成字符串并输出
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		// 使用parse()方法将文本转换成日期
		String d = "2017-7-28 9:07:09";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 调用parse()方法，将字符串转换成日期
		Date date1 = sdf.parse(d);
		System.out.println(date1);
	}

}
