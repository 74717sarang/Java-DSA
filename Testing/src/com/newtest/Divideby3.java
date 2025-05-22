package com.newtest;

public class Divideby3 {

	public static void main(String[] args) {
		
		int[]arr= {0, 1, 2, 3, 4,5,6,7,8,9,10,11,12,13,14,15,16,17,18, 19, 20};
		
		for(int i:arr) {
			if(i%3==0)
				System.out.print(i+ " ");
		}
		for(int i:arr) {
			if(i%3!=0)
				System.out.print(i+ " ");
		}
	}
}
