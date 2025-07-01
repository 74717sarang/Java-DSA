package co.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongWordInString {

	public static void main(String[] args) {
		String sentence = "Flip the words in a sentence";

		String[] arr = sentence.split(" ");
		String result = "";
		for (String s : arr) {
			result = result.length() < s.length() ? s : result;
		}
		System.out.println(result);

		List<String> list = new ArrayList<>(Arrays.asList(arr));

	 	String re = list.stream().max(Comparator.comparingInt(String::length)).orElse("");
	        
	
//	 	String s = list.stream().sorted((a,b)->Integer.compare( b.length(),a.length())).findFirst().orElse("");
	
	 	
	 	String s=list.stream().sorted().findAny().orElse("");
	System.out.println("direct  "+s);
	
	}

}