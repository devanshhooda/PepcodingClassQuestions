package Basics;

import java.util.Scanner;

public class InverseNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();

		int pos = 1; // to maintain the index or position of digit

		int inverse = 0;

		while (num != 0) {

			int rem = num % 10;

			inverse += (pos * getPow(10, rem - 1));

			pos++;

			num = num / 10;

		}

		System.out.println(inverse);

	}

	private static int getPow(int num, int pow) {

		int ans = 1;

		for (int i = 1; i <= pow; i++) {
			ans *= num;
		}

		return ans;

	}
}
