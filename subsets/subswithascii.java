package subsets;

import java.util.ArrayList;

/**
 * subswithascii
 */
public class subswithascii {
   public static void main(String[] args) {
    System.out.println(asciiret(" ", "abc"));
    
   }
//    static void subseqAssci( String p, String up){
//     if(up.isEmpty()){
//         System.out.println(p);
//         return;
//     }

//     char ch = up.charAt(0);
//     subseqAssci(p + ch, up.substring(1));
//     subseqAssci(p, up.substring(1));
//     subseqAssci(p + (ch + 0), up.substring(1));

//     // either its gona take it or leave it (check notes)
// }

     static ArrayList<String> asciiret(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = asciiret(p + ch, up.substring(1));
        ArrayList<String> right = asciiret(p , up.substring(1));
        ArrayList<String> mid = asciiret(p + (ch + 0), up.substring(1));
        left.addAll(right);
        mid.addAll(left);
        return mid;


     }
}

