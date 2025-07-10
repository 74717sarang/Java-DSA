package string;

import java.util.Arrays;

public class Anagram {

	
	public static void main(String[] args) {
		String s1 = "Listen";
        String s2 = "Silent";
        System.out.println(isAnagram(s1, s2)); // true
	}

	private static boolean isAnagram(String s1, String s2) {
           if(s1.length()!=s2.length()) return false;
           
           
        // Remove whitespaces and convert to lowercase
//           s1 = s1.replaceAll("\\s", "").toLowerCase();
//           s2 = s2.replaceAll("\\s", "").toLowerCase();
           
           s1=s1.toLowerCase();
           s2=s2.toLowerCase();
           
        		   
	char []arr1=s1.toCharArray();
	char []arr2=s2.toCharArray();
	Arrays.sort(arr1);;
	Arrays.sort(arr2);
	return Arrays.equals(arr1,arr2);
	
	}
}
