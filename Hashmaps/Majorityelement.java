package Hashmaps;

import java.util.HashMap;

public class Majorityelement {
    public static void main(String[] args) {
        int arr[] = {1, 23, 45, 1, 1, 5};
        majortyele(arr);
    }

    public static void majortyele(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        // Count the frequency of each element
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Print elements that appear more than n/3 times
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }
}
