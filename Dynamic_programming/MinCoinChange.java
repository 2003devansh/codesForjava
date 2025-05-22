package Dynamic_programming;

import java.util.Arrays;

public class MinCoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sum = 5;
        int result = minCoinChange(coins, sum);
        System.out.println("Minimum coins required: " + result);
    }

    public static int minCoinChange(int[] coins, int sum) {
        int n = coins.length;
        int[][] dp = new int[n + 1][sum + 1];

        // Initialize base cases
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0; // 0 coins to make sum 0
        }
        for (int j = 1; j <= sum; j++) {
            dp[0][j] = Integer.MAX_VALUE - 1; // impossible with 0 coins
        }

        // Fill the table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(1 + dp[i][j - coins[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return (dp[n][sum] == Integer.MAX_VALUE - 1) ? -1 : dp[n][sum];
    }
}
