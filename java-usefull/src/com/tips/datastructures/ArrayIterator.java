package com.tips.datastructures;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
	
	private E[] elements;
	
	private int index = 0;
	
	public ArrayIterator(E[] elements) {
		 this.elements = elements;
	}

	@Override
	public boolean hasNext() {		
		return index < elements.length;
	}

	@Override
	public E next() {		
		return elements[index++];
	}
	
	public static void main(String[] args) {
		
		String[] elements = {"Hello","World","Java"};
		ArrayIterator<String> arrayIterator = new ArrayIterator<>(elements);
		
		while(arrayIterator.hasNext()) {
			System.out.println(arrayIterator.next());
		}
		
	}

}
