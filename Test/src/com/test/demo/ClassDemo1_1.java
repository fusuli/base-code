package com.test.demo;

/**
 * @author fusuli
 *
 */
public class ClassDemo1_1 {
	private float screen;
	private float cpu;
	private float mem;

	public float getScreen() {
		return screen;
	}

	public void setScree(float newScreen) {
		screen = newScreen;
	}

	public ClassDemo1_1() {
		System.out.println("无参的构造方法执行了");
	}

	public ClassDemo1_1(float newScreen, float cpu, float mem) {
		screen = newScreen;
		cpu = this.cpu;
		mem = this.mem;
		System.out.println("有参的构造方法执行了");
	}
}
