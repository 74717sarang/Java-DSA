package string;

import java.util.Stack;

public class Palidrome {

	public static void main(String[] args) {
//		System.out.println("enter the string");
		String s = "malayalam";
//		String nstr="";
//		char ch[]=s .toCharArray();
//		System.out.println("Hii");

//		System.out.println("for loop "+palidrome_forLoop(s));
		System.out.println("while loop "+palidrome_whileLoop(s));
		System.out.println("h");
		System.out.println("stack loop "+Palidrome.palidrome_stackLoop(s));
//		System.out.println("Hii");


	}

	private static boolean palidrome_forLoop(String s) {
		for (int i = 0; i <= s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
//				System.out.println(s.charAt(i)+" "+s.charAt(s.length()-1-i));
				System.out.println("not Palidrom");
				return false;
			}
		}
		System.out.println("palidrome");
		return true;
	}

	private static boolean palidrome_whileLoop(String s) {

		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				System.out.println("not Palidrom");
				return false;
			}
		}

		System.out.println(" Palidrom");

		return true;

	}

	private static boolean palidrome_stackLoop(String s) {
		
		Stack<Character>stack=new Stack<>();
		
		   for(char c:s.toCharArray()) {
			   stack.push(c);
		   }
		   String str="";
		   
		    while (stack.isEmpty()) {
				str+=stack.pop();
			}
		System.out.println(str.equals(s)+" stack");
		return str.equals(s);

	}

}
