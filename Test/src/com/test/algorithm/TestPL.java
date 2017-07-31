package com.test.algorithm;

public class TestPL {
	/*
	 * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
	 * 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
	 */
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int k = 0;
		int num = 1;
		for (i = 1; i < 5; i++) {
			for (j = 1; j < 5; j++) {
				for (k = 1; k < 5; k++) {
					if (i != j && i != k && j != k) {					
						System.out.println("能组成" + num + "个三位数" + i + "" + j + "" + k);
						num++;
					}
				}
			}
		}
	}
}
