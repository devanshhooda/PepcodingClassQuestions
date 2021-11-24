package Basics;

import java.util.Scanner;

public class GCDandLCM {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int num1 = scn.nextInt();
		int num2 = scn.nextInt();

		int min = Math.min(num1, num2);

		int gcd = 1;

		for (int i = min; i > 1; i--) {
			int mod1 = num1 % i;
			int mod2 = num2 % i;

			if (mod1 == 0 && mod2 == 0) {
				gcd = i;
				break;
			}
		}

		System.out.println(gcd);

		// lcm = (product of numbers / gcd of numbers)
		int lcm = (num1 * num2) / gcd;

		System.out.println(lcm);

	}

}
