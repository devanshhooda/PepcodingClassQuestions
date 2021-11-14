package FunctionAndArrays;

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int idx = 0; idx < n; idx++) {
			arr[idx] = scn.nextInt();
		}

		printBarChart(arr);

	}

	private static void printBarChart(int[] arr) {

		// main part to think
		int rows = getMaxElement(arr);
		int cols = arr.length;

		// reverse loop for simplicity in condition
		for (int row = rows - 1; row >= 0; row--) {
			for (int col = 0; col < cols; col++) {
				if (arr[col] > row) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}

	}

	private static int getMaxElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int idx = 0; idx < arr.length; idx++) {
			max = Math.max(max, arr[idx]);
		}
		return max;
	}

}
