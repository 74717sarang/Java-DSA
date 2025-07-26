package com.test;

public class Question1 {

	public static void main(String[] args) {

		String s = "A man a plan a canal:Panama";
//           s="race a car";
		boolean tag =isPalidrome(s);

		if (tag) {
			System.out.println("is palidrome");
		}
		System.out.println("tag " + tag);
//		System.out.printf("%c",'a');
	}

	private static boolean isPalidrome(String s) {

		if(s.equals("")) return true;
		
		String str = s.toLowerCase();
		StringBuilder newStr = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (c >= 97 && c <= 122) {
				newStr.append(c);
			}
		}
		
		   System.out.println("nor "+newStr.toString());
            System.out.println();
		   System.out.println("rev "+newStr.reverse().toString());
		   String ss=newStr.toString();
		for(int i=0;i<=ss.length()/2;i++) {
			
			if(ss.charAt(i)!=ss.charAt(ss.length()-1-i)) {
				System.out.println(ss.charAt(i)+" "+ss.charAt(ss.length()-1-i));
				System.out.println(i); 
				return false;
			}
		}
		return true;
       
	}

}
