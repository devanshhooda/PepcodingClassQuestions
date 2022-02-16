package SearchingAndSorting;

public class FindRotationCount {

	// ***** Same as Minimum-In-Rotated-Sorted-Array problem ***** //

	private boolean isMinimum(int mid, int[] arr) {
		int leftVal = mid - 1 < 0 ? Integer.MAX_VALUE : arr[mid - 1];
		int rightVal = mid + 1 >= arr.length ? Integer.MAX_VALUE : arr[mid + 1];

		return (arr[mid] < leftVal && arr[mid] < rightVal);
	}

	private boolean isMaximum(int mid, int[] arr) {
		int leftVal = mid - 1 < 0 ? Integer.MIN_VALUE : arr[mid - 1];
		int rightVal = mid + 1 >= arr.length ? Integer.MIN_VALUE : arr[mid + 1];

		return (arr[mid] > leftVal && arr[mid] > rightVal);
	}

	public int findKRotation(int[] arr, int n) {

		int low = 0;
		int high = n - 1;

		// array is perfectly sorted
		// or
		// array is rotated its size times
		if (arr[low] < arr[high]) {
			return 0;
		}

		while (low <= high) {

			int mid = low + (high - low) / 2;

			// mid is minimum / pivot
			if (this.isMinimum(mid, arr)) {
				return mid;
			}

			// mid is maximum => next element will be minimum
			// i.e - (mid + 1) is pivot
			else if (this.isMaximum(mid, arr)) {
				return mid + 1;
			}

			// left side of array is sorted hence discarded
			else if (arr[mid] > arr[low]) {
				low = mid + 1;
			}

			// right side of array is sorted hence discarded
			else if (arr[mid] < arr[high]) {
				high = mid - 1;
			}

		}

		return 0;

	}

}
