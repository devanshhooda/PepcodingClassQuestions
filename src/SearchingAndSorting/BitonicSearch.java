package SearchingAndSorting;

import java.util.ArrayList;

public class BitonicSearch {

	public int searchInBitonicArray(ArrayList<Integer> arr, int target) {

		int arrLen = arr.size();
		int left = 0;
		int right = arrLen - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (arr.get(mid) < target) {
				left = mid + 1;
			} else if (arr.get(mid) < target) {
				right = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

}
