package com.array;

import java.util.Arrays;

public class TestArray {

	// reverse int in one for loop without extra variable
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	System.out.println();
	
	int []index1= {4,2,5,7,1,3};
	int inedx=6,sum=0;
	
	for(int i:index1) {
	    sum^=i;
	    System.out.println(sum); 
	}
	System.out.println(1^1);
	System.out.println(1^2);
	System.out.println(1^3);
System.out.println();
	System.out.println(2^1);
	System.out.println(2^2);
	System.out.println(2^3);
	System.out.println(2^4);
	
	
	}
}
