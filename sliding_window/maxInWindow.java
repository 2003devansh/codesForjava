package sliding_window;

public class maxInWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 6, 3, 8, 9, 10, 12, 56};
        int k = 4;
        System.out.println(max(arr, k));  // Just to test
    }

    static int max(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int ans = Integer.MIN_VALUE;
        int sum = 0;

        while (j < arr.length) {
            sum += arr[j];

            if (j - i + 1 < k) {
                j++;
            } 
            else if (j - i + 1 == k) {
                ans = Math.max(ans, sum);
                sum -= arr[i];  // Remove the element going out
                i++;
                j++;
            }
        }
        return ans;
    }
}
