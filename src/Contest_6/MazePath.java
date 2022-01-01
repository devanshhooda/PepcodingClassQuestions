package Contest_6;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {

//	Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and
//	columns on a rectangular board.
//
//	Our player starts in top-left corner of the board and must reach bottom-right
//	corner. In one move the player can move 1 step horizontally (right) or 1 step
//	vertically (down) or 1 step diagonally (south-east).
//
//	a. Write a recursive function which returns the count of different ways the
//	player can travel across the board. Print the value returned.
//
//	b. Write a recursive function which returns an ArrayList of moves for all valid
//	paths across the board. Print the value returned.
//
//	c. Write a recursive function which prints moves for all valid paths across the
//	board (void is the return type for function).
//
//	Example(To be used only for expected output):
//	Input:
//	2 2
//	output
//
//	13
//	[HHVV, HVHV, HVVH, HVD, HDV, VHHV, VHVH, VHD, VVHH, VDH, DHV, DVH, DD]
//	HHVV
//	HVHV
//	HVVH
//	HVD
//	HDV
//	VHHV
//	VHVH
//	VHD
//	VVHH
//	VDH
//	DHV
//	DVH
//	DD

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int sr = 0, sc = 0;
		int er = scn.nextInt();
		int ec = scn.nextInt();

		// Return count
		System.out.println(getMazePathCount(sr, sc, er, ec));

		// Return ArrayList
		System.out.println(getMazePath(sr, sc, er, ec));

		// Print paths
		printMazePath(0, 0, er, ec, "");

	}

	private static int getMazePathCount(int sr, int sc, int er, int ec) {

		if (sr > er || sc > ec) {
			return 0;
		}

		if (sr == er && sc == ec) {
			return 1;
		}

		int horizontalMoveCount = getMazePathCount(sr, sc + 1, er, ec);
		int verticalMoveCount = getMazePathCount(sr + 1, sc, er, ec);
		int diagonalMoveCount = getMazePathCount(sr + 1, sc + 1, er, ec);

		return (horizontalMoveCount + verticalMoveCount + diagonalMoveCount);

	}

	private static ArrayList<String> getMazePath(int sr, int sc, int er, int ec) {

		if (sr > er || sc > ec) {
			ArrayList<String> wasteList = new ArrayList<>();
			return wasteList;
		}

		if (sr == er && sc == ec) {
			ArrayList<String> baseList = new ArrayList<>();
			baseList.add("");
			return baseList;
		}

		ArrayList<String> finalList = new ArrayList<>();

		ArrayList<String> horizontalMoveList = getMazePath(sr, sc + 1, er, ec);
		for (String horizontalMove : horizontalMoveList) {
			finalList.add("H" + horizontalMove);
		}

		ArrayList<String> verticalMoveList = getMazePath(sr + 1, sc, er, ec);
		for (String verticalMove : verticalMoveList) {
			finalList.add("V" + verticalMove);
		}

		ArrayList<String> diagonalMoveList = getMazePath(sr + 1, sc + 1, er, ec);
		for (String diagonalMove : diagonalMoveList) {
			finalList.add("D" + diagonalMove);
		}

		return finalList;

	}

	private static void printMazePath(int sr, int sc, int er, int ec, String asf) {

		if (sr > er || sc > ec) {
			return;
		}

		if (sr == er && sc == ec) {
			System.out.println(asf);
			return;
		}

		printMazePath(sr, sc + 1, er, ec, asf + "H");
		printMazePath(sr + 1, sc, er, ec, asf + "V");
		printMazePath(sr + 1, sc + 1, er, ec, asf + "D");

	}

}
