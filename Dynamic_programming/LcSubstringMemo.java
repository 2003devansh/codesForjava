package Dynamic_programming;

import java.util.Arrays;

public class LcSubstringMemo {

    private static int[][] dp;

    public static void main(String[] args) {
        String str1 = "abcdxyz";
        String str2 = "xyzabcd";
        int result = lcSubstringMemo(str1, str2);
        System.out.println("Length of Longest Common Substring: " + result);
    }

    public static int lcSubstringMemo(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        dp = new int[m + 1][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(str1, str2, m, n, 0);
    }

    private static int helper(String str1, String str2, int m, int n, int count) {
        if (m == 0 || n == 0) {
            return count;
        }

        int newCount = count;
        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            newCount = helper(str1, str2, m - 1, n - 1, count + 1);
        }

        int option1 = helper(str1, str2, m - 1, n, 0);
        int option2 = helper(str1, str2, m, n - 1, 0);

        return Math.max(newCount, Math.max(option1, option2));
    }
}
