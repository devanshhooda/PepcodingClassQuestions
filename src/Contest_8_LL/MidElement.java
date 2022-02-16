package Contest_8_LL;

import java.util.Scanner;

public class MidElement {

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

		public int mid() {
			Node slow = this.head;
			Node fast = this.head;

			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}

			return slow.data;
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

		System.out.println(list.mid());

	}

}
