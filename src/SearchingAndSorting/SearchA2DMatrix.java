package SearchingAndSorting;

public class SearchA2DMatrix {

	// 1st approach : considering matrix as 1D array
	public boolean searchMatrix(int[][] matrix, int target) {

		int rows = matrix.length;
		int cols = matrix[0].length;

		int low = 0;
		int high = (rows * cols) - 1;

		while (low <= high) {

			int midCell = low + (high - low) / 2;

			// getting indexes for matrix
			int rowIdx = midCell / cols;
			int colIdx = midCell % cols;

			if (matrix[rowIdx][colIdx] == target) {
				return true;
			}

			if (matrix[rowIdx][colIdx] < target) {
				low = midCell + 1;
			} else {
				high = midCell - 1;
			}

		}

		return false;

	}

}
