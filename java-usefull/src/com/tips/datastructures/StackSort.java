package com.tips.datastructures;

import java.util.Stack;

public class StackSort {

	public static void main(String[] args) {

		Stack<Integer> stack1 = new Stack<>();
		stack1.push(3);
		stack1.push(1);
		stack1.push(9);
		stack1.push(6);

		Stack<Integer> stack2 = new Stack<>();

		while (!stack1.isEmpty()) {

			int temp = stack1.pop();

			while (!stack2.isEmpty() && stack2.peek() > temp) {
				stack1.push(stack2.pop());
			}
			stack2.push(temp);
		}

		// Populate into Stack1.
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}

		while (!stack1.isEmpty()) {
			System.out.println(stack1.pop());
		}

	}

}
