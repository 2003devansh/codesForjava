package BINARY_TREE.Grid_traversal;

import java.util.LinkedList;
import java.util.Queue;

public class BFs_in_grid {
    public static final int[][] DIRECTION = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        // Define the grid
        int[][] grid = {
            {1, 1, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 1, 1},
            {0, 0, 1, 0}
        };

        // Starting point
        int startRow = 0;
        int startCol = 0;

        // Perform BFS traversal
        Bfs(grid, startRow, startCol);
    }

    public static void Bfs(int[][] grid, int startRow, int startCol) {
        int rows = grid.length;
        int col = grid[0].length;

        // Check if starting index is valid
        if (grid[startRow][startCol] == 0) {
            return;
        }

        // Initializing queue to keep track of visited cells
        Queue<int[]> queue = new LinkedList<>();

        // Initializing boolean array to keep track of visited cells
        boolean[][] visited = new boolean[rows][col];

        // Adding the starting cell to the queue and marking it as visited
        queue.add(new int[]{startRow, startCol});
        visited[startRow][startCol] = true;

        System.out.println("BFS Traversal:");

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int Row = cell[0]; // Current row
            int Col = cell[1]; // Current column

            // Print the current cell
            System.out.println("Visited cell: (" + Row + ", " + Col + ")");

            // Exploring neighbors
            for (int[] direction : DIRECTION) {
                int newRow = Row + direction[0];
                int newCol = Col + direction[1];

                // Check if the new cell is within bounds, not visited, and valid (non-zero)
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < col 
                    && !visited[newRow][newCol] && grid[newRow][newCol] == 1) {
                    queue.add(new int[]{newRow, newCol});
                    visited[newRow][newCol] = true;
                }
            }
        }
    }
}
