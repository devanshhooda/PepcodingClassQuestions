package Patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		// 1st half
		for (int row = 1; row <= (n / 2) + 1; row++) {

			// space 1
			for (int spc = 0; spc < row - 1; spc++) {
				System.out.print("\t");
			}

			// star 1
			System.out.print("*\t");

			// space 2
			for (int spc = n - (2 * row); spc > 0; spc--) {
				System.out.print("\t");
			}

			// star 2
			if (row != (n / 2) + 1)
				System.out.print("*\t");

			// next line
			System.out.println();

		}

		// 2nd half
		for (int row = 1; row <= (n / 2); row++) {

			// space 1
			for (int spc = (n / 2) - row; spc > 0; spc--) {
				System.out.print("\t");
			}

			// star 1
			System.out.print("*\t");

			// space 2
			for (int spc = 1; spc <= (2 * row) - 1; spc++) {
				System.out.print("\t");
			}

			// star 2
			System.out.println("*\t");

		}

	}

}
