package com.tips.datastructures;

import com.tips.datastructures.SinglyLinkedList.Node;

public class StackUsingLinkedList<E> {

	SinglyLinkedList<E> list = new SinglyLinkedList<E>();

	public void push(E element) {
		if (list.isEmpty()) {
			list.addFirst(element);
		} else {
			list.addLast(element);
		}
	}

	public E pop() {

		Node<E> tail = list.getTail();
		E element = tail.getElement();
		list.delete(element);
		return element;
	}

	public E peek() {
		Node<E> tail = list.getTail();
		return tail.getElement();
	}

	public static void main(String[] args) {

		StackUsingLinkedList<String> stack = new StackUsingLinkedList<>();
		stack.push("India");
		stack.push("Karthik");
		stack.list.printList();
		System.out.println("================== POP ==================");
		stack.pop();
		stack.list.printList();

	}

}
