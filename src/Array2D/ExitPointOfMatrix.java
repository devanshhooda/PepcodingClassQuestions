package Array2D;

import java.util.Scanner;

public class ExitPointOfMatrix {

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

		printExitPoint(mat);

	}

	private static void printExitPoint(int[][] mat) {

//		taking direction conventions as :
//		  LTRB 	: (0123)
//		  Left 		: 0
//		  Top 		: 1
//		  Right		: 2
//		  Bottom 	: 3

		int direction = 2; // assuming right as starting direction

		int ansRow = 0, ansCol = 0;

		int row = 0; // for starting
		int col = 0; // point

		while (row >= 0 && col >= 0 && row < mat.length && col < mat[0].length) {

			if (mat[row][col] == 1) {
				direction = (direction + 1) % 4;
			}

			ansRow = row;
			ansCol = col;

			if (direction == 0) {
				// left
				col--;
			} else if (direction == 1) {
				// top
				row--;
			} else if (direction == 2) {
				// right
				col++;
			} else {
				// bottom
				row++;
			}

		}

		System.out.println(ansRow);
		System.out.println(ansCol);

	}

}
