package designpattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Two_Pointer {

	// two sum

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		twoSum(nums, target);
		System.out.println(Arrays.toString(twoSum1(nums, target)));
	}

	private static int[] twoSum1(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target)
					return new int[] { i, j };
			}
		}
		return new int[] { 0, 0 };
	}

	private static void twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int rem = target - nums[i];
			if (map.containsKey(rem)) {
				System.out.println(i + " " + map.get(rem));
			}
			map.put(nums[i], 1);
		}
	}

}
