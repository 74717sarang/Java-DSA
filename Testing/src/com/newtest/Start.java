package com.newtest;


public class Start {

	public static int factoRecursion(int no) {
		if (no == 0)
			return 1;
		return no * factoRecursion(no - 1);
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

		no = 4;

		System.out.println("factorial of No 4 :" + factoRecursion(no));
		int fact = 1;
		while (no > 0) {
			fact = no * fact;
			no--;
		}
		System.out.println("use while loop:" + fact);
		no = 4;
		fact = 1;
		for (int i = 0; i<=no; i++) {
			fact = no * fact;
			no--;
		}

		System.out.println("use for loop:" + fact);

		System.out.println();
		
		int n1=0;
		int n2
		=1;
		int n3;
		
		System.out.println("fibonachi::");
		System.out.print(n1+" ");
		no=5;
		for(int i=0;i<no;i++) {
		n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		}
		System.out.println();
		
		int []arr= {1,5,3,9,8,2,7};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			max=max<arr[i]? arr[i]: max;
		}
		System.out.println("max ele: "+max);
		int secmax = 0,m3=0;
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>secmax && max > arr[i]) {
			secmax=arr[i]; 	
			}
		
		}
		System.out.println("secound high: "+secmax);
		
		
		
		int year=2001;
		
		System.out.println("leepyear:: "+findLeep(year));
		
		
	}

	private static boolean findLeep(int year) {

		return year%4==0&&year%100!=0||year%400==0;
	}
}
