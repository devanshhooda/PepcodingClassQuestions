package RecursionInArrays;

import java.util.Scanner;

public class DisplayArrayInReverse {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int idx = 0; idx < n; idx++) {
			arr[idx] = scn.nextInt();
		}

		displayArrReverse(arr, 0);

	}

	private static void displayArrReverse(int[] arr, int idx) {

		if (idx == arr.length) {
			return;
		}

		displayArrReverse(arr, idx + 1);

		System.out.println(arr[idx]);
	}

}
