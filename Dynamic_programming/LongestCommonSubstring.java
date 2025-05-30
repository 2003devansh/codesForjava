package Dynamic_programming;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String str1 = "abcdxyz";
        String str2 = "xyzabcd";
        System.out.println("Length of Longest Common Substring: " + LongestCommonSubstring(str1, str2));
    }

    public static int LongestCommonSubstring(String str1, String str2) {
        return lcsHelper(str1, str2, str1.length(), str2.length(), 0);
    }

    public static int lcsHelper(String str1, String str2, int m, int n, int count) {
        if (m == 0 || n == 0) {
            return count; 
        }

        int currentCount = count;
        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            currentCount = lcsHelper( str1, str2, m - 1, n - 1, count + 1);
        }

        int option1 = lcsHelper(str1, str2, m, n - 1, 0);
        int option2 = lcsHelper(str1, str2, m - 1, n, 0);

        return Math.max(currentCount, Math.max(option1, option2));
    }
}
