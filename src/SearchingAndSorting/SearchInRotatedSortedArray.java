package SearchingAndSorting;

public class SearchInRotatedSortedArray {

	public int search(int[] arr, int target) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			// element found in array
			if (arr[mid] == target) {
				return mid;
			}

			// if left side of array is sorted
			if (arr[left] <= arr[mid]) {

				// if target lies in the left sorted range
				// discarding the right range of array
				if (target >= arr[left] && target <= arr[mid]) {
					right = mid - 1;
				}

				// if not, then discarding the left range
				else {
					left = mid + 1;
				}

			} else {

				// if target lies in the right sorted range
				// discarding the left range of array
				if (target >= arr[mid] && target <= arr[right]) {
					left = mid + 1;
				}

				// if not, then discarding the left range
				else {
					right = mid - 1;
				}

			}

		}

		// if element is not present in array
		return -1;

	}

}
