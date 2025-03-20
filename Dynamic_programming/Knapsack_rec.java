package Dynamic_programming;

public class Knapsack_rec {
    
    public static void main(String[] args) {
        int[] weight = {1, 2, 3, 5};
        int[] val = {10, 20, 30, 50};
        int capacity = 6;
        int n = weight.length;

        Knapsack_rec knapsack = new Knapsack_rec();
        int maxProfit = knapsack.max_prof_knapsack(weight, val, capacity, n);
        
        System.out.println("Maximum Profit: " + maxProfit);
    }

    public int max_prof_knapsack(int[] weight, int[] val, int capacity, int n) {
        if (n == 0 || capacity == 0) {
            return 0;
        }

        if (weight[n - 1] <= capacity) {
            return Math.max(
                val[n - 1] + max_prof_knapsack(weight, val, capacity - weight[n - 1], n - 1),
                max_prof_knapsack(weight, val, capacity, n - 1)
            );
        } else {
            return max_prof_knapsack(weight, val, capacity, n - 1);
        }
    }
}
