package LinkedList;

public class RemoveDuplicates {

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

	public ListNode deleteDuplicates(ListNode head) {

		ListNode resHead = new ListNode(-1);
		ListNode resTail = resHead;

		while (head != null) {

			// either first node or first occurence
			if (resHead == resTail || head.val != resTail.val) {
				resTail.next = head;
				resTail = resTail.next;
			}

			head = head.next;

		}

		resTail.next = null;

		return resHead.next;

	}

}
