package com.newtest;

public class child extends base {
	int baseint=20;
	
	public child() {
		baseint=30;
	}
	
	public static void main(String[] args) {
		
		child c=new child();
		System.out.println(c.baseint);
		
		base b= new base();
		System.out.println(b.baseint);
	}
}
