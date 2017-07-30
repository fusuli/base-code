package com.test.algorithm;

public class TestBall {
	/*
	 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s=100;
		double l=100;
		double h=s*Math.pow(0.5, 10);
//		for(int i=1;i<=10;i++) {
//			h=h/2;
//		}
		for(int i=2;i<=10;i++) {
			l=l+s*Math.pow(0.5, i-2);
		}
		System.out.println("第10次反弹的高度："+h);
		System.out.println("第10次落地经过"+l+"米");
	}

}
