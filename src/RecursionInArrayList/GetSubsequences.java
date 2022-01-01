package RecursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequences {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);

		String str = scn.next();
		int len = str.length();

		System.out.println(getSubsequences(str));
		System.out.println(getSubsequences(str, 0, len));

	}

	// by index method
	public static ArrayList<String> getSubsequences(String str, int idx, int len) {

		if (idx == len) {
			ArrayList<String> baseList = new ArrayList<>();
			baseList.add("");
			return baseList;
		}

		ArrayList<String> recursiveSubsequences = getSubsequences(str, idx + 1, len);
		ArrayList<String> mySubsequences = new ArrayList<>();

		for (String rss : recursiveSubsequences) {
			mySubsequences.add(rss);
		}

		for (String rss : recursiveSubsequences) {
			mySubsequences.add(str.charAt(idx) + rss);
		}

		return mySubsequences;

	}

	// by substring method
	public static ArrayList<String> getSubsequences(String str) {

		if (str.length() == 0) {
			ArrayList<String> baseList = new ArrayList<>();
			baseList.add("");
			return baseList;
		}

		char chr = str.charAt(0);
		String restOfString = str.substring(1);

		ArrayList<String> recursiveSubsequences = getSubsequences(restOfString);
		ArrayList<String> mySubsequences = new ArrayList<>();

		for (String rss : recursiveSubsequences) {
			mySubsequences.add(rss);
		}

		for (String rss : recursiveSubsequences) {
			mySubsequences.add(chr + rss);
		}

		return mySubsequences;

	}

}
