package binarysearch;
/**
 * orderagnosticBS
 */
public class orderagnosticBS {

    public static void main(String[] args) {
   int[] arr = {-19,-18,23,34,45,56};
        int target = 23;
        int ans  = OrderagnosticBS(arr, target);
        System.out.println(ans);
    }
    static int OrderagnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isASC = arr[start] < arr[end];


         while(start<=end){
            //find the middle element
           // int mid = (start  + end)/2;
            // might be possible  (start + ennd ) exceds the range in java
            int mid = start + (start + end)/2;
             
            if(arr[mid] == target){
                return mid;
            }

            if(isASC){
                   if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;

            } else {
                   if(target > arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1; 
            }


            }
            }
        }

        return -1;
    }
}