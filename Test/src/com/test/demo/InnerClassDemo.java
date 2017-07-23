package com.test.demo;

public class InnerClassDemo {
	// 内部类Inner，类Inner在类HelloWorld的内部
	public class Inner {

		// 内部类的方法
		public void show() {
			System.out.println("welcome to imooc!");
		}
	}

	public static void main(String[] args) {

		// 创建外部类对象
		InnerClassDemo icd = new InnerClassDemo();
		// 创建内部类对象
		Inner i = icd.new Inner();
		// 调用内部类对象的方法
		i.show();
	}
}
