package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MinimunNoRemove {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

//		list.add(10);list.add(20);list.add(110);list.add(105);list.add(5);
//		list.forEach(i->System.out.println(i));
//         System.out.println();
//		list.sort((i,j)->i.compareTo(j));
//		list.remove(0);
//		list.forEach(i->System.out.println(i));

		int[] arr = new int[] { 5, 8, 6, 1, 2, 3, 4, 9 };
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//
//			}
//
//		}

		Arrays.sort(arr);
		int[] arr1 = new int[arr.length - 1];
		int j = 1;
		for (int i = 0; i < arr1.length;) {
			arr1[i++] = arr[j];
			j++;
		}
		System.out.println("After remove 1st");

		for (int k : arr1) {
			System.out.println(k);
		}

		int []arr2=new int [arr.length-1];
		//int k=arr.length-2;
		int k=0;
		System.out.println("k::"+arr[k]);
		for(int i=0;i<arr.length-1;i++) {
		      if(k==arr.length)return;
			arr2[i]=arr[k];
		   k++;
		}
		
		System.out.println("After remove last");

		for (int kk : arr2) {
			System.out.println(kk);
		}
	}
}
