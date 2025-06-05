package array;

import java.util.HashMap;
import java.util.Map;

public class CountOfNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 1, 4, 2, 4, 5 };

		bruteForcr(arr);
		System.out.println();

		advance(arr);

	}

	private static void advance(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> i : map.entrySet()) {
			System.out.println(i.getKey() + " Count " + i.getValue());
		}

	}

	private static void bruteForcr(int[] arr) {

		int count;
		boolean[] visited = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (visited[i]) {
				continue; // it skip loop
			}
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;

				}
			}
			System.out.println(arr[i] + " Count " + count);
		}
	}

}
