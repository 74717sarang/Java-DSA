package string;

public class Rotated_palindrome {

//	Check if a string is a rotated palindrome or not

	public static boolean isPalidrome(String s) {
		int left = 0, right = s.length()-1;
		while (left < right) {
			if (s.charAt(right) != s.charAt(left))
				return false;
			left++;
			right--;
		}

		return true;
	}

	public static boolean isRotatedPalindrome(String s) {

		String add = s + s;

		for (int i = 0; i < s.length(); i++) {
			String rotated = add.substring(i, i + s.length());
			if (isPalidrome(rotated))
				return true;
		}
		return false;

	}

	public static void main(String[] args) {
		String s = "aab";
		System.out.println(isRotatedPalindrome(s) ? "Yes" : "No"); // Output: Yes
	}

}
