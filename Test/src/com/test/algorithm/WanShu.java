package com.test.algorithm;

/**
 * 一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程 找出1000以内的所有完数
 * 
 * @author fusuli
 * 
 */
public class WanShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, sum;
		sum = 0;
		for (a = 1; a <= 1000; a++) {
			for (b = 1; b < a; b++) {
				if (a % b == 0) {
					// 此处用sum去累加了 如 sum =1 ,b =2, 则sum = 1 + 2;
					sum = sum + b;
				}
			}
			if (sum == a) {
				System.out.println(sum);
			}
			sum = 0;
		}
	}
}
