package sliding_window;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class firstNegInWindow {
    public static void main(String[] args) {
        
    }

    public ArrayList<Integer> prog(int[] arr , int k){
        int i = 0 ; 
        int j = 0 ; 
        Queue<Integer> queue = new LinkedList<>() ;
        ArrayList<Integer> list = new ArrayList<>() ; 
        while(j < arr.length){
            if(arr[j] < 0){
                queue.offer(arr[j]) ;
            }

            if(j - i +1 < k){
                j++ ; 
            }else if(j - i  +1 == k){
                if(queue.isEmpty()){
                    list.add(0);  
                } else{
                    list.add(queue.peek()) ;
                }

                if (!queue.isEmpty() && arr[i] == queue.peek()) {
                    queue.poll();
                }
            }
        }
        return list  ; 

    }
}
