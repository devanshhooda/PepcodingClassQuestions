package Contest_7;

import java.util.Scanner;

public class StringBetweenParenthesis {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = scn.next();

		printStringBwParenthesis(str, "", false);

	}

	private static void printStringBwParenthesis(String str, String ans, boolean betweenParenthesis) {

		if (str.length() == 0) {
			return;
		}

		char chr = str.charAt(0);
		String ros = str.substring(1);

		if (chr == ')') {
			ans += chr;
			if (betweenParenthesis)
				System.out.println(ans);
			return;
		}

		if (chr == '(') {
			betweenParenthesis = true;
		}

		if (betweenParenthesis) {
			ans += chr;
		}

		printStringBwParenthesis(ros, ans, betweenParenthesis);

	}

}
