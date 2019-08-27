package com.tips.datastructures;

public class Mystack<T> {

	private T[] array = null;

	private int index = -1;

	private T min;

	@SuppressWarnings("unchecked")
	public Mystack(int size) {
		array = (T[]) new Object[size];
	}

	public void push(T element) {
		if (index > array.length - 1) {
			throw new StackOverflowError();
		}
		array[++index] = element;

	}

	public T pop() {
		if (index < 0) {
			throw new IndexOutOfBoundsException();
		}
		return array[index--];
	}

	public T min() {
		return min;
	}

	public static void main(String[] args) {

		Mystack<Integer> mystack = new Mystack<>(10);
		mystack.push(1);
		mystack.push(2);
		mystack.push(3);
		mystack.push(4);
		mystack.push(5);
		mystack.push(6);
		mystack.push(7);
		mystack.push(8);
		mystack.push(9);
		mystack.push(10);

		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());		


	}

	// Queue
	// List --
	// Fibonacci series --
	// Palindrome --
	// SquareRoot
	// Prime number
	// Power

}
