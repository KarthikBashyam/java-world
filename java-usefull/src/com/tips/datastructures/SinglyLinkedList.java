package com.tips.datastructures;

public class SinglyLinkedList<E> {

	private Node<E> head;

	private Node<E> tail;

	private int size;

	public void addFirst(E element) {

		this.head = new Node<E>(element, head);

		if (isEmpty()) {
			this.tail = head;
		}
		++size;
	}
	
	public void addLast(E element) {
		
		Node<E> newNode = new Node<E>(element, null);
		
		if(isEmpty()) {
			head = newNode;			
		} else {
			tail.next = newNode;
		}
		tail = newNode;
		++size;
		
	}

	public Node<E> getHead() {
		return head;
	}
	
	public Node<E> getTail() {
		return tail;
	}
	
	
	private boolean isEmpty() {
		return size() == 0;
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		
		SinglyLinkedList<String> list = new SinglyLinkedList<>();
		list.addFirst("Hello");
		list.addLast("World");
		list.addLast("Data");
		list.addLast("Structures");
		
		System.out.println(list.getTail().getElement());
		
	}

	// List Node
	static class Node<E> {

		private E element;

		private Node<E> next;

		public Node(E e, Node<E> next) {
			this.element = e;
			this.next = next;
		}

		public E getElement() {
			return element;
		}

		public Node<E> getNext() {
			return next;
		}

	}

}
