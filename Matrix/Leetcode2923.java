package Matrix;
// https://leetcode.com/problems/find-champion-i/description/

public class Leetcode2923 {
    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 1},
            {1, 0, 1},
            {0, 0, 0}
        };
        
        int champion = findChampion(grid);
        System.out.println(champion);
        
        
    }
    public static int findChampion(int[][] grid) {

        // team i Row and opponnent is coloumn 

        int n = grid.length ;

        for(int team = 0 ; team < n ; team++){
            boolean isChampion = true ;

            for(int opponent = 0 ; opponent< n ; opponent++){
                if(team != opponent && grid[opponent][team] == 1){
                    isChampion = false ;
                    break ;

                }
            }

            if(isChampion){
                return team ;
            }
        }
        return -1 ; 
    }
    
}
