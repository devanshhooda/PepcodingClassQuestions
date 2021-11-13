package FunctionAndArrays;

import java.util.Scanner;

public class AnyBaseMultiplication {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getProduct(b, n1, n2);
		System.out.println(d);
	}

	private static int getProduct(int base, int num1, int num2) {

		int mult = 1;
		int product = 0;

		while (num2 > 0) {

			int carry = 0;
			int tempMult = 1;

			int tempNum1 = num1;
			int tempProduct = 0;

			int dig2 = num2 % 10;

			while (tempNum1 > 0 || carry > 0) {

				int dig1 = tempNum1 % 10;

				int digitProduct = (dig2 * dig1) + carry;

				int rem = digitProduct % base;
				int quo = digitProduct / base;

				tempProduct += (rem * tempMult);

				carry = quo;
				tempMult *= 10;
				tempNum1 /= 10;

			}

//			System.out.println("for tp : " + tempProduct + " * " + mult);

			product = getAddition((tempProduct * mult), product, base);

//			System.out.println("for product : " + product);

			num2 /= 10;
			mult *= 10;

		}

		return product;

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
