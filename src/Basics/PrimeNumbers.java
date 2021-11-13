package Basics;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

//		int t = scn.nextInt();
//
//		while (t-- > 0) {

		int low = scn.nextInt();
		int high = scn.nextInt();

		for (int num = low; num <= high; num++) {
			if (isPrime(num))
				System.out.println(num);
		}
//		}

	}

	private static boolean isPrime(int num) {

		double limit = Math.sqrt(num);

		for (int div = 2; div <= limit; div++) {
			if (num % div == 0) {
				return false;
			}
		}

		return true;

	}

}
