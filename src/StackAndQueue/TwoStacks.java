package StackAndQueue;

public class TwoStacks {

	public static class TwoStack {
		int[] data;
		int tos1;
		int tos2;

		public TwoStack(int cap) {
			this.data = new int[cap];
			this.tos1 = -1;
			this.tos2 = cap;
		}

		int size1() {
			return this.tos1 + 1;
		}

		int size2() {
			return this.data.length - this.tos2;
		}

		void push1(int val) {
			if (this.size1() + this.size2() == this.data.length) {
				System.out.println("Stack overflow");
				return;
			}

			this.tos1++;
			this.data[this.tos1] = val;
		}

		void push2(int val) {
			if (this.size1() + this.size2() == this.data.length) {
				System.out.println("Stack overflow");
				return;
			}

			this.tos2--;
			this.data[this.tos2] = val;
		}

		int pop1() {
			if (this.tos1 == -1) {
				System.out.println("Stack underflow");
				return -1;
			}

			int val = this.data[this.tos1];
			this.tos1--;
			return val;
		}

		int pop2() {
			if (this.tos2 == this.data.length) {
				System.out.println("Stack underflow");
				return -1;
			}

			int val = this.data[this.tos2];
			this.tos2++;
			return val;
		}

		int top1() {
			if (this.tos1 == -1) {
				System.out.println("Stack underflow");
				return -1;
			}

			return this.data[this.tos1];
		}

		int top2() {
			if (this.tos2 == this.data.length) {
				System.out.println("Stack underflow");
				return -1;
			}

			return this.data[this.tos2];
		}
	}

}
