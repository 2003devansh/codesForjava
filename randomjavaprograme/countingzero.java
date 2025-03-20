package randomjavaprograme;

public class countingzero {
    public static void main(String[] args) {
        
    }

    static int countzero(int num){
        int count =0;
        int rem=0;
        rem=num%10;
        num = num/10;
     if(num%10==0){
       count++;
   return count;
     }
     else{
                return countzero(num);
            }
        
        
    }
}
