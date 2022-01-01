package RecursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKPC {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);

		String str = scn.next();
		int len = str.length();

		System.out.println(getKPC(str));

	}

	public static ArrayList<String> getKPC(String str) {

		if (str.length() == 0) {
			ArrayList<String> baseList = new ArrayList<>();
			baseList.add("");
			return baseList;
		}

		String key = getKey(str.charAt(0) - '0');
		String restOfString = str.substring(1);

		ArrayList<String> recursiveKPC = getKPC(restOfString);
		ArrayList<String> myKPCList = new ArrayList<>();

		for (char chr : key.toCharArray()) {
			for (String rss : recursiveKPC) {
				myKPCList.add(chr + rss);
			}
		}

		return myKPCList;

	}

	private static String getKey(int num) {

		String[] keys = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

		if (num < 0 || num >= keys.length) {
			return "NA";
		}

		return keys[num];

	}

}
