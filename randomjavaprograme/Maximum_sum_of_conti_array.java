package randomjavaprograme;

/**
 * Maximum_sum_of_conti_array
 */
public class Maximum_sum_of_conti_array {

    public static void main(String[] args) {
        int[] arr = {2,1,5,1,2 };
        int Ans = sliding_window( arr, 3);
        System.out.println(Ans); 
        
    }
    static int sliding_window(int[] arr,int k ){
        int maxSum = 0 ;
        int windowSum = 0 ; 
        int start = 0 ; 
        for(int end = 0 ; end < arr.length; end++){
            windowSum = windowSum + arr[end]; 
            if(end >= k - 1){
                maxSum = Math.max(maxSum, windowSum);
                windowSum = windowSum - arr[start];
                start++;
            }
        }
        return maxSum ;
    }
    
}