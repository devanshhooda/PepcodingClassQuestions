package StackAndQueue;

import java.util.LinkedList;

public class StackUsingLL {

	LinkedList<Integer> list;

	public StackUsingLL() {
		list = new LinkedList<>();
	}

	int size() {
		return list.size();
	}

	void push(int val) {
		list.addFirst(val);
	}

	int pop() {
		if (this.size() == 0) {
			System.out.println("Stack underflow");
			return -1;
		}

		return list.removeFirst();
	}

	int top() {
		if (this.size() == 0) {
			System.out.println("Stack underflow");
			return -1;
		}

		return list.getFirst();
	}

}
