package com.patterns.bst;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree(Node root) {
		super();
		this.root = root;
	}

	public void insert(int data) {

		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
			return;
		}

		Node temp = root;

		while (true) {

			if (data > temp.data) {
				temp = temp.right;
				if (temp == null) {
					temp = newNode;
					return;
				}
			} else {
				temp = temp.left;
				if (temp == null) {
					temp = newNode;
					return;
				}
			}

		}

	}
	
	
	public void delete(int data) {
		
		
		
	}
	
	

}
