package SearchingAndSorting;

public class ValidPerfectSquare {

	private int mySqrt(int num) {

		long left = 1;
		long right = num / 2;

		long sqrt = 1L;

		while (left <= right) {

			long mid = left + (right - left) / 2;

			long square = (mid * mid);

			if (square < num) {
				sqrt = mid;
				left = mid + 1;
			} else if (square > num) {
				right = mid - 1;
			} else {
				sqrt = mid;
				break;
			}

		}

		return (int) sqrt;
	}

	public boolean isPerfectSquare(int num) {

		int floorSqrt = mySqrt(num);

		int square = (int) (floorSqrt * floorSqrt);

		return (num == square);

	}

}
