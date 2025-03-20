package recursion.array_rec;

import java.util.ArrayList;

public class Findallindex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
        Allindex(arr, 4, 0);
        System.out.println(list);
        
    }

  static  ArrayList<Integer> list = new ArrayList<>();
   static  void Allindex(int[] arr, int target,int index){
  
        if(index == arr.length){
            return ;
        }if(arr[index] == target){
            list.add(index);
           
        }
        Allindex(arr, target, index +1);
    }
// return all the index that the value is present

}
