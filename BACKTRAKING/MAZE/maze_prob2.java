package BACKTRAKING.MAZE;

import java.util.ArrayList;

// in this we need to return the path that leads to our answer

public class maze_prob2 {
    public static void main(String[] args) {
        // path(" ", 3, 3);
       System.out.println(pathret( " ", 4 ,4));
        
    }

    static void path(String p ,int r , int c){
        if(r == 1 && c ==1 ){
            System.out.println(p);
            return;
        }

        if(r > 1){
            path( p + 'D', r - 1, c);
        }

        if(c > 1){
            path(p + "R", r, c - 1);
        }
    }

    // returning in an arraylist 
    static ArrayList<String> pathret(String p , int r , int c){
        if(r==1 && c ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
           list.addAll(pathret(p + "D", r - 1, c));
        }
        if( c > 1){
            list.addAll(pathret(p + "R", r, c - 1));
        }
        return list ; 
    }
}
