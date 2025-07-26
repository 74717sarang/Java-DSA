package tric;

import java.util.Arrays;

public class MoveZeroesToRight {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };

		System.out.println(Arrays.toString(arr));

		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != 0) {
//				arr[count++] = arr[i];   //non zero add
//			}
//		}
//		while (count < arr.length) {
//			arr[count++] = 0;            // remaing ele is zero
//		}
//		System.out.println("rightShift");
//		System.out.println(Arrays.toString(arr));

		count = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[count--] = arr[i];
			}
		}
		while (count >= 0) {
			arr[count--] = 0;
		}

		System.out.println("LeftShift");
		System.out.println(Arrays.toString(arr));

	}

}
