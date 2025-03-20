package BACKTRAKING.MAZE;

import java.util.Arrays;

public class MazeProb6 {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        All_number_path("", board, 0, 0, path, 0);
    }

    static void All_number_path(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        // Base case: Reached the destination (bottom-right corner)
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p); // print the path
            System.out.println();
            return;
        }

        // If current position is blocked (false), return
        if (!maze[r][c]) {
            return;
        }

        // Mark the current position as visited
        maze[r][c] = false;
        path[r][c] = step;

        // Move Down
        if (r < maze.length - 1) {
            All_number_path(p + "D", maze, r + 1, c, path, step + 1);
        }
        // Move Right
        if (c < maze[0].length - 1) {
            All_number_path(p + "R", maze, r, c + 1, path, step + 1);
        }
        // Move Up
        if (r > 0) {
            All_number_path(p + "U", maze, r - 1, c, path, step + 1);
        }
        // Move Left
        if (c > 0) {
            All_number_path(p + "L", maze, r, c - 1, path, step + 1);
        }

        // Backtrack (unmark the current position and step back)
        maze[r][c] = true;
    }
}
