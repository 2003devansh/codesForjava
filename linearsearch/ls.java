package linearsearch;

public class ls {
    public static void main(String[] args) {
        
    }

    static int lineaersearch(int[] arr,int target){
        if(arr.length == 0 ){
            return -1;
        }

        for(int index = 0 ; index < arr.length ; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // target is not found
        return -1;
    }
}
