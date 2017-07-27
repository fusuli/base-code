package com.test.demo;

public class StringDemo2 {
	public static void main(String[] args) {
		// 定义一个字符串
		String s = "djkafhkadlkfjadslakfj";
		// 出现的次数
		int num = 0;
		// 遍历每个字符，判断是否是字符"a"，如果是累加次数
		for (byte bt : (s.getBytes())) {
			// 获取每个字符判断是否是字符a
			if (bt == 'a') {
				// 累计次数
				num++;
			}
		}
		System.out.println("字符a出现的次数：" + num);
	}
}
