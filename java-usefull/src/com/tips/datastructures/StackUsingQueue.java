package com.tips.datastructures;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> queue1 = new ArrayDeque<>();
	Queue<Integer> queue2 = new ArrayDeque<>();

	public void push(int data) {
		queue1.add(data);
	}

	public int pop() {
		
		int returnValue = 0;
		if(queue1.size() > 0) {
			int count = 0;
			while(count <= queue1.size() - 1) {
				 queue2.add(queue1.poll());
				 count++;					
			}
			returnValue = queue1.poll();
			queue1 = queue2;
			
		}
		return returnValue;
	}

	public static void main(String[] args) {

		StackUsingQueue stack = new StackUsingQueue();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
