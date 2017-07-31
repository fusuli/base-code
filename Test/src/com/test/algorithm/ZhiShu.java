package com.test.algorithm;

public class ZhiShu {
	// 100以内的质数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 100; i++) {
			for (int k = 2; k <= i; k++) {
				// 剔除所有i之前的能被k整除的数
				if (i % k == 0 && i != k) {
					break;
				}
				// 输出能被自身整除的数
				if (i % k == 0 && i == k) {
					System.out.println(i);
				}
			}
		}
	}

}
