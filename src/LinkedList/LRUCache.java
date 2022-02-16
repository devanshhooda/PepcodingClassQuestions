package LinkedList;

import java.util.HashMap;

public class LRUCache {

	int capacity;

	private static class Node {
		int key;
		int value;

		Node next;
		Node prev;

		Node(int key, int data) {
			this.key = key;
			this.value = data;
		}
	}

	Node head, tail;
	int size;
	HashMap<Integer, Node> map;

	public LRUCache(int capacity) {
		this.capacity = capacity;

		this.head = new Node(-1, -1);
		this.tail = new Node(-1, -1);

		this.head.next = this.tail;
		this.tail.prev = this.head;

		this.size = 0;

		this.map = new HashMap<>();
	}

	public int get(int key) {
		// if key doesn't exist
		if (this.map.containsKey(key) == false) {
			return -1;
		}

		// getting node for updating its position
		Node curr = this.map.get(key);
		// removing node from its current position
		curr.prev.next = curr.next;
		curr.next.prev = curr.prev;

		// adding node to its updated position
		// (add first)
		curr.prev = this.head;
		curr.next = this.head.next;
		curr.prev.next = curr;
		curr.next.prev = curr;

		return curr.value;
	}

	public void put(int key, int value) {

		if (this.map.containsKey(key) == true) {

			// getting node for updating its position
			Node curr = this.map.get(key);
			// removing node from its current position
			curr.prev.next = curr.next;
			curr.next.prev = curr.prev;

			// adding node to its updated position
			// (add first)
			curr.prev = this.head;
			curr.next = this.head.next;
			curr.prev.next = curr;
			curr.next.prev = curr;

			curr.value = value;
			this.map.put(key, curr);

		} else {

			Node curr = new Node(key, value);

			if (this.size == this.capacity) {
				// remove last
				Node tailPrev = this.tail.prev;
				this.tail.prev = tailPrev.prev;
				this.tail.prev.next = this.tail;

				this.map.remove(tailPrev.key);
			} else
				this.size++;

			// add fist
			curr.prev = this.head;
			curr.next = this.head.next;
			curr.prev.next = curr;
			curr.next.prev = curr;

			this.map.put(key, curr);

		}

	}

}
