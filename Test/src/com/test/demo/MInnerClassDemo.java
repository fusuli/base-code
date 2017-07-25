package com.test.demo;

public class MInnerClassDemo {
	private String name = "愛自己";

	// 外部类中的show方法
	public void show() {
		// 定义方法内部类
		class MInner {
			int score = 83;

			public int getScore() {
				return score + 10;
			}
		}
		// 创建方法内部类的对象
		MInner mi = new MInner();
		// 调用内部类的方法
		int newScore = mi.getScore();
		System.out.println("姓名：" + name + "\n加分后的成绩：" + newScore);
	}

	// 测试方法内部类
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建外部类的对象
		MInnerClassDemo mcd = new MInnerClassDemo();
		// 调用外部类方法
		mcd.show();

	}

}
