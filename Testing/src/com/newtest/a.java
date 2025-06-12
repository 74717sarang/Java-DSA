package com.newtest;

public class a {
	public static void main(String[] args) {
        String s="abc";
        String str="";
        for(int i=0;i<s.length();i++) {
        	str+=s.charAt(s.length()-i-1);
        }
        System.out.println(str);
	}
}
