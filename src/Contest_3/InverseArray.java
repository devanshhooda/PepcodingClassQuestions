package Contest_3;

import java.util.Scanner;

public class InverseArray {

//	1.Take an input N, the size of array.
//	2.Take N more inputs and store that in an array.
//
//	Write a function which returns true if the second array is inverse of first and
//	false otherwise. Print the value returned.
//
//	Example(To be used only for expected output):
//	Input:
//	4
//	1 2 3 0
//	3 0 1 2
//	Output:
//	true

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];
		int[] inv = new int[n];

		for (int idx = 0; idx < n; idx++) {
			arr[idx] = scn.nextInt();
		}

		for (int idx = 0; idx < n; idx++) {
			inv[idx] = scn.nextInt();
		}

		System.out.println(isInverse(arr, inv, n));

	}

	private static boolean isInverse(int[] arr, int[] inv, int n) {

		for (int idx = 0; idx < n; idx++) {
			int val = arr[idx];
			if (inv[val] != idx) {
				return false;
			}
		}

		return true;

	}

}
