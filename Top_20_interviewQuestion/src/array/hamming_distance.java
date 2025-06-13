package array;

public class hamming_distance {

//	Q9: Find a rotation with maximum hamming distance?
	public static void main(String[] args) {

		int[] arr = { 1, 4, 1 };
		System.out.println("Max Hamming Distance: " + bruteForce(arr));
		System.out.println("Max Hamming Distance: " + advance(arr));

	}

	private static int advance(int[] arr) {
		 int n = arr.length;
	        int[] brr = new int[2 * n];
	        // Concatenate array to itself
	        for (int i = 0; i < n; i++) {
	            brr[i] = arr[i];
	            brr[i + n] = arr[i];
	        }

	        int maxHamming = 0;

	        // Only need to check first n-1 rotations
	        for (int i = 1; i < n; i++) {
	            int currHamming = 0;
	            for (int j = 0; j < n; j++) {
	                if (arr[j] != brr[i + j]) {
	                    currHamming++;
	                }
	            }
	            maxHamming = Math.max(maxHamming, currHamming);

	            // If we get max possible Hamming distance (n), break
	            if (maxHamming == n) {
	                break;
	            }
	        }
	        return maxHamming;
	}

	private static int bruteForce(int[] arr) {

		int distance = 0;
		for (int i = 1; i < arr.length; i++) {
			int current = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] != arr[(i + j) % arr.length]) {
					current++;
				}
			}
			distance = Math.max(distance, current);
		}

		return distance;
	}

}
