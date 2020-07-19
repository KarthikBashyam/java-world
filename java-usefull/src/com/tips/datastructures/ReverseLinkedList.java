package com.tips.datastructures;

import java.util.Stack;

import com.tips.datastructures.SinglyLinkedList.Node;

public class ReverseLinkedList {

	public static void main(String[] args) {

		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		list.addFirst("Hello");
		list.addLast("World");
		list.addLast("Java");
		list.addLast("Test");
		//list.printList();

		
		Stack<Node<String>> stack = new Stack<>();

		Node<String> temp = list.getHead();
		
		while(temp != null) {
			stack.push(temp);
			temp = temp.getNext();
		}
		
		
		Node<String> head = stack.pop();
		Node<String> tail = head;		
		
		
		while(stack.size() > 0) {
			Node<String> temp1 = stack.pop(); 
			tail.setNext(temp1);;
			tail = temp1; 
		}	
		
		list.setHead(head);
		list.printList();
		
		

		
	}

}