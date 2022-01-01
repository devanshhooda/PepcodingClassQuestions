package RecursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int m = scn.nextInt();

		System.out.println(getMazePaths(0, 0, n - 1, m - 1));

	}

	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

		if (sr == dr && sc == dc) {
			ArrayList<String> baseMove = new ArrayList<>();
			baseMove.add("");
			return baseMove;
		}

		ArrayList<String> myMove = new ArrayList<>();

		if (sc + 1 <= dc) {
			ArrayList<String> horizontalMove = getMazePaths(sr, sc + 1, dr, dc);

			for (String move : horizontalMove) {
//				myMove.add(move + "h");
				myMove.add("h" + move);
			}
		}

		if (sr + 1 <= dr) {
			ArrayList<String> verticalMove = getMazePaths(sr + 1, sc, dr, dc);

			for (String move : verticalMove) {
//				myMove.add(move + "v");
				myMove.add("v" + move);
			}
		}

		return myMove;

	}

}
