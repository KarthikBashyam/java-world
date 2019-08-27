package com.tips.datastructures;

import java.util.Stack;

public class QueueUsingStack {

	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

	public QueueUsingStack() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	public void enqueue(int element) {

		stack1.push(element);

	}

	public int dequeue() {

		if (!stack2.isEmpty()) {
			return stack2.pop();
		}

		while (!stack1.isEmpty()) {

			stack2.push(stack1.pop());
		}

		return stack2.pop();

	}

	public static void main(String[] args) {

		QueueUsingStack queueUsingStack = new QueueUsingStack();
		queueUsingStack.enqueue(10);
		queueUsingStack.enqueue(20);
		queueUsingStack.enqueue(30);
		queueUsingStack.enqueue(40);
		queueUsingStack.enqueue(50);
		
		System.out.println(queueUsingStack.dequeue());
		System.out.println(queueUsingStack.dequeue());
		System.out.println(queueUsingStack.dequeue());
		System.out.println(queueUsingStack.dequeue());
		System.out.println(queueUsingStack.dequeue());

	}

}
