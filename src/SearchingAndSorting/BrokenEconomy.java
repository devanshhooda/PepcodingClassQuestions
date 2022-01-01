package SearchingAndSorting;

import java.util.Scanner;

public class BrokenEconomy {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int idx = 0; idx < n; idx++) {
			arr[idx] = scn.nextInt();
		}

		int target = scn.nextInt();

		System.out.println(ceil(arr, target));
		System.out.println(floor(arr, target));

	}

	// Just smaller value than target present in array
	private static int floor(int[] arr, int target) {

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

	// Just larger value than target present in array
	private static int ceil(int[] arr, int target) {

		int left = 0, right = arr.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (arr[mid] <= target) {

				left = mid + 1;

			} else {

				right = mid - 1;

			}

		}

		return arr[left];

	}

}
