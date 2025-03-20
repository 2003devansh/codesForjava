package BACKTRAKING.MAZE;

import java.util.ArrayList;

// diagnol move is allowed ;

public class maze_prob3 {

    public static void main(String[] args) {
        System.out.println(diagnolmove( " ", 3, 3));
        
    }

    static ArrayList<String> diagnolmove(String p   ,int r , int c){
        if(r == 1 || c == 1 ){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list ; 
        }

        ArrayList<String> list = new ArrayList<>() ;

        if(r > 1){
            list.addAll(diagnolmove(p + "D", r - 1, c));
        }

        if( c > 1){
            list.addAll(diagnolmove(p + "R", r, c - 1));

        }

        if( r > 1 && c > 1){
            list.addAll(diagnolmove(p + 'd', r - 1, c- 1));
        }
        return list ;
    }
    
}
