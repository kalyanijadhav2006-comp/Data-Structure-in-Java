import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Boardqueens {
    public boolean isSafe(int row, int col, char[][]board){
        //horizontal
        for(int j=0; j<board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        //vertically
        for(int i=0; i<board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //upper left
        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //upper right
        r = row;
        for(int c= col; c<board.length && r>=0; c++, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // lower left
        for(int c=col; col<board.length && r<board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower right
        for(int c=col; col<board.length && r<board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public void saveboard(char[][] board, List<List<String>> allboards){
        List<String> newBoard = new ArrayList<>();

        for(int i = 0; i < board.length; i++){
            newBoard.add(new String(board[i]));
        }

        allboards.add(newBoard);
    }
    public void helper(char[][] board, List<List<String>> allboards, int col){
        if(col == board.length){
            saveboard(board, allboards);
            return;
        }
        for(int row=0; row<board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allboards, col+1);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n){
        List<List<String>> allboards = new ArrayList<>();
        char [][] board = new char[n][n];
        // initialize board
        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }

        helper(board, allboards, 0);
        return allboards;
    }
}
