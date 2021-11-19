package FunctionAndArrays;

public class SubsetOfArray {

//	3
//	10
//	20
//	30
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;

		int[] binArr = getBinaries(n);

		displayArr(binArr);

	}

	private static int[] getBinaries(int n) {

		int limit = (int) Math.pow(2, n);

		int[] binArr = new int[limit];

		for (int idx = 0; idx < limit; idx++) {
			binArr[idx] = convertDecimalToBinary(idx);
		}

		return binArr;

	}

	private static int convertDecimalToBinary(int num) {

		int ans = 0;
		int mult = 1;

		while (num > 0) {

			int rem = num % 2;

			ans += (rem * mult);

			num /= 2;
			mult *= 10;

		}

		return ans;

	}

	private static void displayArr(int[] arr) {
		for (int val : arr) {
			System.out.println(val + " ");
		}
	}

}
