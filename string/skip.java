package string;

public class skip {
    public static void main(String[] args) {
        skip_a("","baccad");
    }
    static void skip_a(String p , String unp){
        if(unp.isEmpty()){
            System.out.println(p);
            return ; 
        }

        char ch = unp.charAt(0) ;

        if(ch == 'a'){
           skip_a(p, unp.substring(1));
        }else{
        skip_a(p + ch, unp.substring(1));
        }
    }
}
