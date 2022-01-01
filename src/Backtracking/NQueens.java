package Backtracking;

import java.util.Scanner;

public class NQueens {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[][] chess = new int[n][n];

		printNQueens(chess, new boolean[n][n], 0, "");

	}

	private static void printNQueens(int[][] chess, boolean[][] visited, int row, String qsf) {

		if (row > chess[row].length) {
			return;
		}

		if (row == chess.length) {
			System.out.println(qsf);
			return;
		}

		for (int col = 0; col < chess[row].length; col++) {

			if (visited[row][col] == false && isValidCol(chess, col)) {

				visited[row][col] = true;

				printNQueens(chess, visited, row + 1, qsf + row + "-" + col);

				visited[row][col] = false;

			}

		}

	}

	private static boolean isValidCol(int[][] chess, int col) {

		for (int row = 0; row < chess.length; row++) {

			if (chess[row][col] == 1) {
				return false;
			}

			int r = row;
			int c = col;
			while (row >= 0 && col >= 0) {
				if (chess[r][c] == 1) {
					return false;
				}
				r--;
				c--;
			}

			r = row;
			c = col;
			while (row >= 0 && col < chess[row].length) {
				if (chess[r][c] == 1) {
					return false;
				}
				r--;
				c++;
			}

		}

		return true;

	}

}
