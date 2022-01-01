package RecursionPrint;

import java.util.Scanner;

public class PrintEncodings {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = scn.next();

		printEncodings(str, "", 0);

	}

	private static void printEncodings(String str, String ans, int idx) {

		if (str.charAt(idx) == '0') {
			return;
		}

		if (idx == str.length()) {
			System.out.println(ans);
			return;
		}

		int oneDigit = str.charAt(idx) - '0';
		int twoDigit = oneDigit * 10 + str.charAt(idx);

	}

}
