package Array2D;

import java.util.Scanner;

public class StateOfWakanda1 {

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

		travel(mat, n, m);

	}

	private static void travel(int[][] mat, int n, int m) {

		int row = 0;
		int direction = 0;

		for (int col = 0; col < m; col++) {

			while (row >= 0 && row < n) {

				System.out.println(mat[row][col]);

				if (direction == 0) {
					row++;
				} else {
					row--;
				}

			}

			if (direction == 0) {
				row = n - 1;
				direction = 1;
			} else {
				row = 0;
				direction = 0;
			}

		}

	}

}
