package com.tips.datastructures;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {

		String exp = ")";
		System.out.println(isBalanced(exp));

	}

	private static boolean isBalanced(String exp) {

		Stack<Character> stack = new Stack<>();
		char[] chars = exp.toCharArray();

		if (chars[0] == '}' || chars[0] == ']' || chars[0] == ')') {
			return false;
		}

		for (char ch : chars) {

			switch (ch) {

			case '(':
			case '{':
			case '[':
				stack.push(ch);
				break;
			case ')':
				if (stack.size() > 0 && stack.pop() != '(')
					return false;
				break;
			case '}':
				if (stack.size() > 0 && stack.pop() != '{')
					return false;
				break;
			case ']':
				if (stack.size() > 0 && stack.pop() != '[')
					return false;
				break;

			}

		}
		return stack.isEmpty();
	}

}
