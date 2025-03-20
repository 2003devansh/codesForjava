package recursion;

/**
 * one_to_n
 */
public class one_to_n {

    public static void main(String[] args) {
        funrev(10);
    }
     static void funrev(int n ){
         if( n == 0 ){
            return;
         }
         funrev(n-1);
         System.out.println(n);
     }
}