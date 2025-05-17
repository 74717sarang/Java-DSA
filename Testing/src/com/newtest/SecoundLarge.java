package com.newtest;

public class SecoundLarge {
//	private static int findSecoundSmallestEle(int[] arr) {
//
//		int min = 1110;
//		int secondmin = 110;
//
//		for (int i : arr) {
//			if (i < min) {
//				secondmin = min;
//				min = i;
//			} else if (min < i && i < secondmin) {
//				secondmin = i;
//			}
//		}
//
//		return secondmin;
//	}

	private static int findSecoundLargestEle(int[] arr) {
		int max = 0;
		int secoundmax = 0;

		for (int i : arr) {
			if (i > max) {
				secoundmax = max;
				max = i;
			} else if (max > i && secoundmax < i) {
				secoundmax = i;
			}
		}

		return secoundmax;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 8, 9, 7, 5, 4, 2 };
		System.out.println("SecoundLargestElement=" + findSecoundLargestEle(arr));
		// 8

//		System.out.println("SecoundSmallestElement=" + findSecoundSmallestEle(arr));
		// 2
	}

}
