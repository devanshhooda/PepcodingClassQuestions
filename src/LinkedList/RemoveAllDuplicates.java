package LinkedList;

public class RemoveAllDuplicates {

	private class ListNode {
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

	public ListNode deleteDuplicates(ListNode head) {

		ListNode resHead = new ListNode(-1);
		ListNode resTail = resHead;

		while (head != null) {

			// either first node or single occurrence
			if (head.next == null || head.val != head.next.val) {

				// simply appending that node in our res LL
				resTail.next = head;
				resTail = resTail.next;
				head = head.next;

			} else {
				ListNode curr = head;

				// duplicate case: move curr pointer till the next
				// element of last occurrence of duplicate element
				while (curr != null && curr.val == head.val) {
					curr = curr.next;
				}

				head = curr;
			}

		}

		resTail.next = null;

		return resHead.next;

	}

}
