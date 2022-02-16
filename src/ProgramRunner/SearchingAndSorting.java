package ProgramRunner;

import SearchingAndSorting.CountZeroesInSortedMatrix;

public class SearchingAndSorting {

	public static void main(String[] args) {

		CountZeroesInSortedMatrix countZeroesInSortedMatrix = new CountZeroesInSortedMatrix();

		int[][] matrix = { { 0, 0, 0 }, { 0, 0, 1 }, { 0, 1, 1 } };

		System.out.println(countZeroesInSortedMatrix.countZeros(matrix, matrix.length));

	}

}
