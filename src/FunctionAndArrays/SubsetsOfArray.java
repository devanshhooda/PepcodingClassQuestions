package FunctionAndArrays;

import java.util.Scanner;

public class SubsetsOfArray {

//	3
//	10
//	20
//	30

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int idx = 0; idx < n; idx++) {
			arr[idx] = scn.nextInt();
		}

		int numOfSubsets = (int) Math.pow(2, n);

		// created binary array for all possible subsets
		int[] binArr = getBinaries(n, numOfSubsets);

		printArraySubsets(arr, binArr);

	}

	private static void printArraySubsets(int[] arr, int[] binaries) {

		// to extract 1st digit
		int maxPow = (int) Math.pow(10, arr.length - 1);

		for (int binIdx = 0; binIdx < binaries.length; binIdx++) {

			int power = maxPow; // to use in every iteration
			int num = binaries[binIdx];

			for (int arrIdx = 0; arrIdx < arr.length; arrIdx++) {

				// first digit
				if (num / power == 1) {
					System.out.print(arr[arrIdx] + "\t");
				} else {
					System.out.print("-\t");
				}

				// deleting first digit for next iteration
				num %= power;

				// power to extract next digit of num in next iteration
				power /= 10;

			}

			System.out.println();

		}
	}

	private static int[] getBinaries(int n, int numOfSubsets) {

		int[] binArr = new int[numOfSubsets];

		for (int idx = 0; idx < numOfSubsets; idx++) {
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

}
