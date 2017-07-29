package com.collection_map_demo;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	// 带有泛型——Course,的list类型属性

	public List<Course> course;

	public TestGeneric() {
		this.course = new ArrayList<Course>();
	}

	// 测试添加
	public void testAdd() {
		Course cr1 = new Course("1", "大学英语");
		course.add(cr1);
		// 泛型集合中，不能添加泛型规定类型以外的对象，否则会报错
		Course cr2 = new Course("2", "大学语文");
		course.add(cr2);
	}

	// 使用foreach输出
	public void testForEach() {
		for (Course cr : course) {
			System.out.println("课程：" + cr.id + ":" + cr.name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testForEach();
	}

}
