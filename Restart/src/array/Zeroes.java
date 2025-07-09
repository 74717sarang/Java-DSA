package array;

import java.util.Arrays;

public class Zeroes {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 0, 5, 0, 3, 0 };
//			Arrays.sort(arr);
		System.out.println("Normal");
		System.out.println(Arrays.toString(arr));
		leftMoveZeros(arr);
		System.out.println("New right Move");
		rightMoveZeros(arr);
	}

	private static void rightMoveZeros(int[] arr) {
		int len = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[len++] = arr[i];
			}
		}
		while (len < arr.length) {
			arr[len++] = 0;
		}
		System.out.println(Arrays.toString(arr));

	}

	private static void leftMoveZeros(int[] arr) {

		int len = arr.length;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[--len] = arr[i];
			}
		}

		while (len >= 0) {
			arr[len--] = 0;
		}

		System.out.println("New Left Move");

		System.out.println(Arrays.toString(arr));

	}

}
