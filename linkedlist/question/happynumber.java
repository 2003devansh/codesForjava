package question;
// https://leetcode.com/problems/happy-number/

public class happynumber {




    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do {
            slow = findsqaure(slow);//  movinf oner time
            fast = findsqaure(findsqaure(fast)); // moving two times
        }while( slow != fast);

        if( slow == 1){
            return true;
        } 
        return false;

    }

     private int findsqaure(int num){
        int ans = 0;
        while( num > 0){
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;

        }
         return ans;
     }


}