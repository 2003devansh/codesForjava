package randomjavaprograme;

import java.sql.Array;
import java.util.Arrays;

public class sum {
    public static void main(String[] args) {
        
        // int sum_ans = sum(new int[]{1,2,3}) ;
        // System.out.println(sum_ans);

        // boolean exist_ans = exist(new int[]{1,2,3,4}, 3) ;
        // System.out.println(exist_ans);

        // evenOdd(new int[]{1,2,3,4,5}) ;

        System.out.println(Arrays.toString(greaterRight(new int[]{4,5,2,10,8})));
                
            }
            public static int sum(int[] arr){
                int sum = 0; 
                for(int i =0 ; i< arr.length ; i++){
                    sum += arr[i] ;
                }
                return sum ; 
            }
        
            public static boolean exist(int[] arr , int n){
               for(int i =0 ; i< arr.length ; i++){
                if(arr[i] == n){
                    return true ; 
                }
               
               }
               return false ; 
            }
        
            public static void evenOdd(int[] arr){
                int even = 0; 
                int odd = 0; 
                for(int i = 0 ; i < arr.length ; i++){
                    if(arr[i]%2 == 0){
                        even++ ;
                    }else{
                        odd++ ; 
                    }
                }
        
                System.out.println("even count is" + even +  "and odd count is" + odd);
            }
        
        public static int[] greaterRight(int[] arr){
        int[] ans = new int[arr.length] ;

        for(int i = 0 ;i < arr.length  ; i++){
            for(int j = i  ; j < arr.length   ; j++){
               if(arr[j] > arr[i]){
                ans[i] = arr[j] ;
                break ;  
               }else{
                ans[i] =  -1; 
               }
            }
        }

        return ans  ;

    }
}
