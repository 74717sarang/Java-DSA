package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideIntoSubArray {

	public static void main(String[] args) {
		/*
		int[]arr= {1,2,3,4,5,6,7,8,9};
		int count=3;
		int [][]result=subArray(arr,count);
		
		for(int i=0;i<result.length;i++) {
			int max=0;
			int n=0;
			for(int j=0;j<result.length;j++) {
				System.out.print(result[i][j]+" ");
				 n=0;
				n+=result[i][j];
			// max=n>max?(max=n):(1);
			

			}
			System.out.print(" ::"+n);
			System.out.println();
			*/
		
		
		int[] array = {1, 2, 3, 4, 5, 6};

        int subArraySize = 2;
         
        List<Integer> subarraySums = new ArrayList<>();
         int[]arraySum=new int[array.length];
        for (int i = 0; i < array.length; i += subArraySize) {
            int sum = 0;
            for (int j = i; j < i + subArraySize && j < array.length; j++) {
                sum += array[j];
            }
            subarraySums.add(sum);  // Add the sum to the list
            arraySum[i]=sum;
            System.out.println("arraysums: " + arraySum[i]);        }
       // System.out.println("arraysums: " + arraySum[0]+" "+arraySum[1]+" "+arraySum[2]);

           Arrays.sort(arraySum);
           System.out.println("arrsum::"+arraySum[1]);
        System.out.println("Subarray sums: " + subarraySums);
		}
		
	

	
	
}
