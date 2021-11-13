package Basics;

import java.util.Scanner;

public class NumberRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();
		int k = scn.nextInt();

		int nod = getNoOfDigits(num);

		if (nod == 1) {
			System.out.println(num);
			return;
		}

		// getting exact no of rotations

		k = k % nod;

		if (k < 0) {
			k = nod + k;
		}

		int div = (int) Math.pow(10, k);

		int val1 = (num % div) * (int) Math.pow(10, nod - k);
		int val2 = num / div;

		System.out.println(val1 + val2);

	}

	private static int getNoOfDigits(int num) {

		int nod = 0;

		while (num != 0) {
			nod++;
			num = num / 10;
		}

		return nod;

	}

}
