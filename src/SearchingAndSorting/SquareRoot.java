package SearchingAndSorting;

public class SquareRoot {

	public int mySqrt(int x) {

		if (x <= 1) {
			return x;
		}

		long low = 1;
		long high = x / 2;

		long sqrt = 1L;

		while (low <= high) {

			long mid = low + (high - low) / 2;

			// System.out.println(low + " " + mid + " " + high);

			long square = (mid * mid);

			if (square < x) {
				sqrt = mid;
				low = mid + 1;
			} else if (square > x) {
				high = mid - 1;
			} else {
				return (int) mid;
			}

		}

		return (int) sqrt;

	}

}
