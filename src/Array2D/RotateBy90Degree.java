package Array2D;

import java.util.Scanner;

public class RotateBy90Degree {

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

		// Transpose the given matrix
		transposeMatrix(mat);

		// Reverse the every row of matrix
		reverseRowArrays(mat);

		displayMat(mat);

	}

	private static void transposeMatrix(int[][] mat) {
		for (int row = 0; row < mat.length; row++) {
			for (int col = row + 1; col < mat[0].length; col++) {
				transposeSwap(mat, row, col);
			}
		}
	}

	private static void transposeSwap(int[][] mat, int row, int col) {
		int temp = mat[row][col];
		mat[row][col] = mat[col][row];
		mat[col][row] = temp;
	}

	private static void reverseRowArrays(int[][] mat) {

		for (int row = 0; row < mat.length; row++) {

			int left = 0, right = mat[row].length - 1;

			while (left < right) {

				rowElementsSwap(mat, row, left, right);

				left++;
				right--;
			}

		}

	}

	private static void rowElementsSwap(int[][] mat, int row, int left, int right) {
		int temp = mat[row][left];
		mat[row][left] = mat[row][right];
		mat[row][right] = temp;
	}

	private static void displayMat(int[][] mat) {
		for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[row].length; col++) {
				System.out.print(mat[row][col] + " ");
			}
			System.out.println();
		}
	}

}
