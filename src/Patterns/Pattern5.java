package Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		// upper half
		for (int row = 1; row <= (n / 2) + 1; row++) {

			// spaces
			for (int spc = (n / 2) - row + 1; spc > 0; spc--) {
				System.out.print("\t");
			}

			// stars
			for (int str = 1; str <= (2 * row) - 1; str++) {
				System.out.print("*\t");
			}

			System.out.println();

		}

		// lower half
		for (int row = 1; row <= (n / 2); row++) {

			// spaces
			for (int spc = 1; spc <= row; spc++) {
				System.out.print("\t");
			}

			// stars
			for (int str = n - (2 * row); str >= 1; str--) {
				System.out.print("*\t");
			}

			System.out.println();

		}

	}

}
