package com.parctics;

public class BreakContinue {

	public static void main(String[] args) {
		System.out.println("break");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (j == 3)
					break;
				System.out.println(i + " " + j);
			}
		}
		System.out.println();
		System.out.println("continue");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (j == 3)
					continue;
				System.out.println(i + " " + j);
			}
		}
	}

}
