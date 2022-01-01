package RecursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		System.out.println(getStairPaths(n));

	}

	private static ArrayList<String> getStairPaths(int n) {

		if (n < 0) {
			ArrayList<String> baseList = new ArrayList<>();
			return baseList;
		}

		if (n == 0) {
			ArrayList<String> baseList = new ArrayList<>();
			baseList.add("");
			return baseList;
		}

		ArrayList<String> nm1Paths = getStairPaths(n - 1);
		ArrayList<String> nm2Paths = getStairPaths(n - 2);
		ArrayList<String> nm3Paths = getStairPaths(n - 3);

		ArrayList<String> finalList = new ArrayList<>();

		for (String nm1Str : nm1Paths) {
			finalList.add("1" + nm1Str);
		}

		for (String nm2Str : nm2Paths) {
			finalList.add("2" + nm2Str);
		}

		for (String nm3Str : nm3Paths) {
			finalList.add("3" + nm3Str);
		}

		return finalList;

	}

}
