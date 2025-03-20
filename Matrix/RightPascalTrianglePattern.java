package Matrix;

public class RightPascalTrianglePattern {

    public static void main(String[] args) {
       int max = 6 ; 
       for(int i = 3 ;  i <= max ; i++){
        for(int j = 0 ; j < i -2 ; j++ ){
            System.out.print(i + " ");
        }
        System.out.println();
       }

       for(int i = max ; i >= 3 ; i--){
        for(int j = 0 ; j < i - 2 ; j++){
            System.out.print(i+ " ");
        }
        System.out.println();
       }
    }
}