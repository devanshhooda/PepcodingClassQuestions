package SearchingAndSorting;

public class PeakIndexInMountainArray {

	public int peakIndexInMountainArray(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			int leftVal = (mid - 1 >= 0) ? arr[mid - 1] : Integer.MIN_VALUE;
			int rightVal = (mid + 1 < arr.length) ? arr[mid + 1] : Integer.MIN_VALUE;

			if (arr[mid] < rightVal) {
				left = mid + 1;
			} else if (arr[mid] < leftVal) {
				right = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

}
