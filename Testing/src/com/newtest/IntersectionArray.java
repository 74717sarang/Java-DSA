package com.newtest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArray {
// Q6: Write a java program to find the intersection of two arrays?

	private static int findIntersection(int[] arr1, int[] arr2) {

		int inter = 0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int max = arr1.length > arr2.length ? arr1.length : arr2.length;
		for (int i = 0; i < max; i++) {

		}

		return inter;
	}

	private static int intersection(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<>();

		for (int i : arr1) {
			set.add(i);
		}
		int inter = 0;

		for (int i : arr2) {
			if (set.contains(i)) {
				System.out.println("intersection Found::");
				return i;
			}

		}

		return inter;
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 5, 8, 9, 55, 8, 2, 68, 11 };
		int arr2[] = { 9, 86, 595, 5, 4154, 649, 4 };

		System.out.println(findIntersection(arr1, arr2));
		System.out.println(intersection(arr1, arr2));

	}

}
