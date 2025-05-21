package com.newtest;

public class newarr {

	private static int  facto(int n) {
             if(n==1) return 1;
		
		return n*facto(n-1);
	}
	
	private static int  factorial(int n) {
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac*=i;
		}
		
		return fac;
		
	}

	
	public static void main(String[] args) {
		int n=5;
		System.out.println(facto(n));
		System.out.println(factorial(n));
	}

	
}
