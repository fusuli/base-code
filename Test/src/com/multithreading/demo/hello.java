package com.multithreading.demo;

/**
 * @author Rollen-Holt 继承Thread类,直接调用run方法
 */
class hello extends Thread {

	public hello() {

	}
	private String name;
	public hello(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "运行     " + i);
		}
	}

	public static void main(String[] args) {
		hello h1 = new hello("A");
		hello h2 = new hello("B");
		h1.start();
		h2.start();
	}
}
