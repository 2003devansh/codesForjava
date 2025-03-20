package recursion;

public class SkippingString {
    public static void main(String[] args) {
        System.out.println(Skipapple("asddappleljbci"));
        
    }
    static String Skipapple(String up){
        if(up.isEmpty()){
            return " ";

        }
        if(up.startsWith("apple")){
           return Skipapple(up.substring(5));
        }else{
            return up.charAt(0) + Skipapple(up.substring(1));
        }
    }
}
