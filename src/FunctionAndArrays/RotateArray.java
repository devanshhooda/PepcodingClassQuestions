package FunctionAndArrays;

import java.util.Scanner;

public class RotateArray {

//	5
//	1
//	2
//	3
//	4
//	5
//	3

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int idx = 0; idx < n; idx++) {
			arr[idx] = scn.nextInt();
		}

		int k = scn.nextInt();

		rotateArray(arr, k);

		displayArray(arr);

	}

	private static void rotateArray(int[] arr, int k) {

		int n = arr.length;

		// reducing k
		k = k % n;
		if (k < 0) {
			k += n;
		}

		reverse(arr, 0, n - k - 1);
		reverse(arr, n - k, n - 1);
		reverse(arr, 0, n - 1);

	}

	private static void reverse(int[] arr, int left, int right) {
		while (left < right) {
			swap(arr, left, right);
			left++;
			right--;
		}
	}

	private static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

	private static void displayArray(int[] arr) {
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
	}

}
