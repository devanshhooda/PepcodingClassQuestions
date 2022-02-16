package SearchingAndSorting;

import java.util.ArrayList;

// Very Similar to Book Allocation
public class PaintersPartition {

	private static int maxOfArray(ArrayList<Integer> boards) {
		int max = Integer.MIN_VALUE;

		for (int idx = 0; idx < boards.size(); idx++) {
			max = Math.max(max, boards.get(idx));
		}

		return max;
	}

	private static int sumOfArray(ArrayList<Integer> boards) {
		int sum = 0;

		for (int idx = 0; idx < boards.size(); idx++) {
			sum += boards.get(idx);
		}

		return sum;
	}

	private static boolean isPossible(ArrayList<Integer> boards, int totalStudents, int maxLoad) {

		int currLoad = 0;
		int currStudents = 1;

		for (int idx = 0; idx < boards.size() && currStudents <= totalStudents; idx++) {

			if (currLoad + boards.get(idx) <= maxLoad) {
				currLoad += boards.get(idx);
			} else {
				currStudents++;
				currLoad = boards.get(idx);
			}

		}

		return (currStudents <= totalStudents);

	}

	public static int paint(int painters, int units, ArrayList<Integer> boards) {

		int low = maxOfArray(boards);
		int high = sumOfArray(boards);

		int ans = 0;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (isPossible(boards, painters, mid)) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		return (ans * units) % 10000003;

	}

}
