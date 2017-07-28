package com.collection_map_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	// 用于存放课程的list
	public List coursesToSelect;

	public ListTest() {
		this.coursesToSelect = new ArrayList();
	}

	public void testAdd() {
		// 创建一个课程对象，并调用add方法，添加到备选课程
		Course cr1 = new Course("1", "java");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程：" + temp.id + ":" + temp.name);

		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(0, cr2);
		Course temp2 = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);
		// 添加重复元素
		Course cr3 = new Course("1", "java");
		coursesToSelect.add(cr3);
		Course temp0 = (Course) coursesToSelect.get(1);
		System.out.println("添加了课程：" + temp.id + ":" + temp.name);
		Course[] course = { new Course("3", "高等数学"), new Course("4", "线性代数") };
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(3);
		Course temp4 = (Course) coursesToSelect.get(4);
		System.out.println("添加了两门课程：" + temp3.id + ":" + temp3.name + ";" + temp4.id + ":" + temp4.name);

		Course[] course2 = { new Course("5", "大学物理"), new Course("6", "大学英语") };
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		System.out.println("添加了两门课程：" + temp5.id + ":" + temp5.name + ";" + temp6.id + ":" + temp6.name);

	}

	// 取出list元素
	public void testGet() {
		int size = coursesToSelect.size();
		for (int i = 0; i < size; i++) {
			Course cr = (Course) coursesToSelect.get(i);
			System.out.println("课程：" + cr.id + ":" + cr.name);
		}
	}

	// 通过迭代器取得list元素
	public void testIterator() {
		Iterator it = coursesToSelect.iterator();
		// 通过迭代器输出
		System.out.println("通过迭代器输出:");
		while (it.hasNext()) {
			Course cr = (Course) it.next();
			System.out.println("课程：" + cr.id + ":" + cr.name);
		}
	}

	// 通过foreach取得list元素
	public void testForEach() {
		Iterator it = coursesToSelect.iterator();
		// 通过foreach输出
		System.out.println("通过foreach输出:");
		for (Object obj : coursesToSelect) {
			Course cr = (Course) obj;
			System.out.println("课程：" + cr.id + ":" + cr.name);
		}
	}

	// 修改list元素
	public void testModify() {
		coursesToSelect.set(4, new Course("7", "数据结构"));
	}
	//删除list元素
	public void testRemove() {
		Course cr=(Course)coursesToSelect.get(4);
		System.out.println("我是課程"+cr.id+":"+cr.name);
		coursesToSelect.remove(cr);
		System.out.println("成功删除");
		testForEach();
	}

	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testIterator();
		lt.testForEach();
		lt.testModify();
		lt.testForEach();
		lt.testRemove();
	}
}
