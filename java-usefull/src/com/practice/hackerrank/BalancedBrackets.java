package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {

		String s = "[](()";

		List<Character> list = new ArrayList<Character>();
		Stack<Character> stack = new Stack<Character>();
		char[] arr = s.toCharArray();

		for (char c : arr) {
			list.add(c);
			switch (c) {
			case '{':
				stack.push(c);
				break;
			case '[':
				stack.push(c);
				break;
			case '(':
				stack.push(c);
				break;
			case '}': {
				if (stack.size() > 0) {
					Character ch = stack.pop();
					list.remove(ch);
					if (!ch.equals('{')) {
						System.out.println("NO");
					} else {
						list.remove(ch);
						list.remove('}');
					}
				}
				break;
			}
			case ']': {
				if (stack.size() > 0) {
					Character ch = stack.pop();
					list.remove(ch);
					if (!ch.equals('[')) {
						System.out.println("NO");
					} else {
						list.remove(ch);
						list.remove(']');
					}
				}
				break;
			}
			case ')': {
				if (stack.size() > 0) {
					Character ch = stack.pop();					
					if (!ch.equals('(')) {
						System.out.println("NO");
					} else {
						list.remove(ch);
						list.remove(')');
					}
				}
				break;
			}

			}

		}
		System.out.println(list);
		if (stack.size() > 0 || list.size() > 0) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

	}

}