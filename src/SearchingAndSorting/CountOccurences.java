package SearchingAndSorting;

public class CountOccurences {

	int count(int[] arr, int n, int x) {

		int firstOcc = this.firstOcc(arr, x);
		int lastOcc = this.lastOcc(arr, x);

		if (firstOcc == -1 && lastOcc == -1)
			return 0;

		return (lastOcc - firstOcc) + 1;

	}

	private int firstOcc(int[] arr, int target) {

		int left = 0, right = arr.length - 1;

		int firstOcc = -1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (arr[mid] < target) {
				left = mid + 1;
			} else if (arr[mid] > target) {
				right = mid - 1;
			} else {
				firstOcc = mid;
				right = mid - 1;
			}

		}

		return firstOcc;

	}

	private int lastOcc(int[] arr, int target) {

		int left = 0, right = arr.length - 1;

		int lastOcc = -1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (arr[mid] < target) {
				left = mid + 1;
			} else if (arr[mid] > target) {
				right = mid - 1;
			} else {
				lastOcc = mid;
				left = mid + 1;
			}

		}

		return lastOcc;

	}

}
