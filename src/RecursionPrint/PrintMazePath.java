package RecursionPrint;

import java.util.Scanner;

public class PrintMazePath {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int sr = 1, sc = 1;
		int er = scn.nextInt();
		int ec = scn.nextInt();

		printMazePath(sr, sc, er, ec, "");

	}

	private static void printMazePath(int sr, int sc, int er, int ec, String asf) {

		if (sr > er || sc > ec) {
			return;
		}

		if (sr == er && sc == ec) {
			System.out.println(asf);
			return;
		}

		printMazePath(sr, sc + 1, er, ec, asf + "h");
		printMazePath(sr + 1, sc, er, ec, asf + "v");

	}

}
