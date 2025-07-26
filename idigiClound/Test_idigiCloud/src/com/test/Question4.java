package com.test;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int[]prices = { 7, 6,4,3,1 };
		System.out.println(maxprofit(prices));
	}

	private static int maxprofit(int[] prices) {
		int profit = 0;

		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				int curr = prices[j] - prices[i];
				if (profit < curr) {
					profit = curr;
				}
			}
		}

		return profit;
	}

}
