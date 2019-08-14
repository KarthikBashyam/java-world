package com.tips.datastructures;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

public class Mystack<T> {

	private T[] array = null;

	private int INITIAL_CAPACITY = 10;

	private int index = 0;

	@SuppressWarnings("unchecked")
	public Mystack() {
		array = (T[]) new Object[INITIAL_CAPACITY];
	}

	public void push(T element) {
		if (index > array.length - 1) {
			array = Arrays.copyOf(array, array.length * INITIAL_CAPACITY);
		}
		array[index++] = element;
	}

	public T pop() {		
		if(index < 0) {
			throw new IndexOutOfBoundsException();
		}		
		return array[index--];
	}
	
	public static void main(String[] args) {
		
		Mystack<Integer> mystack = new Mystack<>();
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
		mystack.push(11);
		mystack.push(12);
		
		
		System.out.println(mystack.pop());
		System.out.println(mystack.pop()); 
		System.out.println(mystack.pop()); 
		System.out.println(mystack.pop()); 
		System.out.println(mystack.pop()); 
		System.out.println(mystack.pop());
		
	
	}
	
	//Queue
	//List -- 
	//Fibonacci series -- 
	//Palindrome --
	//SquareRoot
	//Prime number
	//Power

}
