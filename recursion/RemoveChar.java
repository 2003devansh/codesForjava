package recursion;

public class RemoveChar {
    public static void main(String[] args) {
        Skip("" , "baccdah");
    }

    static void Skip(String proc, String unproc){
      if(unproc.isEmpty()){
        System.out.println(proc);
        return; 
        // if unprocess is empty ( the on in which we are removing char )
      }
      char ch = unproc.charAt(0);
      
      if(ch == 'a'){
        Skip(proc,unproc.substring(1)); // The substring() function in Java is used to extract a part of a given string.
      }else{
       Skip(proc + ch, unproc.substring(1));
      }
    }
}
