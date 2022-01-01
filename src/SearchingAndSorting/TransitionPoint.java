package SearchingAndSorting;

public class TransitionPoint {

	int transitionPoint(int arr[], int n) {

		int left = 0, right = n - 1;

		int point = -1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (arr[mid] == 0) {
				left = mid + 1;
			} else {
				point = mid;
				right = mid - 1;
			}

		}

		return point;

	}

}
