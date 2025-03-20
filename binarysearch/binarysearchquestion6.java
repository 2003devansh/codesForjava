package binarysearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class binarysearchquestion6 {
    public static void main(String[] args) {
        
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
