//#51 - N-Queens
import java.util.*;
public class P1NQueens {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(solveNQueens(n));
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i<n; i++){
            Arrays.fill(board[i],'.');
        }
        backtrack(0,board,res,n);
        return res;
    }

    private static void backtrack(int row, char[][] board, List<List<String>> res, int n){
        if(row==n) {
            res.add(construct(board));
            return;
        }
        for(int col = 0; col<n;col++){
            if(isSafe(board, row, col, n)){
                board[row][col]='Q';
                backtrack(row+1,board,res,n);
                board[row][col]='.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col,int n){
        // check upper column
        for(int i = 0; i <row; i++){
            if(board[i][col] == 'Q') return false;
        } // check upper left diagonal
        for(int i = row-1,j = col -1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }// check upper right diagonal
        for(int i = row - 1, j = col + 1; i>=0&&j<n;i--,j++){
            if(board[i][j]=='Q') return false;
        }// if no queen is attacking the current position
        return true;
    }

    private static List<String> construct(char[][] board){
        List<String> l = new ArrayList<>();
        for(int i = 0; i< board.length;i++){
            l.add(new String(board[i]));
        }
        return l;
    }
}
