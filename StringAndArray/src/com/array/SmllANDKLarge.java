package com.array;

public class SmllANDKLarge {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 1, 2, 3, 9 };

		int large = Integer.MIN_VALUE;
		int small =   Integer.MAX_VALUE;
  
		int l = arr[0], s = arr[0];
		for (int i : arr) {
			if (i > l) {
				l = i;
			} else if (i < s)
				s = i;
		}
		System.out.println(s + " " + l);

		for (int i : arr) {
			if (i > large) {
				large = i;
			} else if (i < small) {
				small = i;
			}

		}
		System.out.println(small + " " + large);
	}
}
