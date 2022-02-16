package LinkedList;

public class Merge2SortedLL {

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	Node sortedMerge(Node head1, Node head2) {

		Node head = new Node(-1); // dummy concept
		Node tail = head;

		while (head1 != null && head2 != null) {

			if (head1.data <= head2.data) {
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
