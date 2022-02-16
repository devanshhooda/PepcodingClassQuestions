package LinkedList;

public class MergeSort {

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

	private ListNode merge2Sorted(ListNode head1, ListNode head2) {

		if (head1 == null)
			return head2;

		if (head2 == null)
			return head1;

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

	private ListNode middle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		ListNode prev = null;

		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		if (fast == null) // even size LL case
			return prev;

		return slow;
	}

	public ListNode sortList(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode midNode = this.middle(head);

		ListNode midNext = midNode.next;
		midNode.next = null;

		ListNode leftList = this.sortList(head);
		ListNode rightList = this.sortList(midNext);

		return this.merge2Sorted(leftList, rightList);

	}

}
