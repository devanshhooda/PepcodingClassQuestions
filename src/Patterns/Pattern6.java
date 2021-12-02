package Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int row = 1; row <= (n / 2) + 1; row++) {

			for (int str = 1; str <= n - (2 * row) + 1; str++) {
				System.out.print("*\t");
			}

			for (int spc = 1; spc < (2 * row) - 1; spc++) {
				System.out.print("\t");
			}

			for (int str = 1; str <= n - (2 * row) + 1; str++) {
				System.out.print("*\t");
			}

			System.out.println();

		}

	}

}
