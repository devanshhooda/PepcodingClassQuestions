package SearchingAndSorting;

public class FindPeakElement {

	public int findPeakElement(int[] nums) {

		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			long leftVal = (mid - 1 >= 0) ? nums[mid - 1] : Long.MIN_VALUE;
			long rightVal = (mid + 1 < nums.length) ? nums[mid + 1] : Long.MIN_VALUE;

			if (nums[mid] < rightVal) {
				left = mid + 1;
			} else if (nums[mid] < leftVal) {
				right = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

}
