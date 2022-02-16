package StackAndQueue;

public class Queue {

	int front, rear;
	int[] data;

	Queue() {
		this.front = 0;
		this.rear = 0;
		this.data = new int[5];
	}

	Queue(int size) {
		this.front = 0;
		this.rear = 0;
		this.data = new int[size];
	}

	public void size() {
//		return 
	}

	public void add(int item) {
//		if()

		this.data[this.rear] = item;
		this.rear = (this.front + this.rear + 1) / this.data.length;
	}

	public int remove() {
		int val = this.data[this.front];
		this.front = (this.front + 1) % this.data.length;
		return val;
	}

}
