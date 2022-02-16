package Contest_8_LL;

import java.util.Scanner;

public class OddEvenArrange {

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

		public void oddEvenArrange() {

			Node oddHead = new Node();
			oddHead.data = -1;
			Node oddTail = oddHead;

			Node evenHead = new Node();
			evenHead.data = -1;
			Node evenTail = evenHead;

			Node ptr = this.head;

			while (ptr != null) {

				if (ptr.data % 2 == 0) {
					evenTail.next = ptr;
					evenTail = evenTail.next;
				} else {
					oddTail.next = ptr;
					oddTail = oddTail.next;
				}

				ptr = ptr.next;

			}

			evenTail.next = null;
			oddTail.next = evenHead.next;

			this.head = oddHead.next;
			this.tail = evenTail;

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
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		while (n-- > 0) {
			list.addLast(scn.nextInt());
		}

		list.oddEvenArrange();
		list.display();

	}

}
