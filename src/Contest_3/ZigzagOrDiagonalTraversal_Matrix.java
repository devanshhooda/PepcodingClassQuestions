package Contest_3;

import java.util.Scanner;

public class ZigzagOrDiagonalTraversal_Matrix {

//	Q: Given a 2D matrix, print all elements of the given matrix in diagonal order. 
//	For example, consider the following 5 X 4 input matrix.
//
//	input:
//	5 4
//	1 2 3 4
//	5 6 7 8
//	9 10 11 12
//	13 14 15 16
//	17 18 19 20
//	   
//	output:
//	1
//	5 2
//	9 6 3
//	13 10 7 4
//	17 14 11 8
//	18 15 12
//	19 16
//	20

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

		traverseDiagonally(mat, rows, cols);

	}

	private static void traverseDiagonally(int[][] mat, int rows, int cols) {

		int ctr = 0;
		int limit = (rows - 1) + (cols - 1);

		while (ctr <= limit) {
			for (int col = 0; col < cols; col++) {
				for (int row = 0; row < rows; row++) {
					if (row + col == ctr) {
						System.out.print(mat[row][col] + " ");
					}
				}
			}
			ctr++;
			System.out.println();
		}

	}

}