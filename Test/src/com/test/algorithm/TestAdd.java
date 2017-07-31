package com.test.algorithm;

import java.util.Scanner;

/**
 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 * 
 * @author fusuli
 *
 */
public class TestAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入数字0~9");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("请输入几个数相加");
		int b=sc.nextInt();
		int s=0;
		System.out.println("a="+a+";"+"b="+b);
		for(int i=b;i>0;i--) {
			s=(int) (s+i*a*Math.pow(10,(b-i)));
		}
		System.out.println("s="+s);
	}

}
