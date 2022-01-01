package Contest_6;

import java.util.Scanner;

public class Permutation {

//	Take as input str, a string. We are concerned with all possible permutations of
//	 characters in str. E.g. “abc” can produce following words “abc”, “acb”, “bac”,
//	  “bca”, “cab”, “cba”
//
//	a. Write a recursive function which returns the count of different permutations
//	 for a given string(repetition not allowed). Print the value returned.
//
//	b. Write a recursive function which prints all possible permutations for a
//	given string in Laxicographical Order
//	(repetition not allowed and void is the return type for function).
//
//	Example(To be used only for expected output):
//	Input:
//	213
//
//	output
//	6
//	123
//	132
//	213
//	231
//	312
//	321

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = scn.next();

		prinPermutations(str, "");

	}

	private static void prinPermutations(String str, String ans) {
		int len = str.length();

		if (len == 0) {
			System.out.println(ans);
			return;
		}

		for (int idx = 0; idx < len; idx++) {
			String leftSubstr = str.substring(0, idx);
			String rightSubstr = str.substring(idx + 1);
			prinPermutations(leftSubstr + rightSubstr, ans + str.charAt(idx));
		}
	}

}
