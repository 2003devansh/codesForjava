package leetcode;
//https://leetcode.com/problems/squares-of-a-sorted-array/description/
import java.util.Arrays;

public class quest {
    public static void main(String[] args) {
        
    }
    public int[] sortedSquares(int[] nums) {
           int[] dummyarr = new int[nums.length];
        for(int  i = 0 ; i < nums.length ; i++){
            dummyarr[i] = nums[i] * nums[i];
     
        }
        
        Arrays.sort(dummyarr);
         for (int j : dummyarr) {
            System.out.print(j+ " ");
        }

        return dummyarr;


        
    }
}
