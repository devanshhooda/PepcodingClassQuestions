package SearchingAndSorting;

public class ClosestElement {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 5, 6, 6, 8, 9, 12 };
		int target = 3;

		System.out.println(getClosestElement(arr, target));

	}

	private static int getClosestElement(int[] arr, int target) {

		if (arr.length == 0) {
			return -1;
		}

		int floor = floor(arr, target);
		int ceil = ceil(arr, target);

		int floorDiff = floor - target;
		int ceilDiff = ceil - target;

		if (Math.abs(floorDiff) <= Math.abs(ceilDiff)) {
			return floor;
		} else {
			return ceil;
		}

	}

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
