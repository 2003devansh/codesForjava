package recursion.array_rec;

import java.util.ArrayList;

public class returningarraylist {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6};
        ArrayList<Integer> ans = findallindex(arr, 5, 0,new ArrayList<>());
        System.out.println(ans);
        
    }
    static ArrayList<Integer> findallindex(int[] arr , int target,int index, ArrayList<Integer> list){
        if(index == arr.length) {
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

          return findallindex(arr, target, index +1,list);

    }
}
