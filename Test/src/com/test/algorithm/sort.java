package com.test.algorithm;

import java.util.ArrayList;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(7);
		list.add(8);
		list.add(1);
		list.add(5);
		list.add(20);
		list.add(11);
		System.out.println(list);
		int[] num = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			num[i] = (int) list.get(i);
		}
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] < num[j + 1]) {
					int tmp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tmp;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
