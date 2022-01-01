package SearchingAndSorting;

public class NthRoot {

	public int NthRoot(int n, int m) {

		int low = 1;
		int high = m;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			double square = Math.pow(mid, n);

			if (square < m) {
				low = mid + 1;
			} else if (square > m) {
				high = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

}
