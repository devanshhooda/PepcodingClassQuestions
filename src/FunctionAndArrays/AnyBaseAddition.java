package FunctionAndArrays;

import java.util.Scanner;

public class AnyBaseAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getAddition(n1, n2, b);
		System.out.println(d);

	}

	private static int getAddition(int num1, int num2, int base) {

		int carry = 0;
		int mult = 1;
		int sum = 0;

		while (num1 > 0 || num2 > 0 || carry > 0) {

			int dig1 = num1 % 10;
			int dig2 = num2 % 10;

			int tempSum = dig1 + dig2 + carry;

			int quo = tempSum / base;
			int rem = tempSum % base;

			sum += rem * mult;
			carry = quo;

			num1 /= 10;
			num2 /= 10;

			mult *= 10;

		}

		return sum;

	}

}
