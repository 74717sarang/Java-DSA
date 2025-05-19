package com.newtest;

public class CountChar {

	public static void main(String[] args) {
		String str="abcabcA";

		char[]arr=str.toCharArray();
	    int c;
	    
	    for(int i=0;i<arr.length;i++) {
	    	c=1;
	    	for(int j=i+1;j<arr.length;j++) {
	    		if(arr[i]==arr[j]) {
	    			c++;
	    			arr[j]='0';
	    		}
	    	}
	    	if(arr[i]!='0')
	    	System.out.println(arr[i]+" times "+c);
	    }
		
	}
}
