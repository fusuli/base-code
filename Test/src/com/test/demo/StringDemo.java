package com.test.demo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java文件名
		String fileName = "HelloWorld.java";
		// 邮箱
		String email = "15551103598@163.com";
		// 判断.java文件名是否正确
		/*
		 * 1、获取文件名中最后一次出现"."号的位置 2、根据"."号位置，获取文件后缀 3、判断文件后缀
		 */
		// 获取文件名中最后一次出现"."号的位置
		int index = fileName.lastIndexOf(".");
		// 获取文件后缀
		String prefix = fileName.substring(index);
		// 判断必须包含"."号，且不能在首位，同时后缀为Java
		if (index != -1 && (prefix.equals(".java"))) {
			System.out.println("java文件名正确");
		} else {
			System.out.println("Java文件名无效");
		}
		// 判断邮箱格式是否正确：合法的邮箱至少包含"@"符号，并且在"."之前
		/*
		 * 1、获取邮箱@符号的位置 2、获取邮箱中"."的位置 3、判断必须包含"@"符号，且"@"在"."之前
		 */
		// 获取邮箱中"@"符号的位置
		int index2 = email.indexOf("@");
		// 获取邮箱中"."的位置
		int index3 = email.indexOf(".");
		// 判断必须包含"@"符号，且"@"在"."前
		if (index2 != -1 && index3 > index2) {
			System.out.println("邮箱格式正确");
		} else {
			System.out.println("邮箱格式不正确");
		}
	}

}
