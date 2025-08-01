package com.test;

public class Question2 {
	// 9*9 matrix sudoko valid
	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		boolean result = isValidSudoku(board);
		System.out.println("Is the Sudoku board valid? " + result);

		System.out.println(Sudoku(board));
	}

	public static boolean isValidSudoku(char[][] arr) {

		boolean[][] row = new boolean[9][9];
		boolean[][] col = new boolean[9][9];
		boolean[][] box = new boolean[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				if (arr[i][j] != '.') {
					int num = arr[i][j] - '1';
					int boxIndex = (i / 3) * 3 + (j / 3);

					if (row[i][num] || col[j][num] || box[boxIndex][num]) {
						return false;
					}
					row[i][num] = true;
					col[j][num] = true;
					box[boxIndex][num] = true;
				}

			}
		}

		return true;
	}

	public static boolean Sudoku(char[][] arr) {

		boolean[][] row = new boolean[9][9];
		boolean[][] box = new boolean[9][9];
		boolean[][] col = new boolean[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (arr[i][j] != '.') {

					int num = arr[i][j] - '1';
					//if char -> int type 
					// int num=arr[i][j]   direct 
					// -- num // for start from 0
					int boxIndex = (i / 3) * 3 + (j / 3);
					if (row[i][num] || col[j][num] || box[boxIndex][num]) {
						return false;
					}
					row[i][num] = true;
					col[j][num] = true;
					box[boxIndex][num] = true;
				}
			}
		}

		return true;
	}

}
