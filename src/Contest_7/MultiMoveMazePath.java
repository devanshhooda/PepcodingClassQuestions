package Contest_7;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiMoveMazePath {

//	H1H1V1V1
//	H1H1V2
//	H1V1H1V1
//	H1V1V1H1
//	H1V1D1
//	H1V2H1
//	H1D1V1
//	H2V1V1
//	H2V2
//	V1H1H1V1
//	V1H1V1H1
//	V1H1D1
//	V1H2V1
//	V1V1H1H1
//	V1V1H2
//	V1D1H1
//	V2H1H1
//	V2H2
//	D1H1V1
//	D1V1H1
//	D1D1
//	D2

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int cr = 1;
		int cc = 1;
		int er = scn.nextInt();
		int ec = scn.nextInt();

		System.out.println(getAllMazePathsCount(cr, cc, er, ec));
//		System.out.println(getAllMazePaths(cr, cc, er, ec).size());
		System.out.println(getAllMazePaths(cr, cc, er, ec));
		printAllMazePaths(cr, cc, er, ec, "");

	}

	private static ArrayList<String> getAllMazePaths(int cr, int cc, int er, int ec) {

		if (cr > er || cc > ec) {
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}

		if (cr == er && cc == ec) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}

		ArrayList<String> mr = new ArrayList<>();

		for (int move = 1; move <= Math.max((er - cr), (ec - cc)); move++) {
			// horizontal move
			ArrayList<String> hList = getAllMazePaths(cr, cc + move, er, ec);

			for (String hl : hList) {
				mr.add(hl + "H" + move);
			}

			// vertical move
			ArrayList<String> vList = getAllMazePaths(cr + move, cc, er, ec);

			for (String vl : vList) {
				mr.add(vl + "V" + move);
			}

			// diagonal move
			if (cr == cc) {
				ArrayList<String> dList = getAllMazePaths(cr + move, cc + move, er, ec);

				for (String dl : dList) {
					mr.add(dl + "D" + move);
				}
			}

		}

		return mr;

	}

	private static int getAllMazePathsCount(int cr, int cc, int er, int ec) {

		if (cr > er || cc > ec) {
			return 0;
		}

		if (cr == er && cc == ec) {
			return 1;
		}

		int count = 0;

		for (int move = 1; move <= Math.max((er - cr), (ec - cc)); move++) {
			// horizontal move
			count += getAllMazePathsCount(cr, cc + move, er, ec);

			// vertical move
			count += getAllMazePathsCount(cr + move, cc, er, ec);

			// diagonal move
			if (cr == cc) {
				count += getAllMazePathsCount(cr + move, cc + move, er, ec);
			}
		}

		return count;

	}

	private static void printAllMazePaths(int cr, int cc, int er, int ec, String ans) {

		if (cr > er || cc > ec) {
			return;
		}

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}

		for (int move = 1; move <= Math.max((er - cr), (ec - cc)); move++) {
			// horizontal move
			printAllMazePaths(cr, cc + move, er, ec, ans + "H" + move);

			// vertical move
			printAllMazePaths(cr + move, cc, er, ec, ans + "V" + move);

			// diagonal move
			if (cr == cc) {
				printAllMazePaths(cr + move, cc + move, er, ec, ans + "D" + move);
			}
		}

	}

}
