package com.tips.datastructures;

import java.util.Arrays;

public class MyArrayList<E> {

	private E[] elements;

	private int INITIAL_CAPACITY = 10;

	private int size = 0;

	@SuppressWarnings("unchecked")
	public MyArrayList() {
		elements = (E[]) new Object[INITIAL_CAPACITY];
	}

	public void add(E element) {
		increaseCapacity();
		elements[size] = element;
		++size;
	}

	public void add(int index, E element) {
		if (index < 0 || index > size - 1) {
			throw new IndexOutOfBoundsException("Invalid index :" + index);
		}
		increaseCapacity();
		System.arraycopy(elements, index, elements, index + 1, elements.length - index - 1);
		elements[index] = element;
		++size;
	}

	public E get(int index) {

		if (index < 0 || index > size - 1) {
			throw new IndexOutOfBoundsException("Invalid index :" + index);
		}
		return elements[index];
	}

	public void remove(int index) {

		if (index < 0 || index > size - 1) {
			throw new IndexOutOfBoundsException("Invalid index :" + index);
		}
		elements[index] = null;
		System.arraycopy(elements, index + 1, elements, index, elements.length - index - 1);
		--size;
	}

	public int size() {
		return size;
	}

	private void increaseCapacity() {
		if (size >= elements.length) {
			elements = Arrays.copyOf(elements, elements.length * INITIAL_CAPACITY);
		}
	}

	public static void main(String[] args) {

		MyArrayList<Integer> arrayList = new MyArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.get(3));
		arrayList.add(2, 20);
		System.out.println("Size :" + arrayList.size());
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.get(3));
	}

}
