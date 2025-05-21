package com.newtest;

public class Node {

	int data;
	Node next;

//	public Node() {
//		next = null;
//	}
//
//	public Node(int data) {
//		this.data = data;
//		this.next = null;
//	}


	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}


	public Node getNext() {
		return next;
	}
		
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}
