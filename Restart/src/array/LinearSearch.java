package array;

public class LinearSearch {

	public static void main(String[] args) {
		int target=5;
		int[]arr= {1,2,6,7,3,4,5,9};
		System.out.println("target Index "+linearSearch(arr,target));
	}

	private static int linearSearch(int[] arr, int target) {

		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		
		
		return -1;
	}
}
