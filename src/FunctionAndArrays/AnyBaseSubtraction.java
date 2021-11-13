package FunctionAndArrays;

import java.util.Scanner;

public class AnyBaseSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getSubtraction(n1, n2, b);
		System.out.println(d);

	}

	private static int getSubtraction(int num1, int num2, int base) {

		int sub = 0;
		int mult = 1;
		int borrow = 0;

		while (num2 > 0) {

			int dig1 = num1 % 10;
			int dig2 = num2 % 10;

			int tempDiff = dig2 - dig1 + borrow;

			if (tempDiff < 0) {
				tempDiff += base;
				borrow = -1;
			} else {
				borrow = 0;
			}

			sub += (tempDiff * mult);

			num1 /= 10;
			num2 /= 10;

			mult *= 10;

		}

		return sub;

	}

}
