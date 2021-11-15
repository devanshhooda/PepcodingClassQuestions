package FunctionAndArrays;

import java.util.Scanner;

public class InverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int idx = 0; idx < n; idx++) {
			arr[idx] = scn.nextInt();
		}

		int[] invArr = getArrayInverse(arr);

		displayArray(invArr);

	}

	private static int[] getArrayInverse(int[] arr) {

		int[] invArr = new int[arr.length];

		for (int idx = 0; idx < arr.length; idx++) {

			int val = arr[idx];

			invArr[val] = idx;

		}

		return invArr;

	}

	private static void displayArray(int[] arr) {
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
	}

}
