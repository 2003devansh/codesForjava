package Dynamic_programming;

import java.util.Arrays;

public class Knapsack_memo {
    private static int[][] dp;

    public static void main(String[] args) {
        int[] wt = {1, 2, 3, 5};
        int[] val = {10, 20, 30, 50};
        int capacity = 6;
        int n = wt.length;

        dp = new int[n + 1][capacity + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        Knapsack_memo knapsack = new Knapsack_memo();
        int maxProfit = knapsack.knapSack_memo(wt, val, capacity, n);
        
        System.out.println("Maximum Profit: " + maxProfit);
    }

    public int knapSack_memo(int[] wt, int[] val, int capacity, int n) {
        if (capacity == 0 || n == 0) {
            return 0;
        }

        if (dp[n][capacity] != -1) {
            return dp[n][capacity];
        }

        if (wt[n - 1] <= capacity) {
            dp[n][capacity] = Math.max(
                val[n - 1] + knapSack_memo(wt, val, capacity - wt[n - 1], n - 1),
                knapSack_memo(wt, val, capacity, n - 1)
            );
        } else {
            dp[n][capacity] = knapSack_memo(wt, val, capacity, n - 1);
        }

        return dp[n][capacity];
    }
}
