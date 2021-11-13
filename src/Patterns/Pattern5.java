package Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int star_ctr = 0;

		for (int row = 1; row <= (n / 2) + 1; row++) {

			// spaces
			for (int spc = n - row - 2; spc >= 1; spc--) {
				System.out.print("\t");
			}

			// stars
			for (int str = 1; str <= (2 * star_ctr) + 1; str++) {
				System.out.print("*\t");
			}

			star_ctr++;

			System.out.println();

		}

		star_ctr = 1;

		for (int row = 1; row <= (n / 2); row++) {

			// spaces
			for (int spc = 1; spc <= row; spc++) {
				System.out.print("\t");
			}

			// stars
			for (int str = (2 * star_ctr) + 1; str >= 1; str--) {
				System.out.print("*\t");
			}

			star_ctr--;

			System.out.println();

		}

	}

}
