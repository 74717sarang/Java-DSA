package array;

public class BinarySearch {

	public static void main(String[] args) {
		int target = 5;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("Binary Search " + binarySearch(arr, target));
	}

	private static int binarySearch(int[] arr, int target) {

		int left = 0, right = arr.length - 1;
		int mid = (left + right) / 2;
		while (left <= right) {
			if (arr[mid] == target) {
				return mid;
			}
			mid = (left + right) / 2;

			if (arr[mid] < target) {
				left = mid + 1;
			} else if (target < arr[mid]) {
				right = mid - 1;
			}
		}

		return -1;
	}

}