package recursion.array_rec;

import recursion.revrec;

public class linearsearch {
    public static void main(String[] args) {

        int[] arr  = {2,3,1,4,5};
        System.out.println(Ls(arr, 4, 0));
        // staeting sarch fromm the 0 index
    }
     static boolean Ls(int[] arr,int target,int index){
      if( index == arr.length) {
        return false;
      }
      return arr[index] == target || Ls(arr, target, index + 1);
      // either first condition can be true which willl return true if element is oresent in an array or element can be present in an other part of the array
     }

    //   static int findindex(int[] arr,int target,int index){
    //   if( index == arr.length) {
    //     return -1;
    //   }
    //   if(arr.length == target){
    //     return index;
    //   }
    // else{
    //     return findindex(arr, target, index + 1);
    //  }
    // }
}
