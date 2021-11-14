package FunctionAndArrays;

import java.util.Scanner;

public class SumOfTwoArrays {

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

		int[] arrSum = getArraySum(arr1, arr2);

		// to tackle the case of leading '0'
		int idx = arrSum[0] == 0 ? 1 : 0;

		while (idx < arrSum.length) {
			System.out.println(arrSum[idx]);
			idx++;
		}

	}

	private static int[] getArraySum(int[] arr1, int[] arr2) {

		int[] arrSum = new int[Math.max(arr1.length, arr2.length) + 1];

		int idx1 = arr1.length - 1;
		int idx2 = arr2.length - 1;
		int idx3 = arrSum.length - 1;

		int carry = 0;

		while (idx3 >= 0) {

			// tackled the problem of -ve index
			int dig1 = idx1 >= 0 ? arr1[idx1] : 0;
			int dig2 = idx2 >= 0 ? arr2[idx2] : 0;

			int digitSum = dig1 + dig2 + carry;

			int rem = digitSum % 10;
			int quo = digitSum / 10;

			carry = quo;
			arrSum[idx3] = rem;

			idx1--;
			idx2--;
			idx3--;

		}

		return arrSum;

	}

}
