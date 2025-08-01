package array;

import java.util.Arrays;

public class SecondLarge {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 5, 6, 4, 8, 7, 4, 3 };

		System.out.println(secLarge(arr));
		System.out.println(secMin(arr));
		
		// other way is use sort or 2 for loop to sort and return
		
//		Arrays.sort(arr);
//		System.out.println("direct:: "+arr[arr.length-2]);

	}

	private static int  secMin(int[] arr) {
		int min = Integer.MAX_VALUE;   // this compulsory to define max
		int secM =0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secM=min;
				min=arr[i];
			}
			else if(arr[i]> min && arr[i]< secM) {
				secM=arr[i];
			}
		}
		return secM;
	}

	private static int secLarge(int[] arr) {

		int large = arr[0];
		int secL = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				secL = large;
				large = arr[i];
			} else if (arr[i] < large && arr[i] > secL) {
				secL = arr[i];
			}
		}

		return secL;
	}

}
