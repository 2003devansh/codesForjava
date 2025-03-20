package recursion;

public class fibo {
    public static void main(String[] args) {
        System.out.println(fibo(6));
        
    }

    static int fibo(int n){
        if(n < 2){
            return n;
            // value of the fibo(1) and fibo(0) is 1 and 0n  respectively
        }

        return fibo(n-1) + fibo(n-2);
    }
}
