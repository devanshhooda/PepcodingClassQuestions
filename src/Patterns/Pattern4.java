package Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int row = 1; row <= n; row++) {

			// spaces
			for (int spc = 0; spc < row - 1; spc++) {
				System.out.print("\t");
			}

			// stars
			for (int str = n - row + 1; str >= 1; str--) {
				System.out.print("*\t");
			}

			System.out.println();

		}

	}

}
