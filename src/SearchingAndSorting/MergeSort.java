package SearchingAndSorting;

public class MergeSort {

	public int[] mergeSort(int[] arr, int left, int right) {

		// when only one element is remaining
		// return new array with that element only
		if (left == right) {
			int[] baseArr = new int[1];
			baseArr[0] = arr[left];
			return baseArr;
		}

		int mid = left + (right - left) / 2;

		// faith for left half of array
		int[] arr1 = mergeSort(arr, left, mid);

		// faith for right half of array
		int[] arr2 = mergeSort(arr, mid + 1, right);

		// merging the sorted arrays
		return this.mergeTwoSortedArrays(arr1, arr2);

	}

	private int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {

		int[] merged = new int[arr1.length + arr2.length];

		int idx1 = 0, idx2 = 0; // indexes for both given arrays
		int mIdx = 0; // index for resultant merged array

		// loop till reaching the end of either of the arrays
		while (idx1 < arr1.length && idx2 < arr2.length) {

			// checking which element to fill
			if (arr1[idx1] < arr2[idx2]) {

				merged[mIdx] = arr1[idx1];
				idx1++;

			} else {

				merged[mIdx] = arr2[idx2];
				idx2++;

			}

			mIdx++;

		}

		// if elements are remaining in 1st array
		while (idx1 < arr1.length) {
			merged[mIdx] = arr1[idx1];
			idx1++;
			mIdx++;
		}

		// if elements are remaining in 2nd array
		while (idx2 < arr2.length) {
			merged[mIdx] = arr2[idx2];
			idx2++;
			mIdx++;
		}

		return merged;

	}

}
