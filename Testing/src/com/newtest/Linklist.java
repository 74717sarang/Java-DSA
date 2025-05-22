package com.newtest;

public class Linklist {

	Node head;

	public Linklist() {
		head = null;
	}

	public Linklist(int data) {
		if (head == null)
			head = new Node(data);
	}


}
