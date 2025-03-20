package randomjavaprograme;
/**
 * mainlinear
 */
public class mainlinear {

    public static void main(String[] args) {
        int[] nums = {23,14,145,34,34,3,4,-76};
        int target = 23;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
        
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index < arr.length;index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }

        }
         // this line will execute if none of the return statement above have executed
    //hence the targt not found
    return -1 ;
    }
   
}