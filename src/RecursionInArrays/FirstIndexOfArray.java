package RecursionInArrays;

import java.util.Scanner;

public class FirstIndexOfArray {

	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int idx = 0; idx < n; idx++) {
			arr[idx] = scn.nextInt();
		}

		int x = scn.nextInt();

		System.out.println(firstIndex(arr, 0, x));

	}

	private static int firstIndex(int[] arr, int idx, int x) {

		if (idx == arr.length) {
			return -1;
		}

		if (arr[idx] == x) {
			return idx;
		}

		return firstIndex(arr, idx + 1, x);

	}

}
