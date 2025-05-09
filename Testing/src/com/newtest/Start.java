package com.newtest;

public class Start {
	
	public static  int factoRecursion(int no) {
		if(no==0) return 1;
		return no*factoRecursion(no-1); 
	}

	public static void main(String[] args) {

		System.out.println("Hello Wrods");
//		System.out.println("aDD");

		for (int i = 0; i < 10; i++) {
			System.out.print("*" + " ");
		}
		System.out.println();

		int no = 12;
		System.out.println("the no is :");

		System.out.println(no % 2 == 0);
		
		no=4;
		
		System.out.println("factorial of No 4 :"+factoRecursion(no));
		int fact=1;
		while(no>0) {
		 fact=no*fact;
		no--;
		}
		System.out.println("use while loop:"+fact);
		no=4;
		fact=1;
           for(int i=1;i<=no;i++) {
        	   fact=no*fact;
           }
	
		System.out.println("use for loop:"+fact);

	
	System.out.println("sdf");
	}
}
