package com.star;

public class Daimond {

	public static void main(String[] args) {

		int n = 5/2;

		for (int i = 0; i <= n; i++) {
			// Print leading spaces
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			// Print stars
			for (int j = 0; j < 2*i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		n=5/2;
		for(int i=n;i>=0;i--) {
			
			for(int p=0;p<n-i;p++) {
				
				System.out.print(" ");
			}
			
			for(int f=0;f<2*i+1;f++) {
				System.out.print("*");
			}
			System.out.println();
		}
	           
		
		
		
	}
}
