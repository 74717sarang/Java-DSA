package com.array;

public class CountOfChar {

	public static void main(String[] args) {
		String str="abcabcA";
  // without create extra int[] only c var
		char[]arr=str.toCharArray();
        int c;
         for(int i=0;i<str.length();i++) {
        	 c=1;
        	 for(int j=i+1;j<str.length();j++) {
        		 if(arr[i]==arr[j]) {
        			 arr[j]='0';
        			 c++;
        		 }
        	 }
        	 if(arr[i]!='0')
        	 System.out.println(arr[i]+"="+c);
         }
	} 
	
}
