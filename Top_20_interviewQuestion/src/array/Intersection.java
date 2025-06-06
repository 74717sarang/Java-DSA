package array;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

	
//	Q6: Write a java program to find the intersection of two arrays?
	
	public static void main(String[] args) {

		int[] array1 = { 1, 2, 4, 5, 6 };
		int[] array2 = { 2, 3, 5, 7 };

		brouteForce(array1, array2);
		advance(array1, array2);
	}

	private static void advance(int[] array1, int[] array2) {
		Set<Integer> set = new HashSet<>();
		for (int i : array1) {
			set.add(i);
		}

		for (int i : array2) {
			if (set.contains(i)) {
				System.out.println("intersection" + i);
			}
		}
	}

	private static void brouteForce(int[] array1, int[] array2) {

		for (int i : array1) {
			for (int j : array2) {
				if (i == j) {
					System.out.println("intersection " + i);
				}
			}
		}

	}

}
