package Basics;

import java.util.Scanner;

public class NumberDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();

		int n = num;
		int count = 0;
		// digits count
		while (n != 0) {
			count++;
			n = n / 10;
		}

		int div = (int) Math.pow(10, count - 1);

		System.out.println("div : " + div);

		while (div != 0) {

			int front = num / div;

			System.out.println(front);

			num = num % div;

			div = div / 10;

		}

	}

}
