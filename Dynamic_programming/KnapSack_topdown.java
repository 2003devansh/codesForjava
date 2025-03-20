package Dynamic_programming;

public class KnapSack_topdown {
    public static void main(String[] args) {
        int[] wt = {1, 2, 3, 5};
        int[] val = {10, 20, 30, 50};
        int capacity = 6;
        int n = wt.length;

        System.out.println("Maximum Profit: " + KnapSackTopDown(wt, val, capacity, n));
    }

    public static int KnapSackTopDown(int[] wt, int[] val, int capacity, int n) {
        int[][] dp = new int[n + 1][capacity + 1];

        // Initialize base case
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][capacity];
    }
}
