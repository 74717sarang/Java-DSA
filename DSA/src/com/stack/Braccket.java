package com.stack;

import java.util.Stack;

public class Braccket {

	public static void main(String[] args) {

		
		String s="()()()";
		int count=0;
		  char[]ch=s.toCharArray();
		
			for(int i=0;i<ch.length;i++) {
			   if(s.charAt(i)=='(') {
				   if(s.charAt(i+1)==')') {
					 count++;   
				   }
			   }
			
		}
		System.out.println("Count::"+count);
	}

}
