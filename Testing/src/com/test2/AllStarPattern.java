package com.test2;

public class AllStarPattern {

	public static void main(String[] args) {

		int no = 7;

		// Normal triangle

//		 * 
//		 *  * 
//		 *  *  * 
//		 *  *  *  * 
//		 *  *  *  *  *   
		for (int i = 0; i < no; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" * ");

			}
			System.out.println();
		}

		System.out.println();

		// left side triangle

//	     *
//	    **
//	   ***
//	  ****
//	 *****
//		int n=no;

//		for(int i=0;i<no;i++) {
//			for(int j=0;j<n-1;j++) {
//				System.out.print(" ");
//			
//			}
//			for(int k=0;k<=i;k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//			n--;
//		}	

		for (int i = no; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");

			}
			for (int k = 0; k < no - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// ulta triangle

//	 *  *  *  *  * 
//	 *  *  *  * 
//	 *  *  * 
//	 *  * 
//	 * 
		for (int i = no; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" * ");

			}
			System.out.println();
		}

		System.out.println();

		// ulta left tri

//		 ******
//		  *****
//		   ****
//		    ***
//		     **
//		      *

		for (int i = no; i > 0; i--) {
			for (int j = 0; j < no - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// normal triangle

//	        *
//	       ***
//	      *****
//	     *******
//	    *********

		for (int i = 0; i < no; i++) {
			for (int j = 0; j < no - i; j++) // j<no-1 imp steap
			{
				System.out.print(" ");
			}

			for (int k = 0; k <= 2 * i + 1; k++) // k<=2*i-1 imp step

			{
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// Normal ulta triangle

//		   *********
//		    *******
//		     *****
//		      ***
//		       *

//		*only first loop change*
		for (int i = no; i >= 0; i--) {
			for (int j = 0; j < no - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// Normal Square

//		*******
//		*******
//		*******
//		*******

		for (int i = 0; i < no; i++) {
			for (int j = 0; j < no; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// No triangle

//	       1
//	      123
//	     12345
//	    1234567

		// only print k value
		for (int i = 1; i < no; i++) {
			for (int j = 1; j < no - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= 2 * i - 1; k++) {
				System.out.print(k);
			}
			System.out.println();

		}
		System.out.println();

		// hollow rectangle

//		*******
//		*     *
//		*     *
//		*     *
//		*******

		for (int i = 0; i < no; i++) {
			for (int j = 0; j < no; j++) {
				if (i == 0 || i == no - 1 || j == 0 || j == no - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();

		// Daimond

//	     *
//	    ***
//	   *****
//	  *******
//	 *********
//	  *******
//	   *****
//	    ***
//	     *

//		make triangel
		for (int i = 0; i < no; i++) {
			for (int j = 0; j < no - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		uilta triangle logic outer loop change
		for (int i = no; i >= 0; i--) {
			for (int j = 0; j < no - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// mirrored diamond-like pattern

//		 *******
//		  *****
//		   ***
//		    *
//		   ***
//		  *****
//		 *******

		for (int i = no; i > 0; i--) {
			for (int j = 0; j < no - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 2; i <= no; i++) {
			for (int j = 0; j < no - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// hollow triangle

//	    *
//	   * *
//	  *   *
//	 *     *
//	*********

		int j = 0;
		for (int i = 1; i <= no; i++) {
			for (j = 0; j < no - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				if (k == 1 || k == 2 * i - 1 || i == no) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
         System.out.println();
         
        
         
         
         
         
	}
}