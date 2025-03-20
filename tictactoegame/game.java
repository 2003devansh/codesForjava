package tictactoegame;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int row=0;row< board.length;row++){
            for(int col = 0; col < board[row].length;col++){
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while(!gameOver){
            printBoard(board);
            System.err.println();

        }
    }
    public static void printBoard(char[][]){
        
    }
}
