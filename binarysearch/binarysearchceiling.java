package binarysearch;
public class binarysearchceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,4,9,14,16,18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // return the index , greatest number <=target
    static int ceiling(int[] arr, int target){

           // but what if the target element is grator than the greatest number in the array
           if( target > arr[arr.length - 1]){
            return -1;
        }
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

        return start;
    }

}
  