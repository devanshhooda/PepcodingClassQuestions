package Backtracking;

import java.util.Scanner;

public class NQueens {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[][] chess = new int[n][n];

		printNQueens(chess, 0, "");

	}

	private static void printNQueens(int[][] chess, int row, String qsf) {

		// -ve base case
		if (row > chess.length) {
			return;
		}

		// +ve base case
		if (row == chess.length) {
			System.out.println(qsf + ".");
			return;
		}

		for (int col = 0; col < chess[row].length; col++) {

			if (isValidCol(chess, row, col)) {

				chess[row][col] = 1;

				printNQueens(chess, (row + 1), (qsf + row + "-" + col + ", "));

				chess[row][col] = 0;

			}

		}

	}

	private static boolean isValidCol(int[][] chess, int row, int col) {

		if (chess[row][col] == 1) {
			return false;
		}

		int r = row;
		int c = col;

		// column check
		while (r >= 0) {
			if (chess[r][c] == 1) {
				return false;
			}
			r--;
		}

		r = row;
		// left diagonal check
		while (r >= 0 && c >= 0) {
			if (chess[r][c] == 1) {
				return false;
			}
			r--;
			c--;
		}

		r = row;
		c = col;
		// right diagonal check
		while (r >= 0 && c < chess[row].length) {
			if (chess[r][c] == 1) {
				return false;
			}
			r--;
			c++;
		}

		return true;

	}

}
