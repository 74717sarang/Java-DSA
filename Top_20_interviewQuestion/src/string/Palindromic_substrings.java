package string;

import java.util.HashSet;

public class Palindromic_substrings {

//	Q16: Find all possible palindromic substrings of a string

	public static boolean isPalidrome(String s) {
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (s.charAt(right) != s.charAt(left))
				return false;
			left++;
			right--;
		}

		return true;
	}

	private static void findPalindromicSubstrings(String s) {

		HashSet<String> palindromes = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String str = s.substring(i, j + 1);

				if (isPalidrome(str)) {
					palindromes.add(str);
					System.out.println(str);
				}
			}
		}
//		System.out.println(palindromes);
	}

	public static void main(String[] args) {

		String s = "abba";
		findPalindromicSubstrings(s);
	}

}
