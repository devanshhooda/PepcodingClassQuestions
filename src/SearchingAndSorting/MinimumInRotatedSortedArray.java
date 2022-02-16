package SearchingAndSorting;

public class MinimumInRotatedSortedArray {

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

	public int findMin(int[] arr) {

		int low = 0;
		int high = arr.length - 1;

		// array is perfectly sorted
		// or
		// array is rotated its size times
		if (arr[low] < arr[high]) {
			return arr[0];
		}

		while (low <= high) {

			int mid = low + (high - low) / 2;

			// mid is minimum / pivot
			if (this.isMinimum(mid, arr)) {
				return arr[mid];
			}

			// mid is maximum => next element will be minimum
			// i.e.- (mid + 1) is pivot
			else if (this.isMaximum(mid, arr)) {
				return arr[mid + 1];
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
