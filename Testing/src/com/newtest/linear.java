package com.newtest;

public class linear {

	public static void main(String[] args) {
		int target = 5;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(linearSearch(arr, target)); // o\p:4
		System.out.println(binarySearch(arr, target)); // o\p:4

	}

	private static int binarySearch(int[] arr, int target) {

		int left = 0;
		int right = arr.length - 1;
		
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				return mid;

			} else if (target < arr[mid]) {
				right = mid - 1;

			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	private static int linearSearch(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}

		return -1;
	}
}
