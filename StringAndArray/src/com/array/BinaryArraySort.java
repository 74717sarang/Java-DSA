package com.array;

import java.util.Arrays;

public class BinaryArraySort {

	public static void main(String[] args) {

		int[] arr = new int[] { 0, 1, 0, 0, 1, 1, 1, 0 };

		//Arrays.sort(arr);
		int zeroCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zeroCount++;
			}
		}
		for (int j = 0; j < zeroCount; j++) {
			arr[j] = 0;
		}

		for (int j = zeroCount; j < arr.length; j++) {
			arr[j] = 1;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(" "+arr[j]); 
		}

	}
}
