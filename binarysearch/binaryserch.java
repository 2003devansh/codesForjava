package binarysearch;
public class binaryserch {
    public static void main(String[] args) {
        int[] arr = {-19,-18,23,34,45,56};
        int target = 23;
        int ans = Binaryserch(arr, target);
        System.out.println(ans);
    }

    // return the index , return -1 if it does not exist
    static int Binaryserch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            //find the middle element
           // int mid = (start  + end)/2;
            // might be possible  (start + ennd ) exceds the range in java
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                // ans found
                return mid;
            }
        }

        return -1;
    }

}
  