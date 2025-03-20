package Matrix;

import java.util.*;

public class wavetraversal {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        wavetraversal wt = new wavetraversal();
        List<Integer> result = wt.waveTraversal(grid);
        System.out.println(result);
    }
    
    public List<Integer> waveTraversal(int[][] grid) {
        ArrayList<Integer> list = new ArrayList<>();
        int M = grid.length;
        int N = grid[0].length;

        for (int j = 0; j < N; j++) {
            if (j % 2 != 0) {
                for (int i = M - 1; i >= 0; i--) {
                    list.add(grid[i][j]);
                }
            } else {
                for (int i = 0; i < M; i++) {
                    list.add(grid[i][j]);
                }
            }
        }
        return list;
    }
}
