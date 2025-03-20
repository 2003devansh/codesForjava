package recursion.array_rec;
// check the given array is sorted or not
public class sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3};
        System.out.println(Sorted(arr, 0));
    }

    static boolean Sorted(int[] arr,int index){
        if( index == arr.length -1 ){
            return true;
        }
        return arr[index] < arr[index + 1] && Sorted(arr,index + 1);
    }
}

 