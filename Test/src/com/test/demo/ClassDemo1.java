package com.test.demo;

/**
 * @author fusuli
 *
 */
public class ClassDemo1 {
	public static void main(String[] args) {
//		System.out.println("ClassDemo");
		ClassDemo1_1 cd1=new ClassDemo1_1();
		ClassDemo1_1 cd2=new ClassDemo1_1(3.0f,4.0f,3.0f);
		cd2 .setScree(9.0f);
		System.out.println("screen:"+cd2.getScreen());
	}
}
