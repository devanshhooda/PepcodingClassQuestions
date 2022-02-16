package StackAndQueue;

import java.util.Stack;

public class NextGreaterElement {

	// left to right iteration approach
	public static long[] nextLargerElementLTR(long[] arr, int n) {

		Stack<Integer> stack = new Stack<>();
		// nge : next greater element array
		long[] ngeArr = new long[arr.length];

		for (int idx = 0; idx < n; idx++) {

			if (stack.isEmpty()) {
				stack.push(idx);
				continue;
			}

			while (stack.isEmpty() == false && arr[idx] > arr[stack.peek()]) {
				// seIdx : smaller element index
				int seIdx = stack.pop();

				ngeArr[seIdx] = arr[idx];
			}

			stack.push(idx);

		}

		// processing the elements who
		// doesn't had any NGE at its right
		while (stack.isEmpty() == false) {
			ngeArr[stack.pop()] = -1;
		}

		return ngeArr;

	}

	// left to right iteration approach
	public static long[] nextLargerElementRTL(long[] arr, int n) {

		Stack<Integer> stack = new Stack<>();
		// nge : next greater element array
		long[] ngeArr = new long[arr.length];

		for (int idx = n - 1; idx >= 0; idx--) {

			// pop all elements who are lesser than current element as it cannot
			// be an ans to current element or elements present left to that
			while (stack.isEmpty() == false && arr[idx] >= arr[stack.peek()]) {
				stack.pop();
			}

			// if no greater element
			// is present at its right
			if (stack.isEmpty()) {
				ngeArr[idx] = -1;
			}
			// element who did not got popped by above
			// while loop is the ans for current element
			else {
				ngeArr[idx] = arr[idx];
			}

			stack.push(idx);

		}

		return ngeArr;

	}

}
