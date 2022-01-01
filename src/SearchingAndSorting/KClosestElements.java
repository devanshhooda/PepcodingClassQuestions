package SearchingAndSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KClosestElements {
	
	public static List<Integer> findClosestElements(int[] arr, int k, int target) {

		List<Integer> closestElements = new ArrayList<>();

		int second = lowerBound(arr, target);
		int first = second - 1;

		while (first >= 0 && second < arr.length && k-- > 0) {
			int diff1 = Math.abs(arr[first] - target);
			int diff2 = Math.abs(arr[second] - target);

			if (diff1 <= diff2) {

				closestElements.add(arr[first]);
				first--;

			} else {

				closestElements.add(arr[second]);
				second++;

			}
		}

		while (first >= 0 && k-- > 0) {
			closestElements.add(arr[first]);
			first--;
		}

		while (second < arr.length && k-- > 0) {
			closestElements.add(arr[second]);
			second++;
		}

		Collections.sort(closestElements);

		return closestElements;

	}

	private static int lowerBound(int[] arr, int target) {

		int left = 0, right = arr.length - 1;

		int lowerBound = arr.length;
		// if we had taken -1 instead, then we got stuck as
		// both 1st and 2nd pointer would be of no use in worst case
		// (i.e- if target is bigger than every element of array and not present at all
		// in array)

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (arr[mid] >= target) {

				lowerBound = mid;
				right = mid - 1;

			} else if (arr[mid] < target) {

				left = mid + 1;

			}

		}

		return lowerBound;

	}

}
