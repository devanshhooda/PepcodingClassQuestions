package Basics;

public class FibonacciTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;

		int first = 0;
		int second = 1;

//		System.out.print(first + " ");
//		System.out.print(second + " ");

		for (int i = 1; i <= n; i++) {

			int third = first + second;

			System.out.print(first + " ");

			first = second;
			second = third;

		}

//		System.out.println();
//		System.out.println(first);
//		System.out.println(second);

	}

}
