
package com.newtest;

import java.util.Scanner;

public class StarNew {
 
	
	  Scanner sc=new Scanner(System.in);
	//double d=  sc.nextLine()
	  
	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
//		*****
		int no=5;
		for(int i=0;i<=no;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println();
		
//		*****
//		****
//		***
//		**
//		*
		 no=5;
		for(int i=no;i>=0;i--) {
			for(int j=0;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println();
		
	
//	     *
//	    **
//	   ***
//	  ****
		for(int i=0;i<=no;i++) {
			for(int j=0;j<no-i;j++) {   //no-i important 
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		for(int i=no;i>=0;i--) {
			for(int j=0;j<no-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*"); 
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
//		* * * * 
//		*     * 
//		*     * 
//		* * * * 
		
		System.out.println();
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if((i==1&& j==1)||(i==1&& j==2)|| (i==2&& j==1)||(i==2&& j==2) ) {
					System.out.print(" "+" ");
				}
				
				else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
//	     *
//	    ***
//	   *****
//	  *******
		
		  for(int i=0;i<no;i++) {
			  for(int j=0;j<no-i;j++) {
				  System.out.print(" ");
			  }
			  for(int k=0;k<2*i-1;k++) {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
		System.out.println();
		
		
//		 *******
//		  *****
//		   ***
//		    *
		
		for(int i=no;i>0;i--) {
			for(int j=0;j<no-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	
//		    1
//		   123
//		  12345
//		 1234567
		 
		  for(int i=0;i<no;i++) {
			  for(int j=0;j<no-i;j++) {
				  System.out.print(" ");
			  }
			  for(int k=1;k<=2*i-1;k++) {
				  System.out.print(k);
			  }
			  System.out.println();
		  }
		System.out.println();
		
		
		
		
		
		}
	}


