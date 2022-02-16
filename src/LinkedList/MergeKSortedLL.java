package LinkedList;

public class MergeKSortedLL {

	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	private int minNodeIndex(ListNode[] lists) {

		int minIdx = -1;
		int minVal = Integer.MAX_VALUE;

		for (int listIdx = 0; listIdx < lists.length; listIdx++) {

			if (lists[listIdx] != null && lists[listIdx].val < minVal) {
				minIdx = listIdx;
				minVal = lists[listIdx].val;
			}

		}

		return minIdx;

	}

	public ListNode mergeKLists(ListNode[] lists) {

		if (lists.length == 0) {
			return null;
		}

		if (lists.length == 1) {
			return lists[0];
		}

		ListNode mergeHead = new ListNode(-1);
		ListNode mergeTail = mergeHead;

		while (true) {
			int minIdx = this.minNodeIndex(lists);

			if (minIdx == -1)
				break;

			// setting next node in merged
			mergeTail.next = lists[minIdx];

			// moving ahead that list's head
			lists[minIdx] = lists[minIdx].next;

			// moving merged's head ahead
			mergeTail = mergeTail.next;

		}

		// optimized approach
//		mergeTail.next = this.recursiveMerge(lists, 0, lists.length - 1);

		return mergeHead.next;

	}

	// recursive divide and conquer most optimized method
	private ListNode recursiveMerge(ListNode[] lists, int left, int right) {

		if (left > right)
			return null;

		if (left == right)
			return lists[left];

		int mid = left + (right - left) / 2;

		ListNode leftList = this.recursiveMerge(lists, left, mid);
		ListNode rightList = this.recursiveMerge(lists, mid + 1, right);

		// merging the 2 obtained LL's
		return this.merge2SortedLL(leftList, rightList);

	}

	private ListNode merge2SortedLL(ListNode head1, ListNode head2) {

		ListNode head = new ListNode(-1);
		ListNode tail = head;

		while (head1 != null && head2 != null) {

			if (head1.val <= head2.val) {
				tail.next = head1;
				head1 = head1.next;
			} else {
				tail.next = head2;
				head2 = head2.next;
			}

			tail = tail.next;

		}

		if (head1 != null) {
			tail.next = head1;
		} else {
			tail.next = head2;
		}

		return head.next;

	}

}
