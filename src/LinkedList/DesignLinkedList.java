package LinkedList;

public class DesignLinkedList {

	private static class Node {
		int data;
		Node next;

//		public Node() {
//			this.data = 0;
//			this.next = null;
//		}
//
//		public Node(int data, Node next) {
//			this.data = data;
//			this.next = next;
//		}
	}

	public static class LinkedList {
		Node head;
		Node tail;
		int size;

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

		public void addFirst(int val) {
			Node nn = new Node();
			nn.data = val;

			if (this.size == 0) {
				this.head = nn;
				this.tail = nn;
			} else {
				Node prevHead = this.head;
				this.head = nn;
				this.head.next = prevHead;
			}

			this.size++;
		}

		public void addAt(int idx, int val) {
			if (idx < 0 || idx > this.size) {
				System.out.println("Invalid arguments");
				return;
			}

			if (idx == 0) {
				this.addFirst(val);
				return;
			}

			if (idx == this.size) {
				this.addLast(val);
				return;
			}

			Node nn = new Node();
			nn.data = val;

			// reaching to the position
			Node prev = this.head;
			for (int i = 0; i < idx - 1; i++) {
				prev = prev.next;
			}

			nn.next = prev.next;
			prev.next = nn;

			this.size++;
		}

		// GET DATA
		public int getFirst() {

			if (this.size == 0) {
				System.out.println("List is empty");
				return -1;
			}

			return this.head.data;

		}

		public int getLast() {

			if (this.size == 0) {
				System.out.println("List is empty");
				return -1;
			}

			return this.tail.data;

		}

		public int getAt(int idx) {

			if (idx < 0 || idx >= this.size) {
				System.out.println("Invalid arguments");
				return -1;
			}

			if (this.size == 0) {
				System.out.println("List is empty");
				return -1;
			}

			if (idx == 0) {
				return this.getFirst();
			}

			if (idx == this.size - 1) {
				return this.getLast();
			}

			// reaching to the position
			Node ptr = this.head;
			for (int i = 0; i < idx; i++) {
				ptr = ptr.next;
			}

			return ptr.data;

		}

		public Node getNodeAt(int idx) {

			if (idx < 0 || idx >= this.size) {
				System.out.println("Invalid arguments");
				Node nn = new Node();
				nn.data = -1;
				return nn;
			}

			if (this.size == 0) {
				System.out.println("List is empty");
				Node nn = new Node();
				nn.data = -1;
				return nn;
			}

			if (idx == 0) {
				return this.head;
			}

			if (idx == this.size - 1) {
				return this.tail;
			}

			// reaching to the position
			Node ptr = this.head;
			for (int i = 0; i < idx; i++) {
				ptr = ptr.next;
			}

			return ptr;

		}

		public Node mid() {
			Node slow = this.head;
			Node fast = this.head;

			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}

			return slow;
		}

		// REMOVE
		public void removeFirst() {
			if (this.size == 0) {
				System.out.println("List is empty");
				return;
			}

			if (this.size == 1) {
				this.head = this.tail = null;
			} else {
				this.head = this.head.next;
			}

			this.size--;
		}

		public void removeLast() {
			if (this.size == 0) {
				System.out.println("List is empty");
				return;
			}

			if (this.size == 1) {
				this.head = this.tail = null;
			} else {
				Node prev = this.head;
				// reaching to the prev of tail
				while (prev.next != this.tail) {
					prev = prev.next;
				}
				prev.next = null;
				this.tail = prev;
			}

			this.size--;
		}

		public void removeAt(int idx) {
			if (idx < 0 || idx >= this.size) {
				System.out.println("Invalid arguments");
				return;
			}

			if (this.size == 0) {
				System.out.println("List is empty");
				return;
			}

			if (idx == 0) {
				this.removeFirst();
				return;
			}

			if (idx == this.size - 1) {
				this.removeLast();
				return;
			}

			// reaching to the prev of tail
			Node prev = this.head;
			for (int i = 0; i < idx - 1; i++) {
				prev = prev.next;
			}

			prev.next = prev.next.next;

			this.size--;
		}

		// DISPLAY
		public void display() {
			Node temp = this.head;

			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}

			System.out.println();
		}

		// SWAP
		private void swapNodeData(Node n1, Node n2) {
			int temp = n1.data;
			n1.data = n2.data;
			n2.data = temp;
		}

		// REVERSE
		public void reverseDataIteratively() {
			int left = 0, right = this.size - 1;

			Node leftNode = this.head;
			Node rightNode = this.tail;

			while (left < right) {
				if (left > 0)
					rightNode = this.getNodeAt(right);

				this.swapNodeData(leftNode, rightNode);

				leftNode = leftNode.next;

				left++;
				right--;
			}
		}

		public void reversePointersIteratively() {

			Node prev = null, curr, ahead;
			curr = this.head;
			ahead = this.head;

			this.tail = curr;

			while (curr != null) {

				// updating ahead
				ahead = ahead.next;

				// switching the pointer
				curr.next = prev;

				// updation for next iteration
				prev = curr;
				curr = ahead;

			}

			this.head = prev;

		}

		public void reverseDataRecursively() {
			this.reverseDataRecursively(this.head, this.head, 0);
		}

		private Node reverseDataRecursively(Node leftNode, Node rightNode, int counter) {

			if (rightNode == null) {
				return leftNode;
			}

			leftNode = this.reverseDataRecursively(leftNode, rightNode.next, counter + 1);

			if (counter < this.size / 2) {
				this.swapNodeData(leftNode, rightNode);
			}

			return leftNode.next;

		}

		public void reversePointersRecursively() {
			this.reversePointersRecursively(this.head);

			Node tempHead = this.head;
			this.head = this.tail;
			this.tail = tempHead;

			this.tail.next = null;
		}

		private void reversePointersRecursively(Node node) {

			if (node.next == null) {
				return;
			}

			this.reversePointersRecursively(node.next);

			node.next.next = node;

		}

		// not working
		public void kReverse(int k) {
			if (k == 0 || k == 1) {
				return;
			}

			Node prev = this.head;
			Node curr = prev.next;
			Node ahead = curr;

			int itr = 0;

			while ((itr + k) <= this.size) {
				for (int i = 1; i <= k; i++) {
					// links updation
					ahead = ahead.next;
					curr.next = prev;

					System.out.println("b: " + curr.data);

					// for next iteration
					prev = curr;
					curr = ahead;

//					if (curr != null)
//						System.out.println("a: " + curr.data);
				}

				prev = curr;
				curr = ahead;

				itr += k;
			}
		}

	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);

		list.display();

//		list.kReverse(2);
		list.reversePointersRecursively();

		list.display();

	}

}
