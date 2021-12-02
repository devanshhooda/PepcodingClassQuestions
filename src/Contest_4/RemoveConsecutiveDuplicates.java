package Contest_4;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = scn.next();
		int strlen = str.length();

		StringBuilder strb = new StringBuilder();

		char currChar = str.charAt(0);
		strb.append(currChar);

		for (int idx = 0; idx < strlen; idx++) {
			if (str.charAt(idx) != currChar) {
				currChar = str.charAt(idx);
				strb.append(currChar);
			}
		}

		System.out.println(strb);

	}

}
