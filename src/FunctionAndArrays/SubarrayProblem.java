package FunctionAndArrays;

import java.util.Scanner;

public class SubarrayProblem {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int idx = 0; idx < n; idx++) {
			arr[idx] = scn.nextInt();
		}

		for (int idx1 = 0; idx1 < n; idx1++) {

			for (int ctr = idx1; ctr < n; ctr++) {

				System.out.print(arr[idx1] + "\t");

				for (int idx2 = idx1 + 1; idx2 <= ctr; idx2++) {

					System.out.print(arr[idx2] + "\t");

				}

				System.out.println();

			}

		}

	}

}
