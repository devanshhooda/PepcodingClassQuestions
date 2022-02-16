package SearchingAndSorting;

public class RowWithMax1s {

	public int rowWithMax1s(int matrix[][], int rows, int cols) {

		int ansRow = -1;
		int high = cols - 1;

		for (int row = 0; row < rows; row++) {

			// checking for range of high
			// and if the right-most element for the next range
			// of binary search is also 1 or not
			if (high >= 0 && high < cols && matrix[row][high] == 1) {

				// checking in next range
				int searchedIndex = this.binarySearchOnRow(matrix, row, high);

				// if better index is found
				if (searchedIndex != -1) {

					// reducing the search space for next binary search
					high = searchedIndex - 1;

					// updating our ans
					ansRow = row;

				}

			}

		}

		return ansRow;

	}

	// util method for binary search on every row of matrix
	private int binarySearchOnRow(int[][] matrix, int row, int high) {

		int low = 0;
		int index = -1; // value to be returned

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (matrix[row][mid] == 0) {

				// if its not '1' then just avoid that range
				low = mid + 1;

			} else {

				// storing our potential ans
				index = mid;

				// for next better ans
				high = mid - 1;

			}

		}

		return index;

	}

}
