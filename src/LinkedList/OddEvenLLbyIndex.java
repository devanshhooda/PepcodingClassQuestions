package LinkedList;

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

public class OddEvenLLbyIndex {

	public ListNode oddEvenList(ListNode head) {

		ListNode oddHead = new ListNode(-1);
		ListNode evenHead = new ListNode(-1);
		ListNode oddTail = oddHead, evenTail = evenHead;

		int index = 1;

		while (head != null) {

			if (index % 2 == 0) {
				evenTail.next = head;
				evenTail = evenTail.next;
			} else {
				oddTail.next = head;
				oddTail = oddTail.next;
			}

			head = head.next;
			index++;

		}

		evenTail.next = null;
		oddTail.next = evenHead.next;

		return oddHead.next;

	}

}
