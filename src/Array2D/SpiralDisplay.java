package Array2D;

import java.util.Scanner;

public class SpiralDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int m = scn.nextInt();

		int[][] mat = new int[n][m];

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < m; col++) {
				mat[row][col] = scn.nextInt();
			}
		}

		spiralDisplay(mat, n, m);

	}

	private static void spiralDisplay(int[][] mat, int n, int m) {
		// TODO Auto-generated method stub

		int counter = 0;
		int limit = n * m;

		int startingRow = 0, endingRow = n - 1;
		int startingCol = 0, endingCol = m - 1;

		while (counter < limit) {

			// left col
			int row = startingRow;
			int col = startingCol;
			while (row <= endingRow) {
				System.out.println(mat[row][col]);
				counter++;
				if (counter >= limit) {
					return;
				}
				row++;
			}
			startingCol++;

			// bottom row
			row = endingRow;
			col = startingCol;
			while (col <= endingCol) {
				System.out.println(mat[row][col]);
				counter++;
				if (counter >= limit) {
					return;
				}
				col++;
			}
			endingRow--;

			// right col
			row = endingRow;
			col = endingCol;
			while (row >= startingRow) {
				System.out.println(mat[row][col]);
				counter++;
				if (counter >= limit) {
					return;
				}
				row--;
			}
			endingCol--;

			// upper row
			row = startingRow;
			col = endingCol;
			while (col >= startingCol) {
				System.out.println(mat[row][col]);
				counter++;
				if (counter >= limit) {
					return;
				}
				col--;
			}
			startingRow++;

		}

	}

}
