package Matrix;

import java.util.Arrays;

public class Leetcode56 {
    public static void main(String[] args) {
        
    }
    public int[][] merge(int[][] interval) {
        
      int n  = interval.length ;
      int[][] ans ; 
      Arrays.sort(interval, (a, b) -> Arrays.compare(a, b));
      for(int i = 0;i< n ; i++){
        int start  = interval[i][0] ;
        int end  = interval[0][i] ;

      }
    }
}
