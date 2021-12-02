package RecursionInArrays;

import java.util.Scanner;

public class MaxOfAnArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int idx = 0; idx < n; idx++) {
			arr[idx] = scn.nextInt();
		}

		System.out.println(maxOfArray(arr, 0));

	}

	private static int maxOfArray(int[] arr, int idx) {

		if (idx == arr.length) {
			return Integer.MIN_VALUE;
		}

		int maxTillNow = maxOfArray(arr, idx + 1);

		return Math.max(maxTillNow, arr[idx]);

	}

}
