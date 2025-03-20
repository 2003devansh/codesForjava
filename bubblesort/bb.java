package bubblesort;

import java.util.Arrays;

public class bb {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void bubble(int[] arr){
        boolean swapped;
        for(int i = 0;i<arr.length;i++){
            swapped = false;
            for(int j = 1;j<arr.length-i;j++){
                //swap if the item is smaller then the previous item
                if( arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }



            }
            // if we do not swapped for particular value of i it means arr is sorted and hence stop the programee 
            if(!swapped){
                break;
            }
        }
    }
    
}
