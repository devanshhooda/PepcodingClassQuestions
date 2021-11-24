package Contest_3;

import java.util.Scanner;

public class SpiralPrint2DArray {

//	1.Take an input r, the size of row.
//	2.Take an input c, the size of column.
//	2.Take r*c more inputs and store that in an array.
//
//
//	Write a function Spiral print it clock wise and then anti-clock wise
//
//	Example(To be used only for expected output):
//	Input:
//	3 3
//	1 2 3
//	4 5 6
//	7 8 9
//	Output:
//	1 2 3 6 9 8 7 4 5
//	1 4 7 8 9 6 3 2 5

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

		printSpiralRight(mat, rows, cols);
		System.out.println();
		printSpiralLeft(mat, rows, cols);

	}

	private static void printSpiralRight(int[][] mat, int rows, int cols) {

		int minRow = 0;
		int minCol = 0;
		int maxRow = rows - 1;
		int maxCol = cols - 1;

		int traversedElements = 0;
		int maxElements = rows * cols;

		while (traversedElements < maxElements) {

			// top row
			int currRow = minRow;
			int currCol = minCol;
			while (currCol <= maxCol) {
				System.out.print(mat[currRow][currCol] + " ");
				traversedElements++;

				if (traversedElements >= maxElements) {
					break;
				}

				currCol++;
			}
			minRow++;

			// right col
			currRow = minRow;
			currCol = maxCol;
			while (currRow <= maxRow) {
				System.out.print(mat[currRow][currCol] + " ");
				traversedElements++;

				if (traversedElements >= maxElements) {
					break;
				}

				currRow++;
			}
			maxCol--;

			// bottom row
			currRow = maxRow;
			currCol = maxCol;
			while (currCol >= minCol) {
				System.out.print(mat[currRow][currCol] + " ");
				traversedElements++;

				if (traversedElements >= maxElements) {
					break;
				}

				currCol--;
			}
			maxRow--;

			// left col
			currRow = maxRow;
			currCol = minCol;
			while (currRow >= minRow) {
				System.out.print(mat[currRow][currCol] + " ");
				traversedElements++;

				if (traversedElements >= maxElements) {
					break;
				}

				currRow--;
			}
			minCol++;

		}

	}

	private static void printSpiralLeft(int[][] mat, int rows, int cols) {

		int minRow = 0;
		int minCol = 0;
		int maxRow = rows - 1;
		int maxCol = cols - 1;

		int traversedElements = 0;
		int maxElements = rows * cols;

		while (traversedElements < maxElements) {

			// left col
			int currRow = minRow;
			int currCol = minCol;
			while (currRow <= maxRow) {
				System.out.print(mat[currRow][currCol] + " ");
				traversedElements++;

				if (traversedElements >= maxElements) {
					break;
				}

				currRow++;
			}
			minCol++;

			// bottom row
			currRow = maxRow;
			currCol = minCol;
			while (currCol <= maxCol) {
				System.out.print(mat[currRow][currCol] + " ");
				traversedElements++;

				if (traversedElements >= maxElements) {
					break;
				}

				currCol++;
			}
			maxRow--;

			// right col
			currRow = maxRow;
			currCol = maxCol;
			while (currRow >= minRow) {
				System.out.print(mat[currRow][currCol] + " ");
				traversedElements++;

				if (traversedElements >= maxElements) {
					break;
				}

				currRow--;
			}
			maxCol--;

			// top row
			currRow = minRow;
			currCol = maxCol;
			while (currCol >= minCol) {
				System.out.print(mat[currRow][currCol] + " ");
				traversedElements++;

				if (traversedElements >= maxElements) {
					break;
				}

				currCol--;
			}
			minRow++;

		}

	}

}
