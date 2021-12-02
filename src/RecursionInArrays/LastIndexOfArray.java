package RecursionInArrays;

import java.util.Scanner;

public class LastIndexOfArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int idx = 0; idx < n; idx++) {
			arr[idx] = scn.nextInt();
		}

		int x = scn.nextInt();

		System.out.println(lastIndex(arr, arr.length - 1, x));

	}

	public static int lastIndex(int[] arr, int idx, int x) {

		if (idx < 0) {
			return -1;
		}

		if (arr[idx] == x) {
			return idx;
		}

		return lastIndex(arr, idx - 1, x);

	}

}
