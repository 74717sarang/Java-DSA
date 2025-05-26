package com.newtest;

import java.util.Stack;

public class newstringpara {

	private static boolean isBalancedcheck(String str) {
		Stack<Character> stack = new Stack<>();

		for (char c : str.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			} else {
				if (stack.isEmpty() || stack.pop() != '(')
					return false;

			}
		}

		return stack.isEmpty();
	}

//
	private static boolean Recursion(String str, int left, int rigth) {
		if (left >= rigth)
			return true;
		if (str.charAt(rigth) != str.charAt(left))
			return false;

		return Recursion(str, ++left, --rigth);
	}

	public static void main(String[] args) {

		String str = "((())";
		System.out.println(isBalancedcheck(str));
		String s = "abcba";
		System.out.println(Recursion(s, 0, s.length() - 1));

	}

}
