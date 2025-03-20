package recursion.array_rec;

import java.util.ArrayList;

public class inbodyarraylist {
    public static void main(String[] args) {
        
    }
    static ArrayList<Integer> FindAllindex(int[] arr, int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            list.add(index);
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansfrombelow = FindAllindex(arr, target, index + 1);
        list.addAll(ansfrombelow);
        return list;

    }
    
}
