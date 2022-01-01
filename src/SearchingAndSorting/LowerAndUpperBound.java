package SearchingAndSorting;

import java.util.Scanner;

public class LowerAndUpperBound {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int idx = 0; idx < n; idx++) {
			arr[idx] = scn.nextInt();
		}

		int target = scn.nextInt();

		System.out.println(upperBound(arr, target));
		System.out.println(lowerBound(arr, target));

	}

	// This is nothing but ceil itself
	private static int upperBound(int[] arr, int target) {

		int left = 0, right = arr.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (arr[mid] >= target) {

				right = mid - 1;

			} else {

				left = mid + 1;

			}

		}

		return arr[right];

	}

	// Combination of ceil and first occurrence
	private static int lowerBound(int[] arr, int target) {

		int left = 0, right = arr.length - 1;

		int lowerBound = arr.length;
		// application(reason) is present is K-closest element question

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (arr[mid] >= target) {

				lowerBound = arr[mid];
				right = mid - 1;

			} else if (arr[mid] < target) {

				left = mid + 1;

			}

		}

		return lowerBound;

	}

}
