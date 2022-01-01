package SearchingAndSorting;

import java.util.Scanner;

public class SearchInNearlySortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int idx = 0; idx < n; idx++) {
			arr[idx] = scn.nextInt();
		}

		int target = scn.nextInt();

		System.out.println(searchNearlySorted(arr, target));

	}

	private static int searchNearlySorted(int[] arr, int target) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (mid >= 0 && mid < arr.length) {

				if (arr[mid] == target) {
					return mid;
				}

				else if (mid - 1 >= 0 && arr[mid - 1] == target) {
					return mid - 1;
				}

				else if (mid + 1 < arr.length && arr[mid + 1] == target) {
					return mid + 1;
				}

				else {
					if (arr[mid] < target) {
						left = mid + 2;
					} else if (arr[mid] > target) {
						right = mid - 2;
					}
				}

			} else {
				break;
			}

		}

		return -1;

	}

}
