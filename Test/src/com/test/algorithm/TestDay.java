package com.test.algorithm;

import java.util.Scanner;

/**
 * 输入某年某月某日，判断这一天是这一年的第几天？
 * 1.程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，特殊情况，闰年且输入月份大于3时需考虑多加一天。
 * 四年一闰,百年不闰,四百年再闰.
 * 
 * @author fusuli
 *
 */
public class TestDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年：");
		int year = sc.nextInt();
		System.out.println("请输入月：");
		int month = sc.nextInt();
		System.out.println("请输入日：");
		int day = sc.nextInt();
		int d = 0;
		int a[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
			a[1] = 29;
		}
		for (int i = 0; i < month - 1; i++) {

			d = d + a[i];
		}
		System.out.println("第" + (d + day) + "天");
	}

}
