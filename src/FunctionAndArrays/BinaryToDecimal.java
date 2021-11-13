package FunctionAndArrays;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();

		System.out.println(getBinaryToDecimal(num));

	}

	private static int getBinaryToDecimal(int num) {

		int val = 0;

		int mul = 1;

		while (num != 0) {

			int rem = num % 10;

			val += rem * mul;

			num = num / 10;

			mul *= 2;

		}

		return val;

	}

}
