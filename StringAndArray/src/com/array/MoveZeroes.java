package com.array;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {0, 1, 0, 0, 1, 1, 1, 0};
		 int zeroCount=0;
		 for(int i:arr) {
			 if(i==0) zeroCount++;
		 }
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=i< zeroCount ? 0:1  ;
		 }
		 for(int i:arr) {
			 System.out.print(i+" ");
			 
		 }
	}

}
