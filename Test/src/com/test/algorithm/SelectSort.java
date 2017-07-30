package com.test.algorithm;

import java.util.Scanner;

public class SelectSort {

	public void SelectSortArray(int a[]) {
		int min_index;
		for (int i = 0; i < a.length - 1; i++) {
			min_index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min_index]) {
					min_index = j;
				}
				if (min_index != i) {
					int temp;
					temp = a[i];
					a[i] = a[min_index];
					a[min_index] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("请输入5个数字：");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		SelectSort ss=new SelectSort();
		ss.SelectSortArray(a);
	}

}
