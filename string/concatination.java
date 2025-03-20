package string;

import java.util.ArrayList;

public class concatination {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        // convert  to the ascii value then add the respective value

        System.out.println("a" + "b");
        //concatinate the string

        System.out.println((char)('a' + 1));
        //('a' + 1) gives the ascii value and char() convert to string

        System.out.println("a" +1);
        //concatinate the whole thing

        System.out.println("devansh" + new ArrayList<>());
        // return the devansh with empty array because arraylist create a list of array

        System.out.println("devansh" + new Integer(12));
        //add the integer value 12 because the println will call tostring method on the new integer and convert it to string

        // if we try to add arraylist and intger function together it will throw error because of the condition of string
        // the condition is string is need to be present in the operation even though it is empty

        System.out.println(new ArrayList<>() + " " + new Integer(23));
    }
}
