import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = MergeSort(arr);
        System.out.println(Arrays.toString(arr));        
    }
    static int[] MergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;


        int[] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        //copy of range create an new array from passing index to passing end 
        return merge(left,right);
    }
    private static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;


        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;

        }
         // it may be possible that one of the element is not finished 
         // add the remaing element of that particular array
       while (i < first.length) {
        mix[k] = first[i];
        i++;
        k++;
       }

       while (j < second.length) {
        mix[k] = second[j];
        j++;
        k++;
        
       }
       return mix;
    }
}
