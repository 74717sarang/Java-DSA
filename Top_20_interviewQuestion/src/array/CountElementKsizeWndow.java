package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountElementKsizeWndow {

//	Q 10:Count Distinct element in every k size window

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 4, 2, 3 };
		int k = 4;
		bruteForce(arr, k);
		System.out.println();
		slidind_Window(arr,k);
	}

	private static void slidind_Window(int[] arr, int k) {
     
		Map<Integer, Integer>map=new HashMap<>();
		
		for(int i=0;i<k;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(map.size());
		
		for(int i=k;i<arr.length;i++) {
			int leftEle=arr[i-k];
			map.put(leftEle, map.get(leftEle)-1);
			if(map.get(leftEle)==0) {
				map.remove(leftEle);
			}
			int add=arr[i];
			map.put(add, map.getOrDefault(add, 0)+1);
			System.out.println(map.size());
		}
		
		
}

	private static void bruteForce(int[] arr, int k) {

		for (int i = 0; i <= arr.length - k; i++) {
			int count = fun1(i, i + k, arr);
			System.out.println("Window " + i + "-" + (i + k - 1) + " count: " + count);
		}
	}

	private static int fun1(int i, int j, int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int k = i; k < j; k++) {
			set.add(arr[k]);
		}
		return set.size();
	}
}
