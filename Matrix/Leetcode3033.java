package Matrix;
// https://leetcode.com/problems/modify-the-matrix/description/

public class Leetcode3033 {
    public static void main(String[] args) {
        
    }
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length ; 
        int n  = matrix[0].length ;

        int[][] answer = new int[m][n] ;

        for(int i =  0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                answer[i][j] = matrix[i][j] ;
            }
        }

        for(int j = 0 ; j < n ; j++){
            int max = Integer.MIN_VALUE ;

            for(int  i = 0 ; i < m ;i++){
                max = Math.max(max, answer[i][j]) ;
            }

            for(int i = 0  ; i < m ; i++){
                if(answer[i][j] == -1){
                    answer[i][j] = max ;
                }
            }
        }
  return answer ; 
        
    }
    
}
