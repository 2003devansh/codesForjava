package Dynamic_programming;

// to find the maximum number of ways to make a sum using given coins

public class CoinChange {

    public static void main(String[] args) {
        
    }

    public int coinChange(int[] coins , int amount){
        int n  = coins.length ; 
        int[][] dp = new int[n+1][amount+1];


        for(int i = 1 ; i <= n ;i++ ){
            for(int j = 1 ; j <= amount ; j++){
                if(coins[i-1] <= j){
                    dp[i][j] = Math.max(dp[i][j - coins[i-1]] + 1 , dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][amount];
    }
    
}
