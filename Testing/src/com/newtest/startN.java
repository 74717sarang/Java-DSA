package com.newtest;

public class startN {

	public static void main(String[] args) {

		
		int no=123;
		
		int rem,rev=0;
		int n=no;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println(rev);
	}

}
