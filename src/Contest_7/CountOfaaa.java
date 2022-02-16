package Contest_7;

import java.util.Scanner;

public class CountOfaaa {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = scn.next();

		System.out.println(getCountOfaaa(str, 0, 3));
		System.out.println(getCountOfaaaNonOverlapped(str, 0, 3));

	}

	private static int getCountOfaaa(String str, int si, int ei) {

		if (ei > str.length()) {
			return 0;
		}

		int count = 0;
		String substr = str.substring(si, ei);

		if (substr.equals("aaa")) {
			count++;
		}

		count += getCountOfaaa(str, si + 1, ei + 1);

		return count;

	}

	private static int getCountOfaaaNonOverlapped(String str, int si, int ei) {

		if (ei > str.length()) {
			return 0;
		}

		int count = 0;
		String substr = str.substring(si, ei);

		if (substr.equals("aaa")) {
			count++;
		}

		count += getCountOfaaaNonOverlapped(str, si + 3, ei + 3);

		return count;

	}

}
