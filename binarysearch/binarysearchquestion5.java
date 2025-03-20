package binarysearch;
//position of the element in infinite sorted array
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class binarysearchquestion5 {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start  = 0;
        int  end = 1;
        while(target > arr[end]){
            int newstart = end + 1;
            // double the box value
            // end  = previous end + sizeofbox*2
            end = end + (end - start + 1)*2;
            start = newstart;
        }
        return binaryserch(arr, target, start, end);
    }
    static int binaryserch(int[ ] arr, int target,int start,int end){
        

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
  