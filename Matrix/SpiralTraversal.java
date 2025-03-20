package Matrix;

import java.util.*;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        SpiralTraversal st = new SpiralTraversal();
        List<Integer> result = st.spiralTrav(grid);
        System.out.println(result);
    }

    public List<Integer> spiralTrav(int[][] grid) {
        ArrayList<Integer> list = new ArrayList<>();
        int M = grid.length;
        int N = grid[0].length;

        int count = 0;
        int total = M * N;

        int startingRow = 0;
        int startingCol = 0;
        int endingRow = M - 1;
        int endingCol = N - 1;

        while (count < total) {
            // Printing starting row
            for (int index = startingCol; index <= endingCol && count < total; index++) {
                list.add(grid[startingRow][index]);
                count++;
            }
            startingRow++;

            // Printing ending column
            for (int index = startingRow; index <= endingRow && count < total; index++) {
                list.add(grid[index][endingCol]);
                count++;
            }
            endingCol--;

            // Printing ending row
            for (int index = endingCol; index >= startingCol && count < total; index--) {
                list.add(grid[endingRow][index]);
                count++;
            }
            endingRow--;

            // Printing starting column
            for (int index = endingRow; index >= startingRow && count < total; index--) {
                list.add(grid[index][startingCol]);
                count++;
            }
            startingCol++;
        }
        return list;
    }
}
