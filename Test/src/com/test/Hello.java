package com.test;

import java.util.Arrays;

public class Hello {

	// 完成 main 方法
	public static void main(String[] args) {
		Hello hello = new Hello();
		int scores[] = { 89, -23, 64, 91, 119, 52, 73 };
		
		System.out.println(hello.top3(scores));

	}

	// 定义方法完成成绩排序并输出前三名的功能

	public String top3(int scores[]) {
		Arrays.sort(scores);
		int len = 0;
		while (len <= 3) {
			for (int i = scores.length-1; i >= 0; i--) {
				if ((0 < scores[i] && scores[i] < 100)) {
					len++;
				}
				if(scores[i]<0){
					scores[i]=scores[scores.length-1];
					continue;
				}
				if(scores[i]>100){
					scores[i]=scores[scores.length-1];
					continue;
				}
				
					
			}
		}
		System.out.println(len);
		Arrays.sort(scores);
		int a[] = new int[7];
		for (int i = 0; i <= 6; i++) {
			a[i] = scores[i];
		}
		return Arrays.toString(a);
	}

}
