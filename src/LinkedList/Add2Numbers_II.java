package LinkedList;

public class Add2Numbers_II {

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

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		l1 = this.reverseList(l1);
		l2 = this.reverseList(l2);

		ListNode ansHead = new ListNode(-1);
		ListNode ansTail = ansHead;

		int carry = 0;

		while (l1 != null || l2 != null) {

			int l1Dig = (l1 == null ? 0 : l1.val);
			int l2Dig = (l2 == null ? 0 : l2.val);

			int sum = l1Dig + l2Dig + carry;

			int ansDig = sum % 10;

			ansTail.next = new ListNode(ansDig);
			ansTail = ansTail.next;

			carry = sum / 10;

			if (l1 != null)
				l1 = l1.next;

			if (l2 != null)
				l2 = l2.next;

		}

		if (carry > 0) {
			ansTail.next = new ListNode(carry);
			ansTail = ansTail.next;
		}

		return this.reverseList(ansHead.next);

	}

}
