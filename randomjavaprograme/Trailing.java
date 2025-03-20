package randomjavaprograme;

import java.util.Scanner;

/**
 * Trailing Zeroes in Factorial using Recursion
 */
public class Trailing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        int n = sc.nextInt();
        int factorialResult = factorial(n);
        int trailingZeros = countTrailingZeros(factorialResult);
        System.out.println("Factorial of " + n + " is: " + factorialResult);
        System.out.println("Number of trailing zeros in " + n + "! is: " + trailingZeros);
        sc.close();
    }

    
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

   
    static int countTrailingZeros(int number) {
        int count = 0;
        while (number % 10 == 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
