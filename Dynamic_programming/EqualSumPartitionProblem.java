package Dynamic_programming;

public class EqualSumPartitionProblem {
    
    public static boolean isPossible(int[] arr) {
        int size = 0; 
        for (int num : arr) {
            size += num;
        }

        // If the total sum is odd, partitioning into two equal subsets is impossible
        if (size % 2 != 0) {
            return false;
        }

        // Call subset sum function to check if a subset with sum = size/2 exists
        return subSum(arr, size / 2);
    }

    public static boolean subSum(int[] arr, int target) {
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][target + 1];

        // Base case: Sum 0 is always possible with an empty subset
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                } 
            }
        }

        return dp[n][target]; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5};  
        System.out.println(isPossible(arr));  // Output: true

        int[] arr2 = {1, 2, 3, 5};  
        System.out.println(isPossible(arr2)); // Output: false
    }
}
