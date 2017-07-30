package com.test.algorithm;

public class FindDaffodilNamber {
	/*
	 * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数， 其各位数字立方和等于该数本身。例如: 153是一个"水仙花数"，
	 * 因为153=1的三次方＋5的三次方＋3的三次方。 1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i <= 999; i++) {
			int a = i % 10 % 10;// 个位数
			int b = i / 10 % 10;// 十位数
			int c = i / 100;// 百位数
			if (i == (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3))) {
				System.out.println(i);
			}
		}
	}

}
