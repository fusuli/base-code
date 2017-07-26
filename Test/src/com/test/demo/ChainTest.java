package com.test.demo;

/**
 * @author fusuli
 *
 */
public class ChainTest {
/*
 * test1():抛出“温度过高”异常
 * test2():调用test1(),捕获“温度过高”异常，并且包装成运行异常，继续抛出
 * main方法中，调用test2(),尝试捕获test2()方法抛出的异常
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainTest ct=new ChainTest();
		try {
			ct.test2();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void test1() throws DrunkException {
		throw new DrunkException("高温别外出");
	}
	public void test2() {
		try {
			test1();
		} catch (DrunkException e) {
			// TODO Auto-generated catch block
			RuntimeException newExc =new RuntimeException("高温预警");
			newExc.initCause(e);
			throw newExc;
		}
	}

}
