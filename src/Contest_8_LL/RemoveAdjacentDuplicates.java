package Contest_8_LL;

import java.util.Scanner;

public class RemoveAdjacentDuplicates {

	private static class LinkedList {

		private static class Node {
			int data;
			Node next;
		}

		private Node head, tail;
		private int size;

		// ADD
		public void addLast(int val) {
			Node nn = new Node();
			nn.data = val;
			nn.next = null;

			if (this.size == 0) {
				this.head = nn;
				this.tail = nn;
			} else {
				this.tail.next = nn;
				this.tail = nn;
			}

			this.size++;
		}

		public void removeDuplicates() {

			Node resHead = new Node();
			resHead.data = -1;
			Node resTail = resHead;

			Node ptr = this.head;

			while (ptr != null) {

				if (resTail.data != ptr.data) {
					resTail.next = ptr;
					resTail = resTail.next;
				}

				ptr = ptr.next;

			}

			resTail.next = null;

			this.head = resHead.next;
			this.tail = resTail;

		}

		public void display() {
			Node ptr = this.head;
			while (ptr != null) {
				System.out.print(ptr.data + " ");
				ptr = ptr.next;
			}
		}

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		while (n-- > 0) {
			list.addLast(scn.nextInt());
		}

		list.removeDuplicates();
		list.display();

	}

}
