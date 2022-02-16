package Backtracking;

import java.util.Scanner;

public class TagetSum {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int idx = 0; idx < n; idx++) {
			arr[idx] = scn.nextInt();
		}
		int target = scn.nextInt();

		printTargetSumSubsets(arr, 0, target, "", 0);

	}

	public static void printTargetSumSubsets(int[] arr, int idx, int target, String set, int sum) {

		if (idx == arr.length) {
			// +ve base case
			if (sum == target) {
				System.out.println(set + ".");
				return;
			}
			return;
		}

		// -ve base case
		if (sum > target) {
			return;
		}

		printTargetSumSubsets(arr, idx + 1, target, (set + arr[idx] + ", "), (sum + arr[idx]));

		printTargetSumSubsets(arr, idx + 1, target, set, sum);

	}

}
