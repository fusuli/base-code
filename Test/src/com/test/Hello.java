package com.test;

import java.util.Arrays;

/**
 * @author fusuli
 *
 */
public class Hello {

	// main函数
	public static void main(String[] args) {
		Hello hello = new Hello();
		int scores[] = { 89, -23, 64, 91, 119, 52, 73 };
		hello.top3(scores);

	}

	// 编写输出前三成绩方法
	public void top3(int scores[]) {
		Arrays.sort(scores);
		int sum = 0;
		for (int i = scores.length - 1; i >= 0; i--) {
			if (scores[i] < 0 || scores[i] > 100) {
				continue;
			}
			sum++;
			if (sum > 3) {
				break;
			}
			System.out.println(scores[i]);
		}
	}

}
