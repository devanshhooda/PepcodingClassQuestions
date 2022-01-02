package SearchingAndSorting;

public class NthRoot {

	public int nthRoot(int n, int num) {

		int low = 1;
		int high = num;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			double powerVal = Math.pow(mid, n);

			if (powerVal < num) {
				low = mid + 1;
			} else if (powerVal > num) {
				high = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

}
