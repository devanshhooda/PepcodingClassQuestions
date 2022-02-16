package SearchingAndSorting;

public class CountZeroesInSortedMatrix {

	public int countZeros(int matrix[][], int N) {

		int count = 0;

		for (int row = 0; row < N; row++) {

			int lastIndexOfZero = this.binarySearchOnRow(matrix, row, N);

//			System.out.println(ceilIndexOfZero);

			count += (lastIndexOfZero + 1);

		}

		return count;

	}

	// util method for binary search on every row of matrix
	private int binarySearchOnRow(int[][] matrix, int row, int N) {

		int low = 0;
		int high = N - 1;
		int index = -1; // value to be returned

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (matrix[row][mid] == 0) {

				// storing our potential ans
				index = mid;

				// for next better ans
				low = mid + 1;

			} else {

				// if its not '1' then just avoid that range
				high = mid - 1;

			}

		}

		return index;

	}

}
