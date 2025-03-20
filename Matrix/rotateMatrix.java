package Matrix;

import Tree.BST.priavte;

public class rotateMatrix {
    public static void main(String[] args) {
        
    }

    static void rotate(int[][] matrix){
        

    }

    private void transpose(int[][] matrix){
        for(int i = 0 ;i < matrix.length; i++){
            for(int j  = i +1 ; j < matrix[0].length ;j++){
                int temp  = matrix[i][j] ;
                matrix[i][j] = matrix[j][i] ;
                matrix[j][i] = temp ;
            }
        }
    }

    private void reverseOfRow(int[][] matrix){
        for(int i = 0 ;  i < matrix.length ; i++){
            int left  =0;
            int right   = matrix[0].length - 1; 
            while(left < right){
                int temp = matrix[i][left] ; 
                matrix[i][left] = matrix[i][right] ;
                matrix[i][right] = temp ; 
                left++ ;
                right-- ;  
            }
        }
    }
    
}
