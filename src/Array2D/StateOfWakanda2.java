package Array2D;

import java.util.Scanner;

public class StateOfWakanda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[][] mat = new int[n][n];

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				mat[row][col] = scn.nextInt();
			}
		}

		traverseDiagonals(mat, n);

	}

	private static void traverseDiagonals(int[][] mat, int n) {
		// TODO Auto-generated method stub

		for (int colCounter = 0; colCounter < n; colCounter++) {

			int row = 0;
			int col = colCounter;

			while (row < (n - colCounter) && col < n) {
				System.out.println(mat[row][col]);
				row++;
				col++;
			}

		}

	}

}
