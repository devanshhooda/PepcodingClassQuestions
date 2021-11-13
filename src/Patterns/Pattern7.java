package Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int row = 1; row <= n; row++) {

			for (int spc = row - 1; spc > 0; spc--) {
				System.out.print("\t");
			}

			System.out.println("*");

		}

	}

}
