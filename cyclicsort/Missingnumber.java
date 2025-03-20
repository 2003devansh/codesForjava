//https://leetcode.com/problems/missing-number/
package cyclicsort;

 class Missingnumber {
   public static void main(String[] args) {
      int [] arr = {4,0,2,1};
       System.out.println(missingNumber(arr));

   }
        
    
    public static int missingNumber(int [] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct  = arr[i] ;
            if( arr[i] < arr.length && arr[i] != arr[correct])
            // for the && parrt start searching from start the very first index that we find that has not having required index that is answer
            // since the N start from 0 so the index = value on the other hand if counting is started from the 1 then index = value - 1
            // Note :- if the given number is from 1 to N or o to N use cyclic sort 

 
            {
                swap(arr, i, correct);
            }else{ 
                i++;
            }
        }

        for( int index = 0; index < arr.length;index++){
            if(arr[index] != index) {
                return index;
            }
        }

        return arr.length;
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
       }

}
