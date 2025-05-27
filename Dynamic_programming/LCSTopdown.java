package Dynamic_programming;

public class LCSTopdown {
    public static void main(String[] args) {
    String str1 = "abcde";
    String str2 = "ace";
    int m = str1.length();
    int n = str2.length();

    LCSTopdown obj = new LCSTopdown();
    int result = obj.LCSTopdown(str1, str2, m, n);
    System.out.println("Length of LCS: " + result);
    }

    public int LCSTopdown(String str1, String str2, int m , int n){
        int[][] dp = new int[m+1][n+1] ; 
         
        for(int i = 1; i <=m ; i++){
            for(int j = 1 ; j <= n ; j++ ){
                if(str1.charAt(i -1 ) == str2.charAt(j-1 )){
                    dp[i][j] = 1 + dp[i-1][j-1] ;
                }else{
                    dp[i][j]  = Math.max(dp[i-1][j], dp[i][j-1]) ; 
                }
            }
        }
        return dp[m][n] ; 
    }
}
