package com.test.algorithm;

import java.io.IOException;
import java.util.Stack;

/**
 * 逆波兰表达式（Reverse Polish Notation） a+b ---> a,b,+ a+(b-c) ---> a,b,c,-,+
 * a+(b-c)*d ---> a,b,c,-,d,*,+ a+d*(b-c)--->a,d,b,c,-,*,+ a=1+3 ---> a=1,3 +
 */
public class Rpn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] tokens = new String[] { "2", "3", "+", "4", "*", "5", "+" };
		System.out.println(evalRPN(tokens));
	}

	public static int evalRPN(String[] tokens) {// tokens：象征，货币
		int returnValue = 0;
		String operators = "+-*/";
		Stack<String> stack = new Stack<String>();// stack：堆栈

		for (String t : tokens) {
			if (!operators.contains(t)) {// contains：包含，容纳，控制。
				// 如果他是一个数推出
				stack.push(t);
			} else {
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				int index = operators.indexOf(t);// t中运算符在operators中对应的序号(+-*/:0123)
				switch (index) {
				case 0:// "+"
					stack.push(String.valueOf(a + b));
					break;
				case 1:// "-"
					stack.push(String.valueOf(b - a));
					break;
				case 2:// "*"
					stack.push(String.valueOf(a * b));
					break;
				case 3:// "/"
					stack.push(String.valueOf(b / a));
					break;
				}
			}
		}
		returnValue = Integer.valueOf(stack.pop());
		return returnValue;
	}

}
