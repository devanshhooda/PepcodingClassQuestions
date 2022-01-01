package RecursionPrint;

import java.util.Scanner;

public class PrintSusequences {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);

		String str = scn.next();

		printSS(str, "");

	}

	public static void printSS(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		char chr = str.charAt(0);
		String restOfString = str.substring(1);

		printSS(restOfString, ans + chr);
		printSS(restOfString, ans);

	}

}
