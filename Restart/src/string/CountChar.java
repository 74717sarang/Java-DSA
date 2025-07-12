package string;

import java.util.HashMap;
import java.util.Map;

public class CountChar {

	public static void main(String[] args) {

		String s = "abcabc";
		int[] count = new int[s.length()];
		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			count[i] = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (arr[i] == arr[j]) {
					count[i]++;
					arr[j] = '\0';
				}
			}
			if (arr[i] != '\0')
				System.out.println("char is " + arr[i] + " Counts " + count[i]);
		}
          System.out.println();
		System.out.println("Use HashMap for Count ");
		countusingMap(s);

	}

	private static void countusingMap(String s) {

		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> i : map.entrySet()) {
			System.out.println("char is " + i.getKey() + " Times " + i.getValue());
		}
	}
}
