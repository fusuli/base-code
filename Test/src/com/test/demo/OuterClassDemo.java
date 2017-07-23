package com.test.demo;

public class OuterClassDemo {
	// 外部类的私有属性
	private String name = "imooc";
	// 外部类的成员属性
	int age = 20;
//成员内部类Inner
	public class Inner{
		String name ="爱自己";
		//内部类中的方法
		public void show() {
			System.out.println("外部类中的name："+OuterClassDemo.this.name);
			System.out.println("内部类中的name："+name);
			System.out.println("外部类中的age: "+age);
		}
	}
	//测试成员内部类
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建外部类的对象
		OuterClassDemo ocd=new OuterClassDemo();
		//创建内部类的对象
		Inner inn=ocd.new Inner();
		//调用内部类的show方法
		inn.show();
	}

}
