package com.basic;

public class test {

	public static void main(String[] args) {
		int n = 123;
		int num = n;
		int rev = 0;
		int rem;
		
		
		
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;

		}
		System.out.println(rev);

		String str = Integer.toString(num);
		String sb = new StringBuilder(str.toString()).toString();
		System.out.println(sb);
		String ns = new StringBuilder(Integer.toString(n)).toString();
		System.out.println(ns);
	}
	
	

	public static int factorial(int num) {

		if (num == 1) {
			return num;
		}
		return num * (factorial(num - 1));

	}

}
