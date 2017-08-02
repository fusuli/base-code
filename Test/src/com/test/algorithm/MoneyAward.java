package com.test.algorithm;

import java.util.Scanner;

/**
 * 题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提
 * 成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高
 * 于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
 * 1.程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。
 * 
 * @author fusuli
 *
 */
public class MoneyAward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		if (l <= 100000) {
			System.out.println(l * 0.1);
		} else if (100000 < l && l < 200000) {
			System.out.println(100000 * 0.1 + (l - 100000) * 0.075);
		} else if (l >= 200000 && l < 400000) {
			System.out.println(100000 * 0.1 + 100000 * 0.075 + (l - 200000) * 0.05);
		} else if (l >= 400000 && l < 600000) {
			System.out.println(100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + (l - 400000) * 0.03);
		} else if (l >= 600000 && l < 1000000) {
			System.out.println(100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + (l - 600000) * 0.015);
		} else if (l >= 1000000) {
			System.out.println(100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + 400000 * 0.015
					+ (l - 1000000) * 0.01);
		}
	}

}
