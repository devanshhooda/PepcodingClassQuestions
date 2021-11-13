package Basics;

import java.util.Scanner;

public class PrimeFactorisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();

		int fac = 2;

		while (num != 1) {

			while (num % fac == 0) {

				System.out.print(fac + " ");

				num = num / fac;

				if (num == 1) {
					break;
				}

			}

			fac++;

		}

	}

}
