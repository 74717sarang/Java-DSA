package com.newtest;

import java.util.HashMap;
import java.util.Map;

public class StringStart {

	private static String leftShfit(String str, int i) {

		// doselect => selectdo
		String s = "";
		s = str.substring(i);
		s += str.substring(0, i);
		return s;
	}

	private static String RightShfit(String str, int i) {

		// doselect => ctdosele
		String s = "";
		s = str.substring(str.length() - i);
		s += str.substring(i);

		return s;
	}

	private static String camalCase(String str) {
		String[] arr = str.split(" ");
		String s = "";
		for (String e : arr) {
			s += e.substring(0, 1).toUpperCase() + e.substring(1) + " ";
		}
		return s;
	}

	private static void findCharCount(String str) {
		int[] count = new int[str.length()];
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			count[i] = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count[i]++;
					arr[j] = '0';
				}
			}
		}

		// print
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ' && arr[i] != '0')
				System.out.println(arr[i] + " " + count[i]);
		}
	}

	private static void findCharCountWithMap(String str) {

		Map<Character, Integer> map = new HashMap<>();
//		str = "Wwel wel wel";
		for (char i : str.toCharArray()) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}

		}
		map.forEach((k, v) -> System.out.println("char " + k + " count " + v));

		System.out.println("Iterating over entry set:");
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		System.out.println();

		// below is max count of char
		System.out.println("Below is max char Count::");
		int max = 1;
		char ch = ' ';
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() > max) {
				max = entry.getValue();
				ch = entry.getKey();
			}
		}
		System.out.println("MaxKey: " + ch + ", count: " + max);

	}

	public static void main(String[] args) {

		String str = "doselect";
		System.out.println(str);
		System.out.println(leftShfit(str, 2));
		System.out.println(RightShfit(str, 2));

		String s = "big black bug bit a big black dog";
		System.out.println(s);

		System.out.println(camalCase(s));
		System.out.println();

		str = "Wwel wel wwwel";
		System.out.println("Find count char:");
		findCharCount(str);
		System.out.println("Use hashMap:: ");
		findCharCountWithMap(str);

	}

	
	
}
