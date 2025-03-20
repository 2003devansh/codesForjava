package binarysearch;
public class binarysearcquestion7 {
    public static void main(String[] args) {
        
    }

    int search(int[ ] arr , int target){
        int peak = peakIndexInMountainArray(arr);
        int firsttry = orderagnosticBS(arr, target, 0, peak);
        if (firsttry != -1) {
            return firsttry;
            
        }
        return orderagnosticBS(arr, target, peak+1, arr.length - 1);

    }
    static int orderagnosticBS(int[] arr, int target,int start, int end){


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

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while( start < end){
            int mid = start + (end - start) /2;
            if(arr[mid] > arr[mid+ 1]) { 
                // you are in th decreasing part of array
                // this may be the answer , but look at left.
                // this is why end != mid - 1
                end = mid;
            }else{
                // you are in the asc part of array
                start = mid + 1;
                // because we know that mid +1 element > mid element

            }
        }
        // in the end , start == end and pointing to the largest number because of the 2 checks above 
        //start ans end are trying to find max element in the above 2 case
        //hence , when they pointing to just one element, that is the maximum one because that is what wwe check say
        return start;
    }
}
