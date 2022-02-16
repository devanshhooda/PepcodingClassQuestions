package StackAndQueue;

public class Stack {

	private int[] data;
	private int top;

	Stack() {
		this.top = -1;
		this.data = new int[5];
	}

	Stack(int size) {
		this.top = -1;
		this.data = new int[size];
	}

	public int size() {
		return (this.top + 1);
	}

	public void push(int item) {
		if (top == this.data.length - 1) {
			System.out.println("Stack overflow");
			return;
		}

		this.top++;
		this.data[this.top] = item;
	}

	public int top() {
		if (this.top == -1) {
			System.out.println("Stack underflow");
			return -1;
		}

		return this.data[this.top];
	}

	public int pop() {
		if (this.top == -1) {
			System.out.println("Stack underflow");
			return -1;
		}

		int val = this.data[this.top];
		this.top--;
		return val;
	}

	public void display() {
		for (int idx = this.top; idx >= 0; idx--) {
			System.out.print(this.data[idx] + " ");
		}
		System.out.println();
	}

}
