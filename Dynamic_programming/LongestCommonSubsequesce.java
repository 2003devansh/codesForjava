package Dynamic_programming;

public class LongestCommonSubsequesce {
    public static void main(String[] args) {
        
    }
    public static int longestCommonSubsequence(String str1, String str2,int m , int n) {
        if(m == 0 || n ==0 ){
            return 0 ; 
        }

        if(str1.charAt(m  -1) == str2.charAt(n - 1)){
            return 1 + longestCommonSubsequence(str1, str2, m  -1 , n - 1) ; 
        }else{
            return Math.max(longestCommonSubsequence(str1, str2, m - 1 , n) , longestCommonSubsequence(str1, str2, m , n - 1)) ; 
        }
    }
}
