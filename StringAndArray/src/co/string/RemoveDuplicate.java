package co.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

//	3. Remove duplicates from a string — efficiently.

	private static String removeDuplicates(String input) {

		StringBuilder result = new StringBuilder();
		Set<Character> set = new HashSet<>();

		for (char c : input.toCharArray()) {
			if (!set.contains(c)) {
				result.append(c);
			}
			set.add(c);

		}

		return result.toString();
	}

	public static String removeDuplicatesnew(String str) {
		StringBuilder result = new StringBuilder();

		boolean[] seen = new boolean[256]; // Assuming ASCII

		for (char c : str.toCharArray()) {
			if (!seen[c]) {
				seen[c] = true;
				result.append(c);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String input = "programming";
		System.out.println(removeDuplicates(input)); // Output: "progamin"
		System.out.println(removeDuplicatesnew(input));
	}
}
