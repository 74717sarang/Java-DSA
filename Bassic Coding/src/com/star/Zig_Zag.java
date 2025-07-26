package com.star;

public class Zig_Zag {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 7; j++) {
				if (j == 0 || j == 6 || j == i + 2 || i == 1) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
int no=7;
		for (int i = 0; i < no; i++) {
			for (int j = 0; j < no - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		
		for(int i=0;i<no;i++) {
			  for(int j=0;j<no-i;j++) {
				  System.out.print(" ");
			  }
			  for(int k=0;k<2*i+1;k++) {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
		System.out.println();
	}

}
