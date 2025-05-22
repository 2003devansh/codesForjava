package Dynamic_programming;

public class CoinChange {

    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int amount = 4;
        CoinChange cc = new CoinChange();
        int ways = cc.coinChange(coins, amount);
        System.out.println("Number of ways to make sum " + amount + ": " + ways);
    }

    public int coinChange(int[] coins , int amount){
        int n  = coins.length ; 
        int[][] dp = new int[n+1][amount+1];

        // Base case: There's 1 way to make amount 0 with any number of coins (by picking none)
        for(int i = 0; i <= n ; i++){
            dp[i][0] = 1; 
        }

        for(int i = 1 ; i <= n ;i++){
            for(int j = 1 ; j <= amount ; j++){
                if(coins[i-1] <= j ){
                    dp[i][j] = dp[i][j - coins[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j]; 
                }
            }
        }

        // Print DP table
        System.out.println("DP Table:");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= amount; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }

        return dp[n][amount]; 
    }
}
