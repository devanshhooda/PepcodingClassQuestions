package LinkedList;

public class UnfoldLL {

	public static void unfold(ListNode head) {

		ListNode firstHead = new ListNode(-1);
		ListNode secondHead = new ListNode(-1);
		ListNode firstTail = firstHead, secondTail = secondHead;

		int ctr = 0;

		while (head != null) {

			if (ctr % 2 == 0) {
				firstTail.next = head;
				firstTail = firstTail.next;
			} else {
				secondTail.next = head;
				secondTail = secondTail.next;
			}

			head = head.next;
			ctr++;

		}

		firstTail.next = null;
		secondTail.next = null;

		secondHead = reverseList(secondHead.next);

		firstTail.next = secondHead;

	}

	private static ListNode reverseList(ListNode head) {
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
