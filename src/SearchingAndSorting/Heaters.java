package SearchingAndSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Heaters {

	private int findRadius(int[] houses, int[] heaters) {

		int distance = Integer.MIN_VALUE;
		Arrays.sort(heaters);

		for (int idx = 0; idx < houses.length; idx++) {

			int target = houses[idx];

			int closestElement = this.findClosestElements(heaters, 1, target).get(0);

			distance = Math.max(distance, Math.abs((target - closestElement)));

		}

		return distance;

	}

	public List<Integer> findClosestElements(int[] arr, int k, int target) {

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

	private int lowerBound(int[] arr, int target) {

		int left = 0, right = arr.length - 1;

		int lowerBound = arr.length;

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
