package com.test.algorithm;

import java.util.Scanner;

public class TestRabbit {
/*
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
 * 问每个月的兔子总数为多少？ 
 * 1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int a = 1;
		int b = 1;
		int c = 0;
		if (month == 1 && month == 2) {
			System.out.println("兔子有1对");
		}
		for (int i = 3; i <= month; i++) {
			c = a + b;
			b = a;
			a = c;
		}
		System.out.println(c);
	}

}
