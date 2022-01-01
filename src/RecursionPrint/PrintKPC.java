package RecursionPrint;

import java.util.Scanner;

public class PrintKPC {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);

		String str = scn.next();

		printKPC(str, "");

	}

	public static void printKPC(String str, String asf) {

		if (str.length() == 0) {
			System.out.println(asf);
			return;
		}

		String key = getKey(str.charAt(0) - '0');

		for (char chr : key.toCharArray()) {
			printKPC(str.substring(1), asf + chr);
		}

	}

	private static String getKey(int num) {

		String[] keys = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

		if (num < 0 || num >= keys.length) {
			return "NA";
		}

		return keys[num];

	}

}
