package com.test.algorithm;

import java.util.Scanner;

/**
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 1.程序分析：利用while语句,条件为输入的字符不为'\n'.
 * 
 * @author fusuli
 *
 */
public class StChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abcCount = 0;
		int spacesCount = 0;
		int numCount = 0;
		int otherCount = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			// 判断数字个数
			if (Character.isDigit(ch[i])) {
				numCount++;
			}
			// 判断空格个数
			else if (Character.isSpaceChar(ch[i])) {
				spacesCount++;
			}
			// 判断字母个数
			else if (Character.isLetter(ch[i])) {
				abcCount++;
			} else {
				otherCount++;
			}
		}
		System.out.println("字母个数：" + abcCount);
		System.out.println("数字个数：" + numCount);
		System.out.println("空格个数：" + spacesCount);
		System.out.println("其他字符个数：" + otherCount);
	}

}
