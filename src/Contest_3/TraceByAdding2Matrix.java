package Contest_3;

import java.util.Scanner;

public class TraceByAdding2Matrix {

//	1.Take an input r, the size of row.
//	2.Take an input c, the size of column.
//	3.Take r*c more inputs and store that in an Matrix.
//	4.Take r*c more inputs and store that in an another Matrix.
//
//
//	Consider two matrix ANXM, BNXM. Both matrix A and matrix B contains equal
//	elements. The task is to find the trace of the matrix formed by addition of
//	A and B. Trace of matrix PNXM is defined as
//	P[0][0] + P[1][1] + P[2][2] +….. + P[min(n – 1, m – 1)][min(n – 1, m – 1)]
//	i.e addition of main diagonal.
//
//	Example(To be used only for expected output):
//
//	Input:
//	3 3
//	1 2 3
//	4 5 6
//	7 8 9
//	1 4 7
//	2 5 8
//	3 6 9
//
//	output
//	30
//
//	Explanation:
//	    1 2 3
//	A = 4 5 6
//	    7 8 9
//
//	     1 4 7
//	B =  2 5 8
//	     3 6 9
//
//	        2 6 10
//	A + B = 6 10 14
//	        10 14 18
//
//	Trace = 2 + 10 + 18 = 30

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int rows = scn.nextInt();
		int cols = scn.nextInt();

		int[][] mat1 = new int[rows][cols];
		int[][] mat2 = new int[rows][cols];

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				mat1[row][col] = scn.nextInt();
			}
		}

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				mat2[row][col] = scn.nextInt();
			}
		}

		int[][] sumMat = getMatAdd(mat1, mat2, rows, cols);

		int trace = getTrace(sumMat, rows, cols);

		System.out.println(trace);

	}

	private static int getTrace(int[][] mat, int rows, int cols) {

		int row = 0, col = 0;

		int trace = 0;

		while (row < rows && col < cols) {

			trace += mat[row][col];

			row++;
			col++;

		}

		return trace;

	}

	private static int[][] getMatAdd(int[][] mat1, int[][] mat2, int rows, int cols) {

		int[][] sumMat = new int[rows][cols];

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				sumMat[row][col] = mat1[row][col] + mat2[row][col];
			}
		}

		return sumMat;

	}

}
