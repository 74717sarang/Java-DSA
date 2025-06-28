package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class count {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 6, 3, 5, 5 };

		fun1(arr);
		fun2(arr);
	}

	private static void fun2(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> i : map.entrySet()) {
			System.out.println(i.getKey() + " Times " + i.getValue());
		}

		System.out.println();
		for (int i : map.values()) {
			if (i > 1)
				System.out.println(i);
		}
	}

	private static void fun1(int[] arr) {

//		int[]arr= {1,2,5,6,3,5,5};

		int[] frq = new int[10];

		for (int i = 0; i < arr.length; i++) {
			frq[arr[i]]++;
		}
		System.out.println();
		for (int i = 0; i < frq.length; i++) {
			if (frq[i] > 1)
				System.out.println("New " + arr[i] + " times max " + frq[i]);

		}
         System.out.println();
	}
}
