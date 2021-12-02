package RecursionInArrays;

public class AllindicesOfArray {

	public static int[] allIndices(int[] arr, int x, int idx, int fsf) {

		if (idx == arr.length) {
			return new int[fsf];
		}

		if (arr[idx] == x) {
			int[] indices = allIndices(arr, x, idx + 1, fsf + 1);
			indices[fsf] = idx;
			return indices;
		}

		return allIndices(arr, x, idx + 1, fsf);

	}

}
