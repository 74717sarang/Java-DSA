package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class k_non_repeating_characters {

	public static void main(String[] args) {

		String s = "geeksforgeeks";
		int k = 3;
		System.out.print("First " + k + " non-repeating characters: ");
		findFirstKNonRepeating(s, k);
	}

	
	
	
	private static void findFirstKNonRepeating(String s, int k) {

		
		Map<Character, Integer>map=new LinkedHashMap<>();;
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		int found=0;
		for(Map.Entry<Character, Integer> i:map.entrySet()) {
			if(i.getValue()==1) {
				System.out.print(i.getKey()+" ");
				found++;
				
				if(found==k) break;
			}
		}
	}

}
