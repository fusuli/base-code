package com.test.algorithm;

import java.util.Scanner;

/**
 * 输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 
 * @author fusuli
 *
 */
public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int first = a;
		int second = b;
		System.out.println("a=" + a + ";" + "b=" + b);
		int temp;
		if (a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		while (b != 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		System.out.println("最大公约数：" + a);
		System.out.println("最小公倍数：" + first * second / a);
	}

}
