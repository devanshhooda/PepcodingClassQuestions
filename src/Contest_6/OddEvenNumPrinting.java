package Contest_6;

import java.util.Scanner;

public class OddEvenNumPrinting {

//	Take as input
//	1. A Number: n
//
//	Write a recursive function to print the following pattern to print odd numbers
//	in decreasing sequence (up until 0) and even numbers in
//	increasing sequence
//
//	Example(To be used only for expected output):
//
//	Input:
//	6
//
//	output
//	5
//	3
//	1
//	2
//	4
//	6

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();

		printOddEven(num);

	}

	private static void printOddEven(int num) {
		if (num == 0) {
			return;
		}

		if (num % 2 == 0) {
			printOddEven(num - 1);
			System.out.println(num);
		} else {
			System.out.println(num);
			printOddEven(num - 1);
		}
	}

}
