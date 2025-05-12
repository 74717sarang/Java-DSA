package com.newtest;

public class startArray {

	private static int findmaxProduct(int[] arr, int sub) {

		int max = 0;
		for (int i = 0; i <= arr.length - sub; i++) {
			int current = 1;
			for (int j = i; j < i + sub; j++) {
				current *= arr[j];
			}
			max = Math.max(max, current);
		}

		return max;
	}

	private static int findmaxaddition(int[] arr, int sub) {
		int max = 0;

		for (int i = 0; i <= arr.length - sub; i++) {
			int currSum = 0;
			for (int j = i; j < sub + i; j++) {
				currSum += arr[j];
			}
			max = Math.max(max, currSum);
		}
		return max;
	}

	private static int findmaxadditionSliding_Window(int[] arr, int sub) {
		int sum = 0;
		for (int i = 0; i < sub; i++) {
			sum += arr[i];
		}
		int currSum = sum;
		
//		for (int i = 0; i < arr.length - sub; i++) {
//			currSum = currSum + arr[i + sub] - arr[i];
//			sum = Math.max(sum, currSum);
//		}
		
		// other way
		for(int i=sub;i<arr.length;i++) {
			currSum+=arr[i]-arr[i-sub];
			sum = Math.max(sum, currSum);
		}
		return sum;
	}

	public static void main(String[] args) {
		int sub = 3;
		int[] arr = new int[] { 4, 5, 6, 1, 2, 1, 1, 10 };
		System.out.println(findmaxProduct(arr, sub));
		System.out.println(findmaxaddition(arr, sub));
		System.out.println("window Sum: " + findmaxadditionSliding_Window(arr, sub));

	}

}
