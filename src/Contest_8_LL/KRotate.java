package Contest_8_LL;

import java.util.Scanner;

public class KRotate {

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

		public void kRotate(int k, int n) {

			Node slow = this.head;
			Node fast = this.head;

			int tempK = k % n;

			while (tempK-- > 0)
				fast = fast.next;

			while (fast.next != null) {
				slow = slow.next;
				fast = fast.next;
			}

			Node newHead = slow.next;

			fast.next = this.head;

			this.tail = slow;
			slow.next = null;

			this.head = newHead;

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
		int k = scn.nextInt();

		int tempN = n;

		while (tempN-- > 0) {
			list.addLast(scn.nextInt());
		}

		list.kRotate(k, n);
		list.display();

	}

}
