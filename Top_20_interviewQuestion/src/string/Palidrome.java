package string;

import java.util.Stack;

public class Palidrome {

//	Best Choice:
//		StringBuilder approach – Best for simple implementation and fast execution.
//		Character Array (Two-pointer technique) – Most space-efficient and works well for large strings.

//	🔹 Verdict:
//		If you want ease of use → StringBuilder ✅
//		If you want lowest space usage → Character Array (Two Pointers) ✅

	private static boolean fun1(String str) {

		int left = 0, right = str.length() - 1;
		while (left < right) {
			if (str.charAt(right) != str.charAt(left))
				return false;
			left++;
			right--;
		}
		return true;
	}

	private static boolean fun2(String str) {

		String s = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			s += str.charAt(i);
		}
		return s.equals(str);

	}

	private static boolean fun3(String str) {

		int right = str.length() - 1;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(right) != str.charAt(i))
				return false;
			right--;
		}

		return true;

	}

	private static boolean Recursion(String str, int left, int right) {

		if (left >= right)
			return true;
		if (str.charAt(right) != str.charAt(left))
			return false;
		return Recursion(str, left + 1, right - 1);
	}

	private static boolean direct(String str) {

		String s = new StringBuffer(str).reverse().toString();

		return s.equalsIgnoreCase(str);
	}

	private static boolean usestack(String str) {

		Stack<Character> st = new Stack<>();
//	        for(int i=0;i<str.length();i++) {
//	        	st.push(str.charAt(i));
//	        }
		for (char c : str.toCharArray())
			st.push(c);

		StringBuilder s = new StringBuilder();
		while (!st.isEmpty()) {
			s.append(st.pop());
		}
		return str.equalsIgnoreCase(s.toString());
	}

	public static void main(String[] args) {

		String str = "abcba";
		System.out.println(fun1(str));
		System.out.println(fun2(str));
		System.out.println(fun3(str));
		System.out.println("Using Recursion");
		System.out.println(Recursion(str, 0, str.length() - 1));
		System.out.println(direct(str));
		
		System.out.println("useStack ");
		System.out.println(usestack(str));

	}

}
