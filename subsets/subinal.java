package subsets;

import java.util.ArrayList;

public class subinal {
    public static void main(String[] args) {
      System.out.println( subsewRet(" ", "abc"));
    }
     static ArrayList<String> subsewRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        } 

        char ch = up.charAt(0);
         ArrayList<String> left = subsewRet(p + ch, up.substring(1));
        ArrayList<String> right = subsewRet(p , up.substring(1));
        left.addAll(right);
        return left;
     }
}
