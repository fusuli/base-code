package com.test.demo;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义int类型变量
		int score1=90;
		//创建Integer包装类对象，表示变量score1的值
		Integer score2=new Integer(score1);
		//将Integer包装类转换为double类型
		double score3=score2.doubleValue();
		//将Integer包装类转换成float类型
		float score4=score2.floatValue();
		//将Integer包装类转换成int类型
		int score5=score2.intValue();
		System.out.println("Integer包装类："+score2);
		System.out.println("double包装类："+score3);
		System.out.println("float包装类："+score4);
		System.out.println("int包装类："+score5);
		
		
	}

}
