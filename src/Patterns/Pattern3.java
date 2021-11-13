package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int row = 1; row <= n; row++) {

			// for spaces
			for (int spc = n - row; spc >= 1; spc--) {
				System.out.print("\t");
			}

			// for asterisks
			for (int col = 1; col <= row; col++) {
				System.out.print("*\t");
			}

			System.out.println();

		}

	}

}
