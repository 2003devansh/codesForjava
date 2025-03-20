package BACKTRAKING.MAZE;

//   S - - 
//   - - - 
//   - - E

//   we need to count the number of ways in this particular problem to
//   to reacg E from S



public class maze_prob_1 {
    public static void main(String[] args) {
        System.out.println(count(3,3 ));
        
    }

    static int count(int r , int c ){
        if( r== 1 || c == 1 ){
            return 1 ;
        }

        // now we need to compute answer for right hand and left hand 
        // in left hand we are decreasing row by 1 and 
        // in the right hand side we are decreasing col by 1 
        int left = count(r -1 , c);
        int right = count(r, c - 1);
        return left + right ;
    }
}
