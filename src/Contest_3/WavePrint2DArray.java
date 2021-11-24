package Contest_3;

import java.util.Scanner;

public class WavePrint2DArray {

//	1.Take an input r, the size of row.
//	2.Take an input c, the size of column.
//	2.Take r*c more inputs and store that in an array.
//
//
//	Write a function Wave print it row-wise and then column wise.
//
//	Example(To be used only for expected output):
//	Input:
//	3 3
//	1 2 3
//	4 5 6
//	7 8 9
//	Output:
//	1 2 3 6 5 4 7 8 9
//	1 4 7 8 5 2 3 6 9

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int rows = scn.nextInt();
		int cols = scn.nextInt();

		int[][] mat = new int[rows][cols];

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				mat[row][col] = scn.nextInt();
			}
		}

		printWaveRowWise(mat, rows, cols);
		System.out.println();
		printWaveColWise(mat, rows, cols);

	}

	private static void printWaveRowWise(int[][] mat, int rows, int cols) {

		for (int row = 0; row < rows; row++) {

			if (row % 2 == 0) {
				for (int col = 0; col < cols; col++) {
					System.out.print(mat[row][col] + " ");
				}
			} else {
				for (int col = cols - 1; col >= 0; col--) {
					System.out.print(mat[row][col] + " ");
				}
			}

		}

	}

	private static void printWaveColWise(int[][] mat, int rows, int cols) {

		for (int col = 0; col < cols; col++) {

			if (col % 2 == 0) {
				for (int row = 0; row < rows; row++) {
					System.out.print(mat[row][col] + " ");
				}
			} else {
				for (int row = rows - 1; row >= 0; row--) {
					System.out.print(mat[row][col] + " ");
				}
			}

		}

	}

}
