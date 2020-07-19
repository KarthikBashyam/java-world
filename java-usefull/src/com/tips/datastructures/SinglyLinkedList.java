package com.tips.datastructures;

/**
 * Singly Linked List.
 * 
 * @author Karthik Bashyam.
 *
 * @param <E>
 */
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

		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		tail = newNode;
		++size;

	}

	public void printList() {

		Node<E> temp = head;
		while (temp != null) {
			System.out.print(temp.getElement() + "->");
			temp = temp.next;
		}
	}

	public void delete(E element) {

		Node<E> temp = head;

		if (element.equals(head.getElement())) {
			head = head.next;
			return;
		}

		while (temp != null && !temp.getElement().equals(element)) {

			temp = temp.next;
		}

	}

	public Node<E> getHead() {
		return head;
	}

	public void setHead(Node<E> head) {
		this.head = head;
	}

	public Node<E> getTail() {
		return tail;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		return size;
	}

	public void findMiddle() {

		Node<E> sp = this.head;
		Node<E> fp = this.head;

		while (fp != null && fp.next != null) {

			sp = sp.next;
			fp = fp.next.next;
		}

		System.out.println("Middle:" + sp.getElement());

	}

	public static void main(String[] args) {

		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		list.addFirst("Hello");
		list.addLast("World");
		list.addLast("List");

		list.printList();

		// Reverse
		System.out.println("==== REVERSE ===");
		Node<String> prev = null;
		Node<String> curr = list.head;
		Node<String> next = null;

		while (curr != null) {

			next = curr.next;
			curr.next = prev;

			prev = curr;
			curr = next;
		}
		list.setHead(prev);
		list.printList();

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

		public void setNext(Node<E> next) {
			this.next = next;
		}

	}
}