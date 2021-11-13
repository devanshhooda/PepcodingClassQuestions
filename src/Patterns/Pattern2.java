package Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int row = 1; row <= n; row++) {

			for (int col = n + 1 - row; col >= 1; col--) {
				System.out.print("*\t");
			}

			System.out.println();

		}

	}

}
