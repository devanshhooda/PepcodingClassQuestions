package SearchingAndSorting;

import java.util.Scanner;

// Split Array Largest Sum
// Capacity to Ship Packages
public class BooksAllocation {

	private static int maxOfArray(int[] books) {
		int max = Integer.MIN_VALUE;

		for (int idx = 0; idx < books.length; idx++) {
			max = Math.max(max, books[idx]);
		}

		return max;
	}

	private static int sumOfArray(int[] books) {
		int sum = 0;

		for (int idx = 0; idx < books.length; idx++) {
			sum += books[idx];
		}

		return sum;
	}

	private static boolean isPossible(int[] books, int N, int totalStudents, int maxLoad) {

		int currLoad = 0;
		int currStudents = 1;

		for (int idx = 0; idx < N && currStudents <= totalStudents; idx++) {

			if (currLoad + books[idx] <= maxLoad) {
				currLoad += books[idx];
			} else {
				currStudents++;
				currLoad = books[idx];
			}

		}

		return (currStudents <= totalStudents);

	}

	public static int findPages(int[] books, int N, int students) {

		int low = maxOfArray(books);
		int high = sumOfArray(books);

		int ans = 0;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (isPossible(books, N, students, mid)) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		return ans;

	}

//	N = 4
//	A[] = {12,34,67,90}
//	M = 2
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int N = scn.nextInt();
		int[] arr = new int[N];
		for (int idx = 0; idx < N; idx++) {
			arr[idx] = scn.nextInt();
		}
		int M = scn.nextInt();

		System.out.println(findPages(arr, N, M));

	}

}
