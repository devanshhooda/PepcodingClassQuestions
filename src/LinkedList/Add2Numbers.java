package LinkedList;

public class Add2Numbers {

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

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

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

		return ansHead.next;

		// using recursion
		// return this.addTwoNumbers(l1, l2, 0);

	}

	// recursive way
	private ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {

		if (l1 == null && l2 == null) {

			if (carry > 0) {
				ListNode lastNode = new ListNode(carry);
				lastNode.next = null;
				return lastNode;
			}

			return null;
		}

		int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;

		carry = 0;

		if (sum > 9) {
			carry = sum / 10;
			sum = sum % 10;
		}

		ListNode ansPtr = new ListNode(sum);
		ansPtr.next = this.addTwoNumbers(l1 == null ? null : l1.next, l2 == null ? null : l2.next, carry);

		return ansPtr;

	}

}
