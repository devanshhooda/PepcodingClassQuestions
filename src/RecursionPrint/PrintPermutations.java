package RecursionPrint;

import java.util.Scanner;

public class PrintPermutations {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);

		String str = scn.next();

		printPermutations(str, "");

	}

	public static void printPermutations(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int idx = 0; idx < str.length(); idx++) {
			String leftSubstr = str.substring(0, idx);
			String rightSubstr = str.substring(idx + 1);
			printPermutations(leftSubstr + rightSubstr, ans + str.charAt(idx));
		}

	}

}
