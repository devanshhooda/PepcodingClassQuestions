package SearchingAndSorting;

public class FirstBadVersion {

	// *Problem Link* :
	// [https://leetcode.com/problems/first-bad-version/]

	public int firstBadVersion(int n) {

		int left = 1, right = n;

		int version = -1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (this.isBadVersion(mid) == false) {
				left = mid + 1;
			} else {
				version = mid;
				right = mid - 1;
			}

		}

		return version;

	}

}
