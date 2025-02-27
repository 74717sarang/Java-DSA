package com.stack;

public class StackCreate {
  
	int top;
	int size;
	int []arr;
	public StackCreate(int s) {
		top=-1;
		this.size=s;
	   arr= new int[size];
	}
	
	
	public boolean isempty() {
		if(top==-1) {
			return true;
			
		}
		return false;
	}
	
	public boolean isfull() {
		if(top==size-1) {
			return true;
			
		}
		return false;
	}
	
	public void push(int num) {
		if(isfull()) {
			System.out.println("Stack is full...");
			return;
		}
		arr[++top]=num;
		 
		 System.out.println("Done...");
	}
	public int pop() {
		if(isempty()) {
			System.out.println("Stack is empty..");
			return -1;
		}
		return arr[top--];
		
	}
	public int peek() {
		return arr[top];
	}
	
	
	
	
}
