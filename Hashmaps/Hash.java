package Hashmaps;

import java.util.HashMap;

/**
 * Hash
 */
public class Hash {

    public static void main(String[] args) {
    //     String name = "devansh";
    //     int code = name.hashCode();
    //     System.out.println(code);

    HashMap<String, Integer> map = new HashMap<>() ;
    map.put("kunal", 45);
    map.put("devansh", 67) ;
    map.put("utk", 56);

    System.out.println(map.get("kunal"));
    }
}