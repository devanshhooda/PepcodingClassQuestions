package FunctionAndArrays;

import java.util.Scanner;

public class DifferenceOfTwoArrays {

//	3
//	2
//	6
//	7
//	4
//	1
//	0
//	0
//	0

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n1 = scn.nextInt();
		int[] arr1 = new int[n1];

		for (int idx = 0; idx < n1; idx++) {
			arr1[idx] = scn.nextInt();
		}

		int n2 = scn.nextInt();
		int[] arr2 = new int[n2];

		for (int idx = 0; idx < n2; idx++) {
			arr2[idx] = scn.nextInt();
		}

		int[] arrDiff = getArrayDifference(arr1, arr2);

		// to tackle the case of leading '0(s)'
		int idx = 0;

		while (idx < arrDiff.length && arrDiff[idx] == 0) {
			idx++;
		}

		while (idx < arrDiff.length) {
			System.out.println(arrDiff[idx]);
			idx++;
		}

	}

	private static int[] getArrayDifference(int[] arr1, int[] arr2) {

		int[] arrDiff = new int[arr2.length];

		int idx1 = arr1.length - 1;
		int idx2 = arr2.length - 1;

		int borrow = 0;

		while (idx2 >= 0) {

			// tackled the problem of -ve index
			int dig1 = idx1 >= 0 ? arr1[idx1] : 0;
			int dig2 = arr2[idx2];

			int digitSum = dig2 - dig1 + borrow;

			if (digitSum < 0) {
				digitSum += 10;
				borrow = -1;
			} else {
				borrow = 0;
			}

			arrDiff[idx2] = digitSum;

			idx1--;
			idx2--;

		}

		return arrDiff;

	}

}
