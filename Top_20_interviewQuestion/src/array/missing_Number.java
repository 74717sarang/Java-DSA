package array;

public class missing_Number {

	public static void main(String[] args) {
		 int[] nums = {1, 2, 4, 5, 6};
		 int expectedSum = nums.length * (nums.length + 1) / 2;

		 
		 
		 
	        // Sum of array elements
	        int actualSum = 0;
	        for (int num : nums) {
	            actualSum += num;
	        }

	        int missingNumber = expectedSum - actualSum;
	        System.out.println("Missing number is: " + missingNumber);
	}

}
