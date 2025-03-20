package recursion;

public class recursive {
    public static void main(String[] args) {
        
    }
    static int recursive_num(int n ){
        
            if( n == 0 || ){
               return 0 ;
            }
            recursive_num(n-1);
            System.out.println(n);
    
    }
}
