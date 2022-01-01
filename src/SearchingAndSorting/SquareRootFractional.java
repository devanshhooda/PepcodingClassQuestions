package SearchingAndSorting;

public class SquareRootFractional {

	// Square root with precision

	public static void main(String[] args) {

		System.out.println(squareRootWithPrecision(50, 3));

		System.out.println(squareRootWithPrecision(10, 4));

	}

	private static float squareRootWithPrecision(int num, int precision) {

		SquareRoot sqaureRoot = new SquareRoot();
		double ans = sqaureRoot.mySqrt(num);

		double increment = 0.1;

		for (int itr = 1; itr <= precision; itr++) {

			while ((ans * ans) <= num) {
				ans += increment;
			}

			// to compensate the one extra added increment
			ans = ans - increment;

			increment = increment / 10;
		}

		return (float) ans;

	}

}
