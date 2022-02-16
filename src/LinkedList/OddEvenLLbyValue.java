package LinkedList;

public class OddEvenLLbyValue {

	private static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node divide(int N, Node head) {
		Node oddHead = new Node(-1);
		Node oddTail = oddHead;

		Node evenHead = new Node(-1);
		Node evenTail = evenHead;

		while (head != null) {

			if (head.data % 2 == 0) {
				evenTail.next = head;
				evenTail = evenTail.next;
			} else {
				oddTail.next = head;
				oddTail = oddTail.next;
			}

			head = head.next;

		}

		oddTail.next = null;
		evenTail.next = oddHead.next;

		return evenHead.next;
	}

}
