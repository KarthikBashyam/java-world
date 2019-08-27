package com.tips.datastructures;

public class MyQueue {

	private int arr[];
	private int capacity;
	private int rear = -1;
	private int front = 0;
	private int count = 0;

	public MyQueue(int size) {
		arr = new int[size];
		capacity = size;
	}

	public void enqueue(int item) {

		if (isFull()) {
			return;
		}

		rear = (rear + 1) % capacity;
		arr[rear] = item;
		++count;
	}

	public void dequeue() {

		if (isEmpty()) {
			return;
		}
		System.out.println("Removed:" + arr[front]);
		front = (front + 1) % capacity;
		--count;
	}

	public int peek() {
		return arr[front];
	}

	public boolean isFull() {
		return size() == count;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		return capacity;
	}

	public static void main(String[] args) {

		MyQueue myQueue = new MyQueue(5);
		myQueue.enqueue(5);
		myQueue.enqueue(6);
		myQueue.enqueue(7);
		myQueue.enqueue(8);
		myQueue.enqueue(9);
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();

	}

}
