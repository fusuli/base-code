package com.test.demo;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义一个整型数组，长度20
		int[] nums = new int[20];
		// 通过循环给数组赋值
		for (int i = 0; i < nums.length; i++) {
			// 产生20以内的随机数
			int x = (int) (Math.random() * 20);
			nums[i] = x;
		}
		// 使用foreach循环输出数组中的元素
		for (int num : nums) {
			System.out.println(num);
		}
		double a = 28.68;
		int b = (int) a;
		double c = Math.round(a);//返回四舍五入后的整数
		double d = Math.floor(a);//返回小于参数的最大整数
		double e = Math.ceil(a);//返回大于参数的最小整数
		double f = Math.random();//产生[0,1)随机数
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
