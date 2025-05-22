package Dynamic_programming;

public class UnboundedRodCutting {
    public static void main(String[] args) {
        int[] price = {2, 5, 7, 8, 10}; // For lengths 1,2,3,4,5
        int rodLength = 5;

        System.out.println("Maximum Obtainable Value: " + unboundedRodCutting(price, rodLength));
    }

    public static int unboundedRodCutting(int[] price, int length) {
        int n = price.length;
        int[][] dp = new int[n + 1][length + 1];

        // Base case initialization is already handled by default (0)

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= length; j++) {
                if (i <= j) {
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - i], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][length];
    }
}
