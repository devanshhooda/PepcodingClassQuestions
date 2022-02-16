package LinkedList;

public class FoldLL {

	public void reorderList(ListNode head) {

		ListNode midNode = this.middle(head);
		ListNode halfRev = this.reverseList(midNode);

		int ctr = 0;

		while (head != null && halfRev != null) {

			ListNode headNext = head.next;
			ListNode halfRevNext = halfRev.next;

			if (ctr % 2 == 0) {
				head.next = halfRev;
				head = headNext;
			} else {
				halfRev.next = head;
				halfRev = halfRevNext;
			}

			ctr++;

		}

		if (head != null) {
			head.next = halfRev;
		}

		if (halfRev != null) {
			halfRev.next = head;
		}

	}

	private ListNode middle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	private ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode prev = null;
		ListNode curr = head;
		ListNode ahead = curr;

		while (curr != null) {
			ahead = ahead.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}

		return prev;
	}

}
