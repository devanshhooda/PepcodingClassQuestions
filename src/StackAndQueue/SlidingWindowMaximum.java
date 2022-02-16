package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

	public int[] maxSlidingWindow(int[] arr, int k) {

		int[] ans = new int[arr.length - k + 1];
		Deque<Integer> deQueue = new ArrayDeque<>();

		int ansIdx = 0;

		for (int idx = 0; idx < arr.length; idx++) {

			// when window is moved ahead, first element is excluded from it
			if (deQueue.isEmpty() == false && deQueue.getFirst() <= idx - k) {
				deQueue.removeFirst();
			}

			// remove all elements smaller than current element
			while (deQueue.isEmpty() == false && arr[deQueue.getLast()] < arr[idx]) {
				deQueue.removeLast();
			}

			// add your own element
			deQueue.add(idx);

			// start creating your ans when
			// you get you first full window
			if (idx >= k - 1) {
				ans[ansIdx] = arr[deQueue.getFirst()];
				ansIdx++;
			}

		}

		return ans;

	}

}
