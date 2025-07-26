package com.test;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		int[] arr1 = { 2,5,6 };
		int arr2[] = { 1,2,3};
        int m=3,n=3;
		merge(arr1, arr2,m,n);
	}

	public static void merge(int[] arr1, int[] arr2,int m,int n) {
         int l=m+n;
//          arr1=new int[l];
		int []result=new int[l];
		int count=0;
	       for(int i=0;i<arr1.length;i++) {
	    	   if(arr1[i]!=0) {
	    		   result[count++]=arr1[i];
	    	   }
	       }
		    
	       for(int i=0;i<arr2.length;i++) {
	    	   if(arr2[i]!=0) {
	    		   result[count++]=arr2[i];
	    	   }
	       }
		
		Arrays.sort(result);
		System.out.println(Arrays.toString(result) );
	}

}
