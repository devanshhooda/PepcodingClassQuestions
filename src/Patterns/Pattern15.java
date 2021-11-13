package Patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		// 1st half
		for (int row = 1; row <= (n / 2) + 1; row++) {

			// spaces
			for (int spc = (n / 2) - row + 1; spc >= 1; spc--) {
				System.out.print("\t");
			}

			int num = row;
			int tot_cols = (2 * row) - 1;

			// numbers
			for (int col = 1; col <= tot_cols; col++) {

				System.out.print(num + "\t");

				if (col <= tot_cols / 2) {
					num++;
				} else {
					num--;
				}

			}

			System.out.println();

		}

		int dec_ctr = n / 2;

		// 2nd half
		for (int row = 1; row <= (n / 2); row++) {

			// spaces
			for (int spc = 1; spc <= row; spc++) {
				System.out.print("\t");
			}

			int num = dec_ctr;
			int tot_cols = n - (2 * row);

			// numbers
			for (int col = 1; col <= tot_cols; col++) {

				System.out.print(num + "\t");

				// check here
				if (col <= tot_cols / 2) {
					num++;
				} else {
					num--;
				}

			}

			System.out.println();

			dec_ctr--;

		}

	}

}
