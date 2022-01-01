package SearchingAndSorting;

public class FirstAndLastIndex {

	public int[] searchRange(int[] nums, int target) {

		int[] occs = new int[2];

		if (nums.length == 0) {
			occs[0] = -1;
			occs[1] = -1;
			return occs;
		}

		occs[0] = this.firstOcc(nums, target);
		occs[1] = this.lastOcc(nums, target);

		return occs;

	}

	private int firstOcc(int[] nums, int target) {

		int left = 0, right = nums.length - 1;

		int firstOcc = -1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (nums[mid] < target) {
				left = mid + 1;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				firstOcc = mid;
				right = mid - 1;
			}

		}

		return firstOcc;

	}

	private int lastOcc(int[] nums, int target) {

		int left = 0, right = nums.length - 1;

		int lastOcc = -1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (nums[mid] < target) {
				left = mid + 1;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				lastOcc = mid;
				left = mid + 1;
			}

		}

		return lastOcc;

	}

}
