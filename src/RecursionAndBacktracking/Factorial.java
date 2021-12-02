package RecursionAndBacktracking;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();

		System.out.println(factorial(num));

	}

	public static int factorial(int n) {

		if (n == 0) {
			return 1;
		}

		return n * factorial(n -= 1);

	}

}
