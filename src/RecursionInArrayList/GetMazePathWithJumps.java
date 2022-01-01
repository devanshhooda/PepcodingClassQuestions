package RecursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathWithJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int m = scn.nextInt();

		System.out.println(getMazePathsWithJumps(0, 0, n - 1, m - 1));

	}

	private static ArrayList<String> getMazePathsWithJumps(int sr, int sc, int dr, int dc) {

		if (sr == dr && sc == dc) {
			ArrayList<String> baseMove = new ArrayList<>();
			baseMove.add("");
			return baseMove;
		}

		ArrayList<String> myMove = new ArrayList<>();

		if (sc + 1 <= dc) {
			for (int jump = 1; (jump + sc) <= dc; jump++) {
				ArrayList<String> horizontalMove = getMazePathsWithJumps(sr, sc + jump, dr, dc);

				for (String move : horizontalMove) {
					myMove.add("h" + jump + move);
				}
			}
		}

		if (sr + 1 <= dr) {
			for (int jump = 1; (jump + sr) <= dr; jump++) {
				ArrayList<String> verticalMove = getMazePathsWithJumps(sr + jump, sc, dr, dc);

				for (String move : verticalMove) {
					myMove.add("v" + jump + move);
				}
			}
		}

		if (sr + 1 <= dr && sc + 1 <= dc) {
			for (int jump = 1; (jump + sr) <= dr && (jump + sc) <= dc; jump++) {
				ArrayList<String> verticalMove = getMazePathsWithJumps(sr + jump, sc + jump, dr, dc);

				for (String move : verticalMove) {
					myMove.add("d" + jump + move);
				}
			}
		}

		return myMove;

	}

}
