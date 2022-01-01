package Backtracking;

import java.util.Scanner;

public class FloodFill {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		floodfill(arr, 0, 0, "", new boolean[arr.length][arr[0].length]);
	}

	// asf -> answer so far
	private static void floodfill(int[][] maze, int sr, int sc, String asf, boolean[][] visited) {

		if (sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[sr].length || maze[sr][sc] == 1 || visited[sr][sc]) {
			return;
		}

		if (sr == maze.length - 1 && sc == maze[sr].length - 1) {
			System.out.println(asf);
			return;
		}

		visited[sr][sc] = true;

		floodfill(maze, sr - 1, sc, asf + "t", visited);
		floodfill(maze, sr, sc - 1, asf + "l", visited);
		floodfill(maze, sr + 1, sc, asf + "d", visited);
		floodfill(maze, sr, sc + 1, asf + "r", visited);

		visited[sr][sc] = false;

	}

}
