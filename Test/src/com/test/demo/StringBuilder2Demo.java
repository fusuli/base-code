package com.test.demo;

public class StringBuilder2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个空的StringBuilder对象
		StringBuilder str = new StringBuilder();
		// 追加字符串
		str.append("qwertyuiopsdfghjkl");
		// 从后往前每隔三位插入一个","号
		for (int i = str.length() - 3; i > 0; i = i - 3) {
			str.insert(i, ',');
		}
		System.out.println("修改后的str:" + str.toString());
	}

}
