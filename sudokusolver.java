import java.util.Random;


public class sudokusolver {
    public static void main(String[] args){
        int[][] board = new int[9][9];

        int[] usedNums = new int[9];

        Random rand = new Random();

        for(int columns = 0; columns < board.length; columns++){
            for(int rows = 0; rows < board[columns].length; rows++){
                int n = rand.nextInt(9) + 1;
                board[columns][rows] = n;
                System.out.println(board[columns][rows]);


            }
        }


    }
}
